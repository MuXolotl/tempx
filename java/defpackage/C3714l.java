package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lؕۢؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3714l implements InterfaceC15669l, InterfaceC11821l {
    public final /* synthetic */ C14138l adcel;
    public final C5633l admob;
    public final InterfaceC1168l billing;
    public final int firebase;
    public final C7800l mopub;
    public boolean remoteconfig;
    public final BinderC17532l smaato;
    public final LinkedList purchase = new LinkedList();
    public final HashSet subs = new HashSet();
    public final HashMap isPro = new HashMap();
    public final ArrayList vip = new ArrayList();
    public C10602l metrica = null;
    public int startapp = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public C3714l(C14138l c14138l, AbstractC4416l abstractC4416l) {
        this.adcel = c14138l;
        Looper looper = c14138l.f27638l.getLooper();
        C10111l c10111lYandex = abstractC4416l.yandex();
        C1424l c1424l = new C1424l((C10834l) c10111lYandex.f20587l, (String) c10111lYandex.f20586l, (String) c10111lYandex.f20589l);
        C5795l c5795l = (C5795l) abstractC4416l.amazon.f7903l;
        AbstractC1051l.subs(c5795l);
        InterfaceC1168l interfaceC1168lCrashlytics = c5795l.crashlytics(abstractC4416l.yandex, looper, c1424l, abstractC4416l.purchase, this, this);
        C1770l c1770l = abstractC4416l.crashlytics;
        if (c1770l == null || !(interfaceC1168lCrashlytics instanceof AbstractC4620l)) {
            String str = abstractC4416l.loadAd;
            if (str != null && (interfaceC1168lCrashlytics instanceof AbstractC4620l)) {
                ((AbstractC4620l) interfaceC1168lCrashlytics).tapsense = str;
            }
        } else {
            ((AbstractC4620l) interfaceC1168lCrashlytics).Signature = c1770l;
        }
        this.billing = interfaceC1168lCrashlytics;
        this.mopub = abstractC4416l.billing;
        this.admob = new C5633l(4);
        this.firebase = abstractC4416l.admob;
        if (!interfaceC1168lCrashlytics.crashlytics()) {
            this.smaato = null;
            return;
        }
        Context context = c14138l.f27645l;
        HandlerC4052l handlerC4052l = c14138l.f27638l;
        C10111l c10111lYandex2 = abstractC4416l.yandex();
        this.smaato = new BinderC17532l(context, handlerC4052l, new C1424l((C10834l) c10111lYandex2.f20587l, (String) c10111lYandex2.f20586l, (String) c10111lYandex2.f20589l));
    }

    public final void adcel() {
        C14138l c14138l = this.adcel;
        AbstractC1051l.amazon(c14138l.f27638l);
        Status status = C14138l.f27636l;
        admob(status);
        int i = 0;
        this.admob.purchase(false, status);
        for (C12648l c12648l : (C12648l[]) this.isPro.keySet().toArray(new C12648l[0])) {
            startapp(new C0026l(c12648l, new C2350l()));
        }
        smaato(new C10602l(4, null, null));
        if (((AbstractC4620l) this.billing).subscription()) {
            c14138l.f27638l.post(new RunnableC10799l(i, new C14965l(this)));
        }
    }

    public final void admob(Status status) {
        AbstractC1051l.amazon(this.adcel.f27638l);
        mopub(status, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void ads() {
        C14138l c14138l = this.adcel;
        AbstractC1051l.amazon(c14138l.f27638l);
        InterfaceC1168l interfaceC1168l = this.billing;
        if (((AbstractC4620l) interfaceC1168l).subscription()) {
            return;
        }
        AbstractC4620l abstractC4620l = (AbstractC4620l) interfaceC1168l;
        if (abstractC4620l.tapsense()) {
            return;
        }
        try {
            int iMopub = c14138l.f27640l.mopub(c14138l.f27645l, interfaceC1168l);
            if (iMopub != 0) {
                C10602l c10602l = new C10602l(iMopub, null, null);
                String name = interfaceC1168l.getClass().getName();
                String string = c10602l.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(string);
                Log.w("GoogleApiManager", sb.toString());
                metrica(c10602l, null);
                return;
            }
            C16557l c16557l = new C16557l(c14138l, interfaceC1168l, this.mopub);
            if (interfaceC1168l.crashlytics()) {
                BinderC17532l binderC17532l = this.smaato;
                AbstractC1051l.subs(binderC17532l);
                C12582l c12582l = binderC17532l.firebase;
                if (c12582l != null) {
                    c12582l.billing();
                }
                C1424l c1424l = binderC17532l.isPro;
                c1424l.f3606l = Integer.valueOf(System.identityHashCode(binderC17532l));
                C5795l c5795l = binderC17532l.admob;
                Context context = binderC17532l.billing;
                Handler handler = binderC17532l.mopub;
                binderC17532l.firebase = (C12582l) c5795l.crashlytics(context, handler.getLooper(), c1424l, (C18273l) c1424l.f3604l, binderC17532l, binderC17532l);
                binderC17532l.smaato = c16557l;
                Set set = binderC17532l.subs;
                if (set == null || set.isEmpty()) {
                    handler.post(new RunnableC10799l(binderC17532l));
                } else {
                    C12582l c12582l2 = binderC17532l.firebase;
                    c12582l2.getClass();
                    c12582l2.firebase = new C15053l((AbstractC4620l) c12582l2);
                    c12582l2.applovin(2, null);
                }
            }
            try {
                abstractC4620l.firebase = c16557l;
                abstractC4620l.applovin(2, null);
            } catch (SecurityException e) {
                metrica(new C10602l(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            metrica(new C10602l(10, null, null), e2);
        }
    }

    public final boolean amazon(C10602l c10602l) {
        synchronized (C14138l.f27635l) {
            this.adcel.getClass();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean billing(AbstractC14229l abstractC14229l) {
        if (abstractC14229l == null) {
            C5633l c5633l = this.admob;
            InterfaceC1168l interfaceC1168l = this.billing;
            abstractC14229l.billing(c5633l, interfaceC1168l.crashlytics());
            try {
                abstractC14229l.mopub(this);
                return true;
            } catch (DeadObjectException unused) {
                isPro(1);
                ((AbstractC4620l) interfaceC1168l).mopub("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        C9138l c9138lRemoteconfig = remoteconfig(abstractC14229l.yandex(this));
        if (c9138lRemoteconfig == null) {
            C5633l c5633l2 = this.admob;
            InterfaceC1168l interfaceC1168l2 = this.billing;
            abstractC14229l.billing(c5633l2, interfaceC1168l2.crashlytics());
            try {
                abstractC14229l.mopub(this);
                return true;
            } catch (DeadObjectException unused2) {
                isPro(1);
                ((AbstractC4620l) interfaceC1168l2).mopub("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.billing.getClass().getName();
        String str = c9138lRemoteconfig.f18789l;
        long jBilling = c9138lRemoteconfig.billing();
        int length = name.length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(jBilling).length() + 2);
        AbstractC9361l.appmetrica(sb, name, " could not execute call because it requires feature (", str, ", ");
        sb.append(jBilling);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        C14138l c14138l = this.adcel;
        if (!c14138l.f27651l || !abstractC14229l.loadAd(this)) {
            abstractC14229l.purchase(new C1981l(c9138lRemoteconfig));
            return true;
        }
        int iCrashlytics = abstractC14229l.crashlytics(this);
        C10510l c10510l = new C10510l(this.mopub, c9138lRemoteconfig);
        ArrayList arrayList = this.vip;
        int iIndexOf = arrayList.indexOf(c10510l);
        if (iIndexOf >= 0) {
            C10510l c10510l2 = (C10510l) arrayList.get(iIndexOf);
            c14138l.f27638l.removeMessages(15, c10510l2);
            c14138l.f27638l.sendMessageDelayed(Message.obtain(c14138l.f27638l, 15, c10510l2), 5000L);
            return false;
        }
        arrayList.add(c10510l);
        c14138l.f27638l.sendMessageDelayed(Message.obtain(c14138l.f27638l, 15, c10510l), 5000L);
        c14138l.f27638l.sendMessageDelayed(Message.obtain(c14138l.f27638l, 16, c10510l), 120000L);
        C10602l c10602l = new C10602l(1, 2, null, null, Integer.valueOf(iCrashlytics));
        if (amazon(c10602l)) {
            String str2 = c9138lRemoteconfig.f18789l;
            long jBilling2 = c9138lRemoteconfig.billing();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(jBilling2).length());
            sb2.append("A dialog should be displayed for missing feature: ");
            sb2.append(str2);
            sb2.append(", version: ");
            sb2.append(jBilling2);
            Log.w("GoogleApiManager", sb2.toString());
            return false;
        }
        if (!c14138l.billing(c10602l, this.firebase)) {
            return false;
        }
        String str3 = c9138lRemoteconfig.f18789l;
        long jBilling3 = c9138lRemoteconfig.billing();
        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(jBilling3).length());
        sb3.append("Notification displayed for missing feature: ");
        sb3.append(str3);
        sb3.append(", version: ");
        sb3.append(jBilling3);
        Log.w("GoogleApiManager", sb3.toString());
        return false;
    }

    @Override // defpackage.InterfaceC11821l
    public final void crashlytics(C10602l c10602l) {
        metrica(c10602l, null);
    }

    public final boolean firebase(boolean z) {
        AbstractC1051l.amazon(this.adcel.f27638l);
        Object obj = this.billing;
        if (!((AbstractC4620l) obj).subscription() || !this.isPro.isEmpty()) {
            return false;
        }
        C5633l c5633l = this.admob;
        if (((Map) c5633l.f11986l).isEmpty() && ((Map) c5633l.f11985l).isEmpty()) {
            ((AbstractC4620l) obj).mopub("Timing out service connection.");
            return true;
        }
        if (!z) {
            return false;
        }
        subs();
        return false;
    }

    @Override // defpackage.InterfaceC15669l
    public final void isPro(int i) {
        C14138l c14138l = this.adcel;
        if (Looper.myLooper() == c14138l.f27638l.getLooper()) {
            loadAd(i);
        } else {
            c14138l.f27638l.post(new RunnableC16326l(this, i, 2));
        }
    }

    public final void loadAd(int i) {
        AbstractC1051l.amazon(this.adcel.f27638l);
        this.metrica = null;
        this.remoteconfig = true;
        String str = ((AbstractC4620l) this.billing).yandex;
        C5633l c5633l = this.admob;
        c5633l.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        c5633l.purchase(true, new Status(20, sb.toString(), null, null));
        C7800l c7800l = this.mopub;
        C14138l c14138l = this.adcel;
        HandlerC4052l handlerC4052l = c14138l.f27638l;
        handlerC4052l.sendMessageDelayed(Message.obtain(handlerC4052l, 9, c7800l), 5000L);
        HandlerC4052l handlerC4052l2 = c14138l.f27638l;
        handlerC4052l2.sendMessageDelayed(Message.obtain(handlerC4052l2, 11, c7800l), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) c14138l.f27640l.f2499l;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.isPro.values().iterator();
        while (it.hasNext()) {
            ((C10988l) it.next()).getClass();
        }
    }

    @Override // defpackage.InterfaceC15669l
    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public final void mo1410l() {
        C14138l c14138l = this.adcel;
        if (Looper.myLooper() == c14138l.f27638l.getLooper()) {
            yandex();
        } else {
            c14138l.f27638l.post(new RunnableC5360l(29, this));
        }
    }

    public final void metrica(C10602l c10602l, RuntimeException runtimeException) {
        C12582l c12582l;
        C14138l c14138l = this.adcel;
        AbstractC1051l.amazon(c14138l.f27638l);
        BinderC17532l binderC17532l = this.smaato;
        if (binderC17532l != null && (c12582l = binderC17532l.firebase) != null) {
            c12582l.billing();
        }
        AbstractC1051l.amazon(this.adcel.f27638l);
        this.metrica = null;
        SparseIntArray sparseIntArray = (SparseIntArray) c14138l.f27640l.f2499l;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        smaato(c10602l);
        if ((this.billing instanceof C16961l) && c10602l.f21520l != 24) {
            c14138l.f27642l = true;
            HandlerC4052l handlerC4052l = c14138l.f27638l;
            handlerC4052l.sendMessageDelayed(handlerC4052l.obtainMessage(19), 300000L);
        }
        int i = c10602l.f21520l;
        if (i == 4) {
            admob(C14138l.f27634l);
            return;
        }
        if (i == 25) {
            admob(C14138l.crashlytics(this.mopub, c10602l));
            return;
        }
        LinkedList linkedList = this.purchase;
        if (linkedList.isEmpty()) {
            this.metrica = c10602l;
            return;
        }
        if (runtimeException != null) {
            AbstractC1051l.amazon(c14138l.f27638l);
            mopub(null, runtimeException, false);
            return;
        }
        boolean z = c14138l.f27651l;
        C7800l c7800l = this.mopub;
        if (!z) {
            admob(C14138l.crashlytics(c7800l, c10602l));
            return;
        }
        mopub(C14138l.crashlytics(c7800l, c10602l), null, true);
        if (linkedList.isEmpty() || amazon(c10602l) || c14138l.billing(c10602l, this.firebase)) {
            return;
        }
        if (c10602l.f21520l == 18) {
            this.remoteconfig = true;
        }
        if (!this.remoteconfig) {
            admob(C14138l.crashlytics(c7800l, c10602l));
        } else {
            HandlerC4052l handlerC4052l2 = c14138l.f27638l;
            handlerC4052l2.sendMessageDelayed(Message.obtain(handlerC4052l2, 9, c7800l), 5000L);
        }
    }

    public final void mopub(Status status, Exception exc, boolean z) {
        AbstractC1051l.amazon(this.adcel.f27638l);
        if ((status == null) == (exc == null)) {
            C8339l.metrica("Status XOR exception should be null");
            return;
        }
        Iterator it = this.purchase.iterator();
        while (it.hasNext()) {
            AbstractC14229l abstractC14229l = (AbstractC14229l) it.next();
            if (!z || abstractC14229l.yandex == 2) {
                if (status != null) {
                    abstractC14229l.amazon(status);
                } else {
                    abstractC14229l.purchase(exc);
                }
                it.remove();
            }
        }
    }

    public final void purchase() {
        LinkedList linkedList = this.purchase;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC14229l abstractC14229l = (AbstractC14229l) arrayList.get(i);
            if (!((AbstractC4620l) this.billing).subscription()) {
                return;
            }
            if (billing(abstractC14229l)) {
                linkedList.remove(abstractC14229l);
            }
        }
    }

    public final C9138l remoteconfig(C9138l[] c9138lArr) {
        if (c9138lArr != null && c9138lArr.length != 0) {
            C3801l c3801l = ((AbstractC4620l) this.billing).ad;
            C9138l[] c9138lArr2 = c3801l == null ? null : c3801l.f7915l;
            if (c9138lArr2 == null) {
                c9138lArr2 = new C9138l[0];
            }
            C11154l c11154l = new C11154l(c9138lArr2.length);
            for (C9138l c9138l : c9138lArr2) {
                c11154l.put(c9138l.f18789l, Long.valueOf(c9138l.billing()));
            }
            for (C9138l c9138l2 : c9138lArr) {
                Long l = (Long) c11154l.get(c9138l2.f18789l);
                if (l == null || l.longValue() < c9138l2.billing()) {
                    return c9138l2;
                }
            }
        }
        return null;
    }

    public final void smaato(C10602l c10602l) {
        HashSet hashSet = this.subs;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        if (it.next() != null) {
            C18725l.loadAd();
            return;
        }
        if (AbstractC7236l.amazon(c10602l, C10602l.f21518l)) {
            AbstractC4620l abstractC4620l = (AbstractC4620l) this.billing;
            if (!abstractC4620l.subscription() || abstractC4620l.loadAd == null) {
                C18073l.license("Failed to connect when checking package");
                return;
            }
        }
        throw null;
    }

    public final void startapp(AbstractC14229l abstractC14229l) {
        AbstractC1051l.amazon(this.adcel.f27638l);
        boolean zSubscription = ((AbstractC4620l) this.billing).subscription();
        LinkedList linkedList = this.purchase;
        if (zSubscription) {
            if (billing(abstractC14229l)) {
                subs();
                return;
            } else {
                linkedList.add(abstractC14229l);
                return;
            }
        }
        linkedList.add(abstractC14229l);
        C10602l c10602l = this.metrica;
        if (c10602l == null || c10602l.f21520l == 0 || c10602l.f21519l == null) {
            ads();
        } else {
            metrica(c10602l, null);
        }
    }

    public final void subs() {
        C14138l c14138l = this.adcel;
        HandlerC4052l handlerC4052l = c14138l.f27638l;
        C7800l c7800l = this.mopub;
        handlerC4052l.removeMessages(12, c7800l);
        HandlerC4052l handlerC4052l2 = c14138l.f27638l;
        handlerC4052l2.sendMessageDelayed(handlerC4052l2.obtainMessage(12, c7800l), c14138l.f27643l);
    }

    public final void vip(C10602l c10602l) {
        AbstractC1051l.amazon(this.adcel.f27638l);
        Object obj = this.billing;
        String name = obj.getClass().getName();
        String strValueOf = String.valueOf(c10602l);
        AbstractC4620l abstractC4620l = (AbstractC4620l) obj;
        abstractC4620l.mopub(AbstractC9361l.advert(new StringBuilder(name.length() + 25 + strValueOf.length()), "onSignInFailed for ", name, " with ", strValueOf));
        metrica(c10602l, null);
    }

    public final void yandex() {
        Object obj = this.billing;
        C14138l c14138l = this.adcel;
        AbstractC1051l.amazon(c14138l.f27638l);
        this.metrica = null;
        smaato(C10602l.f21518l);
        if (this.remoteconfig) {
            HandlerC4052l handlerC4052l = c14138l.f27638l;
            C7800l c7800l = this.mopub;
            handlerC4052l.removeMessages(11, c7800l);
            c14138l.f27638l.removeMessages(9, c7800l);
            this.remoteconfig = false;
        }
        Iterator it = this.isPro.values().iterator();
        while (it.hasNext()) {
            C1196l c1196l = ((C10988l) it.next()).yandex;
            if (remoteconfig((C9138l[]) c1196l.f3252l) != null) {
                it.remove();
            } else {
                try {
                    ((InterfaceC11545l) ((C13904l) c1196l.f3254l).f27204l).accept(obj, new C2350l());
                } catch (DeadObjectException unused) {
                    isPro(3);
                    ((AbstractC4620l) obj).mopub("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e) {
                    e = e;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e2) {
                    e = e2;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        purchase();
        subs();
    }
}
