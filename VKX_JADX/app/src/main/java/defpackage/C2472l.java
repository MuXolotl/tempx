package defpackage;

/* JADX INFO: renamed from: lؚؔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2472l extends C12474l {
    @Override // defpackage.C12474l, defpackage.C18615l
    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final void mo1140native(long[] jArr) {
        long[] jArr2 = this.subs;
        if (jArr2 != null) {
            if (jArr != null) {
                C13698l c13698l = new C13698l((byte) 0, 13);
                c13698l.firebase(jArr2);
                c13698l.firebase(jArr);
                long[] jArr3 = (long[]) c13698l.f26746l;
                jArr2 = new long[c13698l.m3681static()];
                c13698l.m3673final(jArr3, jArr2);
            }
            jArr = jArr2;
        }
        int iM162case = this.amazon.m162case(jArr, 191, 160, "map") * 2;
        if (iM162case >= 0) {
            this.billing = true;
            this.purchase = iM162case;
        }
    }
}
