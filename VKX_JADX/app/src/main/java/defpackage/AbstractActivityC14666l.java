package defpackage;

import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٔؕۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC14666l extends AbstractActivityC11746l implements InterfaceC0798l, InterfaceC7364l, InterfaceC3187l, InterfaceC14926l, InterfaceC6923l, InterfaceC8977l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f28676l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C10111l f28677l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C8688l f28678l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C8688l f28679l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final AtomicInteger f28680l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f28681l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C18096l f28682l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C8688l f28683l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public boolean f28684l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f28685l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f28686l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C15018l f28687l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C13568l f28688l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f28689l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C16166l f28690l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final ExecutorC8614l f28691l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f28692l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f28693l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public boolean f28694l;

    public AbstractActivityC14666l() {
        C18096l c18096l = new C18096l();
        c18096l.yandex = new CopyOnWriteArraySet();
        this.f28682l = c18096l;
        final int i = 0;
        this.f28677l = new C10111l(new RunnableC0863l(this, 0));
        C17464l c17464l = new C17464l(this, new C5767l(2, this));
        C13568l c13568l = new C13568l(c17464l);
        this.f28688l = c13568l;
        this.f28691l = new ExecutorC8614l(this);
        final int i2 = 1;
        this.f28678l = new C8688l(new C0488l(this, 1));
        this.f28680l = new AtomicInteger();
        this.f28690l = new C16166l(this);
        this.f28685l = new CopyOnWriteArrayList();
        this.f28692l = new CopyOnWriteArrayList();
        this.f28689l = new CopyOnWriteArrayList();
        this.f28676l = new CopyOnWriteArrayList();
        this.f28693l = new CopyOnWriteArrayList();
        this.f28686l = new CopyOnWriteArrayList();
        this.f28681l = new CopyOnWriteArrayList();
        this.f28683l = new C8688l(new C0488l(this, 2));
        C5268l c5268l = this.f23523l;
        if (c5268l == null) {
            C8339l.smaato("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        c5268l.yandex(new InterfaceC13342l(this) { // from class: lؑٛۙ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ AbstractActivityC14666l f1609l;

            {
                this.f1609l = this;
            }

            @Override // defpackage.InterfaceC13342l
            public final void ads(InterfaceC3177l interfaceC3177l, EnumC14812l enumC14812l) {
                Window window;
                View viewPeekDecorView;
                int i3 = i;
                AbstractActivityC14666l abstractActivityC14666l = this.f1609l;
                switch (i3) {
                    case 0:
                        if (enumC14812l == EnumC14812l.ON_STOP && (window = abstractActivityC14666l.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (enumC14812l == EnumC14812l.ON_DESTROY) {
                            abstractActivityC14666l.f28682l.loadAd = null;
                            if (!abstractActivityC14666l.isChangingConfigurations()) {
                                abstractActivityC14666l.firebase().yandex();
                            }
                            ExecutorC8614l executorC8614l = abstractActivityC14666l.f28691l;
                            AbstractActivityC14666l abstractActivityC14666l2 = executorC8614l.f17768l;
                            abstractActivityC14666l2.getWindow().getDecorView().removeCallbacks(executorC8614l);
                            abstractActivityC14666l2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(executorC8614l);
                        }
                        break;
                }
            }
        });
        this.f23523l.yandex(new InterfaceC13342l(this) { // from class: lؑٛۙ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ AbstractActivityC14666l f1609l;

            {
                this.f1609l = this;
            }

            @Override // defpackage.InterfaceC13342l
            public final void ads(InterfaceC3177l interfaceC3177l, EnumC14812l enumC14812l) {
                Window window;
                View viewPeekDecorView;
                int i3 = i2;
                AbstractActivityC14666l abstractActivityC14666l = this.f1609l;
                switch (i3) {
                    case 0:
                        if (enumC14812l == EnumC14812l.ON_STOP && (window = abstractActivityC14666l.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (enumC14812l == EnumC14812l.ON_DESTROY) {
                            abstractActivityC14666l.f28682l.loadAd = null;
                            if (!abstractActivityC14666l.isChangingConfigurations()) {
                                abstractActivityC14666l.firebase().yandex();
                            }
                            ExecutorC8614l executorC8614l = abstractActivityC14666l.f28691l;
                            AbstractActivityC14666l abstractActivityC14666l2 = executorC8614l.f17768l;
                            abstractActivityC14666l2.getWindow().getDecorView().removeCallbacks(executorC8614l);
                            abstractActivityC14666l2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(executorC8614l);
                        }
                        break;
                }
            }
        });
        this.f23523l.yandex(new C12517l(i2, this));
        c17464l.purchase();
        AbstractC6531l.loadAd(this);
        if (Build.VERSION.SDK_INT == 23) {
            this.f23523l.yandex(new C6948l(this));
        }
        ((C18396l) c13568l.f26580l).m4528synchronized("android:support:activity-result", new C8955l(i, this));
        subs(new C11717l(this, i));
        this.f28679l = new C8688l(new C0488l(this, 4));
    }

    public static void billing(C16390l c16390l, AbstractActivityC14666l abstractActivityC14666l, EnumC14812l enumC14812l) {
        if (enumC14812l == EnumC14812l.ON_CREATE) {
            c16390l.crashlytics(abstractActivityC14666l.getOnBackInvokedDispatcher());
        }
    }

    public static void mopub(AbstractActivityC14666l abstractActivityC14666l) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!AbstractC8576l.yandex(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!AbstractC8576l.yandex(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        isPro();
        this.f28691l.yandex(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    public final void admob(InterfaceC13241l interfaceC13241l) {
        this.f28685l.add(interfaceC13241l);
    }

    @Override // defpackage.InterfaceC8977l
    public final C16166l amazon() {
        return this.f28690l;
    }

    @Override // defpackage.InterfaceC7364l
    public final C3806l crashlytics() {
        C3806l c3806l = new C3806l(0);
        if (getApplication() != null) {
            c3806l.yandex(C8257l.f17152l, getApplication());
        }
        c3806l.yandex(AbstractC6531l.yandex, this);
        c3806l.yandex(AbstractC6531l.loadAd, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            c3806l.yandex(AbstractC6531l.crashlytics, extras);
        }
        return c3806l;
    }

    @Override // defpackage.InterfaceC0798l
    public final C15018l firebase() {
        if (getApplication() == null) {
            C8339l.smaato("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.f28687l == null) {
            C4160l c4160l = (C4160l) getLastNonConfigurationInstance();
            if (c4160l != null) {
                this.f28687l = c4160l.yandex;
            }
            if (this.f28687l == null) {
                this.f28687l = new C15018l();
            }
        }
        return this.f28687l;
    }

    @Override // defpackage.InterfaceC6923l
    public final C1527l getNavigationEventDispatcher() {
        return yandex().loadAd().crashlytics;
    }

    public final void isPro() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(R.id.report_drawn, this);
        getWindow().getDecorView().setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.InterfaceC3177l
    public final AbstractC6475l loadAd() {
        return this.f23523l;
    }

    @Override // defpackage.InterfaceC3187l
    public final C18396l metrica() {
        return (C18396l) this.f28688l.f26580l;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f28690l.yandex(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((C9349l) this.f28683l.getValue()).yandex();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f28685l.iterator();
        while (it.hasNext()) {
            ((InterfaceC13241l) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.AbstractActivityC11746l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f28688l.startapp(bundle);
        C18096l c18096l = this.f28682l;
        c18096l.loadAd = this;
        Iterator it = ((CopyOnWriteArraySet) c18096l.yandex).iterator();
        while (it.hasNext()) {
            ((InterfaceC11167l) it.next()).yandex();
        }
        super.onCreate(bundle);
        int i = FragmentC12812l.f25188l;
        AbstractC17537l.loadAd(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f28677l.f20586l).iterator();
        while (it.hasNext()) {
            ((C17591l) it.next()).yandex.firebase();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f28677l.license();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.f28684l = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.f28684l = false;
            Iterator it = this.f28676l.iterator();
            while (it.hasNext()) {
                ((InterfaceC13241l) it.next()).accept(new C13933l(z));
            }
        } catch (Throwable th) {
            this.f28684l = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f28689l.iterator();
        while (it.hasNext()) {
            ((InterfaceC13241l) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f28677l.f20586l).iterator();
        while (it.hasNext()) {
            ((C17591l) it.next()).yandex.adcel();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.f28694l = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f28694l = false;
            Iterator it = this.f28693l.iterator();
            while (it.hasNext()) {
                ((InterfaceC13241l) it.next()).accept(new C12739l(z));
            }
        } catch (Throwable th) {
            this.f28694l = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        C2582l c2582lLoadAd = AbstractC7680l.loadAd(pictureInPictureUiState);
        Iterator it = this.f28686l.iterator();
        while (it.hasNext()) {
            ((InterfaceC13241l) it.next()).accept(c2582lLoadAd);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f28677l.f20586l).iterator();
        while (it.hasNext()) {
            ((C17591l) it.next()).yandex.tapsense();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.f28690l.yandex(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C4160l c4160l;
        C15018l c15018l = this.f28687l;
        if (c15018l == null && (c4160l = (C4160l) getLastNonConfigurationInstance()) != null) {
            c15018l = c4160l.yandex;
        }
        if (c15018l == null) {
            return null;
        }
        C4160l c4160l2 = new C4160l();
        c4160l2.yandex = c15018l;
        return c4160l2;
    }

    @Override // defpackage.AbstractActivityC11746l, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C5268l c5268l = this.f23523l;
        if (c5268l != null) {
            c5268l.amazon("setCurrentState");
            c5268l.billing(EnumC8981l.f18520l);
        }
        super.onSaveInstanceState(bundle);
        this.f28688l.adcel(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f28692l.iterator();
        while (it.hasNext()) {
            ((InterfaceC13241l) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f28681l.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC15011l.admob()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            ((C2241l) this.f28678l.getValue()).yandex();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        isPro();
        this.f28691l.yandex(getWindow().getDecorView());
        super.setContentView(i);
    }

    public final C12840l smaato(final InterfaceC18517l interfaceC18517l, final C17423l c17423l) {
        final String str = "activity_rq#" + this.f28680l.getAndIncrement();
        final C16166l c16166l = this.f28690l;
        LinkedHashMap linkedHashMap = c16166l.crashlytics;
        C5268l c5268l = this.f23523l;
        if (c5268l.subs.yandex(EnumC8981l.f18524l)) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(this);
            EnumC8981l enumC8981l = c5268l.subs;
            sb.append(" is attempting to register while current state is ");
            sb.append(enumC8981l);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        c16166l.amazon(str);
        C11546l c11546l = (C11546l) linkedHashMap.get(str);
        if (c11546l == null) {
            c11546l = new C11546l(c5268l);
        }
        InterfaceC13342l interfaceC13342l = new InterfaceC13342l() { // from class: lًْۚ
            @Override // defpackage.InterfaceC13342l
            public final void ads(InterfaceC3177l interfaceC3177l, EnumC14812l enumC14812l) {
                EnumC14812l enumC14812l2 = EnumC14812l.ON_START;
                C16166l c16166l2 = c16166l;
                String str2 = str;
                if (enumC14812l2 != enumC14812l) {
                    if (EnumC14812l.ON_STOP == enumC14812l) {
                        c16166l2.purchase.remove(str2);
                        return;
                    } else {
                        if (EnumC14812l.ON_DESTROY == enumC14812l) {
                            c16166l2.purchase(str2);
                            return;
                        }
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = c16166l2.purchase;
                Bundle bundle = c16166l2.mopub;
                LinkedHashMap linkedHashMap3 = c16166l2.billing;
                InterfaceC18517l interfaceC18517l2 = interfaceC18517l;
                C17423l c17423l2 = c17423l;
                linkedHashMap2.put(str2, new C1129l(interfaceC18517l2, c17423l2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    interfaceC18517l2.isPro(obj);
                }
                C6597l c6597l = (C6597l) AbstractC17653l.amazon(str2, bundle);
                if (c6597l != null) {
                    bundle.remove(str2);
                    interfaceC18517l2.isPro(c17423l2.admob(c6597l.f13815l, c6597l.f13816l));
                }
            }
        };
        c11546l.yandex.yandex(interfaceC13342l);
        c11546l.loadAd.add(interfaceC13342l);
        linkedHashMap.put(str, c11546l);
        return new C12840l(c16166l, str, c17423l, 0);
    }

    public final void subs(InterfaceC11167l interfaceC11167l) {
        C18096l c18096l = this.f28682l;
        if (((AbstractActivityC14666l) c18096l.loadAd) != null) {
            interfaceC11167l.yandex();
        }
        ((CopyOnWriteArraySet) c18096l.yandex).add(interfaceC11167l);
    }

    @Override // defpackage.InterfaceC14926l
    public final C16390l yandex() {
        return (C16390l) this.f28679l.getValue();
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        isPro();
        this.f28691l.yandex(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        isPro();
        this.f28691l.yandex(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.f28684l) {
            return;
        }
        Iterator it = this.f28676l.iterator();
        while (it.hasNext()) {
            ((InterfaceC13241l) it.next()).accept(new C13933l(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.f28694l) {
            return;
        }
        Iterator it = this.f28693l.iterator();
        while (it.hasNext()) {
            ((InterfaceC13241l) it.next()).accept(new C12739l(z));
        }
    }
}
