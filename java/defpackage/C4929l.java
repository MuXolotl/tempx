package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lؗٗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llؗٗؕ;", "Llَّؓ;", "Llّ٘ۘ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class C4929l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final float f10039l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final InterfaceC6347l f10040l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final boolean f10041l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final float f10042l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final float f10043l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final long f10044l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final float f10045l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final float f10046l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C2068l f10047l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final long f10048l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final long f10049l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final int f10050l;

    public C4929l(float f, float f2, float f3, float f4, float f5, long j, InterfaceC6347l interfaceC6347l, boolean z, long j2, long j3, int i, C2068l c2068l) {
        this.f10043l = f;
        this.f10042l = f2;
        this.f10039l = f3;
        this.f10046l = f4;
        this.f10045l = f5;
        this.f10049l = j;
        this.f10040l = interfaceC6347l;
        this.f10041l = z;
        this.f10048l = j2;
        this.f10044l = j3;
        this.f10050l = i;
        this.f10047l = c2068l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C18148l c18148l = (C18148l) abstractC14971l;
        c18148l.f35526l = this.f10043l;
        c18148l.f35520l = this.f10042l;
        c18148l.f35523l = this.f10039l;
        c18148l.f35529l = this.f10046l;
        c18148l.f35522l = this.f10045l;
        c18148l.f35519l = 8.0f;
        c18148l.f35518l = this.f10049l;
        c18148l.f35517l = this.f10040l;
        c18148l.f35530l = this.f10041l;
        c18148l.f35521l = this.f10048l;
        c18148l.f35525l = this.f10044l;
        c18148l.f35528l = this.f10050l;
        c18148l.f35516l = 3;
        c18148l.f35524l = this.f10047l;
        AbstractC4047l.remoteconfig(c18148l, c18148l.f35527l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4929l)) {
            return false;
        }
        C4929l c4929l = (C4929l) obj;
        return Float.compare(this.f10043l, c4929l.f10043l) == 0 && Float.compare(this.f10042l, c4929l.f10042l) == 0 && Float.compare(this.f10039l, c4929l.f10039l) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f10046l, c4929l.f10046l) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f10045l, c4929l.f10045l) == 0 && Float.compare(8.0f, 8.0f) == 0 && C1723l.yandex(this.f10049l, c4929l.f10049l) && AbstractC8576l.yandex(this.f10040l, c4929l.f10040l) && this.f10041l == c4929l.f10041l && C9735l.crashlytics(this.f10048l, c4929l.f10048l) && C9735l.crashlytics(this.f10044l, c4929l.f10044l) && this.f10050l == c4929l.f10050l && AbstractC8576l.yandex(this.f10047l, c4929l.f10047l);
    }

    public final int hashCode() {
        int iMopub = AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.f10043l) * 31, this.f10042l, 31), this.f10039l, 31), 0.0f, 31), 0.0f, 31), this.f10046l, 31), 0.0f, 31), 0.0f, 31), this.f10045l, 31), 8.0f, 31);
        int i = C1723l.crashlytics;
        long j = this.f10049l;
        int iIsPro = (AbstractC2812l.isPro(this.f10040l, (((int) (j ^ (j >>> 32))) + iMopub) * 31, 31) + (this.f10041l ? 1231 : 1237)) * 961;
        int i2 = C9735l.smaato;
        return this.f10047l.hashCode() + ((((AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(iIsPro, this.f10048l, 31), this.f10044l, 31) + this.f10050l) * 31) + 3) * 961);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C18148l c18148l = new C18148l();
        c18148l.f35526l = this.f10043l;
        c18148l.f35520l = this.f10042l;
        c18148l.f35523l = this.f10039l;
        c18148l.f35529l = this.f10046l;
        c18148l.f35522l = this.f10045l;
        c18148l.f35519l = 8.0f;
        c18148l.f35518l = this.f10049l;
        c18148l.f35517l = this.f10040l;
        c18148l.f35530l = this.f10041l;
        c18148l.f35521l = this.f10048l;
        c18148l.f35525l = this.f10044l;
        c18148l.f35528l = this.f10050l;
        c18148l.f35516l = 3;
        c18148l.f35524l = this.f10047l;
        c18148l.f35527l = new C10065l(3, c18148l);
        return c18148l;
    }

    public final String toString() {
        String strLoadAd = C1723l.loadAd(this.f10049l);
        String strSubs = C9735l.subs(this.f10048l);
        String strSubs2 = C9735l.subs(this.f10044l);
        String strTapsense = AbstractC15560l.tapsense("CompositingStrategy(value=", this.f10050l, ")");
        String strAmazon = AbstractC16759l.amazon(3);
        StringBuilder sbTapsense = AbstractC14814l.tapsense("GraphicsLayerElement(scaleX=", this.f10043l, ", scaleY=", this.f10042l, ", alpha=");
        sbTapsense.append(this.f10039l);
        sbTapsense.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sbTapsense.append(this.f10046l);
        sbTapsense.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sbTapsense.append(this.f10045l);
        sbTapsense.append(", cameraDistance=8.0, transformOrigin=");
        sbTapsense.append(strLoadAd);
        sbTapsense.append(", shape=");
        sbTapsense.append(this.f10040l);
        sbTapsense.append(", clip=");
        sbTapsense.append(this.f10041l);
        sbTapsense.append(", renderEffect=null, ambientShadowColor=");
        AbstractC9361l.appmetrica(sbTapsense, strSubs, ", spotShadowColor=", strSubs2, ", compositingStrategy=");
        AbstractC9361l.appmetrica(sbTapsense, strTapsense, ", blendMode=", strAmazon, ", colorFilter=null, outsets=");
        sbTapsense.append(this.f10047l);
        sbTapsense.append(")");
        return sbTapsense.toString();
    }
}
