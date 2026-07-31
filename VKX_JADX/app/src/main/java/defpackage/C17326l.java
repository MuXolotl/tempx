package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: lٜٗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17326l implements InterfaceC12356l, InterfaceC11947l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f33636l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f33637l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33638l;

    public /* synthetic */ C17326l(InterfaceC12356l interfaceC12356l, InterfaceC17842l interfaceC17842l, int i) {
        this.f33638l = i;
        this.f33637l = interfaceC12356l;
        this.f33636l = interfaceC17842l;
    }

    public void admob(EnumC2771l enumC2771l) {
        if (((EnumC2771l) this.f33636l) == enumC2771l) {
            return;
        }
        StringBuilder sb = new StringBuilder("Expected state ");
        sb.append(enumC2771l);
        C18353l.adcel(sb, " but was ", (EnumC2771l) this.f33636l);
    }

    @Override // defpackage.InterfaceC11947l
    public final void amazon() {
        switch (this.f33638l) {
            case 0:
                admob(EnumC2771l.f6021l);
                this.f33636l = EnumC2771l.f6020l;
                Iterator it = ((Set) this.f33637l).iterator();
                while (it.hasNext()) {
                    ((InterfaceC11947l) it.next()).amazon();
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC11947l
    public final void billing() {
        int i = 1;
        InterfaceC14029l interfaceC14029l = null;
        int i2 = 0;
        switch (this.f33638l) {
            case 0:
                admob(EnumC2771l.f6017l);
                this.f33636l = EnumC2771l.f6021l;
                Iterator it = ((Set) this.f33637l).iterator();
                while (it.hasNext()) {
                    ((InterfaceC11947l) it.next()).billing();
                }
                break;
            case 1:
            case 2:
                break;
            case 3:
                ((InterfaceC12356l) this.f33637l).crashlytics(this);
                C5803l c5803l = (C5803l) this.f33636l;
                AbstractC10999l.mopub(c5803l.purchase, null, 0, new C6518l(c5803l, interfaceC14029l, i), 3);
                break;
            case 4:
                ((InterfaceC12356l) this.f33637l).crashlytics(this);
                C13242l c13242l = (C13242l) this.f33636l;
                AbstractC10999l.mopub(c13242l.mopub, null, 0, new C3381l(c13242l, interfaceC14029l, i2), 3);
                break;
            case 5:
                ((InterfaceC12356l) this.f33637l).crashlytics(this);
                C0324l c0324l = (C0324l) this.f33636l;
                AbstractC10999l.mopub(c0324l.purchase, null, 0, new C9692l(c0324l, interfaceC14029l, i), 3);
                break;
            default:
                ((InterfaceC12356l) this.f33637l).crashlytics(this);
                C6922l c6922l = (C6922l) this.f33636l;
                AbstractC10999l.mopub(c6922l.amazon, null, 0, new C18236l(c6922l, interfaceC14029l, i), 3);
                break;
        }
    }

    @Override // defpackage.InterfaceC12356l
    public void crashlytics(InterfaceC11947l interfaceC11947l) {
        this.f33637l = AbstractC9905l.amazon((Set) this.f33637l, interfaceC11947l);
    }

    @Override // defpackage.InterfaceC11947l
    public final void loadAd() {
        switch (this.f33638l) {
            case 0:
                admob(EnumC2771l.f6021l);
                this.f33636l = EnumC2771l.f6017l;
                Iterator it = AbstractC16901l.m4240super((Set) this.f33637l).iterator();
                while (it.hasNext()) {
                    ((InterfaceC11947l) it.next()).loadAd();
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC12356l
    public void mopub(InterfaceC11947l interfaceC11947l) {
        if (((Set) this.f33637l).contains(interfaceC11947l)) {
            C8339l.smaato("Already subscribed");
            return;
        }
        this.f33637l = AbstractC9905l.admob((Set) this.f33637l, interfaceC11947l);
        EnumC2771l enumC2771l = (EnumC2771l) this.f33636l;
        if (enumC2771l.compareTo(EnumC2771l.f6017l) >= 0) {
            interfaceC11947l.onCreate();
        }
        if (enumC2771l.compareTo(EnumC2771l.f6021l) >= 0) {
            interfaceC11947l.billing();
        }
        if (enumC2771l.compareTo(EnumC2771l.f6020l) >= 0) {
            interfaceC11947l.amazon();
        }
    }

    @Override // defpackage.InterfaceC11947l
    public final void onCreate() {
        switch (this.f33638l) {
            case 0:
                admob(EnumC2771l.f6018l);
                this.f33636l = EnumC2771l.f6017l;
                Iterator it = ((Set) this.f33637l).iterator();
                while (it.hasNext()) {
                    ((InterfaceC11947l) it.next()).onCreate();
                }
                break;
            case 1:
                ((InterfaceC12356l) this.f33637l).crashlytics(this);
                C11919l c11919l = ((C0956l) this.f33636l).amazon;
                ArrayList<C15050l> arrayListSubs = AbstractC16584l.loadAd().subs();
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(arrayListSubs, 10));
                for (C15050l c15050l : arrayListSubs) {
                    arrayList.add(new C8032l(c15050l.yandex, c15050l.crashlytics, c15050l.loadAd));
                }
                c11919l.subscription(AbstractC0509l.purchase(arrayList));
                break;
            case 2:
                ((InterfaceC12356l) this.f33637l).crashlytics(this);
                C17723l c17723l = (C17723l) this.f33636l;
                AbstractC10999l.mopub(c17723l.billing, null, 0, new C11671l(c17723l, null, 4), 3);
                break;
        }
    }

    @Override // defpackage.InterfaceC11947l
    public final void onDestroy() {
        switch (this.f33638l) {
            case 0:
                admob(EnumC2771l.f6017l);
                this.f33636l = EnumC2771l.f6019l;
                Iterator it = AbstractC16901l.m4240super((Set) this.f33637l).iterator();
                while (it.hasNext()) {
                    ((InterfaceC11947l) it.next()).onDestroy();
                }
                this.f33637l = C5746l.f12138l;
                break;
        }
    }

    @Override // defpackage.InterfaceC11947l
    public final void purchase() {
        switch (this.f33638l) {
            case 0:
                admob(EnumC2771l.f6020l);
                this.f33636l = EnumC2771l.f6021l;
                Iterator it = AbstractC16901l.m4240super((Set) this.f33637l).iterator();
                while (it.hasNext()) {
                    ((InterfaceC11947l) it.next()).purchase();
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC12356l
    public EnumC2771l yandex() {
        return (EnumC2771l) this.f33636l;
    }

    public /* synthetic */ C17326l() {
        this.f33638l = 0;
    }

    private final void Signature() {
    }

    private final void ad() {
    }

    private final void adcel() {
    }

    private final void ads() {
    }

    private final void advert() {
    }

    private final void applovin() {
    }

    private final void appmetrica() {
    }

    private final void firebase() {
    }

    private final void inmobi() {
    }

    private final void isPro() {
    }

    private final void isVip() {
    }

    private final void license() {
    }

    private final void metrica() {
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    private final void m4304native() {
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    private final void m4305package() {
    }

    private final void premium() {
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    private final void m4306private() {
    }

    private final void pro() {
    }

    private final void remoteconfig() {
    }

    private final void signatures() {
    }

    private final void smaato() {
    }

    private final void startapp() {
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    private final void m4307strictfp() {
    }

    private final void subs() {
    }

    private final void subscription() {
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    private final void m4308synchronized() {
    }

    private final void tapsense() {
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    private final void m4309throws() {
    }

    private final void vip() {
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    private final void m4310volatile() {
    }
}
