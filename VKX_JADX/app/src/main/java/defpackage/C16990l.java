package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًٗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16990l implements InterfaceC10666l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f33117l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f33118l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f33119l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f33120l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f33121l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f33122l;

    public C16990l() {
        this.f33117l = new LinkedHashMap();
        this.f33121l = new LinkedHashMap();
        this.f33120l = new LinkedHashMap();
        this.f33122l = new C17049l(15);
        this.f33119l = true;
        this.f33118l = true;
        boolean z = AbstractC4981l.yandex;
    }

    @Override // defpackage.InterfaceC10666l
    public boolean admob() {
        if (this.f33119l) {
            ((C3071l) this.f33117l).getClass();
            return false;
        }
        InterfaceC10666l interfaceC10666l = (InterfaceC10666l) this.f33122l;
        interfaceC10666l.getClass();
        return interfaceC10666l.admob();
    }

    public void amazon(AbstractC1091l abstractC1091l) {
        InterfaceC10666l interfaceC10666l;
        InterfaceC10666l interfaceC10666lSubs = abstractC1091l.subs();
        if (interfaceC10666lSubs == null || interfaceC10666lSubs == (interfaceC10666l = (InterfaceC10666l) this.f33122l)) {
            return;
        }
        if (interfaceC10666l != null) {
            throw new C17361l(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f33122l = interfaceC10666lSubs;
        this.f33120l = abstractC1091l;
        ((C4886l) interfaceC10666lSubs).loadAd((C1372l) ((C3071l) this.f33117l).f6605l);
    }

    @Override // defpackage.InterfaceC10666l
    public C1372l billing() {
        InterfaceC10666l interfaceC10666l = (InterfaceC10666l) this.f33122l;
        return interfaceC10666l != null ? interfaceC10666l.billing() : (C1372l) ((C3071l) this.f33117l).f6605l;
    }

    public void crashlytics(InterfaceC1541l interfaceC1541l) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f33117l;
        if (linkedHashMap.containsKey(interfaceC1541l.getKey())) {
            return;
        }
        linkedHashMap.put(interfaceC1541l.getKey(), new C17015l(2, interfaceC1541l));
    }

    @Override // defpackage.InterfaceC10666l
    public void loadAd(C1372l c1372l) {
        InterfaceC10666l interfaceC10666l = (InterfaceC10666l) this.f33122l;
        if (interfaceC10666l != null) {
            interfaceC10666l.loadAd(c1372l);
            c1372l = ((InterfaceC10666l) this.f33122l).billing();
        }
        ((C3071l) this.f33117l).loadAd(c1372l);
    }

    @Override // defpackage.InterfaceC10666l
    public long mopub() {
        if (this.f33119l) {
            return ((C3071l) this.f33117l).mopub();
        }
        InterfaceC10666l interfaceC10666l = (InterfaceC10666l) this.f33122l;
        interfaceC10666l.getClass();
        return interfaceC10666l.mopub();
    }

    public void purchase(C16990l c16990l) {
        this.f33119l = c16990l.f33119l;
        this.f33118l = c16990l.f33118l;
        ((LinkedHashMap) this.f33117l).putAll((LinkedHashMap) c16990l.f33117l);
        ((LinkedHashMap) this.f33121l).putAll((LinkedHashMap) c16990l.f33121l);
        ((LinkedHashMap) this.f33120l).putAll((LinkedHashMap) c16990l.f33120l);
    }

    public void yandex(InterfaceC1541l interfaceC1541l, Function1 function1) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f33121l;
        linkedHashMap.put(interfaceC1541l.getKey(), new C12342l((Function1) linkedHashMap.get(interfaceC1541l.getKey()), function1, 0));
        crashlytics(interfaceC1541l);
    }

    public C16990l(C0477l c0477l, C18527l c18527l) {
        this.f33121l = c0477l;
        this.f33117l = new C3071l(c18527l);
        this.f33119l = true;
    }
}
