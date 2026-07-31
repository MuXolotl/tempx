package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؚؚٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7298l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C8785l c8785l = (C8785l) obj;
        String str = c8785l.f18086l;
        c1080l.m788class(c8785l.yandex());
        C10434l.f21246l.yandex().subs(c1080l, 3, c8785l.f18087l);
        EnumC15144l enumC15144l = c8785l.f18085l;
        if (enumC15144l != EnumC15144l.NEW) {
            EnumC15144l.f29701l.subs(c1080l, 2, enumC15144l);
        }
        if (AbstractC8576l.yandex(str, "")) {
            return;
        }
        AbstractC7532l.startapp.subs(c1080l, 1, str);
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        Object objCrashlytics = EnumC15144l.NEW;
        ArrayList arrayList = new ArrayList();
        long jAmazon = c7084l.amazon();
        String strSmaato = "";
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C8785l(strSmaato, (EnumC15144l) objCrashlytics, arrayList, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                AbstractC7532l.startapp.getClass();
                strSmaato = c7084l.smaato();
            } else if (iMopub == 2) {
                try {
                    objCrashlytics = EnumC15144l.f29701l.crashlytics(c7084l);
                } catch (C12016l e) {
                    c7084l.yandex(iMopub, 1, Long.valueOf(e.f23945l));
                }
            } else if (iMopub != 3) {
                c7084l.remoteconfig(iMopub);
            } else {
                arrayList.add(C10434l.f21246l.crashlytics(c7084l));
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C8785l c8785l = (C8785l) obj;
        int iPurchase = c8785l.yandex().purchase();
        String str = c8785l.f18086l;
        if (!AbstractC8576l.yandex(str, "")) {
            iPurchase += AbstractC7532l.startapp.firebase(1, str);
        }
        EnumC15144l enumC15144l = c8785l.f18085l;
        if (enumC15144l != EnumC15144l.NEW) {
            iPurchase += EnumC15144l.f29701l.firebase(2, enumC15144l);
        }
        return C10434l.f21246l.yandex().firebase(3, c8785l.f18087l) + iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C8785l c8785l = (C8785l) obj;
        String str = c8785l.f18086l;
        if (!AbstractC8576l.yandex(str, "")) {
            AbstractC7532l.startapp.admob(c13161l, 1, str);
        }
        EnumC15144l enumC15144l = c8785l.f18085l;
        if (enumC15144l != EnumC15144l.NEW) {
            EnumC15144l.f29701l.admob(c13161l, 2, enumC15144l);
        }
        C10434l.f21246l.yandex().admob(c13161l, 3, c8785l.f18087l);
        c13161l.m3586switch(c8785l.yandex());
    }
}
