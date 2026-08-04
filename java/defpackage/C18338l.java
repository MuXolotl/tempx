package defpackage;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l٘ۥٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18338l implements InterfaceC13077l, InterfaceC11772l, InterfaceC4930l, InterfaceC3270l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f35846l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f35847l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public long f35848l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f35849l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f35850l;

    public C18338l(InterfaceC6347l interfaceC6347l, long j, EnumC9931l enumC9931l, C6742l c6742l) {
        this.f35847l = interfaceC6347l;
        this.f35848l = j;
        this.f35846l = enumC9931l;
        this.f35850l = c6742l;
    }

    public void Signature() {
        int i;
        C6649l c6649l;
        C13350l c13350l = (C13350l) this.f35849l;
        C18602l c18602l = c13350l.admob.tapsense;
        if (c18602l.inmobi().yandex == 0) {
            c6649l = null;
        } else {
            C16616l c16616lVip = c18602l.vip();
            if (c16616lVip.yandex.yandex(26, 34)) {
                i = c16616lVip.yandex.yandex(25, 33) ? 2 : 1;
            } else {
                i = 0;
            }
            Handler handler = new Handler(((InterfaceC9814l) c18602l.f33215l).mo2780l());
            int iAdmob = c18602l.mo2779l(23) ? c18602l.admob() : 0;
            C2848l c2848lInmobi = c18602l.inmobi();
            c6649l = new C6649l(i, c2848lInmobi.crashlytics, iAdmob, c2848lInmobi.amazon, handler, c18602l);
        }
        c13350l.adcel = c6649l;
        C0458l c0458l = c13350l.vip;
        if (c6649l == null) {
            ((C1139l) c0458l.f1691l).yandex.setPlaybackToLocal((c18602l.mo2779l(21) ? c18602l.applovin() : C13736l.subs).crashlytics());
        } else {
            ((C1139l) c0458l.f1691l).yandex.setPlaybackToRemote(c6649l.yandex());
        }
    }

    public void ad(C3852l c3852l) {
        C13350l c13350l = (C13350l) this.f35849l;
        C0458l c0458l = c13350l.vip;
        CharSequence queueTitle = ((C10730l) ((C18396l) c0458l.f1690l).f35934l).yandex.getQueueTitle();
        CharSequence charSequence = c3852l.yandex;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        C18602l c18602l = c13350l.admob.tapsense;
        if (!c13350l.signatures.yandex(17) || !c18602l.vip().yandex(17)) {
            charSequence = null;
        }
        ((C1139l) c0458l.f1691l).yandex.setQueueTitle(charSequence);
    }

    @Override // defpackage.InterfaceC3270l
    public void adcel(int i, C9009l c9009l, boolean z, boolean z2, int i2) {
        C13350l c13350l = (C13350l) this.f35849l;
        c13350l.m3637instanceof(c13350l.admob.tapsense);
    }

    public InterfaceC6942l ads() {
        InterfaceC7832l interfaceC7832l = (InterfaceC7832l) this.f35847l;
        interfaceC7832l.mo1844l();
        return AbstractC0622l.isPro(new C10424l(interfaceC7832l.mo1843l().mo1733l(this, null), 2));
    }

    public void advert(int i) {
        C0458l c0458l = ((C13350l) this.f35849l).vip;
        int iStartapp = AbstractC18585l.startapp(i);
        C1139l c1139l = (C1139l) c0458l.f1691l;
        if (c1139l.isPro != iStartapp) {
            c1139l.isPro = iStartapp;
            synchronized (c1139l.amazon) {
                int iBeginBroadcast = c1139l.billing.beginBroadcast() - 1;
                while (true) {
                    RemoteCallbackList remoteCallbackList = c1139l.billing;
                    if (iBeginBroadcast >= 0) {
                        try {
                            ((InterfaceC3145l) remoteCallbackList.getBroadcastItem(iBeginBroadcast)).subs(iStartapp);
                        } catch (RemoteException | SecurityException e) {
                            AbstractC6427l.subs("MediaSessionCompat", "Dead object in setRepeatMode.", e);
                        }
                        iBeginBroadcast--;
                    } else {
                        remoteCallbackList.finishBroadcast();
                    }
                }
            }
        }
    }

    @Override // defpackage.InterfaceC4930l
    public void amazon(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C13350l c13350l = (C13350l) ((C18338l) this.f35849l).f35849l;
        if (this != c13350l.tapsense) {
            return;
        }
        C13350l.m3628class(c13350l.vip, AbstractC18585l.vip((C3852l) this.f35847l, (String) this.f35846l, (Uri) this.f35850l, this.f35848l, bitmap));
        C3726l c3726l = c13350l.admob;
        AbstractC15323l.m3966final(c3726l.metrica, new RunnableC0128l(c3726l, 0));
    }

    public void applovin(AbstractC10759l abstractC10759l) throws Throwable {
        C13350l c13350l = (C13350l) this.f35849l;
        C3726l c3726l = c13350l.admob;
        C18602l c18602l = c3726l.tapsense;
        if (!c13350l.signatures.yandex(17) || !c18602l.vip().yandex(17) || abstractC10759l.startapp()) {
            C13350l.m3629continue(c13350l.vip, null);
            return;
        }
        AbstractC8481l abstractC8481l = AbstractC18585l.yandex;
        ArrayList arrayList = new ArrayList();
        C4322l c4322l = new C4322l();
        for (int i = 0; i < abstractC10759l.metrica(); i++) {
            arrayList.add(abstractC10759l.remoteconfig(i, c4322l, 0L).crashlytics);
        }
        ArrayList arrayList2 = new ArrayList();
        RunnableC4063l runnableC4063l = new RunnableC4063l(this, new AtomicInteger(0), arrayList, arrayList2, 11);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            byte[] bArr = ((C2427l) arrayList.get(i2)).amazon.firebase;
            if (bArr == null) {
                arrayList2.add(null);
                runnableC4063l.run();
            } else {
                ListenableFuture listenableFutureMo1119try = c3726l.remoteconfig.mo1119try(bArr);
                arrayList2.add(listenableFutureMo1119try);
                Handler handler = c3726l.smaato;
                Objects.requireNonNull(handler);
                listenableFutureMo1119try.yandex(runnableC4063l, new ExecutorC10366l(handler, 1));
            }
        }
    }

    public AbstractC15342l appmetrica(InterfaceC6347l interfaceC6347l, long j, EnumC9931l enumC9931l, C6742l c6742l) {
        if (((AbstractC15342l) this.f35849l) == null || !AbstractC8576l.yandex(interfaceC6347l, (InterfaceC6347l) this.f35847l) || !C14174l.loadAd(j, this.f35848l) || enumC9931l != ((EnumC9931l) this.f35846l) || c6742l != ((C6742l) this.f35850l)) {
            this.f35847l = interfaceC6347l;
            this.f35848l = j;
            this.f35846l = enumC9931l;
            this.f35850l = c6742l;
            this.f35849l = interfaceC6347l.yandex(j, enumC9931l, c6742l);
        }
        return (AbstractC15342l) this.f35849l;
    }

    @Override // defpackage.InterfaceC11772l
    public C11815l billing() {
        return (C11815l) this.f35847l;
    }

    @Override // defpackage.InterfaceC11772l
    public C13247l crashlytics() throws IOException {
        C3329l c3329lTapsense;
        long j;
        C3329l c3329l;
        IOException iOException = null;
        while (true) {
            try {
                if (((CopyOnWriteArrayList) this.f35850l).isEmpty() && !((C11815l) this.f35847l).yandex(null)) {
                    subscription();
                    throw iOException;
                }
                if (((C11815l) this.f35847l).firebase.f34637l) {
                    throw new IOException("Canceled");
                }
                C3585l c3585l = ((C3097l) this.f35846l).yandex;
                long jNanoTime = System.nanoTime();
                long j2 = this.f35848l - jNanoTime;
                if (((CopyOnWriteArrayList) this.f35850l).isEmpty() || j2 <= 0) {
                    c3329lTapsense = tapsense();
                    j = 250000000;
                    this.f35848l = jNanoTime + 250000000;
                } else {
                    j = j2;
                    c3329lTapsense = null;
                }
                if (c3329lTapsense == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f35850l;
                    if (copyOnWriteArrayList.isEmpty() || (c3329l = (C3329l) ((LinkedBlockingDeque) this.f35849l).poll(j, timeUnit)) == null) {
                        c3329lTapsense = null;
                    } else {
                        copyOnWriteArrayList.remove(c3329l.yandex);
                        c3329lTapsense = c3329l;
                    }
                    if (c3329lTapsense == null) {
                    }
                }
                boolean z = false;
                if (c3329lTapsense.loadAd == null && c3329lTapsense.crashlytics == null) {
                    subscription();
                    if (!c3329lTapsense.yandex.yandex()) {
                        c3329lTapsense = c3329lTapsense.yandex.mopub();
                    }
                    if (c3329lTapsense.loadAd == null && c3329lTapsense.crashlytics == null) {
                        z = true;
                    }
                    if (z) {
                        C13247l c13247lCrashlytics = c3329lTapsense.yandex.crashlytics();
                        subscription();
                        return c13247lCrashlytics;
                    }
                }
                Throwable th = c3329lTapsense.crashlytics;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        AbstractC11718l.yandex(iOException, th);
                    }
                }
                InterfaceC7476l interfaceC7476l = c3329lTapsense.loadAd;
                if (interfaceC7476l != null) {
                    ((C11815l) this.f35847l).startapp.addFirst(interfaceC7476l);
                }
            } catch (Throwable th2) {
                subscription();
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d5 A[RETURN] */
    public boolean inmobi(long j, C1841l c1841l) {
        C9030l c9030l;
        if (((ArrayList) this.f35850l) == null) {
            this.f35850l = new ArrayList();
        }
        if (((ArrayList) this.f35846l) == null) {
            this.f35846l = new ArrayList();
        }
        if (((ArrayList) this.f35850l).isEmpty() || ((((C1841l) ((ArrayList) this.f35850l).get(0)).signatures() / 1000) / 60) / 60 == ((c1841l.signatures() / 1000) / 60) / 60) {
            long jRemoteconfig = this.f35848l + ((long) c1841l.remoteconfig());
            C6901l c6901l = (C6901l) this.f35849l;
            if (!c6901l.m2097import().m1682l(null, AbstractC5981l.f12693l)) {
                c6901l.m2097import();
                if (jRemoteconfig < Math.max(0, ((Integer) AbstractC5981l.isPro.yandex(null)).intValue())) {
                    this.f35848l = jRemoteconfig;
                    ((ArrayList) this.f35850l).add(c1841l);
                    ((ArrayList) this.f35846l).add(Long.valueOf(j));
                    c9030l = (C9030l) this.f35847l;
                    if (((ArrayList) this.f35850l).size() < Math.max(1, c6901l.m2097import().m1683l(c9030l != null ? c9030l.tapsense() : null, AbstractC5981l.firebase))) {
                        return true;
                    }
                }
            } else if (((ArrayList) this.f35850l).isEmpty()) {
                this.f35848l = jRemoteconfig;
                ((ArrayList) this.f35850l).add(c1841l);
                ((ArrayList) this.f35846l).add(Long.valueOf(j));
                c9030l = (C9030l) this.f35847l;
                if (((ArrayList) this.f35850l).size() < Math.max(1, c6901l.m2097import().m1683l(c9030l != null ? c9030l.tapsense() : null, AbstractC5981l.firebase))) {
                    return true;
                }
            } else {
                c6901l.m2097import();
                if (jRemoteconfig < Math.max(0, ((Integer) AbstractC5981l.isPro.yandex(null)).intValue())) {
                    this.f35848l = jRemoteconfig;
                    ((ArrayList) this.f35850l).add(c1841l);
                    ((ArrayList) this.f35846l).add(Long.valueOf(j));
                    c9030l = (C9030l) this.f35847l;
                    if (((ArrayList) this.f35850l).size() < Math.max(1, c6901l.m2097import().m1683l(c9030l != null ? c9030l.tapsense() : null, AbstractC5981l.firebase))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC3270l
    public void isPro(int i, List list) {
        C13350l c13350l = (C13350l) this.f35849l;
        c13350l.m3637instanceof(c13350l.admob.tapsense);
    }

    public void isVip(boolean z) {
        C0458l c0458l = ((C13350l) this.f35849l).vip;
        AbstractC8481l abstractC8481l = AbstractC18585l.yandex;
        C1139l c1139l = (C1139l) c0458l.f1691l;
        if (c1139l.firebase != z) {
            c1139l.firebase = z ? 1 : 0;
            synchronized (c1139l.amazon) {
                int iBeginBroadcast = c1139l.billing.beginBroadcast() - 1;
                while (true) {
                    RemoteCallbackList remoteCallbackList = c1139l.billing;
                    if (iBeginBroadcast >= 0) {
                        try {
                            ((InterfaceC3145l) remoteCallbackList.getBroadcastItem(iBeginBroadcast)).mo1291l(z ? 1 : 0);
                        } catch (RemoteException | SecurityException e) {
                            AbstractC6427l.subs("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                        }
                        iBeginBroadcast--;
                    } else {
                        remoteCallbackList.finishBroadcast();
                    }
                }
            }
        }
    }

    public void license(C2427l c2427l) {
        premium();
        C13350l c13350l = (C13350l) this.f35849l;
        C0458l c0458l = c13350l.vip;
        if (c2427l == null) {
            ((C1139l) c0458l.f1691l).yandex.setRatingType(0);
        } else {
            ((C1139l) c0458l.f1691l).yandex.setRatingType(AbstractC18585l.pro(c2427l.amazon.subs));
        }
        c13350l.m3637instanceof(c13350l.admob.tapsense);
    }

    @Override // defpackage.InterfaceC4930l
    public void mopub(Throwable th) {
        if (this != ((C13350l) ((C18338l) this.f35849l).f35849l).tapsense) {
            return;
        }
        AbstractC6427l.vip("MediaSessionLegacyStub", "Failed to load bitmap: " + th.getMessage());
    }

    public void premium() {
        Bitmap bitmap;
        Uri uri;
        C13350l c13350l = (C13350l) this.f35849l;
        C3726l c3726l = c13350l.admob;
        C18602l c18602l = c3726l.tapsense;
        C2427l c2427lM4567l = c18602l.m4567l();
        C3852l c3852lM4568l = c18602l.m4568l();
        long duration = -9223372036854775807L;
        if ((!c18602l.mo2779l(16) || !c18602l.mo2777l()) && c18602l.mo2779l(16)) {
            duration = c18602l.getDuration();
        }
        String str = c2427lM4567l != null ? c2427lM4567l.yandex : "";
        Uri uri2 = (c2427lM4567l == null || (uri = c2427lM4567l.billing.yandex) == null) ? null : uri;
        if (Objects.equals((C3852l) this.f35847l, c3852lM4568l) && Objects.equals((String) this.f35846l, str) && Objects.equals((Uri) this.f35850l, uri2) && this.f35848l == duration) {
            return;
        }
        this.f35846l = str;
        this.f35850l = uri2;
        this.f35847l = c3852lM4568l;
        this.f35848l = duration;
        ListenableFuture listenableFutureMo1118default = c3726l.remoteconfig.mo1118default(c3852lM4568l);
        if (listenableFutureMo1118default != null) {
            c13350l.tapsense = null;
            if (listenableFutureMo1118default.isDone()) {
                try {
                    bitmap = (Bitmap) AbstractC7151l.crashlytics(listenableFutureMo1118default);
                } catch (CancellationException | ExecutionException e) {
                    AbstractC6427l.vip("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
                    bitmap = null;
                }
            } else {
                C18338l c18338l = new C18338l();
                c18338l.f35849l = this;
                c18338l.f35847l = c3852lM4568l;
                c18338l.f35846l = str;
                c18338l.f35850l = uri2;
                c18338l.f35848l = duration;
                c13350l.tapsense = c18338l;
                Handler handler = c3726l.smaato;
                Objects.requireNonNull(handler);
                listenableFutureMo1118default.yandex(new RunnableC9929l(listenableFutureMo1118default, c18338l, 9), new ExecutorC10366l(handler, 1));
            }
            bitmap = null;
        } else {
            bitmap = null;
        }
        C13350l.m3628class(c13350l.vip, AbstractC18585l.vip(c3852lM4568l, str, uri2, duration, bitmap));
    }

    public void pro(int i, C18602l c18602l) throws Throwable {
        C13350l c13350l = (C13350l) this.f35849l;
        signatures(c18602l.m4569l());
        ad(c18602l.mo2779l(18) ? c18602l.mo2802public() : C3852l.f7980private);
        c18602l.m4568l();
        premium();
        isVip(c18602l.mo2788l());
        advert(c18602l.mopub());
        c18602l.inmobi();
        Signature();
        int i2 = c18602l.mo2779l(20) ? 4 : 0;
        if (c13350l.Signature != i2) {
            c13350l.Signature = i2;
            ((C1139l) c13350l.vip.f1691l).yandex.setFlags(i2 | 3);
        }
        license(c18602l.m4567l());
    }

    @Override // defpackage.InterfaceC3270l
    public void purchase(int i, C12417l c12417l) {
        Bundle bundle = Bundle.EMPTY;
        boolean zIsEmpty = bundle.isEmpty();
        Bundle bundle2 = c12417l.crashlytics;
        if (zIsEmpty) {
            bundle = bundle2;
        } else if (!bundle2.isEmpty()) {
            Bundle bundle3 = new Bundle(bundle2);
            bundle3.putAll(bundle);
            bundle = bundle3;
        }
        C0458l c0458l = ((C13350l) this.f35849l).vip;
        String str = c12417l.loadAd;
        c0458l.getClass();
        if (TextUtils.isEmpty(str)) {
            C8339l.metrica("event cannot be null or empty");
        } else {
            ((C1139l) c0458l.f1691l).yandex.sendSessionEvent(str, bundle);
        }
    }

    public void signatures(AbstractC10759l abstractC10759l) throws Throwable {
        applovin(abstractC10759l);
        premium();
    }

    @Override // defpackage.InterfaceC3270l
    public void smaato(int i, C16616l c16616l) {
        C13350l c13350l = (C13350l) this.f35849l;
        C18602l c18602l = c13350l.admob.tapsense;
        int i2 = c18602l.mo2779l(20) ? 4 : 0;
        if (c13350l.Signature != i2) {
            c13350l.Signature = i2;
            ((C1139l) c13350l.vip.f1691l).yandex.setFlags(i2 | 3);
        }
        c13350l.m3637instanceof(c18602l);
    }

    public void subscription() {
        CopyOnWriteArrayList<InterfaceC7476l> copyOnWriteArrayList = (CopyOnWriteArrayList) this.f35850l;
        for (InterfaceC7476l interfaceC7476l : copyOnWriteArrayList) {
            interfaceC7476l.cancel();
            InterfaceC7476l interfaceC7476lLoadAd = interfaceC7476l.loadAd();
            if (interfaceC7476lLoadAd != null) {
                ((C11815l) this.f35847l).startapp.addLast(interfaceC7476lLoadAd);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public C3329l tapsense() {
        InterfaceC7476l c6619l;
        C11815l c11815l = (C11815l) this.f35847l;
        if (c11815l.yandex(null)) {
            try {
                c6619l = c11815l.loadAd();
            } catch (Throwable th) {
                c6619l = new C6619l(th);
            }
            if (c6619l.yandex()) {
                return new C3329l(c6619l, null, null, 6);
            }
            if (c6619l instanceof C6619l) {
                return ((C6619l) c6619l).yandex;
            }
            ((CopyOnWriteArrayList) this.f35850l).add(c6619l);
            ((C3097l) this.f35846l).amazon().amazon(new C0728l(AbstractC11432l.loadAd + " connect " + c11815l.subs.admob.mopub(), c6619l, this), 0L);
        }
        return null;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public void m4523throws() {
        C16386l c16386l = (C16386l) this.f35849l;
        c16386l.mo211l();
        ((C17417l) c16386l.f833l).f33951l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = c16386l.m4180l().edit();
        editorEdit.remove((String) this.f35846l);
        editorEdit.remove((String) this.f35850l);
        editorEdit.putLong((String) this.f35847l, jCurrentTimeMillis);
        editorEdit.apply();
    }

    @Override // defpackage.InterfaceC13077l
    public InterfaceC2257l vip() {
        long ptr$cinterop_release = ((LongPointerWrapper) ((NativePointer) this.f35846l)).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        return new C0093l(new LongPointerWrapper(realmcJNI.realm_query_find_all(ptr$cinterop_release), false, 2, null), this.f35848l, (InterfaceC1388l) this.f35849l, (C5501l) this.f35850l);
    }

    @Override // defpackage.InterfaceC3270l
    public void yandex() {
    }

    @Override // defpackage.InterfaceC3270l
    public /* synthetic */ void loadAd(int i) {
    }

    @Override // defpackage.InterfaceC3270l
    public /* synthetic */ void firebase(int i, C9201l c9201l) {
    }

    @Override // defpackage.InterfaceC3270l
    public /* synthetic */ void remoteconfig(int i, C5159l c5159l) {
    }

    @Override // defpackage.InterfaceC3270l
    public /* synthetic */ void admob(int i, int i2, int i3) {
    }

    @Override // defpackage.InterfaceC3270l
    public /* synthetic */ void metrica(int i, C17425l c17425l, String str) {
    }

    @Override // defpackage.InterfaceC3270l
    public /* synthetic */ void subs(int i, C17425l c17425l, String str) {
    }

    @Override // defpackage.InterfaceC3270l
    public /* synthetic */ void startapp(int i, C1908l c1908l, C16616l c16616l, boolean z, boolean z2) {
    }
}
