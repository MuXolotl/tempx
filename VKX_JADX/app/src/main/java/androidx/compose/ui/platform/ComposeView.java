package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.AbstractC15391l;
import defpackage.AbstractC1753l;
import defpackage.AbstractC8020l;
import defpackage.C10086l;
import defpackage.C3956l;
import defpackage.C4224l;
import defpackage.C6956l;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ComposeView extends AbstractC15391l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C10086l f338l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public boolean f339l;

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, AbstractC1753l abstractC1753l) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // defpackage.AbstractC15391l
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f339l;
    }

    public final void setContent(Function2<? super C6956l, ? super Integer, Unit> function2) {
        this.f339l = true;
        this.f338l.setValue(function2);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            amazon();
        }
    }

    @Override // defpackage.AbstractC15391l
    public final void yandex(C6956l c6956l, int i) {
        c6956l.m2133new(420213850);
        int i2 = 4;
        int i3 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            Function2 function2 = (Function2) this.f338l.getValue();
            if (function2 == null) {
                c6956l.m2123default(-1238823553);
            } else {
                c6956l.m2123default(98585282);
                function2.invoke(c6956l, 0);
            }
            c6956l.startapp(false);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3956l(this, i, i2);
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f338l = AbstractC8020l.smaato(null);
    }

    public ComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
