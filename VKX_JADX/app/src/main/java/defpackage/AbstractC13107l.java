package defpackage;

/* JADX INFO: renamed from: lْؔۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13107l {
    public byte yandex;

    public AbstractC13107l() {
        this.yandex = (byte) 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC13107l) && ((long) yandex()) == ((long) ((AbstractC13107l) obj).yandex());
    }

    public byte yandex() {
        return this.yandex;
    }

    public AbstractC13107l(byte b) {
        this.yandex = b;
    }
}
