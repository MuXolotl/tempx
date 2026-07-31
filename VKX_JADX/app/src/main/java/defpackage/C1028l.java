package defpackage;

/* JADX INFO: renamed from: lْۣؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1028l extends AbstractC9813l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f2861l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f2862l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2863l = 0;

    public C1028l(float[] fArr) {
        this.f2861l = fArr;
        this.f2862l = fArr.length / 2;
    }

    @Override // defpackage.AbstractC7095l, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        switch (this.f2863l) {
            case 1:
                if (obj instanceof C9735l) {
                    return super.contains(new C9735l(((C9735l) obj).yandex));
                }
                return false;
            case 2:
                if (obj instanceof C1187l) {
                    return super.contains(new C1187l(((C1187l) obj).yandex));
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f2863l;
        Object obj = this.f2861l;
        switch (i2) {
            case 0:
                return ((C1412l) obj).invoke(Integer.valueOf(i));
            case 1:
                return new C9735l(((long[]) obj)[i]);
            default:
                float[] fArr = (float[]) obj;
                int i3 = i * 2;
                float f = fArr[i3];
                return new C1187l((((long) Float.floatToRawIntBits(fArr[i3 + 1])) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        }
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public int indexOf(Object obj) {
        switch (this.f2863l) {
            case 1:
                if (obj instanceof C9735l) {
                    return super.indexOf(new C9735l(((C9735l) obj).yandex));
                }
                return -1;
            case 2:
                if (obj instanceof C1187l) {
                    return super.indexOf(new C1187l(((C1187l) obj).yandex));
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public int lastIndexOf(Object obj) {
        switch (this.f2863l) {
            case 1:
                if (obj instanceof C9735l) {
                    return super.lastIndexOf(new C9735l(((C9735l) obj).yandex));
                }
                return -1;
            case 2:
                if (obj instanceof C1187l) {
                    return super.lastIndexOf(new C1187l(((C1187l) obj).yandex));
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.AbstractC7095l
    public final int pro() {
        switch (this.f2863l) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f2862l;
    }

    public C1028l(int i, C1412l c1412l) {
        this.f2862l = i;
        this.f2861l = c1412l;
    }

    public C1028l(long[] jArr) {
        this.f2861l = jArr;
        this.f2862l = jArr.length;
    }
}
