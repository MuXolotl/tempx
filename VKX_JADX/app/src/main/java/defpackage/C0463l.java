package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;

/* JADX INFO: renamed from: lؙؑٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0463l {
    public final Object crashlytics;
    public float loadAd;
    public int yandex;

    public C0463l(C18118l c18118l) {
        this.crashlytics = c18118l;
        this.yandex = -1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object loadAd(float f, AbstractC0283l abstractC0283l) {
        C1154l c1154l;
        if (abstractC0283l instanceof C1154l) {
            c1154l = (C1154l) abstractC0283l;
            int i = c1154l.f3131l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1154l.f3131l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c1154l = new C1154l(this, abstractC0283l);
            }
        } else {
            c1154l = new C1154l(this, abstractC0283l);
        }
        Object objInvoke = c1154l.f3130l;
        int i2 = c1154l.f3131l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objInvoke);
            C18716l c18716l = (C18716l) this.crashlytics;
            Float f2 = new Float(f);
            c1154l.f3131l = 1;
            objInvoke = c18716l.invoke(f2, c1154l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objInvoke == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objInvoke);
        }
        this.loadAd += ((Number) objInvoke).floatValue();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public float yandex(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        C18118l c18118l = (C18118l) this.crashlytics;
        int i2 = 1;
        if (z) {
            int iBilling = AbstractC10478l.billing(c18118l.billing, i, z);
            int lineStart = c18118l.billing.getLineStart(iBilling);
            int iBilling2 = c18118l.billing(iBilling);
            if (i == lineStart || i == iBilling2) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.yandex == i4) {
            return this.loadAd;
        }
        float fIsPro = z3 ? c18118l.isPro(i, z) : c18118l.firebase(i, z);
        if (z2) {
            this.yandex = i4;
            this.loadAd = fIsPro;
        }
        return fIsPro;
    }

    public C0463l(int i, C18716l c18716l) {
        this.yandex = i;
        this.crashlytics = c18716l;
    }
}
