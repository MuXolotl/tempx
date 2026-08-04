package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٟؔؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2338l implements InterfaceC3177l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final Handler f5069l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final int f5070l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final float f5071l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public View f5073l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C14972l f5074l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public float f5075l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C18480l f5076l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public View f5078l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f5079l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f5080l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public Activity f5081l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f5082l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f5083l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public boolean f5084l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C5268l f5077l = new C5268l(this, true);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C14692l f5072l = new C14692l(0, this);

    static {
        VKXApplication.Companion companion = VKXApplication.f36628l;
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        f5071l = (int) (16.0f * vKXApplication.getResources().getDisplayMetrics().density);
        VKXApplication vKXApplication2 = VKXApplication.f36631l;
        f5070l = (int) (32.0f * (vKXApplication2 != null ? vKXApplication2 : null).getResources().getDisplayMetrics().density);
        f5069l = new Handler(Looper.getMainLooper());
    }

    public AbstractC2338l(boolean z, boolean z2) {
        this.f5079l = z;
        this.f5083l = z2;
    }

    public final void Signature(Activity activity) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            Log.w("BottomSlideFragment", "show(...) should be called on the main thread!");
            f5069l.post(new RunnableC7762l(this, activity, 12));
            return;
        }
        View viewFindFocus = activity.getWindow().getDecorView().findFocus();
        if (viewFindFocus instanceof EditText) {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            viewFindFocus.clearFocus();
            inputMethodManager.hideSoftInputFromWindow(viewFindFocus.getWindowToken(), 1);
        }
        this.f5081l = activity;
        isPro();
        activity.getApplication().registerActivityLifecycleCallbacks(this.f5072l);
        crashlytics();
    }

    public void ads() {
        this.f5077l.purchase(EnumC14812l.ON_RESUME);
    }

    public void amazon(int i, int i2) {
        View view = this.f5078l;
        view.setPadding(view.getPaddingLeft(), this.f5078l.getPaddingTop(), this.f5078l.getPaddingRight(), i + i2);
    }

    public final void crashlytics() {
        Activity activity = this.f5081l;
        if (activity != null) {
            final ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            viewGroup.setBackgroundColor(-16777216);
            int i = 0;
            this.f5073l = viewGroup.getChildAt(0);
            this.f5078l = firebase(viewGroup);
            this.f5078l.setOutlineProvider(new C16118l(this));
            int i2 = 1;
            this.f5078l.setClipToOutline(true);
            this.f5078l.setOnClickListener(new ViewOnClickListenerC17980l(0));
            C14972l c14972l = new C14972l(activity);
            this.f5074l = c14972l;
            c14972l.f29471l = this.f5083l || this.f5079l;
            subscription(this.f5078l);
            this.f5078l.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC3367l(i2, this));
            this.f5074l.setSheetHeight(this.f5078l.getHeight());
            viewGroup.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: lْٗ٘
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    int stableInsetTop = windowInsets.getStableInsetTop();
                    AbstractC2338l abstractC2338l = this.yandex;
                    abstractC2338l.f5082l = stableInsetTop;
                    viewGroup.setOnApplyWindowInsetsListener(null);
                    abstractC2338l.amazon(windowInsets.getStableInsetBottom(), abstractC2338l.f5083l ? 0 : abstractC2338l.f5082l + AbstractC2338l.f5070l);
                    return windowInsets.consumeStableInsets();
                }
            });
            C11260l c11260lIsPro = this.f5076l.isPro();
            C17930l c17930l = C14972l.f29463l;
            if (c17930l == null) {
                C8339l.metrica("springConfig is required");
                return;
            }
            c11260lIsPro.yandex = c17930l;
            c11260lIsPro.crashlytics(1.0d);
            c11260lIsPro.loadAd = true;
            c11260lIsPro.isPro.add(new C8668l(this, i2));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, mopub());
            layoutParams.gravity = 80;
            this.f5078l.setLayoutParams(layoutParams);
            View view = new View(activity);
            view.setBackgroundColor(RecyclerView.UNDEFINED_DURATION);
            view.setAlpha(0.0f);
            view.setId(R.id.overlay);
            view.setOnClickListener(new ViewOnClickListenerC9657l(i, this));
            this.f5074l.addView(view);
            this.f5074l.addView(this.f5078l);
            C14972l c14972l2 = this.f5074l;
            c14972l2.f29470l = this;
            c14972l2.setCurrentProgress(1.0f);
            this.f5074l.setAlpha(0.0f);
            this.f5074l.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC3367l(2, c11260lIsPro));
            viewGroup.addView(this.f5074l);
            this.f5074l.requestApplyInsets();
        }
    }

    public abstract View firebase(ViewGroup viewGroup);

    public void isPro() {
        EnumC14812l enumC14812l = EnumC14812l.ON_CREATE;
        C5268l c5268l = this.f5077l;
        c5268l.purchase(enumC14812l);
        c5268l.purchase(EnumC14812l.ON_START);
        this.f5076l = new C18480l(9);
        ComponentCallbacks2 componentCallbacks2 = this.f5081l;
        if (componentCallbacks2 instanceof InterfaceC16129l) {
            AppActivity appActivity = (AppActivity) ((InterfaceC16129l) componentCallbacks2);
            C4983l c4983l = appActivity.f36641l;
            ArrayList arrayList = appActivity.f36639l;
            arrayList.add(this);
            if (!arrayList.isEmpty()) {
                appActivity.yandex().yandex(c4983l, appActivity);
                c4983l.purchase(true);
            }
            ((InterfaceC16129l) this.f5081l).getClass();
        }
    }

    @Override // defpackage.InterfaceC3177l
    public final AbstractC6475l loadAd() {
        return this.f5077l;
    }

    public abstract int mopub();

    public void purchase() {
        if (this.f5084l) {
            return;
        }
        this.f5084l = true;
        if (this.f5081l != null) {
            C11260l c11260lIsPro = this.f5076l.isPro();
            C17930l c17930l = C14972l.f29463l;
            if (c17930l == null) {
                C8339l.metrica("springConfig is required");
                return;
            }
            c11260lIsPro.yandex = c17930l;
            c11260lIsPro.crashlytics(this.f5075l);
            c11260lIsPro.loadAd = true;
            c11260lIsPro.isPro.add(new C8668l(this, 0));
            c11260lIsPro.amazon(1.0d);
        }
    }

    public void smaato() {
        EnumC14812l enumC14812l = EnumC14812l.ON_STOP;
        C5268l c5268l = this.f5077l;
        c5268l.purchase(enumC14812l);
        c5268l.purchase(EnumC14812l.ON_DESTROY);
        Activity activity = this.f5081l;
        if (activity != null) {
            ((ViewGroup) activity.getWindow().getDecorView()).removeView(this.f5074l);
            if (this.f5073l != null) {
                this.f5073l = null;
            }
            this.f5074l = null;
        }
        Collection collectionValues = ((HashMap) this.f5076l.f36084l).values();
        Iterator it = new ArrayList(DesugarCollections.unmodifiableList(collectionValues instanceof List ? (List) collectionValues : new ArrayList(collectionValues))).iterator();
        while (it.hasNext()) {
            ((C11260l) it.next()).yandex();
        }
        ComponentCallbacks2 componentCallbacks2 = this.f5081l;
        if (componentCallbacks2 instanceof InterfaceC16129l) {
            AppActivity appActivity = (AppActivity) ((InterfaceC16129l) componentCallbacks2);
            C4983l c4983l = appActivity.f36641l;
            ArrayList arrayList = appActivity.f36639l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c4983l.purchase(false);
                c4983l.amazon();
            }
            ((InterfaceC16129l) this.f5081l).getClass();
        }
    }

    public void startapp() {
        this.f5077l.purchase(EnumC14812l.ON_PAUSE);
    }

    public void subs() {
        if (this.f5079l) {
            return;
        }
        purchase();
    }

    public abstract void subscription(View view);

    public final void tapsense(boolean z) {
        this.f5079l = z;
        C14972l c14972l = this.f5074l;
        if (c14972l != null) {
            c14972l.f29471l = z;
        }
    }

    public void remoteconfig(Intent intent) {
    }

    public void admob(int i, int i2, Intent intent) {
    }
}
