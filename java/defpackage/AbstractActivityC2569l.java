package defpackage;

import android.R;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؙّؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC2569l extends AbstractActivityC16046l implements InterfaceC9686l {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public C4983l f5594l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public C12779l f5595l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public SparseArray f5596l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public C6453l f5597l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public int f5598l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public C9967l f5599l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public SparseArray f5600l;

    public final void Signature() {
        this.f5594l.purchase(this.f5599l.getFragmentStack().size() > 1);
    }

    public final void ad(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC13209l.crashlytics.add(this);
        AbstractC11790l.crashlytics();
        getWindow().setStatusBarColor(AbstractC13209l.yandex(R.attr.windowBackground));
    }

    public final void advert() {
        super.onDestroy();
        AbstractC13209l.crashlytics.remove(this);
    }

    @Override // defpackage.AbstractActivityC16046l, defpackage.AbstractActivityC11746l, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 111 && keyEvent.getAction() == 1) {
            onBackPressed();
            return true;
        }
        this.f5599l.getCurrentFragment();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.AbstractActivityC16046l, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f5597l == null) {
            Resources resources = super.getResources();
            C6453l c6453l = new C6453l(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
            c6453l.yandex = resources;
            this.f5597l = c6453l;
        }
        return this.f5597l;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!Objects.equals(str, "layout_inflater")) {
            return super.getSystemService(str);
        }
        if (this.f5595l == null) {
            this.f5595l = new C12779l(this, (LayoutInflater) super.getSystemService(str));
        }
        return this.f5595l;
    }

    public final void isVip(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        SparseArray sparseArray = this.f5600l;
        C10776l c10776l = (C10776l) sparseArray.get(i);
        if (c10776l != null) {
            sparseArray.remove(i);
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                String str = strArr[i2];
                arrayList.add(new C12041l(iArr[i2]));
            }
            Function0 function0 = c10776l.yandex;
            AppActivity appActivity = c10776l.loadAd;
            C12041l c12041l = (C12041l) AbstractC16901l.m4217extends(arrayList);
            if (c12041l == null || c12041l.yandex != 0) {
                new C7217l().Signature(appActivity);
            } else {
                function0.invoke();
            }
        }
    }

    public abstract void license(AbstractC17777l abstractC17777l);

    @Override // defpackage.AbstractActivityC16046l, defpackage.AbstractActivityC14666l, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        pro(i, i2, intent);
        Stack<AbstractC17777l> fragmentStack = this.f5599l.getFragmentStack();
        if (fragmentStack.isEmpty()) {
            return;
        }
        fragmentStack.peek().getClass();
    }

    @Override // defpackage.AbstractActivityC16046l, defpackage.AbstractActivityC14666l, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT < 29 || !AbstractC11790l.loadAd.getBoolean("enabled", true) || (configuration.uiMode & 48) == 0) {
            return;
        }
        AbstractC11790l.crashlytics();
    }

    @Override // defpackage.AbstractActivityC16046l, defpackage.AbstractActivityC14666l, defpackage.AbstractActivityC11746l, android.app.Activity
    public void onCreate(Bundle bundle) {
        ad(bundle);
        C9967l c9967l = new C9967l(this);
        this.f5599l = c9967l;
        c9967l.setNavigationListener(this);
        C9967l c9967l2 = this.f5599l;
        if (findViewById(R.id.content) != null) {
            setContentView(c9967l2);
        }
        this.f5594l = new C4983l(3, this);
        yandex().yandex(this.f5594l, this);
    }

    @Override // defpackage.AbstractActivityC16046l, android.app.Activity
    public void onDestroy() {
        advert();
        Iterator<AbstractC17777l> it = this.f5599l.getFragmentStack().iterator();
        while (it.hasNext()) {
            it.next().appmetrica();
        }
        this.f5594l.amazon();
    }

    @Override // defpackage.AbstractActivityC16046l, android.app.Activity
    public void onPause() {
        super.onPause();
        C9967l c9967l = this.f5599l;
        if (c9967l != null) {
            Stack<AbstractC17777l> fragmentStack = c9967l.getFragmentStack();
            for (int iMax = Math.max(0, fragmentStack.size() - 2); iMax < fragmentStack.size(); iMax++) {
                fragmentStack.get(iMax).inmobi();
            }
        }
    }

    @Override // defpackage.AbstractActivityC16046l, defpackage.AbstractActivityC14666l, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        isVip(i, strArr, iArr);
        Stack<AbstractC17777l> fragmentStack = this.f5599l.getFragmentStack();
        if (fragmentStack.isEmpty()) {
            return;
        }
        fragmentStack.peek().mo2004package(i, strArr, iArr);
    }

    @Override // defpackage.AbstractActivityC16046l, android.app.Activity
    public void onResume() {
        super.onResume();
        C9967l c9967l = this.f5599l;
        if (c9967l != null) {
            Stack<AbstractC17777l> fragmentStack = c9967l.getFragmentStack();
            for (int iMax = Math.max(0, fragmentStack.size() - 2); iMax < fragmentStack.size(); iMax++) {
                fragmentStack.get(iMax).mo2208synchronized();
            }
        }
    }

    public final void pro(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f5596l.get(i) == null) {
            return;
        }
        C18725l.loadAd();
    }
}
