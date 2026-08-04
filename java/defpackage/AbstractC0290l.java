package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lَْؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0290l extends ViewGroup implements InterfaceC3112l, InterfaceC0492l, InterfaceC0827l, InterfaceC12833l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public int f1309l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public InterfaceC3187l f1310l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC11218l f1311l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Function0 f1312l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final int[] f1313l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public Function1 f1314l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public InterfaceC17242l f1315l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public C1473l f1316l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C9754l f1317l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final View f1318l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C17110l f1319l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C7228l f1320l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public Function1 f1321l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public boolean f1322l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public InterfaceC13490l f1323l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public long f1324l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f1325l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Function0 f1326l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final C3654l f1327l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public InterfaceC3177l f1328l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Function1 f1329l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Function0 f1330l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public Function1 f1331l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final int[] f1332l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C7228l f1333l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public int f1334l;

    public AbstractC0290l(Context context, AbstractC0306l abstractC0306l, int i, C17110l c17110l, View view, InterfaceC11218l interfaceC11218l) {
        super(context);
        this.f1319l = c17110l;
        this.f1318l = view;
        this.f1311l = interfaceC11218l;
        if (abstractC0306l != null) {
            C13660l c13660l = AbstractC7980l.yandex;
            setTag(R.id.androidx_compose_ui_view_composition_context, abstractC0306l);
        }
        int i2 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        C8464l c8464l = (C8464l) this;
        AbstractC15872l.startapp(this, new C0919l(c8464l, i2));
        AbstractC8558l.crashlytics(this, this);
        this.f1326l = C5617l.f11952l;
        this.f1330l = C5617l.f11962l;
        this.f1312l = C5617l.f11938l;
        C4346l c4346l = C4346l.f8873l;
        this.f1315l = c4346l;
        this.f1323l = AbstractC17463l.yandex();
        int i3 = 2;
        this.f1332l = new int[2];
        this.f1324l = 0L;
        int i4 = 1;
        this.f1333l = new C7228l(c8464l, i4);
        this.f1320l = new C7228l(c8464l, i2);
        this.f1313l = new int[2];
        this.f1309l = RecyclerView.UNDEFINED_DURATION;
        this.f1334l = RecyclerView.UNDEFINED_DURATION;
        this.f1317l = new C9754l((byte) 0, 7);
        C3654l c3654l = new C3654l(3);
        c3654l.f7688l = c8464l;
        InterfaceC17242l interfaceC17242lYandex = AbstractC4962l.yandex(AbstractC16422l.mopub(c4346l, AbstractC2697l.yandex, c17110l), true, C11192l.f22541l);
        C13408l c13408l = new C13408l();
        c13408l.f26311l = new C5205l(c8464l, i3);
        C17330l c17330l = new C17330l();
        C17330l c17330l2 = c13408l.f26310l;
        if (c17330l2 != null) {
            c17330l2.f33641l = null;
        }
        c13408l.f26310l = c17330l;
        c17330l.f33641l = c13408l;
        setOnRequestDisallowInterceptTouchEvent$ui(c17330l);
        InterfaceC17242l interfaceC17242lPremium = AbstractC8238l.billing(AbstractC14289l.isPro(interfaceC17242lYandex.premium(c13408l), new C12683l(c8464l, c3654l, c8464l)), new C15329l(c8464l, c3654l, i3)).premium(new C18380l(new C5205l(c8464l, i4)));
        c3654l.f7677l = i;
        c3654l.m1374break(this.f1315l.premium(interfaceC17242lPremium));
        int i5 = 5;
        this.f1329l = new C2977l(c3654l, interfaceC17242lPremium, i5);
        c3654l.m1391public(this.f1323l);
        this.f1331l = new C3006l(i5, c3654l);
        c3654l.f7669l = new C15329l(c8464l, c3654l, i2);
        c3654l.f7678l = new C5205l(c8464l, i2);
        c3654l.m1400try(new C7096l(c8464l, c3654l, i4));
        this.f1327l = c3654l;
    }

    public static final int firebase(C8464l c8464l, int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(AbstractC8576l.purchase(i3, i, i2), 1073741824);
        }
        if (i3 != -2 || i2 == Integer.MAX_VALUE) {
            return (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i2, RecyclerView.UNDEFINED_DURATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C5227l getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            AbstractC0081l.crashlytics("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC13840l) this.f1311l).getSnapshotObserver();
    }

    public static C15496l smaato(C15496l c15496l, int i, int i2, int i3, int i4) {
        int i5 = c15496l.yandex - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = c15496l.loadAd - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = c15496l.crashlytics - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = c15496l.amazon - i4;
        return C15496l.loadAd(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    @Override // defpackage.InterfaceC0827l
    public final boolean ad() {
        return isAttachedToWindow();
    }

    @Override // defpackage.InterfaceC14324l
    public final void admob(View view, int i, int i2, int[] iArr, int i3) {
        if (this.f1318l.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            int i4 = i3 == 0 ? 1 : 2;
            C4369l c4369l = this.f1319l.yandex;
            C4369l c4369lM1543l = c4369l != null ? c4369l.m1543l() : null;
            long jMo1112switch = c4369lM1543l != null ? c4369lM1543l.mo1112switch(i4, jFloatToRawIntBits) : 0L;
            iArr[0] = AbstractC5573l.ads(Float.intBitsToFloat((int) (jMo1112switch >> 32))) * (-1);
            iArr[1] = AbstractC5573l.ads(Float.intBitsToFloat((int) (jMo1112switch & 4294967295L))) * (-1);
        }
    }

    @Override // defpackage.InterfaceC14324l
    public final void amazon(View view, int i, int i2, int i3, int i4, int i5) {
        if (this.f1318l.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            C4369l c4369l = this.f1319l.yandex;
            C4369l c4369lM1543l = c4369l != null ? c4369l.m1543l() : null;
            if (c4369lM1543l != null) {
                c4369lM1543l.mo1111return(i6, jFloatToRawIntBits, jFloatToRawIntBits2);
            }
        }
    }

    @Override // defpackage.InterfaceC14324l
    public final void billing(View view, View view2, int i, int i2) {
        C9754l c9754l = this.f1317l;
        if (i2 == 1) {
            c9754l.f19892l = i;
        } else {
            c9754l.f19893l = i;
        }
    }

    @Override // defpackage.InterfaceC3112l
    public final void crashlytics(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.f1318l.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            C4369l c4369l = this.f1319l.yandex;
            C4369l c4369lM1543l = c4369l != null ? c4369l.m1543l() : null;
            long jMo1111return = c4369lM1543l != null ? c4369lM1543l.mo1111return(i6, jFloatToRawIntBits, jFloatToRawIntBits2) : 0L;
            iArr[0] = AbstractC5573l.ads(Float.intBitsToFloat((int) (jMo1111return >> 32))) * (-1);
            iArr[1] = AbstractC5573l.ads(Float.intBitsToFloat((int) (jMo1111return & 4294967295L))) * (-1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f1313l;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final InterfaceC13490l getDensity() {
        return this.f1323l;
    }

    public final View getInteropView() {
        return this.f1318l;
    }

    public final C3654l getLayoutNode() {
        return this.f1327l;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f1318l.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC3177l getLifecycleOwner() {
        return this.f1328l;
    }

    public final InterfaceC17242l getModifier() {
        return this.f1315l;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C9754l c9754l = this.f1317l;
        return c9754l.f19892l | c9754l.f19893l;
    }

    public final Function1<InterfaceC13490l, Unit> getOnDensityChanged$ui() {
        return this.f1331l;
    }

    public final Function1<InterfaceC17242l, Unit> getOnModifierChanged$ui() {
        return this.f1329l;
    }

    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.f1314l;
    }

    public final Function0<Unit> getRelease() {
        return this.f1312l;
    }

    public final Function0<Unit> getReset() {
        return this.f1330l;
    }

    public final InterfaceC3187l getSavedStateRegistryOwner() {
        return this.f1310l;
    }

    public final Function0<Unit> getUpdate() {
        return this.f1326l;
    }

    public final View getView() {
        return this.f1318l;
    }

    @Override // defpackage.InterfaceC12833l
    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public final C1473l mo404implements(View view, C1473l c1473l) {
        this.f1316l = new C1473l(c1473l);
        return remoteconfig(c1473l);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f1322l) {
            this.f1327l.inmobi();
            return null;
        }
        this.f1318l.postOnAnimation(new RunnableC0037l(3, this.f1320l));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1318l.isNestedScrollingEnabled();
    }

    @Override // defpackage.InterfaceC0492l
    public final void loadAd() {
        this.f1330l.invoke();
        removeAllViewsInLayout();
    }

    @Override // defpackage.InterfaceC14324l
    public final void mopub(View view, int i) {
        C9754l c9754l = this.f1317l;
        if (i == 1) {
            c9754l.f19892l = 0;
        } else {
            c9754l.f19893l = 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1333l.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f1322l) {
            this.f1327l.inmobi();
        } else {
            this.f1318l.postOnAnimation(new RunnableC0037l(3, this.f1320l));
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b A[Catch: all -> 0x0096, LOOP:1: B:14:0x0035->B:25:0x007b, LOOP_END, TryCatch #0 {all -> 0x0096, blocks: (B:4:0x000e, B:8:0x0018, B:26:0x0080, B:28:0x0088, B:33:0x0098, B:30:0x008d, B:11:0x0029, B:14:0x0035, B:16:0x004a, B:18:0x0056, B:20:0x0060, B:22:0x0070, B:25:0x007b, B:34:0x009c), top: B:39:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0080 A[EDGE_INSN: B:46:0x0080->B:26:0x0080 BREAK  A[LOOP:1: B:14:0x0035->B:25:0x007b], SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int i;
        super.onDetachedFromWindow();
        C0298l c0298l = getSnapshotObserver().yandex;
        synchronized (c0298l.mopub) {
            try {
                C17893l c17893l = c0298l.billing;
                int i2 = c17893l.f34846l;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    Object[] objArr = c17893l.f34848l;
                    if (i3 < i2) {
                        C8080l c8080l = (C8080l) objArr[i3];
                        C7661l c7661l = (C7661l) c8080l.billing.smaato(this);
                        if (c7661l == null) {
                            i = i3;
                        } else {
                            Object[] objArr2 = c7661l.loadAd;
                            int[] iArr = c7661l.crashlytics;
                            long[] jArr = c7661l.yandex;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i5 = 0;
                                while (true) {
                                    long j = jArr[i5];
                                    i = i3;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i5 != length) {
                                            break;
                                            break;
                                        } else {
                                            i5++;
                                            i3 = i;
                                        }
                                    } else {
                                        int i6 = 8;
                                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                                        int i8 = 0;
                                        while (i8 < i7) {
                                            if ((j & 255) < 128) {
                                                int i9 = (i5 << 3) + i8;
                                                Object obj = objArr2[i9];
                                                int i10 = iArr[i9];
                                                c8080l.crashlytics(this, obj);
                                            }
                                            j >>= i6;
                                            i8++;
                                            i6 = i6;
                                        }
                                        if (i7 != i6) {
                                            break;
                                        }
                                        if (i5 != length) {
                                            break;
                                        }
                                        i5++;
                                        i3 = i;
                                    }
                                }
                            } else {
                                i = i3;
                            }
                        }
                        if (!c8080l.billing.isPro()) {
                            i4++;
                        } else if (i4 > 0) {
                            Object[] objArr3 = c17893l.f34848l;
                            objArr3[i - i4] = objArr3[i];
                        }
                        i3 = i + 1;
                    } else {
                        int i11 = i2 - i4;
                        Arrays.fill(objArr, i11, i2, (Object) null);
                        c17893l.f34846l = i11;
                        Unit unit = Unit.INSTANCE;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1318l.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.f1318l;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f1309l = i;
        this.f1334l = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f1318l.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC10999l.mopub(this.f1319l.crashlytics(), null, 0, new C8210l(z, this, AbstractC12311l.mopub(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.f1318l.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC10999l.mopub(this.f1319l.crashlytics(), null, 0, new C17400l(this, AbstractC12311l.mopub(f * (-1.0f), f2 * (-1.0f)), (InterfaceC14029l) null, 0), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // defpackage.InterfaceC14324l
    public final boolean purchase(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    public final C1473l remoteconfig(C1473l c1473l) {
        C17212l c17212l = c1473l.yandex;
        C15496l c15496lSubs = c17212l.subs(-1);
        C15496l c15496l = C15496l.purchase;
        if (!c15496lSubs.equals(c15496l) || !c17212l.isPro(-9).equals(c15496l) || c17212l.admob() != null) {
            C11103l c11103l = (C11103l) this.f1327l.f7703l.amazon;
            if (c11103l.f22307l.f29462l) {
                long jIsPro = AbstractC3383l.isPro(c11103l.mo2591strictfp(0L));
                int i = (int) (jIsPro >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jIsPro & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jSmaato = AbstractC9690l.crashlytics(c11103l).smaato();
                int i3 = (int) (jSmaato >> 32);
                int i4 = (int) (jSmaato & 4294967295L);
                long j = c11103l.f20590l;
                long jIsPro2 = AbstractC3383l.isPro(c11103l.mo2591strictfp((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jIsPro2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & jIsPro2));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return c1473l.yandex.ads(i, i2, i5, i7);
                }
            }
        }
        return c1473l;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Function1 function1 = this.f1321l;
        if (function1 == null) {
            return true;
        }
        function1.invoke(rect != null ? AbstractC5833l.smaato(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        Function1 function1 = this.f1314l;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(InterfaceC13490l interfaceC13490l) {
        if (interfaceC13490l != this.f1323l) {
            this.f1323l = interfaceC13490l;
            Function1 function1 = this.f1331l;
            if (function1 != null) {
                function1.invoke(interfaceC13490l);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC3177l interfaceC3177l) {
        if (interfaceC3177l != this.f1328l) {
            this.f1328l = interfaceC3177l;
            setTag(R.id.view_tree_lifecycle_owner, interfaceC3177l);
        }
    }

    public final void setModifier(InterfaceC17242l interfaceC17242l) {
        if (interfaceC17242l != this.f1315l) {
            this.f1315l = interfaceC17242l;
            Function1 function1 = this.f1329l;
            if (function1 != null) {
                function1.invoke(interfaceC17242l);
            }
        }
    }

    public final void setOnDensityChanged$ui(Function1<? super InterfaceC13490l, Unit> function1) {
        this.f1331l = function1;
    }

    public final void setOnModifierChanged$ui(Function1<? super InterfaceC17242l, Unit> function1) {
        this.f1329l = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(Function1<? super Boolean, Unit> function1) {
        this.f1314l = function1;
    }

    public final void setRelease(Function0<Unit> function0) {
        this.f1312l = function0;
    }

    public final void setReset(Function0<Unit> function0) {
        this.f1330l = function0;
    }

    public final void setSavedStateRegistryOwner(InterfaceC3187l interfaceC3187l) {
        if (interfaceC3187l != this.f1310l) {
            this.f1310l = interfaceC3187l;
            setTag(R.id.view_tree_saved_state_registry_owner, interfaceC3187l);
        }
    }

    public final void setUpdate(Function0<Unit> function0) {
        this.f1326l = function0;
        this.f1325l = true;
        this.f1333l.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // defpackage.InterfaceC0492l
    public final void subs() {
        View view = this.f1318l;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f1330l.invoke();
        }
    }

    @Override // defpackage.InterfaceC0492l
    public final void yandex() {
        this.f1312l.invoke();
    }
}
