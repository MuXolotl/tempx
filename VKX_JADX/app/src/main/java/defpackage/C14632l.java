package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: lٔؒۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14632l implements InterfaceC13553l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC2262l f28634l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC13553l f28635l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC18212l f28636l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public InterfaceC18212l f28638l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C10086l f28631l = AbstractC8020l.smaato(Boolean.FALSE);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C11029l f28637l = new C11029l(17, this);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C10086l f28632l = AbstractC8020l.smaato(new ArrayList());

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C12376l f28633l = new C12376l();

    public C14632l(InterfaceC13553l interfaceC13553l, InterfaceC2262l interfaceC2262l) {
        this.f28635l = interfaceC13553l;
        this.f28634l = interfaceC2262l;
    }

    public final C8832l amazon(String str, C6956l c6956l) {
        c6956l.m2123default(800730162);
        c6956l.m2123default(-148945892);
        boolean zBilling = c6956l.billing(str);
        Object objM2132native = c6956l.m2132native();
        if (zBilling || objM2132native == C1867l.yandex) {
            objM2132native = new C8832l(str);
            c6956l.m2147try(objM2132native);
        }
        C8832l c8832l = (C8832l) objM2132native;
        c8832l.loadAd.setValue(C0020l.yandex);
        c6956l.startapp(false);
        c6956l.startapp(false);
        return c8832l;
    }

    @Override // defpackage.InterfaceC13553l
    public final long crashlytics(InterfaceC18212l interfaceC18212l, InterfaceC18212l interfaceC18212l2) {
        return this.f28635l.crashlytics(interfaceC18212l, interfaceC18212l2);
    }

    public final boolean loadAd() {
        return ((Boolean) this.f28631l.getValue()).booleanValue();
    }

    public final void purchase() {
        Collection<C14509l> collectionValues = ((C7090l) this.f28633l.purchase().crashlytics).values();
        boolean z = false;
        for (C14509l c14509l : collectionValues) {
            z = z || (c14509l.yandex() && c14509l.amazon());
            c14509l.purchase();
        }
        if (z != loadAd()) {
            this.f28631l.setValue(Boolean.valueOf(z));
            if (z) {
                return;
            }
            for (C14509l c14509l2 : collectionValues) {
                if (c14509l2.crashlytics().size() > 1) {
                    List listCrashlytics = c14509l2.crashlytics();
                    int i = AbstractC3674l.yandex;
                    int size = listCrashlytics.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            if (((C0633l) listCrashlytics.get(i2)).amazon().loadAd()) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                C17724l c17724l = c14509l2.crashlytics;
                c17724l.loadAd = 1;
                c17724l.yandex = ((C15308l) c17724l.billing).admob();
                ((C10086l) c17724l.purchase).setValue(C10323l.yandex);
            }
        }
    }

    @Override // defpackage.InterfaceC13553l
    public final InterfaceC18212l yandex(InterfaceC18212l interfaceC18212l) {
        return this.f28635l.yandex(interfaceC18212l);
    }
}
