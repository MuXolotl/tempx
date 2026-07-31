package defpackage;

/* JADX INFO: renamed from: lٍؑٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9254l {
    public final /* synthetic */ int yandex;

    public /* synthetic */ C9254l(int i) {
        this.yandex = i;
    }

    public static void loadAd(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
    }

    public static C4124l yandex(C13812l c13812l, advert advertVar) {
        try {
            Ccase ccaseAdvert = Ccase.advert(advertVar.inmobi());
            if (!(ccaseAdvert instanceof Cclass)) {
                return new C4124l(c13812l, Cthrow.premium(ccaseAdvert).f36593l);
            }
            Cclass cclassInmobi = Cclass.inmobi(ccaseAdvert);
            return new C4124l(c13812l, Cthrow.premium(cclassInmobi.mo173throws(0)).f36593l, Cthrow.premium(cclassInmobi.mo173throws(1)).f36593l);
        } catch (Exception unused) {
            return new C4124l(c13812l, advertVar.inmobi());
        }
    }
}
