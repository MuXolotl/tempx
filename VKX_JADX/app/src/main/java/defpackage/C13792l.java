package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْۥۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llْۥۗ;", "Llَّؓ;", "Llٓۨۦ;", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class C13792l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C7190l f26916l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final InterfaceC17030l f26917l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final AbstractC8939l f26918l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C13177l f26919l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C7819l f26920l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final String f26921l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Function1 f26922l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Function1 f26923l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C13204l f26924l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final InterfaceC13460l f26925l;

    public C13792l(C7819l c7819l, C13177l c13177l, C7190l c7190l, Function1 function1, Function1 function2, InterfaceC13460l interfaceC13460l, InterfaceC17030l interfaceC17030l, AbstractC8939l abstractC8939l, C13204l c13204l, String str) {
        this.f26920l = c7819l;
        this.f26919l = c13177l;
        this.f26916l = c7190l;
        this.f26923l = function1;
        this.f26922l = function2;
        this.f26925l = interfaceC13460l;
        this.f26917l = interfaceC17030l;
        this.f26918l = abstractC8939l;
        this.f26924l = c13204l;
        this.f26921l = str;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C14587l c14587l = (C14587l) abstractC14971l;
        long jSubs = c14587l.f28561l.subs();
        C15466l c15466l = c14587l.f28562l;
        C7190l c7190l = this.f26916l;
        C13177l c13177l = this.f26919l;
        C7819l c7819l = this.f26920l;
        C11084l c11084l = new C11084l(c13177l, c7819l, c7190l);
        C7737l c7737l = c14587l.f28561l;
        c7737l.f16235l = this.f26923l;
        c7737l.f16249l = this.f26922l;
        InterfaceC17030l interfaceC17030l = this.f26917l;
        c7737l.f16244l = interfaceC17030l;
        c7737l.f16240l = 1;
        c7737l.f16242l = this.f26924l;
        c7737l.metrica(c11084l);
        boolean zLoadAd = C14174l.loadAd(jSubs, c7737l.subs());
        c14587l.f28567l = this.f26925l;
        InterfaceC0476l interfaceC0476l = c7819l.ads;
        c14587l.f28562l = interfaceC0476l instanceof C15466l ? (C15466l) interfaceC0476l : null;
        c14587l.f28564l = interfaceC17030l;
        c14587l.f28566l = 1.0f;
        c14587l.f28568l = this.f26918l;
        c14587l.f28565l = true;
        String str = c14587l.f28563l;
        String str2 = this.f26921l;
        if (!AbstractC8576l.yandex(str, str2)) {
            c14587l.f28563l = str2;
            AbstractC18037l.purchase(c14587l);
        }
        boolean zYandex = AbstractC8576l.yandex(c15466l, c14587l.f28562l);
        if (!zLoadAd || !zYandex) {
            AbstractC4047l.isPro(c14587l);
        }
        AbstractC2697l.firebase(c14587l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13792l)) {
            return false;
        }
        C13792l c13792l = (C13792l) obj;
        return this.f26920l.equals(c13792l.f26920l) && AbstractC8576l.yandex(this.f26919l, c13792l.f26919l) && AbstractC8576l.yandex(this.f26916l, c13792l.f26916l) && AbstractC8576l.yandex(this.f26923l, c13792l.f26923l) && AbstractC8576l.yandex(this.f26922l, c13792l.f26922l) && AbstractC8576l.yandex(this.f26925l, c13792l.f26925l) && AbstractC8576l.yandex(this.f26917l, c13792l.f26917l) && Float.compare(1.0f, 1.0f) == 0 && AbstractC8576l.yandex(this.f26918l, c13792l.f26918l) && AbstractC8576l.yandex(this.f26924l, c13792l.f26924l) && AbstractC8576l.yandex(this.f26921l, c13792l.f26921l);
    }

    public final int hashCode() {
        int iHashCode = (this.f26923l.hashCode() + ((this.f26916l.hashCode() + ((this.f26919l.hashCode() + (this.f26920l.hashCode() * 31)) * 31)) * 31)) * 31;
        Function1 function1 = this.f26922l;
        int iMopub = AbstractC9029l.mopub((this.f26917l.hashCode() + ((this.f26925l.hashCode() + ((((iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31) + 1) * 31)) * 31)) * 31, 1.0f, 31);
        AbstractC8939l abstractC8939l = this.f26918l;
        int iHashCode2 = (((iMopub + (abstractC8939l == null ? 0 : abstractC8939l.hashCode())) * 31) + 1231) * 31;
        C13204l c13204l = this.f26924l;
        int iHashCode3 = (iHashCode2 + (c13204l == null ? 0 : c13204l.hashCode())) * 31;
        String str = this.f26921l;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C7190l c7190l = this.f26916l;
        C13177l c13177l = this.f26919l;
        C7819l c7819l = this.f26920l;
        C11084l c11084l = new C11084l(c13177l, c7819l, c7190l);
        C7737l c7737l = new C7737l(c11084l);
        c7737l.f16235l = this.f26923l;
        c7737l.f16249l = this.f26922l;
        c7737l.f16244l = this.f26917l;
        c7737l.f16240l = 1;
        c7737l.f16242l = this.f26924l;
        c7737l.metrica(c11084l);
        InterfaceC0476l interfaceC0476l = c7819l.ads;
        return new C14587l(c7737l, this.f26925l, this.f26917l, this.f26918l, this.f26921l, interfaceC0476l instanceof C15466l ? (C15466l) interfaceC0476l : null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentPainterElement(request=");
        sb.append(this.f26920l);
        sb.append(", imageLoader=");
        sb.append(this.f26919l);
        sb.append(", modelEqualityDelegate=");
        sb.append(this.f26916l);
        sb.append(", transform=");
        sb.append(this.f26923l);
        sb.append(", onState=");
        sb.append(this.f26922l);
        sb.append(", filterQuality=");
        sb.append("Low");
        sb.append(", alignment=");
        sb.append(this.f26925l);
        sb.append(", contentScale=");
        sb.append(this.f26917l);
        sb.append(", alpha=1.0, colorFilter=");
        sb.append(this.f26918l);
        sb.append(", clipToBounds=true, previewHandler=");
        sb.append(this.f26924l);
        sb.append(", contentDescription=");
        return AbstractC0653l.ads(sb, this.f26921l, ")");
    }
}
