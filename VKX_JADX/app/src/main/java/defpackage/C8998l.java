package defpackage;

/* JADX INFO: renamed from: lٌؘۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8998l implements InterfaceC12244l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C8610l f18541l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C10086l f18542l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C10086l f18543l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C8610l f18544l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10086l f18545l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C10086l f18546l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C10086l f18547l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C10086l f18548l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C10086l f18549l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C10086l f18550l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C10086l f18551l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C10086l f18552l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C10086l f18553l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C16801l f18554l;

    public C8998l() {
        Boolean bool = Boolean.FALSE;
        this.f18546l = AbstractC8020l.smaato(bool);
        this.f18545l = AbstractC8020l.smaato(1);
        this.f18542l = AbstractC8020l.smaato(1);
        this.f18549l = AbstractC8020l.smaato(bool);
        this.f18548l = AbstractC8020l.smaato(null);
        this.f18552l = AbstractC8020l.smaato(Float.valueOf(1.0f));
        this.f18543l = AbstractC8020l.smaato(bool);
        this.f18544l = AbstractC8020l.mopub(new C12498l(this, 1));
        this.f18551l = AbstractC8020l.smaato(null);
        Float fValueOf = Float.valueOf(0.0f);
        this.f18547l = AbstractC8020l.smaato(fValueOf);
        this.f18553l = AbstractC8020l.smaato(fValueOf);
        this.f18550l = AbstractC8020l.smaato(Long.MIN_VALUE);
        this.f18541l = AbstractC8020l.mopub(new C12498l(this, 0));
        AbstractC8020l.mopub(new C12498l(this, 2));
        this.f18554l = new C16801l();
    }

    public static final void amazon(C8998l c8998l, boolean z) {
        c8998l.f18546l.setValue(Boolean.valueOf(z));
    }

    public static final boolean crashlytics(C8998l c8998l, int i, long j) {
        C10086l c10086l = c8998l.f18551l;
        C10086l c10086l2 = c8998l.f18547l;
        C10086l c10086l3 = c8998l.f18548l;
        C8610l c8610l = c8998l.f18544l;
        C10086l c10086l4 = c8998l.f18550l;
        C10712l c10712l = (C10712l) c10086l.getValue();
        if (c10712l == null) {
            return true;
        }
        long jLongValue = ((Number) c10086l4.getValue()).longValue() == Long.MIN_VALUE ? 0L : j - ((Number) c10086l4.getValue()).longValue();
        c10086l4.setValue(Long.valueOf(j));
        if (c10086l3.getValue() != null) {
            C18725l.loadAd();
            return false;
        }
        if (c10086l3.getValue() != null) {
            C18725l.loadAd();
            return false;
        }
        float fFloatValue = ((Number) c8610l.getValue()).floatValue() * ((jLongValue / 1000000) / c10712l.loadAd());
        float fFloatValue2 = ((Number) c8610l.getValue()).floatValue() < 0.0f ? 0.0f - (((Number) c10086l2.getValue()).floatValue() + fFloatValue) : (((Number) c10086l2.getValue()).floatValue() + fFloatValue) - 1.0f;
        if (fFloatValue2 < 0.0f) {
            c8998l.admob(AbstractC8576l.amazon(((Number) c10086l2.getValue()).floatValue(), 0.0f, 1.0f) + fFloatValue);
            return true;
        }
        int i2 = (int) (fFloatValue2 / 1.0f);
        int i3 = i2 + 1;
        if (c8998l.billing() + i3 > i) {
            c8998l.admob(c8998l.purchase());
            c8998l.mopub(i);
            return false;
        }
        c8998l.mopub(c8998l.billing() + i3);
        float f = fFloatValue2 - (i2 * 1.0f);
        c8998l.admob(((Number) c8610l.getValue()).floatValue() < 0.0f ? 1.0f - f : 0.0f + f);
        return true;
    }

    public final void admob(float f) {
        C10712l c10712l;
        this.f18547l.setValue(Float.valueOf(f));
        if (((Boolean) this.f18543l.getValue()).booleanValue() && (c10712l = (C10712l) this.f18551l.getValue()) != null) {
            f -= f % (1.0f / c10712l.vip);
        }
        this.f18553l.setValue(Float.valueOf(f));
    }

    public final int billing() {
        return ((Number) this.f18545l.getValue()).intValue();
    }

    @Override // defpackage.InterfaceC12244l
    public final Object getValue() {
        return Float.valueOf(((Number) this.f18553l.getValue()).floatValue());
    }

    public final void mopub(int i) {
        this.f18545l.setValue(Integer.valueOf(i));
    }

    public final float purchase() {
        return ((Number) this.f18541l.getValue()).floatValue();
    }
}
