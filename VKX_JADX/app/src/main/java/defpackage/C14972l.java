package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٔٙۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14972l extends FrameLayout {

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C17930l f29463l = C17930l.yandex(55.0d, 10.0d);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f29464l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f29465l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final Rect f29466l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f29467l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f29468l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C5008l f29469l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public AbstractC2338l f29470l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f29471l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f29472l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public float f29473l;

    public C14972l(Context context) {
        super(context);
        this.f29466l = new Rect();
        this.f29469l = new C5008l(getContext(), new C11629l(0, this));
        this.f29465l = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public static boolean amazon(View view, MotionEvent motionEvent, Rect rect) {
        view.getGlobalVisibleRect(rect);
        if (view.getVisibility() == 0 && rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return view.canScrollVertically(-1);
        }
        return false;
    }

    public static boolean crashlytics(ViewGroup viewGroup, MotionEvent motionEvent, Rect rect) {
        if (viewGroup == null) {
            return false;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                if (amazon(childAt, motionEvent, rect)) {
                    return true;
                }
                if ((childAt instanceof ViewGroup) && childAt.getVisibility() == 0 && crashlytics((ViewGroup) childAt, motionEvent, rect)) {
                    return true;
                }
            }
        }
        return amazon(viewGroup, motionEvent, rect);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f29470l != null) {
            int action = motionEvent.getAction() & 255;
            if (!this.f29468l) {
                if (((GestureDetector) this.f29469l.f10245l).onTouchEvent(motionEvent)) {
                    if (super.dispatchTouchEvent(motionEvent)) {
                    }
                } else if (action != 0) {
                    if (action == 1 || action == 3) {
                        if (this.f29467l) {
                            this.f29464l = false;
                            this.f29467l = false;
                            this.f29468l = false;
                            if (this.f29473l <= 0.5f) {
                                yandex();
                            } else {
                                this.f29468l = true;
                                this.f29470l.purchase();
                            }
                        } else if (this.f29464l) {
                            this.f29464l = false;
                            this.f29467l = false;
                            this.f29468l = false;
                        }
                    }
                    if (super.dispatchTouchEvent(motionEvent)) {
                    }
                }
            }
        } else if (super.dispatchTouchEvent(motionEvent) && (motionEvent.getAction() & 255) != 0) {
            return false;
        }
        return true;
    }

    public final void loadAd() {
        getChildAt(0).setAlpha(1.0f - this.f29473l);
        AbstractC2338l abstractC2338l = this.f29470l;
        if (abstractC2338l != null) {
            float f = this.f29473l;
            boolean z = abstractC2338l.f5083l;
            abstractC2338l.f5075l = f;
            boolean z2 = f <= 0.5f;
            if (abstractC2338l.f5080l != z2 && !z) {
                abstractC2338l.f5080l = z2;
                ComponentCallbacks2 componentCallbacks2 = abstractC2338l.f5081l;
                if (componentCallbacks2 instanceof InterfaceC16129l) {
                    AppActivity appActivity = (AppActivity) ((InterfaceC16129l) componentCallbacks2);
                    appActivity.getClass();
                    if (AbstractC13209l.purchase.amazon) {
                        if (z2) {
                            C6124l c6124lAppmetrica = appActivity.appmetrica();
                            c6124lAppmetrica.loadAd(false);
                            c6124lAppmetrica.yandex(false);
                        } else {
                            C6124l c6124lAppmetrica2 = appActivity.appmetrica();
                            c6124lAppmetrica2.loadAd(true);
                            c6124lAppmetrica2.yandex(true);
                        }
                    }
                }
            }
            int measuredHeight = abstractC2338l.f5078l.getMeasuredHeight();
            int i = z ? 0 : AbstractC2338l.f5070l + abstractC2338l.f5082l;
            View view = abstractC2338l.f5078l;
            if (view != null) {
                view.setTranslationY(measuredHeight - ((1.0f - f) * (measuredHeight - i)));
            }
            View view2 = abstractC2338l.f5078l;
            if (view2 != null) {
                view2.invalidateOutline();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            this.f29464l = true;
            this.f29467l = false;
            if (this.f29473l > 0.0f) {
                yandex();
            }
        }
    }

    public void setCurrentProgress(float f) {
        this.f29473l = f;
        loadAd();
    }

    public void setSheetHeight(int i) {
        this.f29472l = i;
    }

    public final void yandex() {
        this.f29468l = true;
        C11260l c11260lIsPro = this.f29470l.f5076l.isPro();
        C17930l c17930l = f29463l;
        if (c17930l == null) {
            C8339l.metrica("springConfig is required");
            return;
        }
        c11260lIsPro.yandex = c17930l;
        c11260lIsPro.isPro.add(new C12072l(this));
        c11260lIsPro.crashlytics(this.f29473l);
        c11260lIsPro.amazon(0.0d);
    }
}
