package defpackage;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lؘ۠٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6009l extends AbstractC14971l implements InterfaceC16031l, InterfaceC16388l, InterfaceC15641l {

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public float f12751l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public C18480l f12752l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final boolean f12753l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C4358l f12755l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final float f12756l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public C2064l f12757l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C2403l f12758l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public C5659l f12759l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C9007l f12760l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public boolean f12761l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public long f12750l = 0;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C12463l f12754l = new C12463l();

    public C6009l(C2403l c2403l, boolean z, float f, C9007l c9007l, C4358l c4358l) {
        this.f12758l = c2403l;
        this.f12753l = z;
        this.f12756l = f;
        this.f12760l = c9007l;
        this.f12755l = c4358l;
    }

    @Override // defpackage.InterfaceC4325l
    public final void Signature(long j) {
        float fMo868instanceof;
        this.f12761l = true;
        InterfaceC13490l interfaceC13490l = AbstractC5573l.metrica(this).f7668l;
        this.f12750l = AbstractC14707l.mopub(j);
        float f = this.f12756l;
        if (Float.isNaN(f)) {
            long j2 = this.f12750l;
            fMo868instanceof = C1187l.crashlytics(AbstractC2296l.yandex(C14174l.billing(j2), C14174l.crashlytics(j2))) / 2.0f;
            if (this.f12753l) {
                fMo868instanceof += interfaceC13490l.mo868instanceof(10.0f);
            }
        } else {
            fMo868instanceof = interfaceC13490l.mo868instanceof(f);
        }
        this.f12751l = fMo868instanceof;
        C12463l c12463l = this.f12754l;
        Object[] objArr = c12463l.yandex;
        int i = c12463l.loadAd;
        for (int i2 = 0; i2 < i; i2++) {
            m1919l((InterfaceC14368l) objArr[i2]);
        }
        c12463l.billing();
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() throws InterruptedException {
        C2064l c2064l = this.f12757l;
        if (c2064l != null) {
            this.f12759l = null;
            AbstractC2697l.firebase(this);
            C2494l c2494l = c2064l.f4602l;
            C5659l c5659l = (C5659l) ((LinkedHashMap) c2494l.f5291l).get(this);
            if (c5659l != null) {
                c5659l.crashlytics();
                LinkedHashMap linkedHashMap = (LinkedHashMap) c2494l.f5291l;
                C5659l c5659l2 = (C5659l) linkedHashMap.get(this);
                if (c5659l2 != null) {
                }
                linkedHashMap.remove(this);
                c2064l.f4598l.add(c5659l);
            }
        }
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        AbstractC10999l.mopub(m3914l(), null, 0, new C7226l(this, null, 15), 3);
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final void m1919l(InterfaceC14368l interfaceC14368l) {
        C5659l c5659l;
        if (!(interfaceC14368l instanceof C12951l)) {
            if (interfaceC14368l instanceof C3426l) {
                C5659l c5659l2 = this.f12759l;
                if (c5659l2 != null) {
                    c5659l2.amazon();
                    return;
                }
                return;
            }
            if (!(interfaceC14368l instanceof C10129l) || (c5659l = this.f12759l) == null) {
                return;
            }
            c5659l.amazon();
            return;
        }
        C12951l c12951l = (C12951l) interfaceC14368l;
        long j = this.f12750l;
        float f = this.f12751l;
        C2064l c2064l = this.f12757l;
        if (c2064l == null) {
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
                    C2064l c2064l2 = new C2064l(viewGroup.getContext());
                    viewGroup.addView(c2064l2);
                    c2064l = c2064l2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof C2064l) {
                        c2064l = (C2064l) childAt;
                        break;
                    }
                    i++;
                }
            }
            this.f12757l = c2064l;
        }
        ArrayList arrayList = c2064l.f4599l;
        C2494l c2494l = c2064l.f4602l;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c2494l.f5291l;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c2494l.f5291l;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) c2494l.f5290l;
        C5659l c5659l3 = (C5659l) linkedHashMap.get(this);
        if (c5659l3 == null) {
            ArrayList arrayList2 = c2064l.f4598l;
            c5659l3 = (C5659l) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (c5659l3 == null) {
                if (c2064l.f4601l > AbstractC14055l.smaato(arrayList)) {
                    c5659l3 = new C5659l(c2064l.getContext());
                    c2064l.addView(c5659l3);
                    arrayList.add(c5659l3);
                } else {
                    c5659l3 = (C5659l) arrayList.get(c2064l.f4601l);
                    C6009l c6009l = (C6009l) linkedHashMap3.get(c5659l3);
                    if (c6009l != null) {
                        c6009l.f12759l = null;
                        AbstractC2697l.firebase(c6009l);
                        C5659l c5659l4 = (C5659l) linkedHashMap2.get(c6009l);
                        if (c5659l4 != null) {
                        }
                        linkedHashMap2.remove(c6009l);
                        c5659l3.crashlytics();
                    }
                }
                int i2 = c2064l.f4601l;
                if (i2 < c2064l.f4600l - 1) {
                    c2064l.f4601l = i2 + 1;
                } else {
                    c2064l.f4601l = 0;
                }
            }
            linkedHashMap2.put(this, c5659l3);
            linkedHashMap3.put(c5659l3, this);
        }
        C5659l c5659l5 = c5659l3;
        c5659l5.loadAd(c12951l, this.f12753l, j, AbstractC5573l.ads(f), this.f12760l.yandex(), ((C2029l) this.f12755l.invoke()).amazon, new C9636l(7, this));
        this.f12759l = c5659l5;
        AbstractC2697l.firebase(this);
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final boolean mo512l() {
        return false;
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final void mo536l(C6742l c6742l) throws InterruptedException {
        C13601l c13601l = c6742l.f14144l;
        c6742l.yandex();
        C18480l c18480l = this.f12752l;
        if (c18480l != null) {
            float f = this.f12751l;
            long jYandex = this.f12760l.yandex();
            float fFloatValue = ((Number) ((C5616l) c18480l.f36088l).amazon()).floatValue();
            if (fFloatValue > 0.0f) {
                long jLoadAd = C9735l.loadAd(fFloatValue, jYandex);
                if (c18480l.f36085l) {
                    float fBilling = C14174l.billing(c6742l.admob());
                    float fCrashlytics = C14174l.crashlytics(c6742l.admob());
                    C18449l c18449l = c13601l.f26629l;
                    long jM4551private = c18449l.m4551private();
                    c18449l.m4555synchronized().mopub();
                    try {
                        ((C16543l) c18449l.f36010l).remoteconfig(0.0f, 0.0f, fBilling, fCrashlytics, 1);
                        AbstractC9361l.admob(c6742l, jLoadAd, f, 0L, null, 124);
                        AbstractC0653l.license(c18449l, jM4551private);
                    } catch (Throwable th) {
                        AbstractC0653l.license(c18449l, jM4551private);
                        throw th;
                    }
                } else {
                    AbstractC9361l.admob(c6742l, jLoadAd, f, 0L, null, 124);
                }
            }
        }
        InterfaceC14859l interfaceC14859lM4555synchronized = c13601l.f26629l.m4555synchronized();
        C5659l c5659l = this.f12759l;
        if (c5659l != null) {
            c5659l.purchase(this.f12750l, AbstractC5573l.ads(this.f12751l), this.f12760l.yandex(), ((C2029l) this.f12755l.invoke()).amazon);
            Canvas canvas = AbstractC10071l.yandex;
            c5659l.draw(((C2151l) interfaceC14859lM4555synchronized).yandex);
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
