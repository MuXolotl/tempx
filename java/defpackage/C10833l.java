package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lُؕۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10833l extends AbstractC11340l implements InterfaceC7150l, InterfaceC3506l, InterfaceC16031l {

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public Map f21893l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C7559l f21894l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C10312l f21895l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public boolean f21896l;

    public C10833l(C10312l c10312l, C16328l c16328l, C11090l c11090l, boolean z, C3790l c3790l) {
        this.f21895l = c10312l;
        this.f21896l = z;
        C7559l c7559l = new C7559l(c10312l.mopub);
        m3069l(c7559l);
        this.f21894l = c7559l;
        C10312l c10312l2 = this.f21895l;
        c10312l2.getClass();
        boolean z2 = this.f21896l;
        boolean z3 = !z2;
        C15315l c15315l = c10312l2.yandex;
        c15315l.getClass();
        c15315l.f29930l.setValue(new C11007l(c16328l, c11090l, z2, z3, c3790l.crashlytics == 4));
    }

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        C10312l c10312l = this.f21895l;
        EnumC9931l layoutDirection = interfaceC7448l.getLayoutDirection();
        InterfaceC16061l interfaceC16061l = (InterfaceC16061l) AbstractC13402l.loadAd(this, AbstractC4751l.firebase);
        C15315l c15315l = c10312l.yandex;
        c15315l.getClass();
        C1256l c1256l = new C1256l(interfaceC7448l, layoutDirection, interfaceC16061l, j);
        c15315l.f29929l.setValue(c1256l);
        C11007l c11007l = (C11007l) c15315l.f29930l.getValue();
        if (c11007l == null) {
            AbstractC14825l.amazon("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
            C17132l.firebase();
            return null;
        }
        C0327l c0327lCrashlytics = c15315l.crashlytics(c11007l, c1256l);
        long j2 = c0327lCrashlytics.crashlytics;
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(AbstractC13628l.billing(i, i, i2, i2));
        this.f21895l.billing.setValue(new C14467l(this.f21896l ? interfaceC7448l.mo872static(AbstractC0509l.loadAd(c0327lCrashlytics.loadAd.loadAd(0))) : 0.0f));
        Map linkedHashMap = this.f21893l;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap(2);
        }
        linkedHashMap.put(AbstractC12013l.yandex, Integer.valueOf(Math.round(c0327lCrashlytics.amazon)));
        linkedHashMap.put(AbstractC12013l.loadAd, Integer.valueOf(Math.round(c0327lCrashlytics.purchase)));
        this.f21893l = linkedHashMap;
        return interfaceC7448l.isVip(i, i2, linkedHashMap, new C10889l(abstractC10113lAdcel, 16));
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.firebase(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC3506l
    /* JADX INFO: renamed from: for */
    public final void mo1346for(InterfaceC18212l interfaceC18212l) {
        this.f21895l.crashlytics.setValue(interfaceC18212l);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.adcel(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.tapsense(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.vip(this, abstractC11754l, interfaceC6357l, i);
    }
}
