package androidx.car.app.model;

import defpackage.AbstractC18739l;
import defpackage.InterfaceC12208l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public class Badge {
    private final CarColor mDotColor;
    private final boolean mHasDot;
    private final CarIcon mIcon;
    private final CarColor mIconBackgroundColor;

    private Badge() {
        this.mHasDot = false;
        this.mDotColor = null;
        this.mIcon = null;
        this.mIconBackgroundColor = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Badge)) {
            return false;
        }
        Badge badge = (Badge) obj;
        return this.mHasDot == badge.mHasDot && Objects.equals(this.mDotColor, badge.mDotColor) && Objects.equals(this.mIcon, badge.mIcon) && Objects.equals(this.mIconBackgroundColor, badge.mIconBackgroundColor);
    }

    @Deprecated
    public CarColor getBackgroundColor() {
        return this.mDotColor;
    }

    public CarColor getDotColor() {
        return this.mDotColor;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public CarColor getIconBackgroundColor() {
        return this.mIconBackgroundColor;
    }

    public boolean hasDot() {
        return this.mHasDot;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mHasDot), this.mDotColor, this.mIcon, this.mIconBackgroundColor);
    }

    public String toString() {
        return "[hasDot: " + this.mHasDot + ", dotColor: " + this.mDotColor + ", icon: " + this.mIcon + ", iconBackgroundColor: " + this.mIconBackgroundColor + "]";
    }

    public Badge(AbstractC18739l abstractC18739l) {
        throw null;
    }
}
