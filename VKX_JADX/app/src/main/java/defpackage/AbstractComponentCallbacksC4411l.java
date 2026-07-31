package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lؖۜ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC4411l implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC3177l, InterfaceC0798l, InterfaceC7364l, InterfaceC3187l {

    /* JADX INFO: renamed from: lُؚؓ, reason: contains not printable characters */
    public static final Object f8945l = new Object();

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public boolean f8946l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public boolean f8947l;

    /* JADX INFO: renamed from: lؒٓؐ, reason: contains not printable characters */
    public EnumC8981l f8948l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public boolean f8950l;

    /* JADX INFO: renamed from: lٟؓٔ, reason: contains not printable characters */
    public C13568l f8951l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public SparseArray f8952l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public AbstractComponentCallbacksC4411l f8953l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public C6239l f8954l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public C13734l f8955l;

    /* JADX INFO: renamed from: lؕۦؓ, reason: contains not printable characters */
    public C5268l f8957l;

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public String f8958l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public boolean f8959l;

    /* JADX INFO: renamed from: lؚؗٞ, reason: contains not printable characters */
    public final C13716l f8960l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public C16447l f8961l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public int f8962l;

    /* JADX INFO: renamed from: lؗ۟ۤ, reason: contains not printable characters */
    public final ArrayList f8963l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Bundle f8964l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public int f8966l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public boolean f8967l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public boolean f8968l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public boolean f8969l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public int f8970l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public boolean f8972l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public boolean f8973l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Bundle f8975l;

    /* JADX INFO: renamed from: lِِٞ, reason: contains not printable characters */
    public final C6400l f8976l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public boolean f8977l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public String f8978l;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public boolean f8979l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public boolean f8980l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public ViewGroup f8981l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f8982l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Bundle f8983l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public boolean f8984l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public boolean f8986l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public boolean f8988l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public AbstractComponentCallbacksC4411l f8989l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f8965l = -1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public String f8974l = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public String f8956l = null;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public Boolean f8971l = null;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public C13734l f8949l = new C13734l();

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public final boolean f8987l = true;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public boolean f8985l = true;

    public AbstractComponentCallbacksC4411l() {
        new RunnableC5360l(9, this);
        this.f8948l = EnumC8981l.f18523l;
        this.f8960l = new C13716l();
        new AtomicInteger();
        this.f8963l = new ArrayList();
        this.f8976l = new C6400l(this);
        subs();
    }

    public LayoutInflater Signature(Bundle bundle) {
        C6239l c6239l = this.f8954l;
        if (c6239l == null) {
            C8339l.smaato("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        AbstractActivityC16046l abstractActivityC16046l = c6239l.f13180l;
        LayoutInflater layoutInflaterCloneInContext = abstractActivityC16046l.getLayoutInflater().cloneInContext(abstractActivityC16046l);
        layoutInflaterCloneInContext.setFactory2(this.f8949l.billing);
        return layoutInflaterCloneInContext;
    }

    public abstract void ad();

    public void adcel(Context context) {
        this.f8968l = true;
        C6239l c6239l = this.f8954l;
        if ((c6239l == null ? null : c6239l.f13179l) != null) {
            this.f8968l = true;
        }
    }

    public final C13734l admob() {
        C13734l c13734l = this.f8955l;
        if (c13734l != null) {
            return c13734l;
        }
        C18262l.firebase(this, " not associated with a fragment manager.", "Fragment ");
        return null;
    }

    public abstract void ads(Bundle bundle);

    public void advert(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8949l.m3730catch();
        this.f8988l = true;
        firebase();
    }

    public abstract AbstractC5473l amazon();

    public final C13734l billing() {
        if (this.f8954l != null) {
            return this.f8949l;
        }
        C18262l.firebase(this, " has not been attached yet.", "Fragment ");
        return null;
    }

    @Override // defpackage.InterfaceC7364l
    public final C3806l crashlytics() {
        Application application;
        Context applicationContext = isVip().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && C13734l.m3727volatile(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + isVip().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C3806l c3806l = new C3806l(0);
        if (application != null) {
            c3806l.yandex(C8257l.f17152l, application);
        }
        c3806l.yandex(AbstractC6531l.yandex, this);
        c3806l.yandex(AbstractC6531l.loadAd, this);
        Bundle bundle = this.f8983l;
        if (bundle != null) {
            c3806l.yandex(AbstractC6531l.crashlytics, bundle);
        }
        return c3806l;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.InterfaceC0798l
    public final C15018l firebase() {
        if (this.f8955l == null) {
            C8339l.smaato("Can't access ViewModels from detached fragment");
            return null;
        }
        if (mopub() == 1) {
            C8339l.smaato("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.f8955l.f26813throw.amazon;
        C15018l c15018l = (C15018l) map.get(this.f8974l);
        if (c15018l != null) {
            return c15018l;
        }
        C15018l c15018l2 = new C15018l();
        map.put(this.f8974l, c15018l2);
        return c15018l2;
    }

    public final void isPro() {
        subs();
        this.f8958l = this.f8974l;
        this.f8974l = UUID.randomUUID().toString();
        this.f8984l = false;
        this.f8980l = false;
        this.f8986l = false;
        this.f8973l = false;
        this.f8967l = false;
        this.f8966l = 0;
        this.f8955l = null;
        this.f8949l = new C13734l();
        this.f8954l = null;
        this.f8962l = 0;
        this.f8970l = 0;
        this.f8978l = null;
        this.f8947l = false;
        this.f8969l = false;
    }

    public final Context isVip() {
        C6239l c6239l = this.f8954l;
        AbstractActivityC16046l abstractActivityC16046l = c6239l == null ? null : c6239l.f13181l;
        if (abstractActivityC16046l != null) {
            return abstractActivityC16046l;
        }
        C18262l.firebase(this, " not attached to a context.", "Fragment ");
        return null;
    }

    public abstract void license(Bundle bundle);

    @Override // defpackage.InterfaceC3177l
    public final AbstractC6475l loadAd() {
        return this.f8957l;
    }

    @Override // defpackage.InterfaceC3187l
    public final C18396l metrica() {
        return (C18396l) this.f8951l.f26580l;
    }

    public final int mopub() {
        EnumC8981l enumC8981l = this.f8948l;
        return (enumC8981l == EnumC8981l.f18521l || this.f8989l == null) ? enumC8981l.ordinal() : Math.min(enumC8981l.ordinal(), this.f8989l.mopub());
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f8968l = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C6239l c6239l = this.f8954l;
        AbstractActivityC16046l abstractActivityC16046l = c6239l == null ? null : c6239l.f13179l;
        if (abstractActivityC16046l != null) {
            abstractActivityC16046l.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        } else {
            C18262l.firebase(this, " not attached to an activity.", "Fragment ");
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f8968l = true;
    }

    public abstract void pro();

    public final C16447l purchase() {
        if (this.f8961l == null) {
            C16447l c16447l = new C16447l();
            Object obj = f8945l;
            c16447l.mopub = obj;
            c16447l.admob = obj;
            c16447l.subs = obj;
            c16447l.isPro = null;
            this.f8961l = c16447l;
        }
        return this.f8961l;
    }

    public final boolean remoteconfig() {
        return this.f8966l > 0;
    }

    public final void signatures(int i, int i2, int i3, int i4) {
        if (this.f8961l == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        purchase().loadAd = i;
        purchase().crashlytics = i2;
        purchase().amazon = i3;
        purchase().purchase = i4;
    }

    public final boolean smaato() {
        if (this.f8947l) {
            return true;
        }
        C13734l c13734l = this.f8955l;
        if (c13734l != null) {
            AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = this.f8989l;
            c13734l.getClass();
            if (abstractComponentCallbacksC4411l == null ? false : abstractComponentCallbacksC4411l.smaato()) {
                return true;
            }
        }
        return false;
    }

    public void startapp(int i, int i2, Intent intent) {
        if (C13734l.m3727volatile(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public final void subs() {
        this.f8957l = new C5268l(this, true);
        this.f8951l = new C13568l(new C17464l(this, new C5767l(2, this)));
        ArrayList arrayList = this.f8963l;
        C6400l c6400l = this.f8976l;
        if (arrayList.contains(c6400l)) {
            return;
        }
        if (this.f8965l >= 0) {
            c6400l.yandex();
        } else {
            arrayList.add(c6400l);
        }
    }

    public abstract void subscription();

    public abstract void tapsense();

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f8974l);
        if (this.f8962l != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f8962l));
        }
        if (this.f8978l != null) {
            sb.append(" tag=");
            sb.append(this.f8978l);
        }
        sb.append(")");
        return sb.toString();
    }

    public abstract void vip();
}
