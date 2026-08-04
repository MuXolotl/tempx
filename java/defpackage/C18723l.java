package defpackage;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lۧ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18723l extends AbstractC14971l implements InterfaceC16031l, InterfaceC16388l, InterfaceC15641l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public boolean f36490l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public float f36492l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final boolean f36493l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C3793l f36495l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final float f36496l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public C15119l f36497l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C2403l f36500l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public C16222l f36501l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public InterfaceC12553l f36502l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public C8835l f36503l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C1635l f36504l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public long f36491l = 0;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C12463l f36505l = new C12463l();

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C5616l f36494l = AbstractC6791l.yandex(0.0f);

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final ArrayList f36499l = new ArrayList();

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public final C5616l f36489l = AbstractC6791l.yandex(0.0f);

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public final C10086l f36498l = AbstractC8020l.smaato(Boolean.FALSE);

    public C18723l(C2403l c2403l, boolean z, float f, C1635l c1635l, C3793l c3793l) {
        this.f36500l = c2403l;
        this.f36493l = z;
        this.f36496l = f;
        this.f36504l = c1635l;
        this.f36495l = c3793l;
    }

    @Override // defpackage.InterfaceC4325l
    public final void Signature(long j) {
        float fMo868instanceof;
        this.f36490l = true;
        InterfaceC13490l interfaceC13490l = AbstractC5573l.metrica(this).f7668l;
        this.f36491l = AbstractC14707l.mopub(j);
        float f = this.f36496l;
        if (Float.isNaN(f)) {
            long j2 = this.f36491l;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            fMo868instanceof = C1187l.crashlytics((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)) / 2.0f;
            if (this.f36493l) {
                fMo868instanceof += interfaceC13490l.mo868instanceof(10.0f);
            }
        } else {
            fMo868instanceof = interfaceC13490l.mo868instanceof(f);
        }
        this.f36492l = fMo868instanceof;
        C12463l c12463l = this.f36505l;
        Object[] objArr = c12463l.yandex;
        int i = c12463l.loadAd;
        for (int i2 = 0; i2 < i; i2++) {
            m4573l((InterfaceC14368l) objArr[i2]);
        }
        c12463l.billing();
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        C8835l c8835l = this.f36503l;
        if (c8835l != null) {
            this.f36497l = null;
            AbstractC2697l.firebase(this);
            C13645l c13645l = c8835l.f18146l;
            C15119l c15119l = (C15119l) ((LinkedHashMap) c13645l.f26671l).get(this);
            if (c15119l != null) {
                c15119l.crashlytics();
                LinkedHashMap linkedHashMap = (LinkedHashMap) c13645l.f26671l;
                C15119l c15119l2 = (C15119l) linkedHashMap.get(this);
                if (c15119l2 != null) {
                }
                linkedHashMap.remove(this);
                c8835l.f18142l.add(c15119l);
            }
        }
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        AbstractC10999l.mopub(m3914l(), null, 0, new C7226l(this, null, 14), 3);
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final void m4573l(InterfaceC14368l interfaceC14368l) {
        C15119l c15119l;
        if (!(interfaceC14368l instanceof C12951l)) {
            if (interfaceC14368l instanceof C3426l) {
                C15119l c15119l2 = this.f36497l;
                if (c15119l2 != null) {
                    c15119l2.amazon();
                    return;
                }
                return;
            }
            if (!(interfaceC14368l instanceof C10129l) || (c15119l = this.f36497l) == null) {
                return;
            }
            c15119l.amazon();
            return;
        }
        C12951l c12951l = (C12951l) interfaceC14368l;
        long j = this.f36491l;
        float f = this.f36492l;
        C8835l c8835l = this.f36503l;
        if (c8835l == null) {
            Object obj = (View) AbstractC13402l.loadAd(this, AbstractC1242l.billing);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    C10754l.license(obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", "Couldn't find a valid parent for ");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    C8835l c8835l2 = new C8835l(viewGroup.getContext());
                    viewGroup.addView(c8835l2);
                    c8835l = c8835l2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof C8835l) {
                        c8835l = (C8835l) childAt;
                        break;
                    }
                    i++;
                }
            }
            this.f36503l = c8835l;
        }
        ArrayList arrayList = c8835l.f18143l;
        C13645l c13645l = c8835l.f18146l;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c13645l.f26671l;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c13645l.f26671l;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) c13645l.f26670l;
        C15119l c15119l3 = (C15119l) linkedHashMap.get(this);
        if (c15119l3 == null) {
            ArrayList arrayList2 = c8835l.f18142l;
            c15119l3 = (C15119l) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (c15119l3 == null) {
                if (c8835l.f18145l > AbstractC14055l.smaato(arrayList)) {
                    c15119l3 = new C15119l(c8835l.getContext());
                    c8835l.addView(c15119l3);
                    arrayList.add(c15119l3);
                } else {
                    c15119l3 = (C15119l) arrayList.get(c8835l.f18145l);
                    C18723l c18723l = (C18723l) linkedHashMap3.get(c15119l3);
                    if (c18723l != null) {
                        c18723l.f36497l = null;
                        AbstractC2697l.firebase(c18723l);
                        C15119l c15119l4 = (C15119l) linkedHashMap2.get(c18723l);
                        if (c15119l4 != null) {
                        }
                        linkedHashMap2.remove(c18723l);
                        c15119l3.crashlytics();
                    }
                }
                int i2 = c8835l.f18145l;
                if (i2 < c8835l.f18144l - 1) {
                    c8835l.f18145l = i2 + 1;
                } else {
                    c8835l.f18145l = 0;
                }
            }
            linkedHashMap2.put(this, c15119l3);
            linkedHashMap3.put(c15119l3, this);
        }
        C15119l c15119l5 = c15119l3;
        c15119l5.loadAd(c12951l, this.f36493l, j, AbstractC5573l.ads(f), this.f36504l.yandex(), ((C15172l) this.f36495l.invoke()).yandex instanceof C15218l ? 0.1f : 0.0f, new C9636l(6, this));
        this.f36497l = c15119l5;
        AbstractC2697l.firebase(this);
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final boolean mo512l() {
        return false;
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final void mo536l(C6742l c6742l) throws Throwable {
        long j;
        c6742l.yandex();
        C13601l c13601l = c6742l.f14144l;
        InterfaceC14859l interfaceC14859lM4555synchronized = c13601l.f26629l.m4555synchronized();
        C15119l c15119l = this.f36497l;
        if (c15119l != null) {
            c15119l.purchase(this.f36491l, AbstractC5573l.ads(this.f36492l), this.f36504l.yandex(), ((C15172l) this.f36495l.invoke()).yandex instanceof C15218l ? 0.1f : 0.0f);
            Canvas canvas = AbstractC10071l.yandex;
            c15119l.draw(((C2151l) interfaceC14859lM4555synchronized).yandex);
        }
        float fFloatValue = ((Number) this.f36494l.amazon()).floatValue();
        if (fFloatValue > 0.0f) {
            long jLoadAd = C9735l.loadAd(fFloatValue, this.f36504l.yandex());
            if (this.f36493l) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c6742l.admob() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c6742l.admob() & 4294967295L));
                C18449l c18449l = c13601l.f26629l;
                long jM4551private = c18449l.m4551private();
                c18449l.m4555synchronized().mopub();
                try {
                    ((C16543l) c18449l.f36010l).remoteconfig(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                    j = jM4551private;
                    try {
                        AbstractC9361l.admob(c6742l, jLoadAd, this.f36492l, 0L, null, 124);
                        AbstractC0653l.license(c18449l, j);
                    } catch (Throwable th) {
                        th = th;
                        AbstractC0653l.license(c18449l, j);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = jM4551private;
                }
            } else {
                AbstractC9361l.admob(c6742l, jLoadAd, this.f36492l, 0L, null, 124);
            }
        }
        if (((Number) this.f36489l.amazon()).floatValue() > 0.0f) {
            C16222l c16222l = this.f36501l;
            if (c16222l == null) {
                c16222l = new C16222l(9);
            }
            this.f36501l = c16222l;
            this.f36495l.invoke();
        }
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: continue */
    public final /* synthetic */ void mo533continue() {
    }

    @Override // defpackage.InterfaceC15641l
    public final /* synthetic */ void startapp(InterfaceC18212l interfaceC18212l) {
    }
}
