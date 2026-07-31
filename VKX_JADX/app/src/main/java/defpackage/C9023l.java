package defpackage;

/* JADX INFO: renamed from: lٌۙۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9023l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C16661l c16661l = (C16661l) obj;
        c1080l.m788class(c16661l.yandex());
        C11193l.f22546l.subs(c1080l, 2, c16661l.f32663l);
        EnumC1428l enumC1428l = c16661l.f32664l;
        if (enumC1428l != EnumC1428l.ANDROID) {
            EnumC1428l.f3608l.subs(c1080l, 1, enumC1428l);
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        Object objCrashlytics = EnumC1428l.ANDROID;
        long jAmazon = c7084l.amazon();
        Object objCrashlytics2 = null;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C16661l((EnumC1428l) objCrashlytics, (C11193l) objCrashlytics2, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                try {
                    objCrashlytics = EnumC1428l.f3608l.crashlytics(c7084l);
                } catch (C12016l e) {
                    c7084l.yandex(iMopub, 1, Long.valueOf(e.f23945l));
                }
            } else if (iMopub != 2) {
                c7084l.remoteconfig(iMopub);
            } else {
                objCrashlytics2 = C11193l.f22546l.crashlytics(c7084l);
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C16661l c16661l = (C16661l) obj;
        int iPurchase = c16661l.yandex().purchase();
        EnumC1428l enumC1428l = c16661l.f32664l;
        if (enumC1428l != EnumC1428l.ANDROID) {
            iPurchase += EnumC1428l.f3608l.firebase(1, enumC1428l);
        }
        return C11193l.f22546l.firebase(2, c16661l.f32663l) + iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C16661l c16661l = (C16661l) obj;
        EnumC1428l enumC1428l = c16661l.f32664l;
        if (enumC1428l != EnumC1428l.ANDROID) {
            EnumC1428l.f3608l.admob(c13161l, 1, enumC1428l);
        }
        C11193l.f22546l.admob(c13161l, 2, c16661l.f32663l);
        c13161l.m3586switch(c16661l.yandex());
    }
}
