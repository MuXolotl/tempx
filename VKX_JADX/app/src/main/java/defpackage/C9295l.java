package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍؓۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9295l extends AbstractC15391l implements InterfaceC12833l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public boolean f19095l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final Window f19096l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public boolean f19097l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public boolean f19098l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C10086l f19099l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public boolean f19100l;

    public C9295l(Context context, Window window) {
        super(context);
        this.f19096l = window;
        this.f19099l = AbstractC8020l.smaato(AbstractC0644l.yandex);
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        AbstractC8558l.crashlytics(this, this);
        AbstractC15872l.startapp(this, new C0919l(this, 1));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    @Override // defpackage.AbstractC15391l
    public final void admob(int i, int i2) {
        int iYandex;
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.admob(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.f19096l;
        if (mode != Integer.MIN_VALUE || this.f19098l || window.getAttributes().height != -2) {
            iYandex = size2;
        } else if (this.f19095l) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 30) {
                iYandex = C2611l.yandex.yandex(window);
            } else if (i3 < 32) {
                iYandex = C11836l.yandex.yandex(window);
            } else {
                iYandex = size2;
            }
        } else {
            iYandex = size2 + 1;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i4 = size - paddingRight;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = iYandex - paddingBottom;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, RecyclerView.UNDEFINED_DURATION);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, RecyclerView.UNDEFINED_DURATION);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, iMin);
        if (this.f19095l || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(RecyclerView.UNDEFINED_DURATION);
        if (this.f19098l) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // defpackage.AbstractC15391l
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f19097l;
    }

    @Override // defpackage.InterfaceC12833l
    /* JADX INFO: renamed from: implements */
    public final C1473l mo404implements(View view, C1473l c1473l) {
        if (!this.f19095l) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return c1473l.yandex.ads(iMax, iMax2, iMax3, iMax4);
            }
        }
        return c1473l;
    }

    @Override // defpackage.AbstractC15391l
    public final void mopub(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // defpackage.AbstractC15391l
    public final void yandex(C6956l c6956l, int i) {
        c6956l.m2133new(1735448596);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            ((Function2) this.f19099l.getValue()).invoke(c6956l, 0);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3956l(this, i, 6);
        }
    }
}
