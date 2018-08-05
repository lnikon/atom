package ru.atom.geometry;

public class Bar implements  Collider {
    public Point firstCorner;
    public Point secondCorner;

    public Bar(int firstCornerX, int firstCornerY, int secondCornerX, int secondCornerY)
    {
        setFirstCorner(new Point(firstCornerX, firstCornerY));
        setSecondCorner(new Point(secondCornerX, secondCornerY));
    }

    public void setFirstCorner(Point firstCorner) {
        this.firstCorner = firstCorner;
    }

    public void setSecondCorner(Point secondCorner) {
        this.secondCorner = secondCorner;
    }

    public Point getFirstCorner() {
        return firstCorner;
    }

    public Point getSecondCorner() {
        return secondCorner;
    }

    public Point getThirdCorner() {
        return new Point(secondCorner.x, firstCorner.y);
    }

    public Point getFourthCorner() {
        return new Point(firstCorner.x, secondCorner.y);
    }

    public boolean contains(Point other) {
        return (other.x >= this.firstCorner.x && other.y >= this.firstCorner.y)
                && (other.x <= this.secondCorner.x && other.y <= this.secondCorner.y);
    }

    public boolean collides(Point other) {
        return (other.x >= this.firstCorner.x && other.y >= this.firstCorner.y)
                || (other.x <= this.secondCorner.x && other.y <= this.secondCorner.y);
    }

    @Override
    public boolean isColliding(Collider other)
    {
        if(other == null) return false;

        if(other instanceof Point) {
            Point point = (Point)other;
            return contains(point);
        } else if(other instanceof Bar) {
            Bar bar = (Bar)other;
            return (collides(bar.getFirstCorner()) && contains(bar.getSecondCorner())) ||
                    (collides(bar.getSecondCorner()) && contains(bar.getFirstCorner())) ||
                    (collides(bar.getFirstCorner()) && contains(bar.getThirdCorner())) ||
                    (collides(bar.getSecondCorner()) && contains(bar.getFourthCorner())) ||
                    (equals(bar));
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Bar bar = (Bar)o;

        return (firstCorner.x + secondCorner.x == bar.firstCorner.x + bar.secondCorner.x)
                && (firstCorner.y + secondCorner.y == bar.firstCorner.y + bar.secondCorner.y);
    }
}
