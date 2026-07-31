package androidx.car.app.model;

import defpackage.AbstractC0653l;
import defpackage.C1770l;
import defpackage.C8339l;
import defpackage.InterfaceC12208l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class CarIconSpan extends CarSpan {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    private final int mAlignment;
    private final CarIcon mIcon;

    private CarIconSpan() {
        this.mIcon = null;
        this.mAlignment = 1;
    }

    private static String alignmentToString(int i) {
        if (i == 0) {
            return "bottom";
        }
        if (i != 1) {
            return i != 2 ? "unknown" : "center";
        }
        return "baseline";
    }

    public static CarIconSpan create(CarIcon carIcon, int i) {
        C1770l.f4176l.Signature(carIcon);
        if (i == 1 || i == 0 || i == 2) {
            Objects.requireNonNull(carIcon);
            return new CarIconSpan(carIcon, i);
        }
        C8339l.smaato(AbstractC0653l.vip(i, "Invalid alignment value: "));
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarIconSpan) {
            return Objects.equals(this.mIcon, ((CarIconSpan) obj).mIcon);
        }
        return false;
    }

    public int getAlignment() {
        return this.mAlignment;
    }

    public CarIcon getIcon() {
        CarIcon carIcon = this.mIcon;
        Objects.requireNonNull(carIcon);
        return carIcon;
    }

    public int hashCode() {
        return Objects.hashCode(this.mIcon);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[icon: ");
        sb.append(this.mIcon);
        sb.append(", alignment: ");
        return AbstractC0653l.ads(sb, alignmentToString(this.mAlignment), "]");
    }

    private CarIconSpan(CarIcon carIcon, int i) {
        this.mIcon = carIcon;
        this.mAlignment = i;
    }

    public static CarIconSpan create(CarIcon carIcon) {
        return create(carIcon, 1);
    }
}
