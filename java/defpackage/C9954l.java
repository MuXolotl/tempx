package defpackage;

/* JADX INFO: renamed from: lٍۦٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C9954l extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public C9954l(String str, C10166l c10166l) {
        StringBuilder sbAdvert = AbstractC5020l.advert(str, ", frames: ");
        sbAdvert.append(c10166l.billing());
        super(sbAdvert.toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9954l(String str, C10166l c10166l, Exception exc) {
        StringBuilder sbAdvert = AbstractC5020l.advert(str, ", frames: ");
        sbAdvert.append(c10166l.billing());
        super(sbAdvert.toString(), exc);
    }
}
