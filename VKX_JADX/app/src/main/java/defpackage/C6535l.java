package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙ٘ۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6535l extends View {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C4096l f13607l = new C4096l(3);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C13601l f13608l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public InterfaceC13490l f13609l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public EnumC9931l f13610l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10383l f13611l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC3059l f13612l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C11925l f13613l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Outline f13614l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f13615l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public float f13616l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Function1 f13617l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f13618l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public float f13619l;

    public C6535l(AbstractC3059l abstractC3059l, C10383l c10383l, C13601l c13601l) {
        super(abstractC3059l.getContext());
        this.f13612l = abstractC3059l;
        this.f13611l = c10383l;
        this.f13608l = c13601l;
        setOutlineProvider(f13607l);
        this.f13618l = true;
        this.f13609l = AbstractC14707l.yandex;
        this.f13610l = EnumC9931l.f20223l;
        InterfaceC0285l.yandex.getClass();
        this.f13617l = C16274l.f31867l;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f = this.f13619l;
        C13601l c13601l = this.f13608l;
        C10383l c10383l = this.f13611l;
        if (f > 0.0f || this.f13616l > 0.0f) {
            int iSave = canvas.save();
            canvas.translate(this.f13619l, this.f13616l);
            C2151l c2151l = c10383l.yandex;
            Canvas canvas2 = c2151l.yandex;
            c2151l.yandex = canvas;
            InterfaceC13490l interfaceC13490l = this.f13609l;
            EnumC9931l enumC9931l = this.f13610l;
            float width = getWidth();
            long jFloatToRawIntBits = (4294967295L & ((long) Float.floatToRawIntBits(getHeight()))) | (Float.floatToRawIntBits(width) << 32);
            C11925l c11925l = this.f13613l;
            Function1 function1 = this.f13617l;
            C18449l c18449l = c13601l.f26629l;
            C18449l c18449l2 = c13601l.f26629l;
            InterfaceC13490l interfaceC13490lM4560volatile = c18449l.m4560volatile();
            EnumC9931l enumC9931lM4548native = c18449l2.m4548native();
            InterfaceC14859l interfaceC14859lM4555synchronized = c18449l2.m4555synchronized();
            long jM4551private = c18449l2.m4551private();
            C11925l c11925l2 = (C11925l) c18449l2.f36009l;
            c18449l2.m4554super(interfaceC13490l);
            c18449l2.m4545import(enumC9931l);
            c18449l2.m4544goto(c2151l);
            c18449l2.m4534abstract(jFloatToRawIntBits);
            c18449l2.f36009l = c11925l;
            c2151l.mopub();
            try {
                function1.invoke(c13601l);
                c2151l.ads();
                c18449l2.m4554super(interfaceC13490lM4560volatile);
                c18449l2.m4545import(enumC9931lM4548native);
                c18449l2.m4544goto(interfaceC14859lM4555synchronized);
                c18449l2.m4534abstract(jM4551private);
                c18449l2.f36009l = c11925l2;
                c10383l.yandex.yandex = canvas2;
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                c2151l.ads();
                c18449l2.m4554super(interfaceC13490lM4560volatile);
                c18449l2.m4545import(enumC9931lM4548native);
                c18449l2.m4544goto(interfaceC14859lM4555synchronized);
                c18449l2.m4534abstract(jM4551private);
                c18449l2.f36009l = c11925l2;
                throw th;
            }
        } else {
            C2151l c2151l2 = c10383l.yandex;
            Canvas canvas3 = c2151l2.yandex;
            c2151l2.yandex = canvas;
            InterfaceC13490l interfaceC13490l2 = this.f13609l;
            EnumC9931l enumC9931l2 = this.f13610l;
            float width2 = getWidth();
            long jFloatToRawIntBits2 = (4294967295L & ((long) Float.floatToRawIntBits(getHeight()))) | (Float.floatToRawIntBits(width2) << 32);
            C11925l c11925l3 = this.f13613l;
            Function1 function2 = this.f13617l;
            C18449l c18449l3 = c13601l.f26629l;
            C18449l c18449l4 = c13601l.f26629l;
            InterfaceC13490l interfaceC13490lM4560volatile2 = c18449l3.m4560volatile();
            EnumC9931l enumC9931lM4548native2 = c18449l4.m4548native();
            InterfaceC14859l interfaceC14859lM4555synchronized2 = c18449l4.m4555synchronized();
            long jM4551private2 = c18449l4.m4551private();
            C11925l c11925l4 = (C11925l) c18449l4.f36009l;
            c18449l4.m4554super(interfaceC13490l2);
            c18449l4.m4545import(enumC9931l2);
            c18449l4.m4544goto(c2151l2);
            c18449l4.m4534abstract(jFloatToRawIntBits2);
            c18449l4.f36009l = c11925l3;
            c2151l2.mopub();
            try {
                function2.invoke(c13601l);
                c2151l2.ads();
                c18449l4.m4554super(interfaceC13490lM4560volatile2);
                c18449l4.m4545import(enumC9931lM4548native2);
                c18449l4.m4544goto(interfaceC14859lM4555synchronized2);
                c18449l4.m4534abstract(jM4551private2);
                c18449l4.f36009l = c11925l4;
                c10383l.yandex.yandex = canvas3;
            } catch (Throwable th2) {
                c2151l2.ads();
                c18449l4.m4554super(interfaceC13490lM4560volatile2);
                c18449l4.m4545import(enumC9931lM4548native2);
                c18449l4.m4544goto(interfaceC14859lM4555synchronized2);
                c18449l4.m4534abstract(jM4551private2);
                c18449l4.f36009l = c11925l4;
                throw th2;
            }
        }
        this.f13615l = false;
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.f13618l;
    }

    public final C10383l getCanvasHolder() {
        return this.f13611l;
    }

    public final View getOwnerView() {
        return this.f13612l;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f13618l;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f13615l) {
            return;
        }
        this.f13615l = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.f13618l != z) {
            this.f13618l = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.f13615l = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
