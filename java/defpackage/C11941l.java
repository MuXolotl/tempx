package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؘِٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11941l extends AbstractC15391l implements InterfaceC6923l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public C0616l f23785l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public C16918l f23786l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final View f23787l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C10086l f23788l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C10086l f23789l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final WindowManager f23790l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final Rect f23791l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public EnumC9931l f23792l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final WindowManager.LayoutParams f23793l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public final int[] f23794l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public final C1527l f23795l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final C0298l f23796l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public Function0 f23797l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C2183l f23798l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public final C10086l f23799l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final C9349l f23800l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public String f23801l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C12288l f23802l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final boolean f23803l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public boolean f23804l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public InterfaceC16711l f23805l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C8610l f23806l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11941l(Function0 function0, C12288l c12288l, String str, View view, InterfaceC13490l interfaceC13490l, InterfaceC16711l interfaceC16711l, UUID uuid, boolean z) {
        super(view.getContext());
        int i = Build.VERSION.SDK_INT;
        int i2 = 7;
        C2183l c3948l = i >= 30 ? new C3948l(i2) : i >= 29 ? new C11850l(i2) : new C2183l(i2);
        this.f23797l = function0;
        this.f23802l = c12288l;
        this.f23801l = str;
        this.f23787l = view;
        this.f23803l = z;
        this.f23798l = c3948l;
        this.f23790l = (WindowManager) view.getContext().getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        C12288l c12288l2 = this.f23802l;
        boolean zLoadAd = AbstractC3017l.loadAd(view);
        boolean z2 = c12288l2.loadAd;
        int i3 = c12288l2.yandex;
        if (z2 && zLoadAd) {
            i3 |= 8192;
        } else if (z2 && !zLoadAd) {
            i3 &= -8193;
        }
        layoutParams.flags = i3;
        layoutParams.type = this.f23802l.billing;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f23793l = layoutParams;
        this.f23805l = interfaceC16711l;
        this.f23792l = EnumC9931l.f20223l;
        this.f23789l = AbstractC8020l.smaato(null);
        this.f23788l = AbstractC8020l.smaato(null);
        this.f23806l = AbstractC8020l.mopub(new C11029l(14, this));
        this.f23791l = new Rect();
        this.f23796l = new C0298l(new C13984l(this, 3));
        C9349l c9349l = new C9349l();
        this.f23800l = c9349l;
        C11541l c11541l = new C11541l(this);
        C1527l c1527l = new C1527l(null);
        C1527l.yandex(c1527l, c11541l);
        c1527l.loadAd(c9349l);
        this.f23795l = c1527l;
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, AbstractC6889l.purchase(view));
        setTag(R.id.view_tree_view_model_store_owner, AbstractC1135l.crashlytics(view));
        setTag(R.id.view_tree_saved_state_registry_owner, AbstractC17344l.loadAd(view));
        setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
        C1527l navigationEventDispatcher = getNavigationEventDispatcher();
        C12288l c12288l3 = this.f23802l;
        boolean z3 = (c12288l3.yandex & 8) == 0 && c12288l3.crashlytics;
        navigationEventDispatcher.amazon();
        if (navigationEventDispatcher.crashlytics != z3) {
            navigationEventDispatcher.crashlytics = z3;
            navigationEventDispatcher.amazon.loadAd();
        }
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(interfaceC13490l.mo868instanceof(8.0f));
        setOutlineProvider(new C4096l(2));
        this.f23799l = AbstractC8020l.smaato(AbstractC6321l.yandex);
        this.f23794l = new int[2];
    }

    private final Function2<C6956l, Integer, Unit> getContent() {
        return (Function2) this.f23799l.getValue();
    }

    private final C16918l getDisplayBounds() {
        int i = this.f23802l.yandex & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
        View view = this.f23787l;
        Rect rect = this.f23791l;
        C2183l c2183l = this.f23798l;
        if (i == 0) {
            c2183l.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            c2183l.amazon(view, rect);
        }
        return new C16918l(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC18212l getParentLayoutCoordinates() {
        return (InterfaceC18212l) this.f23788l.getValue();
    }

    private final void setContent(Function2<? super C6956l, ? super Integer, Unit> function2) {
        this.f23799l.setValue(function2);
    }

    private final void setParentLayoutCoordinates(InterfaceC18212l interfaceC18212l) {
        this.f23788l.setValue(interfaceC18212l);
    }

    public final void adcel(InterfaceC18212l interfaceC18212l) {
        setParentLayoutCoordinates(interfaceC18212l);
        startapp();
    }

    @Override // defpackage.AbstractC15391l
    public final void admob(int i, int i2) {
        this.f23802l.getClass();
        C16918l displayBounds = getDisplayBounds();
        super.admob(View.MeasureSpec.makeMeasureSpec(displayBounds.amazon(), RecyclerView.UNDEFINED_DURATION), View.MeasureSpec.makeMeasureSpec(displayBounds.loadAd(), RecyclerView.UNDEFINED_DURATION));
    }

    public final void ads() {
        C4999l c4999lM3294getPopupContentSizebOM6tXw;
        C16918l c16918l = this.f23786l;
        if (c16918l == null || (c4999lM3294getPopupContentSizebOM6tXw = m3294getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = c4999lM3294getPopupContentSizebOM6tXw.yandex;
        C16918l displayBounds = getDisplayBounds();
        long jLoadAd = (((long) displayBounds.loadAd()) & 4294967295L) | (((long) displayBounds.amazon()) << 32);
        C17078l c17078l = new C17078l();
        c17078l.f33243l = 0L;
        this.f23796l.crashlytics(this, C16274l.f31859l, new C16598l(c17078l, this, c16918l, jLoadAd, j));
        long j2 = c17078l.f33243l;
        WindowManager.LayoutParams layoutParams = this.f23793l;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.f23802l.purchase;
        C2183l c2183l = this.f23798l;
        if (z) {
            c2183l.billing(this, (int) (jLoadAd >> 32), (int) (jLoadAd & 4294967295L));
        }
        c2183l.getClass();
        this.f23790l.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f23802l.crashlytics) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                this.f23800l.yandex();
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f23806l.getValue()).booleanValue();
    }

    @Override // defpackage.InterfaceC6923l
    public C1527l getNavigationEventDispatcher() {
        return this.f23795l;
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.f23793l;
    }

    public final EnumC9931l getParentLayoutDirection() {
        return this.f23792l;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final C4999l m3294getPopupContentSizebOM6tXw() {
        return (C4999l) this.f23789l.getValue();
    }

    public final InterfaceC16711l getPositionProvider() {
        return this.f23805l;
    }

    @Override // defpackage.AbstractC15391l
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f23804l;
    }

    public final String getTestTag() {
        return this.f23801l;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void metrica(Function0 function0, C12288l c12288l, String str, EnumC9931l enumC9931l) {
        this.f23797l = function0;
        this.f23801l = str;
        int i = 0;
        if (!AbstractC8576l.yandex(this.f23802l, c12288l)) {
            c12288l.getClass();
            this.f23802l = c12288l;
            C1527l navigationEventDispatcher = getNavigationEventDispatcher();
            C12288l c12288l2 = this.f23802l;
            boolean z = (c12288l2.yandex & 8) == 0 && c12288l2.crashlytics;
            navigationEventDispatcher.amazon();
            if (navigationEventDispatcher.crashlytics != z) {
                navigationEventDispatcher.crashlytics = z;
                navigationEventDispatcher.amazon.loadAd();
            }
            boolean zLoadAd = AbstractC3017l.loadAd(this.f23787l);
            boolean z2 = c12288l.loadAd;
            int i2 = c12288l.yandex;
            if (z2 && zLoadAd) {
                i2 |= 8192;
            } else if (z2 && !zLoadAd) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.f23793l;
            layoutParams.flags = i2;
            this.f23798l.getClass();
            this.f23790l.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = enumC9931l.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                C18725l.billing();
                return;
            }
            i = 1;
        }
        super.setLayoutDirection(i);
    }

    @Override // defpackage.AbstractC15391l
    public final void mopub(boolean z, int i, int i2, int i3, int i4) {
        super.mopub(z, i, i2, i3, i4);
        this.f23802l.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.f23793l;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.f23798l.getClass();
        this.f23790l.updateViewLayout(this, layoutParams);
    }

    @Override // defpackage.AbstractC15391l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23796l.amazon();
        if (!this.f23802l.crashlytics || Build.VERSION.SDK_INT < 33) {
            return;
        }
        AbstractC2847l.ad(this, getNavigationEventDispatcher(), new C13984l(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0298l c0298l = this.f23796l;
        C4568l c4568l = c0298l.admob;
        if (c4568l != null) {
            c4568l.crashlytics();
        }
        c0298l.yandex();
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        C0616l c0616l = this.f23785l;
        if (c0616l != null) {
            C1527l navigationEventDispatcher = getNavigationEventDispatcher();
            navigationEventDispatcher.amazon();
            if (navigationEventDispatcher.mopub.admob(c0616l)) {
                C8048l c8048l = navigationEventDispatcher.amazon;
                c8048l.firebase.admob(c0616l);
                c8048l.isPro.admob(c0616l);
                c8048l.subs.admob(c0616l);
                c0616l.yandex = null;
                c0616l.crashlytics();
            }
        }
        this.f23785l = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f23802l.amazon) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            Function0 function0 = this.f23797l;
            if (function0 != null) {
                function0.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            Function0 function1 = this.f23797l;
            if (function1 != null) {
                function1.invoke();
            }
        }
        return true;
    }

    public final void setParentLayoutDirection(EnumC9931l enumC9931l) {
        this.f23792l = enumC9931l;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m3295setPopupContentSizefhxjrPA(C4999l c4999l) {
        this.f23789l.setValue(c4999l);
    }

    public final void setPositionProvider(InterfaceC16711l interfaceC16711l) {
        this.f23805l = interfaceC16711l;
    }

    public final void setTestTag(String str) {
        this.f23801l = str;
    }

    public final void startapp() {
        InterfaceC18212l parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.mopub()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jSmaato = parentLayoutCoordinates.smaato();
            long jStartapp = this.f23803l ? parentLayoutCoordinates.startapp(0L) : parentLayoutCoordinates.amazon(0L);
            C16918l c16918lLoadAd = AbstractC14231l.loadAd((((long) Math.round(Float.intBitsToFloat((int) (jStartapp >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (jStartapp & 4294967295L))))), jSmaato);
            if (c16918lLoadAd.equals(this.f23786l)) {
                return;
            }
            this.f23786l = c16918lLoadAd;
            ads();
        }
    }

    public final void vip(AbstractC0306l abstractC0306l, Function2 function2) {
        setParentCompositionContext(abstractC0306l);
        setContent(function2);
        this.f23804l = true;
    }

    @Override // defpackage.AbstractC15391l
    public final void yandex(C6956l c6956l, int i) {
        c6956l.m2133new(-857613600);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(c6956l, 0);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3956l(this, i, 8);
        }
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public AbstractC15391l getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
