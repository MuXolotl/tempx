package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lؗۧۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5307l implements InterfaceC0048l, InterfaceC4089l, InterfaceC0491l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C6916l f11424l = new C6916l("camerax.core.streamSharing.captureTypes", List.class, null);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C7420l f11425l;

    public C5307l(C7420l c7420l) {
        this.f11425l = c7420l;
    }

    @Override // defpackage.InterfaceC17944l
    public final /* synthetic */ Set Signature(C6916l c6916l) {
        return AbstractC4338l.billing(this, c6916l);
    }

    @Override // defpackage.InterfaceC4089l
    public final C18085l ad() {
        int i = AbstractC17666l.yandex;
        return (C18085l) smaato(InterfaceC4089l.f8427volatile, null);
    }

    @Override // defpackage.InterfaceC17944l
    public final /* synthetic */ Object adcel(C6916l c6916l) {
        return AbstractC4338l.firebase(this, c6916l);
    }

    @Override // defpackage.InterfaceC4089l
    public final C18085l admob() {
        int i = AbstractC17666l.yandex;
        return (C18085l) adcel(InterfaceC4089l.f8427volatile);
    }

    @Override // defpackage.InterfaceC0048l
    public final /* synthetic */ C10814l ads() {
        return AbstractC12589l.purchase(this);
    }

    @Override // defpackage.InterfaceC17944l
    public final /* synthetic */ Object advert(C6916l c6916l, EnumC10534l enumC10534l) {
        return AbstractC4338l.remoteconfig(this, c6916l, enumC10534l);
    }

    @Override // defpackage.InterfaceC15273l
    public final /* synthetic */ String applovin(String str) {
        return AbstractC12589l.metrica(this, str);
    }

    @Override // defpackage.InterfaceC4089l
    public final Size appmetrica() {
        int i = AbstractC17666l.yandex;
        return (Size) smaato(InterfaceC4089l.f8423package, null);
    }

    @Override // defpackage.InterfaceC4089l
    public final List billing() {
        int i = AbstractC17666l.yandex;
        return (List) smaato(InterfaceC4089l.f8424strictfp, null);
    }

    @Override // defpackage.InterfaceC0048l
    /* JADX INFO: renamed from: case */
    public final /* synthetic */ C0665l mo250case() {
        return AbstractC12589l.amazon(this);
    }

    @Override // defpackage.InterfaceC0048l
    /* JADX INFO: renamed from: catch */
    public final /* synthetic */ Range mo251catch(Range range) {
        return AbstractC12589l.remoteconfig(this, range);
    }

    @Override // defpackage.InterfaceC17944l
    /* JADX INFO: renamed from: class */
    public final /* synthetic */ EnumC10534l mo860class(C6916l c6916l) {
        return AbstractC4338l.purchase(this, c6916l);
    }

    @Override // defpackage.InterfaceC4089l
    /* JADX INFO: renamed from: continue */
    public final boolean mo1482continue() {
        int i = AbstractC17666l.yandex;
        return mo861strictfp(InterfaceC4089l.premium);
    }

    @Override // defpackage.InterfaceC0048l
    /* JADX INFO: renamed from: extends */
    public final /* synthetic */ int mo252extends(Size size) {
        return AbstractC12589l.crashlytics(this, size);
    }

    @Override // defpackage.InterfaceC0048l
    /* JADX INFO: renamed from: final */
    public final /* synthetic */ boolean mo253final() {
        return AbstractC12589l.ads(this);
    }

    @Override // defpackage.InterfaceC4089l
    /* JADX INFO: renamed from: finally */
    public final /* synthetic */ int mo1483finally(int i) {
        return AbstractC17666l.purchase(this, i);
    }

    @Override // defpackage.InterfaceC16352l
    public final int firebase() {
        return ((Integer) adcel(InterfaceC16352l.advert)).intValue();
    }

    @Override // defpackage.InterfaceC0048l
    /* JADX INFO: renamed from: for */
    public final /* synthetic */ int mo254for() {
        return AbstractC12589l.subs(this);
    }

    @Override // defpackage.InterfaceC4089l
    /* JADX INFO: renamed from: import */
    public final Size mo1484import() {
        int i = AbstractC17666l.yandex;
        return (Size) smaato(InterfaceC4089l.f8425synchronized, null);
    }

    @Override // defpackage.InterfaceC17944l
    public final /* synthetic */ void inmobi(C5131l c5131l) {
        AbstractC4338l.amazon(this, c5131l);
    }

    @Override // defpackage.InterfaceC0048l
    /* JADX INFO: renamed from: instanceof */
    public final /* synthetic */ boolean mo255instanceof() {
        return AbstractC12589l.subscription(this);
    }

    @Override // defpackage.InterfaceC4089l
    /* JADX INFO: renamed from: interface */
    public final /* synthetic */ int mo1485interface() {
        return AbstractC17666l.amazon(this);
    }

    @Override // defpackage.InterfaceC0048l
    public final /* synthetic */ boolean license() {
        return AbstractC12589l.adcel(this);
    }

    @Override // defpackage.InterfaceC16352l
    public final /* synthetic */ C15421l loadAd() {
        return AbstractC2812l.yandex(this);
    }

    @Override // defpackage.InterfaceC16352l
    public final boolean metrica() {
        return mo861strictfp(InterfaceC16352l.signatures);
    }

    @Override // defpackage.InterfaceC0048l
    /* JADX INFO: renamed from: native */
    public final /* synthetic */ EnumC11949l mo256native() {
        return AbstractC12589l.loadAd(this);
    }

    @Override // defpackage.InterfaceC0048l
    /* JADX INFO: renamed from: package */
    public final /* synthetic */ EnumC18632l mo257package() {
        return AbstractC12589l.isPro(this);
    }

    @Override // defpackage.InterfaceC0048l
    /* JADX INFO: renamed from: private */
    public final /* synthetic */ int mo258private() {
        return AbstractC12589l.startapp(this);
    }

    @Override // defpackage.InterfaceC4089l
    public final /* synthetic */ ArrayList pro() {
        return AbstractC17666l.loadAd(this);
    }

    @Override // defpackage.InterfaceC4089l
    public final /* synthetic */ int remoteconfig() {
        return AbstractC17666l.crashlytics(this);
    }

    @Override // defpackage.InterfaceC0048l
    public final /* synthetic */ C10814l signatures() {
        return AbstractC12589l.billing(this);
    }

    @Override // defpackage.InterfaceC17944l
    public final /* synthetic */ Object smaato(C6916l c6916l, Object obj) {
        return AbstractC4338l.smaato(this, c6916l, obj);
    }

    @Override // defpackage.InterfaceC17944l
    public final /* synthetic */ Set startapp() {
        return AbstractC4338l.isPro(this);
    }

    @Override // defpackage.InterfaceC0048l
    /* JADX INFO: renamed from: static */
    public final /* synthetic */ int mo259static() {
        return AbstractC12589l.mopub(this);
    }

    @Override // defpackage.InterfaceC17944l
    /* JADX INFO: renamed from: strictfp */
    public final /* synthetic */ boolean mo861strictfp(C6916l c6916l) {
        return AbstractC4338l.crashlytics(this, c6916l);
    }

    @Override // defpackage.InterfaceC15866l
    public final InterfaceC17944l subs() {
        return this.f11425l;
    }

    @Override // defpackage.InterfaceC0048l
    public final /* synthetic */ int subscription() {
        return AbstractC12589l.firebase(this);
    }

    @Override // defpackage.InterfaceC0048l
    /* JADX INFO: renamed from: super */
    public final boolean mo260super() {
        return mo861strictfp(InterfaceC0048l.f924l);
    }

    @Override // defpackage.InterfaceC15273l
    /* JADX INFO: renamed from: switch */
    public final /* synthetic */ String mo862switch() {
        return AbstractC12589l.vip(this);
    }

    @Override // defpackage.InterfaceC0048l
    public final /* synthetic */ C17511l tapsense() {
        return AbstractC12589l.admob(this);
    }

    @Override // defpackage.InterfaceC4089l
    /* JADX INFO: renamed from: this */
    public final /* synthetic */ int mo1486this() {
        return AbstractC17666l.yandex(this);
    }

    @Override // defpackage.InterfaceC0048l
    public final /* synthetic */ C3693l vip() {
        return AbstractC12589l.smaato(this);
    }

    @Override // defpackage.InterfaceC4089l
    /* JADX INFO: renamed from: volatile */
    public final Size mo1487volatile() {
        int i = AbstractC17666l.yandex;
        return (Size) smaato(InterfaceC4089l.f8426throws, null);
    }
}
