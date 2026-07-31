package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؑ۠ٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0633l implements InterfaceC6752l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C10086l f2084l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C10086l f2085l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C10086l f2086l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C10086l f2087l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C9902l f2090l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C10086l f2091l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C10086l f2092l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public C8030l f2093l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C10086l f2094l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C10086l f2095l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C0633l f2096l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C10086l f2089l = AbstractC8020l.smaato(Boolean.FALSE);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C13765l f2088l = new C13765l(0.0f);

    public C0633l(C14509l c14509l, C17154l c17154l, C9144l c9144l, C8832l c8832l) {
        Boolean bool = Boolean.TRUE;
        this.f2085l = AbstractC8020l.smaato(bool);
        this.f2092l = AbstractC8020l.smaato(c14509l);
        this.f2091l = AbstractC8020l.smaato(c17154l);
        this.f2095l = AbstractC8020l.smaato(C5517l.loadAd);
        this.f2086l = AbstractC8020l.smaato(bool);
        this.f2087l = AbstractC8020l.smaato(c9144l);
        this.f2094l = AbstractC8020l.smaato(c8832l);
        this.f2084l = AbstractC8020l.smaato(null);
    }

    public final boolean admob() {
        C8832l c8832l = (C8832l) this.f2094l.getValue();
        if (!((Boolean) this.f2089l.getValue()).booleanValue()) {
            return false;
        }
        ((C0020l) c8832l.loadAd.getValue()).getClass();
        return true;
    }

    public final C17154l amazon() {
        return (C17154l) this.f2091l.getValue();
    }

    public final boolean billing() {
        if (amazon().loadAd()) {
            return true;
        }
        return (purchase().crashlytics.tapsense().amazon() && !purchase().crashlytics.tapsense().loadAd()) || !((Boolean) this.f2086l.getValue()).booleanValue();
    }

    @Override // defpackage.InterfaceC6752l
    public final void crashlytics() {
        C14632l c14632l = purchase().loadAd;
        c14632l.getClass();
        C14509l c14509lPurchase = purchase();
        c14509lPurchase.amazon.setValue(AbstractC16901l.m4218final(this, c14509lPurchase.loadAd()));
        c14509lPurchase.purchase();
        c14632l.purchase();
        C10086l c10086l = c14632l.f28632l;
        List list = (List) c10086l.getValue();
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            C0633l c0633l = (C0633l) it.next();
            if (!(c0633l instanceof C0633l)) {
                c0633l = null;
            }
            if (AbstractC8576l.yandex(c0633l != null ? c0633l.purchase() : null, purchase())) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1 || i >= list.size() - 1) {
            c10086l.setValue(AbstractC16901l.m4218final(this, (List) c10086l.getValue()));
        } else {
            C10227l c10227lAdmob = AbstractC14055l.admob();
            int i2 = i + 1;
            c10227lAdmob.addAll(list.subList(0, i2));
            c10227lAdmob.add(this);
            c10227lAdmob.addAll(list.subList(i2, list.size()));
            c10086l.setValue(AbstractC14055l.purchase(c10227lAdmob));
        }
        purchase().crashlytics.Signature();
    }

    @Override // defpackage.InterfaceC6752l
    public final void loadAd() {
        C14632l c14632l = purchase().loadAd;
        c14632l.getClass();
        C14509l c14509lPurchase = purchase();
        c14509lPurchase.amazon.setValue(AbstractC16901l.m4225interface(c14509lPurchase.loadAd(), this));
        c14509lPurchase.purchase.setValue(AbstractC16901l.m4225interface(c14509lPurchase.crashlytics(), this));
        c14509lPurchase.purchase();
        c14632l.purchase();
        C10086l c10086l = c14632l.f28632l;
        c10086l.setValue(AbstractC16901l.m4225interface((List) c10086l.getValue(), this));
        if (c14509lPurchase.loadAd().isEmpty()) {
            AbstractC10999l.mopub(c14509lPurchase.loadAd.f28634l, null, 0, new C7864l(c14509lPurchase, this, (InterfaceC14029l) null, 17), 3);
        }
        purchase().crashlytics.Signature();
    }

    public final boolean mopub() {
        return billing() && purchase().crashlytics.tapsense().amazon() && admob() && ((Boolean) this.f2085l.getValue()).booleanValue() && purchase().loadAd.loadAd();
    }

    public final C14509l purchase() {
        return (C14509l) this.f2092l.getValue();
    }

    @Override // defpackage.InterfaceC6752l
    public final void yandex() {
    }
}
