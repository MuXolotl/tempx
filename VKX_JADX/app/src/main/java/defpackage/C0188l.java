package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.SurfaceHolder;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lًؑٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0188l implements InterfaceC11345l {
    public final C8961l amazon;
    public final InterfaceC9474l billing;
    public final C12962l crashlytics;
    public boolean firebase;
    public C5138l isPro;
    public final C16811l loadAd;
    public boolean metrica;
    public final Bundle mopub;
    public final C17977l purchase;
    public boolean smaato;
    public C18396l subs;
    public boolean subscription;
    public final Context yandex;
    public C5908l remoteconfig = new C5908l();
    public C5908l vip = new C5908l();
    public C1424l startapp = new C1424l(18);
    public final long admob = 100;
    public long adcel = -9223372036854775807L;
    public long ads = -9223372036854775807L;

    public C0188l(Context context, C16811l c16811l, C12962l c12962l, Bundle bundle, Looper looper, InterfaceC9474l interfaceC9474l) {
        this.amazon = new C8961l(looper, C18527l.yandex, new C1149l(this));
        this.yandex = context;
        this.loadAd = c16811l;
        this.purchase = new C17977l(this, looper);
        this.crashlytics = c12962l;
        this.mopub = bundle;
        this.billing = interfaceC9474l;
        C13708l c13708l = C13708l.f26763l;
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public static boolean m287abstract(C1424l c1424l) {
        C1908l c1908l = (C1908l) c1424l.f3603l;
        if (c1908l.signatures == 1 || c1908l.isPro.startapp()) {
            return false;
        }
        return ((C16616l) c1424l.f3601l).yandex(2) || ((C1908l) c1424l.f3603l).license;
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public static List m288l(ArrayList arrayList) {
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        C2494l c2494l = AbstractC8672l.yandex;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public static C4262l m289l(int i, C2427l c2427l, long j, boolean z) {
        return new C4262l(null, i, c2427l, null, i, j, j, z ? 0 : -1, z ? 0 : -1);
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static C16830l m290l(C16830l c16830l) {
        if (c16830l == null) {
            return null;
        }
        if (c16830l.f32856l > 0.0f) {
            return c16830l;
        }
        AbstractC6427l.vip("MCImplLegacy", "Adjusting playback speed to 1.0f because negative playback speed isn't supported.");
        ArrayList arrayList = new ArrayList();
        long j = c16830l.f32849l;
        long j2 = c16830l.f32855l;
        int i = c16830l.f32859l;
        CharSequence charSequence = c16830l.f32850l;
        List list = c16830l.f32858l;
        if (list != null) {
            arrayList.addAll(list);
        }
        return new C16830l(c16830l.f32853l, c16830l.f32852l, j, 1.0f, j2, i, charSequence, c16830l.f32851l, arrayList, c16830l.f32854l, c16830l.f32860l);
    }

    @Override // defpackage.InterfaceC11345l
    public final void Signature(InterfaceC13521l interfaceC13521l) {
        this.amazon.yandex(interfaceC13521l);
    }

    @Override // defpackage.InterfaceC11345l
    public final int ad() {
        return mo304implements();
    }

    @Override // defpackage.InterfaceC11345l
    public final void adcel() {
        mo359throw(0, Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.InterfaceC11345l
    public final int admob() {
        C1908l c1908l = (C1908l) this.startapp.f3603l;
        if (c1908l.subscription.yandex == 1) {
            return c1908l.tapsense;
        }
        C18396l c18396l = this.subs;
        if (c18396l == null) {
            return 0;
        }
        C13052l c13052lYandex = ((C10730l) c18396l.f35934l).yandex();
        AbstractC8481l abstractC8481l = AbstractC18585l.yandex;
        if (c13052lYandex == null) {
            return 0;
        }
        return c13052lYandex.amazon;
    }

    @Override // defpackage.InterfaceC11345l
    public final void ads(boolean z) {
        if (z != mo334l()) {
            C1908l c1908lFirebase = ((C1908l) this.startapp.f3603l).firebase(z);
            C1424l c1424l = this.startapp;
            m326l(new C1424l(c1908lFirebase, (C14023l) c1424l.f3602l, (C16616l) c1424l.f3601l, (AbstractC1186l) c1424l.f3605l, (Bundle) c1424l.f3604l, (C18503l) null), null, null);
        }
        C13161l c13161lAppmetrica = this.subs.appmetrica();
        AbstractC8481l abstractC8481l = AbstractC18585l.yandex;
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", z ? 1 : 0);
        c13161lAppmetrica.m3588volatile("android.support.v4.media.session.action.SET_SHUFFLE_MODE", bundle);
    }

    @Override // defpackage.InterfaceC11345l
    public final C15074l advert() {
        AbstractC6427l.vip("MCImplLegacy", "Session doesn't support getting VideoSize");
        return C15074l.amazon;
    }

    @Override // defpackage.InterfaceC11345l
    public final boolean amazon() {
        return false;
    }

    @Override // defpackage.InterfaceC11345l
    public final C13736l applovin() {
        return ((C1908l) this.startapp.f3603l).adcel;
    }

    @Override // defpackage.InterfaceC11345l
    public final void appmetrica(int i, boolean z) {
        if (z != mo329l()) {
            C1908l c1908lCrashlytics = ((C1908l) this.startapp.f3603l).crashlytics(admob(), z);
            C1424l c1424l = this.startapp;
            m326l(new C1424l(c1908lCrashlytics, (C14023l) c1424l.f3602l, (C16616l) c1424l.f3601l, (AbstractC1186l) c1424l.f3605l, (Bundle) c1424l.f3604l, (C18503l) null), null, null);
        }
        ((C10730l) this.subs.f35934l).yandex.adjustVolume(z ? -100 : 100, i);
    }

    @Override // defpackage.InterfaceC11345l
    public final C1372l billing() {
        return ((C1908l) this.startapp.f3603l).mopub;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: break, reason: not valid java name */
    public final void mo291break(C13736l c13736l, boolean z) {
        AbstractC6427l.vip("MCImplLegacy", "Legacy session doesn't support setting audio attributes remotely");
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final void mo292case() {
        ((MediaController.TransportControls) this.subs.appmetrica().f25776l).skipToPrevious();
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final void mo293catch(SurfaceHolder surfaceHolder) {
        AbstractC6427l.vip("MCImplLegacy", "Session doesn't support setting SurfaceHolder");
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final void mo294class(int i) {
        m337l(i, 0L);
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: const, reason: not valid java name */
    public final void mo295const(int i) {
        if (i != mopub()) {
            C1908l c1908lSubs = ((C1908l) this.startapp.f3603l).subs(i);
            C1424l c1424l = this.startapp;
            m326l(new C1424l(c1908lSubs, (C14023l) c1424l.f3602l, (C16616l) c1424l.f3601l, (AbstractC1186l) c1424l.f3605l, (Bundle) c1424l.f3604l, (C18503l) null), null, null);
        }
        C13161l c13161lAppmetrica = this.subs.appmetrica();
        int iStartapp = AbstractC18585l.startapp(i);
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", iStartapp);
        c13161lAppmetrica.m3588volatile("android.support.v4.media.session.action.SET_REPEAT_MODE", bundle);
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final void mo296continue(boolean z) {
        C1908l c1908l = (C1908l) this.startapp.f3603l;
        if (c1908l.license == z) {
            return;
        }
        this.adcel = AbstractC8672l.crashlytics(c1908l, this.adcel, this.ads, this.loadAd.f32841l);
        this.ads = SystemClock.elapsedRealtime();
        C1908l c1908lAmazon = ((C1908l) this.startapp.f3603l).amazon(1, 0, z);
        C1424l c1424l = this.startapp;
        m326l(new C1424l(c1908lAmazon, (C14023l) c1424l.f3602l, (C16616l) c1424l.f3601l, (AbstractC1186l) c1424l.f3605l, (Bundle) c1424l.f3604l, (C18503l) null), null, null);
        if (!this.subscription) {
            if (m287abstract(this.startapp)) {
                m308l();
            }
        } else {
            C18396l c18396l = this.subs;
            if (z) {
                ((MediaController.TransportControls) c18396l.appmetrica().f25776l).play();
            } else {
                ((MediaController.TransportControls) c18396l.appmetrica().f25776l).pause();
            }
        }
    }

    @Override // defpackage.InterfaceC11345l
    public final void crashlytics(float f) {
        if (f != billing().yandex) {
            C1908l c1908lPurchase = ((C1908l) this.startapp.f3603l).purchase(new C1372l(f));
            C1424l c1424l = this.startapp;
            m326l(new C1424l(c1908lPurchase, (C14023l) c1424l.f3602l, (C16616l) c1424l.f3601l, (AbstractC1186l) c1424l.f3605l, (Bundle) c1424l.f3604l, (C18503l) null), null, null);
        }
        this.subs.appmetrica().mo3584private(f);
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final void mo297default(int i, List list) {
        AbstractC12442l.admob(i >= 0);
        if (list.isEmpty()) {
            return;
        }
        C10444l c10444l = (C10444l) ((C1908l) this.startapp.f3603l).isPro;
        if (c10444l.startapp()) {
            mo327l(0, -9223372036854775807L, list);
            return;
        }
        int iMin = Math.min(i, mo338l().metrica());
        C10444l c10444lAdcel = c10444l.adcel(iMin, list);
        int iMo304implements = mo304implements();
        int size = list.size();
        if (iMo304implements >= iMin) {
            iMo304implements += size;
        }
        C1908l c1908lRemoteconfig = ((C1908l) this.startapp.f3603l).remoteconfig(c10444lAdcel, iMo304implements);
        C1424l c1424l = this.startapp;
        m326l(new C1424l(c1908lRemoteconfig, (C14023l) c1424l.f3602l, (C16616l) c1424l.f3601l, (AbstractC1186l) c1424l.f3605l, (Bundle) c1424l.f3604l, (C18503l) null), null, null);
        if (this.subscription) {
            remoteconfig(iMin, list);
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final void mo298else(float f) {
        AbstractC6427l.vip("MCImplLegacy", "Session doesn't support setting player volume");
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final void mo299extends(int i) {
        mo359throw(i, i + 1);
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final void mo300final() {
        AbstractC6427l.vip("MCImplLegacy", "Session doesn't support unmuting the player");
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final boolean mo301finally() {
        return ((C1908l) this.startapp.f3603l).ad;
    }

    @Override // defpackage.InterfaceC11345l
    public final long firebase() {
        return ((C1908l) this.startapp.f3603l).crashlytics.mopub;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final void mo302for(long j) {
        m337l(mo304implements(), j);
    }

    @Override // defpackage.InterfaceC11345l
    public final long getDuration() {
        return ((C1908l) this.startapp.f3603l).crashlytics.amazon;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final void mo303goto() {
        ((MediaController.TransportControls) this.subs.appmetrica().f25776l).skipToNext();
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public final int mo304implements() {
        return ((C1908l) this.startapp.f3603l).crashlytics.yandex.loadAd;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final C1047l mo305import() {
        return C1047l.loadAd;
    }

    @Override // defpackage.InterfaceC11345l
    public final C2848l inmobi() {
        return ((C1908l) this.startapp.f3603l).subscription;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final boolean mo306instanceof() {
        return this.smaato;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public final long mo307interface() {
        return ((C1908l) this.startapp.f3603l).appmetrica;
    }

    @Override // defpackage.InterfaceC11345l
    public final long isPro() {
        return -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC11345l
    public final void isVip() {
        ((MediaController.TransportControls) this.subs.appmetrica().f25776l).skipToPrevious();
    }

    @Override // defpackage.InterfaceC11345l
    public final int license() {
        return -1;
    }

    @Override // defpackage.InterfaceC11345l
    public final void loadAd(C1372l c1372l) {
        if (!c1372l.equals(billing())) {
            C1908l c1908lPurchase = ((C1908l) this.startapp.f3603l).purchase(c1372l);
            C1424l c1424l = this.startapp;
            m326l(new C1424l(c1908lPurchase, (C14023l) c1424l.f3602l, (C16616l) c1424l.f3601l, (AbstractC1186l) c1424l.f3605l, (Bundle) c1424l.f3604l, (C18503l) null), null, null);
        }
        this.subs.appmetrica().mo3584private(c1372l.yandex);
    }

    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public final void m308l() {
        this.subscription = true;
        C4322l c4322l = new C4322l();
        C1908l c1908l = (C1908l) this.startapp.f3603l;
        C10444l c10444l = (C10444l) c1908l.isPro;
        int i = c1908l.crashlytics.yandex.loadAd;
        c10444l.remoteconfig(i, c4322l, 0L);
        C2427l c2427l = c4322l.crashlytics;
        if (c10444l.ads(i) != -1) {
            boolean z = ((C1908l) this.startapp.f3603l).license;
            C18396l c18396l = this.subs;
            if (z) {
                ((MediaController.TransportControls) c18396l.appmetrica().f25776l).play();
            } else {
                c18396l.appmetrica().ad();
            }
        } else {
            C11470l c11470l = c2427l.billing;
            String str = c2427l.yandex;
            if (c11470l.yandex != null) {
                boolean z2 = ((C1908l) this.startapp.f3603l).license;
                C18396l c18396l2 = this.subs;
                if (z2) {
                    C13161l c13161lAppmetrica = c18396l2.appmetrica();
                    Uri uri = c11470l.yandex;
                    Bundle bundle = c11470l.crashlytics;
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    ((MediaController.TransportControls) c13161lAppmetrica.f25776l).playFromUri(uri, bundle);
                } else {
                    C13161l c13161lAppmetrica2 = c18396l2.appmetrica();
                    Uri uri2 = c11470l.yandex;
                    Bundle bundle2 = c11470l.crashlytics;
                    if (bundle2 == null) {
                        bundle2 = Bundle.EMPTY;
                    }
                    c13161lAppmetrica2.applovin(uri2, bundle2);
                }
            } else {
                String str2 = c11470l.loadAd;
                C1424l c1424l = this.startapp;
                if (str2 != null) {
                    boolean z3 = ((C1908l) c1424l.f3603l).license;
                    C18396l c18396l3 = this.subs;
                    if (z3) {
                        C13161l c13161lAppmetrica3 = c18396l3.appmetrica();
                        String str3 = c11470l.loadAd;
                        Bundle bundle3 = c11470l.crashlytics;
                        if (bundle3 == null) {
                            bundle3 = Bundle.EMPTY;
                        }
                        ((MediaController.TransportControls) c13161lAppmetrica3.f25776l).playFromSearch(str3, bundle3);
                    } else {
                        C13161l c13161lAppmetrica4 = c18396l3.appmetrica();
                        String str4 = c11470l.loadAd;
                        Bundle bundle4 = c11470l.crashlytics;
                        if (bundle4 == null) {
                            bundle4 = Bundle.EMPTY;
                        }
                        c13161lAppmetrica4.signatures(str4, bundle4);
                    }
                } else {
                    boolean z4 = ((C1908l) c1424l.f3603l).license;
                    C18396l c18396l4 = this.subs;
                    if (z4) {
                        C13161l c13161lAppmetrica5 = c18396l4.appmetrica();
                        Bundle bundle5 = c11470l.crashlytics;
                        if (bundle5 == null) {
                            bundle5 = Bundle.EMPTY;
                        }
                        ((MediaController.TransportControls) c13161lAppmetrica5.f25776l).playFromMediaId(str, bundle5);
                    } else {
                        C13161l c13161lAppmetrica6 = c18396l4.appmetrica();
                        Bundle bundle6 = c11470l.crashlytics;
                        if (bundle6 == null) {
                            bundle6 = Bundle.EMPTY;
                        }
                        c13161lAppmetrica6.advert(str, bundle6);
                    }
                }
            }
        }
        if (((C1908l) this.startapp.f3603l).crashlytics.yandex.billing != 0) {
            ((MediaController.TransportControls) this.subs.appmetrica().f25776l).seekTo(((C1908l) this.startapp.f3603l).crashlytics.yandex.billing);
        }
        if (((C16616l) this.startapp.f3601l).yandex(20)) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < c10444l.metrica(); i2++) {
                if (i2 != i && c10444l.ads(i2) == -1) {
                    c10444l.remoteconfig(i2, c4322l, 0L);
                    arrayList.add(c4322l.crashlytics);
                }
            }
            remoteconfig(0, arrayList);
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؚۣؒ, reason: contains not printable characters */
    public final void mo309l() {
        AbstractC6427l.vip("MCImplLegacy", "Session doesn't support muting the player");
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lۣؒٞ, reason: contains not printable characters */
    public final C4970l mo310l() {
        return C4970l.f10152volatile;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؒۢۜ, reason: contains not printable characters */
    public final void mo311l(C2427l c2427l) {
        mo324l(c2427l);
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؘؓؖ, reason: contains not printable characters */
    public final C14023l mo312l() {
        return (C14023l) this.startapp.f3602l;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lٜؓ۠, reason: contains not printable characters */
    public final void mo313l(List list) {
        mo297default(Alert.DURATION_SHOW_INDEFINITELY, list);
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؙؔؑ, reason: contains not printable characters */
    public final void mo314l(List list) {
        mo327l(0, -9223372036854775807L, list);
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    public final int mo315l() {
        return 0;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lٖؖ۠, reason: contains not printable characters */
    public final ListenableFuture mo316l(String str, C1673l c1673l) {
        CharSequence charSequence = ((C8937l) this.remoteconfig.f12457l).f18410l.getCharSequence("android.media.metadata.MEDIA_ID");
        if (str.equals(charSequence != null ? charSequence.toString() : null)) {
            ((MediaController.TransportControls) this.subs.appmetrica().f25776l).setRating((Rating) AbstractC18585l.ads(c1673l).loadAd());
        }
        return AbstractC7151l.purchase(new C5159l(0));
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lّؗؑ, reason: contains not printable characters */
    public final long mo317l() {
        long jCrashlytics = AbstractC8672l.crashlytics((C1908l) this.startapp.f3603l, this.adcel, this.ads, this.loadAd.f32841l);
        this.adcel = jCrashlytics;
        return jCrashlytics;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؗۨؑ, reason: contains not printable characters */
    public final void mo318l() {
        C12962l c12962l = this.crashlytics;
        int iYandex = c12962l.yandex.yandex();
        C16811l c16811l = this.loadAd;
        if (iYandex != 0) {
            c16811l.m4197abstract(new RunnableC10663l(this, 1));
            return;
        }
        Object objAmazon = c12962l.yandex.amazon();
        objAmazon.getClass();
        c16811l.m4197abstract(new RunnableC12388l(this, (C5057l) objAmazon, 7));
        c16811l.f32839l.postDelayed(new RunnableC10663l(this, 0), 500L);
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lٍؘؘ, reason: contains not printable characters */
    public final boolean mo319l() {
        return this.smaato;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؘِٞ, reason: contains not printable characters */
    public final void mo320l(int i) {
        mo348package(i, 1);
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؙٗۛ, reason: contains not printable characters */
    public final void mo321l() {
        ((MediaController.TransportControls) this.subs.appmetrica().f25776l).rewind();
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؙ۟ٙ, reason: contains not printable characters */
    public final C3852l mo322l() {
        C2427l c2427lSubscription = ((C1908l) this.startapp.f3603l).subscription();
        return c2427lSubscription == null ? C3852l.f7980private : c2427lSubscription.amazon;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lٍؚۖ, reason: contains not printable characters */
    public final long mo323l() {
        return ((C1908l) this.startapp.f3603l).applovin;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public final void mo324l(C2427l c2427l) {
        metrica(c2427l, -9223372036854775807L);
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lًٚٔ, reason: contains not printable characters */
    public final void mo325l(int i, C2427l c2427l) {
        mo297default(i, Collections.singletonList(c2427l));
    }

    /* JADX INFO: renamed from: lٍۤٙ, reason: contains not printable characters */
    public final void m326l(C1424l c1424l, Integer num, Integer num2) {
        m339l(false, this.remoteconfig, false, c1424l, num, num2);
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؘْؒ, reason: contains not printable characters */
    public final void mo327l(int i, long j, List list) {
        if (list.isEmpty()) {
            adcel();
            return;
        }
        C1908l c1908lVip = ((C1908l) this.startapp.f3603l).vip(C10444l.mopub.adcel(0, list), new C9009l(m289l(i, (C2427l) list.get(i), j == -9223372036854775807L ? 0L : j, false), false, SystemClock.elapsedRealtime(), -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L), 0);
        C1424l c1424l = this.startapp;
        m326l(new C1424l(c1908lVip, (C14023l) c1424l.f3602l, (C16616l) c1424l.f3601l, (AbstractC1186l) c1424l.f3605l, (Bundle) c1424l.f3604l, (C18503l) null), null, null);
        if (m287abstract(this.startapp)) {
            m308l();
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؚْٟ, reason: contains not printable characters */
    public final long mo328l() {
        return mo347new();
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lْٓؒ, reason: contains not printable characters */
    public final boolean mo329l() {
        C1908l c1908l = (C1908l) this.startapp.f3603l;
        if (c1908l.subscription.yandex == 1) {
            return c1908l.Signature;
        }
        C18396l c18396l = this.subs;
        if (c18396l == null) {
            return false;
        }
        C13052l c13052lYandex = ((C10730l) c18396l.f35934l).yandex();
        AbstractC8481l abstractC8481l = AbstractC18585l.yandex;
        return c13052lYandex != null && c13052lYandex.amazon == 0;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lْ٘ۚ, reason: contains not printable characters */
    public final void mo330l(int i, C2427l c2427l) {
        mo346native(i, i + 1, AbstractC1186l.isVip(c2427l));
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lْۥٞ, reason: contains not printable characters */
    public final void mo331l() {
        ((MediaController.TransportControls) this.subs.appmetrica().f25776l).skipToNext();
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lٔٙٝ, reason: contains not printable characters */
    public final void mo332l() {
        ((MediaController.TransportControls) this.subs.appmetrica().f25776l).fastForward();
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lٍٔ۠, reason: contains not printable characters */
    public final void mo333l() {
        mo357synchronized(1);
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lٕؓٗ, reason: contains not printable characters */
    public final boolean mo334l() {
        return ((C1908l) this.startapp.f3603l).subs;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lٕٕۤ, reason: contains not printable characters */
    public final AbstractC1186l mo335l() {
        return (AbstractC1186l) this.startapp.f3605l;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public final void mo336l(int i, int i2, int i3) {
        AbstractC12442l.admob(i >= 0 && i <= i2 && i3 >= 0);
        C10444l c10444l = (C10444l) ((C1908l) this.startapp.f3603l).isPro;
        int iMetrica = c10444l.metrica();
        int iMin = Math.min(i2, iMetrica);
        int i4 = iMin - i;
        int i5 = iMetrica - i4;
        int i6 = i5 - 1;
        int iMin2 = Math.min(i3, i5);
        if (i >= iMetrica || i == iMin || i == iMin2) {
            return;
        }
        int iMo304implements = mo304implements();
        if (iMo304implements >= i) {
            iMo304implements = iMo304implements < iMin ? -1 : iMo304implements - i4;
        }
        if (iMo304implements == -1) {
            iMo304implements = AbstractC15323l.isPro(i, 0, i6);
            AbstractC6427l.vip("MCImplLegacy", "Currently playing item will be removed and added back to mimic move. Assumes item at " + iMo304implements + " would be the new current item");
        }
        if (iMo304implements >= iMin2) {
            iMo304implements += i4;
        }
        ArrayList arrayList = new ArrayList(c10444l.purchase);
        AbstractC15323l.m3981switch(arrayList, i, iMin, iMin2);
        C1908l c1908lRemoteconfig = ((C1908l) this.startapp.f3603l).remoteconfig(new C10444l(AbstractC1186l.Signature(arrayList), c10444l.billing), iMo304implements);
        C1424l c1424l = this.startapp;
        m326l(new C1424l(c1908lRemoteconfig, (C14023l) c1424l.f3602l, (C16616l) c1424l.f3601l, (AbstractC1186l) c1424l.f3605l, (Bundle) c1424l.f3604l, (C18503l) null), null, null);
        if (this.subscription) {
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < i4; i7++) {
                arrayList2.add((C10517l) ((List) this.remoteconfig.f12459l).get(i));
                this.subs.m4527strictfp(((C10517l) ((List) this.remoteconfig.f12459l).get(i)).f21399l);
            }
            for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                this.subs.subscription(((C10517l) arrayList2.get(i8)).f21399l, i8 + iMin2);
            }
        }
    }

    /* JADX INFO: renamed from: lٌٖؖ, reason: contains not printable characters */
    public final void m337l(int i, long j) {
        Integer num;
        Integer num2;
        int i2;
        long j2;
        long j3;
        long j4;
        int i3 = i;
        long j5 = j;
        AbstractC12442l.admob(i3 >= 0);
        int iMo304implements = mo304implements();
        AbstractC10759l abstractC10759l = ((C1908l) this.startapp.f3603l).isPro;
        if ((abstractC10759l.startapp() || i3 < abstractC10759l.metrica()) && !subs()) {
            if (i3 != iMo304implements) {
                long jAds = ((C10444l) ((C1908l) this.startapp.f3603l).isPro).ads(i3);
                if (jAds != -1) {
                    ((MediaController.TransportControls) this.subs.appmetrica().f25776l).skipToQueueItem(jAds);
                    num = 2;
                } else {
                    AbstractC12900l.subscription("Cannot seek to new media item due to the missing queue Id at media item, mediaItemIndex=", i3, "MCImplLegacy");
                    i3 = iMo304implements;
                    num = null;
                }
            } else {
                i3 = iMo304implements;
                num = null;
            }
            long jMo317l = mo317l();
            if (j5 == -9223372036854775807L) {
                j5 = jMo317l;
                num2 = null;
            } else {
                ((MediaController.TransportControls) this.subs.appmetrica().f25776l).seekTo(j5);
                num2 = 1;
            }
            if (num == null) {
                long jMo347new = mo347new();
                long duration = getDuration();
                long jMax = j5 < jMo317l ? j5 : Math.max(j5, jMo347new);
                j2 = jMax;
                i2 = duration == -9223372036854775807L ? 0 : (int) ((100 * jMax) / duration);
                j3 = jMax - j5;
                j4 = duration;
            } else {
                i2 = 0;
                j2 = 0;
                j3 = 0;
                j4 = -9223372036854775807L;
            }
            C1908l c1908lIsPro = ((C1908l) this.startapp.f3603l).isPro(new C9009l(m289l(i3, !abstractC10759l.startapp() ? abstractC10759l.remoteconfig(i3, new C4322l(), 0L).crashlytics : null, j5, false), false, SystemClock.elapsedRealtime(), j4, j2, i2, j3, -9223372036854775807L, j4, j2));
            if (c1908lIsPro.signatures != 1) {
                c1908lIsPro = c1908lIsPro.billing(2, null);
            }
            C1908l c1908l = c1908lIsPro;
            C1424l c1424l = this.startapp;
            m326l(new C1424l(c1908l, (C14023l) c1424l.f3602l, (C16616l) c1424l.f3601l, (AbstractC1186l) c1424l.f3605l, (Bundle) c1424l.f3604l, (C18503l) null), num2, num);
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lَٖؕ, reason: contains not printable characters */
    public final AbstractC10759l mo338l() {
        return ((C1908l) this.startapp.f3603l).isPro;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ec  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: lٖۡٓ, reason: contains not printable characters */
    public final void m339l(boolean z, C5908l c5908l, boolean z2, final C1424l c1424l, Integer num, Integer num2) {
        C14723l c14723lMetrica;
        final int i;
        final int i2;
        final int i3;
        C14023l c14023l = (C14023l) c1424l.f3602l;
        AbstractC1186l abstractC1186l = (AbstractC1186l) c1424l.f3605l;
        C5908l c5908l2 = this.remoteconfig;
        C1424l c1424l2 = this.startapp;
        if (z2) {
            this.remoteconfig = c5908l;
            this.vip = c5908l;
            if (m287abstract(c1424l)) {
                this.subscription = true;
            }
        }
        this.startapp = c1424l;
        int i4 = 8;
        C16811l c16811l = this.loadAd;
        if (z) {
            c16811l.remoteconfig();
            if (((AbstractC1186l) c1424l2.f3605l).equals(abstractC1186l)) {
                return;
            }
            c16811l.f32839l.post(new RunnableC12388l(this, c1424l, i4));
            return;
        }
        C1908l c1908l = (C1908l) c1424l2.f3603l;
        AbstractC10759l abstractC10759l = c1908l.isPro;
        C1908l c1908l2 = (C1908l) c1424l.f3603l;
        C18503l c18503l = (C18503l) c1424l.f3606l;
        boolean zEquals = abstractC10759l.equals(c1908l2.isPro);
        final int i5 = 4;
        C8961l c8961l = this.amazon;
        if (!zEquals) {
            c8961l.crashlytics(0, new InterfaceC16975l() { // from class: lؒ۟ۤ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i6 = i5;
                    C1424l c1424l3 = c1424l;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i6) {
                        case 0:
                            interfaceC13521l.tapsense(((C1908l) c1424l3.f3603l).startapp);
                            break;
                        case 1:
                            interfaceC13521l.mo2731case(((C1908l) c1424l3.f3603l).subscription);
                            break;
                        case 2:
                            C1908l c1908l3 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 3:
                            interfaceC13521l.mo2734else((C16616l) c1424l3.f3601l);
                            break;
                        case 4:
                            C1908l c1908l4 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.mo2745volatile(c1908l4.isPro, c1908l4.firebase);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(((C1908l) c1424l3.f3603l).remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.Signature(((C1908l) c1424l3.f3603l).signatures);
                            break;
                        case 7:
                            interfaceC13521l.startapp(4, ((C1908l) c1424l3.f3603l).license);
                            break;
                        case 8:
                            interfaceC13521l.mo2737interface(((C1908l) c1424l3.f3603l).ad);
                            break;
                        case 9:
                            interfaceC13521l.mo2732catch(((C1908l) c1424l3.f3603l).mopub);
                            break;
                        case 10:
                            interfaceC13521l.subs(((C1908l) c1424l3.f3603l).admob);
                            break;
                        case 11:
                            interfaceC13521l.pro(((C1908l) c1424l3.f3603l).subs);
                            break;
                        default:
                            interfaceC13521l.smaato(((C1908l) c1424l3.f3603l).adcel);
                            break;
                    }
                }
            });
        }
        CharSequence charSequence = (CharSequence) c5908l2.f12453l;
        CharSequence charSequence2 = (CharSequence) c5908l.f12453l;
        C16830l c16830l = (C16830l) c5908l.f12458l;
        boolean zEquals2 = TextUtils.equals(charSequence, charSequence2);
        final int i6 = 5;
        if (!zEquals2) {
            c8961l.crashlytics(15, new InterfaceC16975l() { // from class: lؒ۟ۤ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i7 = i6;
                    C1424l c1424l3 = c1424l;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i7) {
                        case 0:
                            interfaceC13521l.tapsense(((C1908l) c1424l3.f3603l).startapp);
                            break;
                        case 1:
                            interfaceC13521l.mo2731case(((C1908l) c1424l3.f3603l).subscription);
                            break;
                        case 2:
                            C1908l c1908l3 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 3:
                            interfaceC13521l.mo2734else((C16616l) c1424l3.f3601l);
                            break;
                        case 4:
                            C1908l c1908l4 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.mo2745volatile(c1908l4.isPro, c1908l4.firebase);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(((C1908l) c1424l3.f3603l).remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.Signature(((C1908l) c1424l3.f3603l).signatures);
                            break;
                        case 7:
                            interfaceC13521l.startapp(4, ((C1908l) c1424l3.f3603l).license);
                            break;
                        case 8:
                            interfaceC13521l.mo2737interface(((C1908l) c1424l3.f3603l).ad);
                            break;
                        case 9:
                            interfaceC13521l.mo2732catch(((C1908l) c1424l3.f3603l).mopub);
                            break;
                        case 10:
                            interfaceC13521l.subs(((C1908l) c1424l3.f3603l).admob);
                            break;
                        case 11:
                            interfaceC13521l.pro(((C1908l) c1424l3.f3603l).subs);
                            break;
                        default:
                            interfaceC13521l.smaato(((C1908l) c1424l3.f3603l).adcel);
                            break;
                    }
                }
            });
        }
        if (num != null) {
            c8961l.crashlytics(11, new C17706l(c1424l2, c1424l, num, 8));
        }
        if (num2 != null) {
            c8961l.crashlytics(1, new C5131l(c1424l, num2, 26));
        }
        C16830l c16830l2 = (C16830l) c5908l2.f12458l;
        C2494l c2494l = AbstractC8672l.yandex;
        boolean z3 = c16830l2 != null && c16830l2.f32853l == 7;
        boolean z4 = c16830l != null && c16830l.f32853l == 7;
        final int i7 = 2;
        final int i8 = 10;
        if (z3 && z4) {
            String str = AbstractC15323l.yandex;
            if (c16830l2.f32859l != c16830l.f32859l || !TextUtils.equals(c16830l2.f32850l, c16830l.f32850l)) {
                c14723lMetrica = AbstractC18585l.metrica(c16830l, this.yandex);
                c8961l.crashlytics(10, new C17617l(2, c14723lMetrica));
                if (c14723lMetrica != null) {
                    c8961l.crashlytics(10, new C17617l(3, c14723lMetrica));
                }
            }
        } else if (z3 != z4) {
            c14723lMetrica = AbstractC18585l.metrica(c16830l, this.yandex);
            c8961l.crashlytics(10, new C17617l(2, c14723lMetrica));
            if (c14723lMetrica != null) {
                c8961l.crashlytics(10, new C17617l(3, c14723lMetrica));
            }
        }
        if (((C8937l) c5908l2.f12457l) != ((C8937l) c5908l.f12457l)) {
            c8961l.crashlytics(14, new C1149l(this));
        }
        if (c1908l.signatures != c1908l2.signatures) {
            final int i9 = 6;
            c8961l.crashlytics(4, new InterfaceC16975l() { // from class: lؒ۟ۤ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i10 = i9;
                    C1424l c1424l3 = c1424l;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i10) {
                        case 0:
                            interfaceC13521l.tapsense(((C1908l) c1424l3.f3603l).startapp);
                            break;
                        case 1:
                            interfaceC13521l.mo2731case(((C1908l) c1424l3.f3603l).subscription);
                            break;
                        case 2:
                            C1908l c1908l3 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 3:
                            interfaceC13521l.mo2734else((C16616l) c1424l3.f3601l);
                            break;
                        case 4:
                            C1908l c1908l4 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.mo2745volatile(c1908l4.isPro, c1908l4.firebase);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(((C1908l) c1424l3.f3603l).remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.Signature(((C1908l) c1424l3.f3603l).signatures);
                            break;
                        case 7:
                            interfaceC13521l.startapp(4, ((C1908l) c1424l3.f3603l).license);
                            break;
                        case 8:
                            interfaceC13521l.mo2737interface(((C1908l) c1424l3.f3603l).ad);
                            break;
                        case 9:
                            interfaceC13521l.mo2732catch(((C1908l) c1424l3.f3603l).mopub);
                            break;
                        case 10:
                            interfaceC13521l.subs(((C1908l) c1424l3.f3603l).admob);
                            break;
                        case 11:
                            interfaceC13521l.pro(((C1908l) c1424l3.f3603l).subs);
                            break;
                        default:
                            interfaceC13521l.smaato(((C1908l) c1424l3.f3603l).adcel);
                            break;
                    }
                }
            });
        }
        if (c1908l.license != c1908l2.license) {
            i = 7;
            c8961l.crashlytics(5, new InterfaceC16975l() { // from class: lؒ۟ۤ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i10 = i;
                    C1424l c1424l3 = c1424l;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i10) {
                        case 0:
                            interfaceC13521l.tapsense(((C1908l) c1424l3.f3603l).startapp);
                            break;
                        case 1:
                            interfaceC13521l.mo2731case(((C1908l) c1424l3.f3603l).subscription);
                            break;
                        case 2:
                            C1908l c1908l3 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 3:
                            interfaceC13521l.mo2734else((C16616l) c1424l3.f3601l);
                            break;
                        case 4:
                            C1908l c1908l4 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.mo2745volatile(c1908l4.isPro, c1908l4.firebase);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(((C1908l) c1424l3.f3603l).remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.Signature(((C1908l) c1424l3.f3603l).signatures);
                            break;
                        case 7:
                            interfaceC13521l.startapp(4, ((C1908l) c1424l3.f3603l).license);
                            break;
                        case 8:
                            interfaceC13521l.mo2737interface(((C1908l) c1424l3.f3603l).ad);
                            break;
                        case 9:
                            interfaceC13521l.mo2732catch(((C1908l) c1424l3.f3603l).mopub);
                            break;
                        case 10:
                            interfaceC13521l.subs(((C1908l) c1424l3.f3603l).admob);
                            break;
                        case 11:
                            interfaceC13521l.pro(((C1908l) c1424l3.f3603l).subs);
                            break;
                        default:
                            interfaceC13521l.smaato(((C1908l) c1424l3.f3603l).adcel);
                            break;
                    }
                }
            });
        } else {
            i = 7;
        }
        if (c1908l.ad != c1908l2.ad) {
            final int i10 = 8;
            c8961l.crashlytics(i, new InterfaceC16975l() { // from class: lؒ۟ۤ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i11 = i10;
                    C1424l c1424l3 = c1424l;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i11) {
                        case 0:
                            interfaceC13521l.tapsense(((C1908l) c1424l3.f3603l).startapp);
                            break;
                        case 1:
                            interfaceC13521l.mo2731case(((C1908l) c1424l3.f3603l).subscription);
                            break;
                        case 2:
                            C1908l c1908l3 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 3:
                            interfaceC13521l.mo2734else((C16616l) c1424l3.f3601l);
                            break;
                        case 4:
                            C1908l c1908l4 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.mo2745volatile(c1908l4.isPro, c1908l4.firebase);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(((C1908l) c1424l3.f3603l).remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.Signature(((C1908l) c1424l3.f3603l).signatures);
                            break;
                        case 7:
                            interfaceC13521l.startapp(4, ((C1908l) c1424l3.f3603l).license);
                            break;
                        case 8:
                            interfaceC13521l.mo2737interface(((C1908l) c1424l3.f3603l).ad);
                            break;
                        case 9:
                            interfaceC13521l.mo2732catch(((C1908l) c1424l3.f3603l).mopub);
                            break;
                        case 10:
                            interfaceC13521l.subs(((C1908l) c1424l3.f3603l).admob);
                            break;
                        case 11:
                            interfaceC13521l.pro(((C1908l) c1424l3.f3603l).subs);
                            break;
                        default:
                            interfaceC13521l.smaato(((C1908l) c1424l3.f3603l).adcel);
                            break;
                    }
                }
            });
        }
        final int i11 = 9;
        final int i12 = 12;
        if (!c1908l.mopub.equals(c1908l2.mopub)) {
            c8961l.crashlytics(12, new InterfaceC16975l() { // from class: lؒ۟ۤ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i13 = i11;
                    C1424l c1424l3 = c1424l;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i13) {
                        case 0:
                            interfaceC13521l.tapsense(((C1908l) c1424l3.f3603l).startapp);
                            break;
                        case 1:
                            interfaceC13521l.mo2731case(((C1908l) c1424l3.f3603l).subscription);
                            break;
                        case 2:
                            C1908l c1908l3 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 3:
                            interfaceC13521l.mo2734else((C16616l) c1424l3.f3601l);
                            break;
                        case 4:
                            C1908l c1908l4 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.mo2745volatile(c1908l4.isPro, c1908l4.firebase);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(((C1908l) c1424l3.f3603l).remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.Signature(((C1908l) c1424l3.f3603l).signatures);
                            break;
                        case 7:
                            interfaceC13521l.startapp(4, ((C1908l) c1424l3.f3603l).license);
                            break;
                        case 8:
                            interfaceC13521l.mo2737interface(((C1908l) c1424l3.f3603l).ad);
                            break;
                        case 9:
                            interfaceC13521l.mo2732catch(((C1908l) c1424l3.f3603l).mopub);
                            break;
                        case 10:
                            interfaceC13521l.subs(((C1908l) c1424l3.f3603l).admob);
                            break;
                        case 11:
                            interfaceC13521l.pro(((C1908l) c1424l3.f3603l).subs);
                            break;
                        default:
                            interfaceC13521l.smaato(((C1908l) c1424l3.f3603l).adcel);
                            break;
                    }
                }
            });
        }
        if (c1908l.admob != c1908l2.admob) {
            c8961l.crashlytics(8, new InterfaceC16975l() { // from class: lؒ۟ۤ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i13 = i8;
                    C1424l c1424l3 = c1424l;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i13) {
                        case 0:
                            interfaceC13521l.tapsense(((C1908l) c1424l3.f3603l).startapp);
                            break;
                        case 1:
                            interfaceC13521l.mo2731case(((C1908l) c1424l3.f3603l).subscription);
                            break;
                        case 2:
                            C1908l c1908l3 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 3:
                            interfaceC13521l.mo2734else((C16616l) c1424l3.f3601l);
                            break;
                        case 4:
                            C1908l c1908l4 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.mo2745volatile(c1908l4.isPro, c1908l4.firebase);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(((C1908l) c1424l3.f3603l).remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.Signature(((C1908l) c1424l3.f3603l).signatures);
                            break;
                        case 7:
                            interfaceC13521l.startapp(4, ((C1908l) c1424l3.f3603l).license);
                            break;
                        case 8:
                            interfaceC13521l.mo2737interface(((C1908l) c1424l3.f3603l).ad);
                            break;
                        case 9:
                            interfaceC13521l.mo2732catch(((C1908l) c1424l3.f3603l).mopub);
                            break;
                        case 10:
                            interfaceC13521l.subs(((C1908l) c1424l3.f3603l).admob);
                            break;
                        case 11:
                            interfaceC13521l.pro(((C1908l) c1424l3.f3603l).subs);
                            break;
                        default:
                            interfaceC13521l.smaato(((C1908l) c1424l3.f3603l).adcel);
                            break;
                    }
                }
            });
        }
        if (c1908l.subs != c1908l2.subs) {
            final int i13 = 11;
            c8961l.crashlytics(9, new InterfaceC16975l() { // from class: lؒ۟ۤ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i14 = i13;
                    C1424l c1424l3 = c1424l;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i14) {
                        case 0:
                            interfaceC13521l.tapsense(((C1908l) c1424l3.f3603l).startapp);
                            break;
                        case 1:
                            interfaceC13521l.mo2731case(((C1908l) c1424l3.f3603l).subscription);
                            break;
                        case 2:
                            C1908l c1908l3 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 3:
                            interfaceC13521l.mo2734else((C16616l) c1424l3.f3601l);
                            break;
                        case 4:
                            C1908l c1908l4 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.mo2745volatile(c1908l4.isPro, c1908l4.firebase);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(((C1908l) c1424l3.f3603l).remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.Signature(((C1908l) c1424l3.f3603l).signatures);
                            break;
                        case 7:
                            interfaceC13521l.startapp(4, ((C1908l) c1424l3.f3603l).license);
                            break;
                        case 8:
                            interfaceC13521l.mo2737interface(((C1908l) c1424l3.f3603l).ad);
                            break;
                        case 9:
                            interfaceC13521l.mo2732catch(((C1908l) c1424l3.f3603l).mopub);
                            break;
                        case 10:
                            interfaceC13521l.subs(((C1908l) c1424l3.f3603l).admob);
                            break;
                        case 11:
                            interfaceC13521l.pro(((C1908l) c1424l3.f3603l).subs);
                            break;
                        default:
                            interfaceC13521l.smaato(((C1908l) c1424l3.f3603l).adcel);
                            break;
                    }
                }
            });
        }
        if (!c1908l.adcel.equals(c1908l2.adcel)) {
            c8961l.crashlytics(20, new InterfaceC16975l() { // from class: lؒ۟ۤ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i14 = i12;
                    C1424l c1424l3 = c1424l;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i14) {
                        case 0:
                            interfaceC13521l.tapsense(((C1908l) c1424l3.f3603l).startapp);
                            break;
                        case 1:
                            interfaceC13521l.mo2731case(((C1908l) c1424l3.f3603l).subscription);
                            break;
                        case 2:
                            C1908l c1908l3 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 3:
                            interfaceC13521l.mo2734else((C16616l) c1424l3.f3601l);
                            break;
                        case 4:
                            C1908l c1908l4 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.mo2745volatile(c1908l4.isPro, c1908l4.firebase);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(((C1908l) c1424l3.f3603l).remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.Signature(((C1908l) c1424l3.f3603l).signatures);
                            break;
                        case 7:
                            interfaceC13521l.startapp(4, ((C1908l) c1424l3.f3603l).license);
                            break;
                        case 8:
                            interfaceC13521l.mo2737interface(((C1908l) c1424l3.f3603l).ad);
                            break;
                        case 9:
                            interfaceC13521l.mo2732catch(((C1908l) c1424l3.f3603l).mopub);
                            break;
                        case 10:
                            interfaceC13521l.subs(((C1908l) c1424l3.f3603l).admob);
                            break;
                        case 11:
                            interfaceC13521l.pro(((C1908l) c1424l3.f3603l).subs);
                            break;
                        default:
                            interfaceC13521l.smaato(((C1908l) c1424l3.f3603l).adcel);
                            break;
                    }
                }
            });
        }
        if (c1908l.startapp != c1908l2.startapp) {
            i2 = 0;
            c8961l.crashlytics(21, new InterfaceC16975l() { // from class: lؒ۟ۤ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i14 = i2;
                    C1424l c1424l3 = c1424l;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i14) {
                        case 0:
                            interfaceC13521l.tapsense(((C1908l) c1424l3.f3603l).startapp);
                            break;
                        case 1:
                            interfaceC13521l.mo2731case(((C1908l) c1424l3.f3603l).subscription);
                            break;
                        case 2:
                            C1908l c1908l3 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 3:
                            interfaceC13521l.mo2734else((C16616l) c1424l3.f3601l);
                            break;
                        case 4:
                            C1908l c1908l4 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.mo2745volatile(c1908l4.isPro, c1908l4.firebase);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(((C1908l) c1424l3.f3603l).remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.Signature(((C1908l) c1424l3.f3603l).signatures);
                            break;
                        case 7:
                            interfaceC13521l.startapp(4, ((C1908l) c1424l3.f3603l).license);
                            break;
                        case 8:
                            interfaceC13521l.mo2737interface(((C1908l) c1424l3.f3603l).ad);
                            break;
                        case 9:
                            interfaceC13521l.mo2732catch(((C1908l) c1424l3.f3603l).mopub);
                            break;
                        case 10:
                            interfaceC13521l.subs(((C1908l) c1424l3.f3603l).admob);
                            break;
                        case 11:
                            interfaceC13521l.pro(((C1908l) c1424l3.f3603l).subs);
                            break;
                        default:
                            interfaceC13521l.smaato(((C1908l) c1424l3.f3603l).adcel);
                            break;
                    }
                }
            });
        } else {
            i2 = 0;
        }
        if (c1908l.subscription.equals(c1908l2.subscription)) {
            i3 = 1;
        } else {
            i3 = 1;
            c8961l.crashlytics(29, new InterfaceC16975l() { // from class: lؒ۟ۤ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i14 = i3;
                    C1424l c1424l3 = c1424l;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i14) {
                        case 0:
                            interfaceC13521l.tapsense(((C1908l) c1424l3.f3603l).startapp);
                            break;
                        case 1:
                            interfaceC13521l.mo2731case(((C1908l) c1424l3.f3603l).subscription);
                            break;
                        case 2:
                            C1908l c1908l3 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 3:
                            interfaceC13521l.mo2734else((C16616l) c1424l3.f3601l);
                            break;
                        case 4:
                            C1908l c1908l4 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.mo2745volatile(c1908l4.isPro, c1908l4.firebase);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(((C1908l) c1424l3.f3603l).remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.Signature(((C1908l) c1424l3.f3603l).signatures);
                            break;
                        case 7:
                            interfaceC13521l.startapp(4, ((C1908l) c1424l3.f3603l).license);
                            break;
                        case 8:
                            interfaceC13521l.mo2737interface(((C1908l) c1424l3.f3603l).ad);
                            break;
                        case 9:
                            interfaceC13521l.mo2732catch(((C1908l) c1424l3.f3603l).mopub);
                            break;
                        case 10:
                            interfaceC13521l.subs(((C1908l) c1424l3.f3603l).admob);
                            break;
                        case 11:
                            interfaceC13521l.pro(((C1908l) c1424l3.f3603l).subs);
                            break;
                        default:
                            interfaceC13521l.smaato(((C1908l) c1424l3.f3603l).adcel);
                            break;
                    }
                }
            });
        }
        if (c1908l.tapsense != c1908l2.tapsense || c1908l.Signature != c1908l2.Signature) {
            c8961l.crashlytics(30, new InterfaceC16975l() { // from class: lؒ۟ۤ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i14 = i7;
                    C1424l c1424l3 = c1424l;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i14) {
                        case 0:
                            interfaceC13521l.tapsense(((C1908l) c1424l3.f3603l).startapp);
                            break;
                        case 1:
                            interfaceC13521l.mo2731case(((C1908l) c1424l3.f3603l).subscription);
                            break;
                        case 2:
                            C1908l c1908l3 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 3:
                            interfaceC13521l.mo2734else((C16616l) c1424l3.f3601l);
                            break;
                        case 4:
                            C1908l c1908l4 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.mo2745volatile(c1908l4.isPro, c1908l4.firebase);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(((C1908l) c1424l3.f3603l).remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.Signature(((C1908l) c1424l3.f3603l).signatures);
                            break;
                        case 7:
                            interfaceC13521l.startapp(4, ((C1908l) c1424l3.f3603l).license);
                            break;
                        case 8:
                            interfaceC13521l.mo2737interface(((C1908l) c1424l3.f3603l).ad);
                            break;
                        case 9:
                            interfaceC13521l.mo2732catch(((C1908l) c1424l3.f3603l).mopub);
                            break;
                        case 10:
                            interfaceC13521l.subs(((C1908l) c1424l3.f3603l).admob);
                            break;
                        case 11:
                            interfaceC13521l.pro(((C1908l) c1424l3.f3603l).subs);
                            break;
                        default:
                            interfaceC13521l.smaato(((C1908l) c1424l3.f3603l).adcel);
                            break;
                    }
                }
            });
        }
        if (!((C16616l) c1424l2.f3601l).equals((C16616l) c1424l.f3601l)) {
            final int i14 = 3;
            c8961l.crashlytics(13, new InterfaceC16975l() { // from class: lؒ۟ۤ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i15 = i14;
                    C1424l c1424l3 = c1424l;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i15) {
                        case 0:
                            interfaceC13521l.tapsense(((C1908l) c1424l3.f3603l).startapp);
                            break;
                        case 1:
                            interfaceC13521l.mo2731case(((C1908l) c1424l3.f3603l).subscription);
                            break;
                        case 2:
                            C1908l c1908l3 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 3:
                            interfaceC13521l.mo2734else((C16616l) c1424l3.f3601l);
                            break;
                        case 4:
                            C1908l c1908l4 = (C1908l) c1424l3.f3603l;
                            interfaceC13521l.mo2745volatile(c1908l4.isPro, c1908l4.firebase);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(((C1908l) c1424l3.f3603l).remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.Signature(((C1908l) c1424l3.f3603l).signatures);
                            break;
                        case 7:
                            interfaceC13521l.startapp(4, ((C1908l) c1424l3.f3603l).license);
                            break;
                        case 8:
                            interfaceC13521l.mo2737interface(((C1908l) c1424l3.f3603l).ad);
                            break;
                        case 9:
                            interfaceC13521l.mo2732catch(((C1908l) c1424l3.f3603l).mopub);
                            break;
                        case 10:
                            interfaceC13521l.subs(((C1908l) c1424l3.f3603l).admob);
                            break;
                        case 11:
                            interfaceC13521l.pro(((C1908l) c1424l3.f3603l).subs);
                            break;
                        default:
                            interfaceC13521l.smaato(((C1908l) c1424l3.f3603l).adcel);
                            break;
                    }
                }
            });
        }
        if (!((C14023l) c1424l2.f3602l).equals(c14023l)) {
            c16811l.getClass();
            AbstractC12442l.subscription(Looper.myLooper() == c16811l.f32839l.getLooper() ? i3 : i2);
            c16811l.f32840l.amazon();
        }
        if (!((AbstractC1186l) c1424l2.f3605l).equals(abstractC1186l)) {
            c16811l.getClass();
            AbstractC12442l.subscription(Looper.myLooper() == c16811l.f32839l.getLooper() ? i3 : i2);
            InterfaceC14026l interfaceC14026l = c16811l.f32840l;
            interfaceC14026l.ad(c16811l, abstractC1186l);
            interfaceC14026l.isVip();
        }
        if (c18503l != null) {
            c16811l.getClass();
            AbstractC12442l.subscription(Looper.myLooper() == c16811l.f32839l.getLooper() ? i3 : i2);
            c16811l.f32840l.getClass();
        }
        c8961l.loadAd();
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lٖۥۡ, reason: contains not printable characters */
    public final ListenableFuture mo340l(C12417l c12417l, Bundle bundle) {
        Bundle bundle2 = c12417l.crashlytics;
        if (this.subs == null) {
            return AbstractC7151l.purchase(new C5159l(-100));
        }
        if (bundle.isEmpty()) {
            bundle = bundle2;
        } else if (!bundle2.isEmpty()) {
            Bundle bundle3 = new Bundle(bundle2);
            bundle3.putAll(bundle);
            bundle = bundle3;
        }
        this.subs.appmetrica().m3588volatile(c12417l.loadAd, bundle);
        return AbstractC7151l.purchase(new C5159l(0));
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lْٗٔ, reason: contains not printable characters */
    public final Bundle mo341l() {
        return this.mopub;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public final void mo342l(int i, int i2) {
        mo336l(i, i + 1, i2);
    }

    /* JADX INFO: renamed from: l٘ٗ۟, reason: contains not printable characters */
    public final void m343l() {
        C8937l c8937lCreateFromParcel;
        int iMo1138l;
        if (this.firebase || this.smaato) {
            return;
        }
        this.smaato = true;
        C13052l c13052lYandex = ((C10730l) this.subs.f35934l).yandex();
        C16830l c16830lM290l = m290l(this.subs.signatures());
        MediaMetadata metadata = ((C10730l) this.subs.f35934l).yandex.getMetadata();
        if (metadata != null) {
            C11154l c11154l = C8937l.f18407l;
            Parcel parcelObtain = Parcel.obtain();
            metadata.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            c8937lCreateFromParcel = C8937l.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            c8937lCreateFromParcel.f18409l = metadata;
        } else {
            c8937lCreateFromParcel = null;
        }
        List<MediaSession.QueueItem> queue = ((C10730l) this.subs.f35934l).yandex.getQueue();
        List listM288l = m288l(queue != null ? C10517l.yandex(queue) : null);
        CharSequence queueTitle = ((C10730l) this.subs.f35934l).yandex.getQueueTitle();
        InterfaceC10867l interfaceC10867lYandex = ((C10730l) this.subs.f35934l).purchase.yandex();
        int iMopub = -1;
        if (interfaceC10867lYandex != null) {
            try {
                iMopub = interfaceC10867lYandex.mopub();
            } catch (RemoteException | SecurityException e) {
                AbstractC6427l.subs("MediaControllerCompat", "Dead object in getRepeatMode.", e);
            }
        }
        InterfaceC10867l interfaceC10867lYandex2 = ((C10730l) this.subs.f35934l).purchase.yandex();
        if (interfaceC10867lYandex2 != null) {
            try {
                iMo1138l = interfaceC10867lYandex2.mo1138l();
            } catch (RemoteException | SecurityException e2) {
                AbstractC6427l.subs("MediaControllerCompat", "Dead object in getShuffleMode.", e2);
                iMo1138l = -1;
            }
        } else {
            iMo1138l = -1;
        }
        m345l(true, new C5908l(c13052lYandex, c16830lM290l, c8937lCreateFromParcel, listM288l, queueTitle, iMopub, iMo1138l, AbstractC15323l.startapp(((C10730l) this.subs.f35934l).yandex.getExtras())));
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public final void mo344l(InterfaceC13521l interfaceC13521l) {
        this.amazon.purchase(interfaceC13521l);
    }

    /* JADX WARN: Code duplicated, block: B:132:0x026e A[PHI: r4 r9 r29
  0x026e: PHI (r4v23 lَٝۜ) = (r4v17 lَٝۜ), (r4v20 lَٝۜ), (r4v29 lَٝۜ) binds: [B:138:0x0288, B:153:0x02c1, B:131:0x0254] A[DONT_GENERATE, DONT_INLINE]
  0x026e: PHI (r9v11 int) = (r9v8 int), (r9v8 int), (r9v16 int) binds: [B:138:0x0288, B:153:0x02c1, B:131:0x0254] A[DONT_GENERATE, DONT_INLINE]
  0x026e: PHI (r29v7 lْؖؒ) = (r29v4 lْؖؒ), (r29v4 lْؖؒ), (r29v9 lْؖؒ) binds: [B:138:0x0288, B:153:0x02c1, B:131:0x0254] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:137:0x0280  */
    /* JADX WARN: Code duplicated, block: B:139:0x028a  */
    /* JADX WARN: Code duplicated, block: B:141:0x0290  */
    /* JADX WARN: Code duplicated, block: B:142:0x0292  */
    /* JADX WARN: Code duplicated, block: B:150:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:153:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:154:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:155:0x030b  */
    /* JADX WARN: Code duplicated, block: B:174:0x0350  */
    /* JADX WARN: Code duplicated, block: B:179:0x0360 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x0362  */
    /* JADX WARN: Code duplicated, block: B:186:0x0376  */
    /* JADX WARN: Code duplicated, block: B:190:0x0386  */
    /* JADX WARN: Code duplicated, block: B:193:0x0393  */
    /* JADX WARN: Code duplicated, block: B:195:0x039d  */
    /* JADX WARN: Code duplicated, block: B:200:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:204:0x03be  */
    /* JADX WARN: Code duplicated, block: B:207:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:210:0x03da  */
    /* JADX WARN: Code duplicated, block: B:213:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:216:0x0400  */
    /* JADX WARN: Code duplicated, block: B:219:0x0410  */
    /* JADX WARN: Code duplicated, block: B:222:0x041e  */
    /* JADX WARN: Code duplicated, block: B:225:0x0428  */
    /* JADX WARN: Code duplicated, block: B:227:0x0431  */
    /* JADX WARN: Code duplicated, block: B:229:0x0434  */
    /* JADX WARN: Code duplicated, block: B:232:0x044e  */
    /* JADX WARN: Code duplicated, block: B:235:0x045b  */
    /* JADX WARN: Code duplicated, block: B:237:0x0462  */
    /* JADX WARN: Code duplicated, block: B:239:0x046b  */
    /* JADX WARN: Code duplicated, block: B:242:0x0479  */
    /* JADX WARN: Code duplicated, block: B:245:0x0491  */
    /* JADX WARN: Code duplicated, block: B:247:0x049a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:248:0x049c  */
    /* JADX WARN: Code duplicated, block: B:249:0x049f  */
    /* JADX WARN: Code duplicated, block: B:252:0x04bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:255:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:258:0x04d8 A[LOOP:4: B:256:0x04d4->B:258:0x04d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:260:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:263:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:267:0x050b  */
    /* JADX WARN: Code duplicated, block: B:270:0x0517  */
    /* JADX WARN: Code duplicated, block: B:272:0x0525  */
    /* JADX WARN: Code duplicated, block: B:276:0x0535  */
    /* JADX WARN: Code duplicated, block: B:277:0x0542  */
    /* JADX WARN: Code duplicated, block: B:280:0x0557  */
    /* JADX WARN: Code duplicated, block: B:282:0x0565  */
    /* JADX WARN: Code duplicated, block: B:283:0x0571  */
    /* JADX WARN: Code duplicated, block: B:286:0x0583  */
    /* JADX WARN: Code duplicated, block: B:287:0x0586  */
    /* JADX WARN: Code duplicated, block: B:290:0x0596  */
    /* JADX WARN: Code duplicated, block: B:292:0x059f  */
    /* JADX WARN: Code duplicated, block: B:293:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:295:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:297:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:299:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:303:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:309:0x0600  */
    /* JADX WARN: Code duplicated, block: B:311:0x060a  */
    /* JADX WARN: Code duplicated, block: B:313:0x0617 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:325:0x065d  */
    /* JADX WARN: Code duplicated, block: B:326:0x065f  */
    /* JADX WARN: Code duplicated, block: B:330:0x066c  */
    /* JADX WARN: Code duplicated, block: B:331:0x066f  */
    /* JADX WARN: Code duplicated, block: B:333:0x0678  */
    /* JADX WARN: Code duplicated, block: B:335:0x067d  */
    /* JADX WARN: Code duplicated, block: B:337:0x0684  */
    /* JADX WARN: Code duplicated, block: B:338:0x0687  */
    /* JADX WARN: Code duplicated, block: B:341:0x068d  */
    /* JADX WARN: Code duplicated, block: B:343:0x0691 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:346:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:347:0x06a4 A[Catch: lًٓۡ -> 0x06d2, TryCatch #0 {lًٓۡ -> 0x06d2, blocks: (B:344:0x0693, B:350:0x06ad, B:351:0x06b0, B:352:0x06c3, B:347:0x06a4), top: B:438:0x0693 }] */
    /* JADX WARN: Code duplicated, block: B:351:0x06b0 A[Catch: lًٓۡ -> 0x06d2, TryCatch #0 {lًٓۡ -> 0x06d2, blocks: (B:344:0x0693, B:350:0x06ad, B:351:0x06b0, B:352:0x06c3, B:347:0x06a4), top: B:438:0x0693 }] */
    /* JADX WARN: Code duplicated, block: B:353:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:354:0x06c6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:355:0x06c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:356:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:357:0x06cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:362:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:363:0x0702  */
    /* JADX WARN: Code duplicated, block: B:367:0x070b  */
    /* JADX WARN: Code duplicated, block: B:369:0x0710  */
    /* JADX WARN: Code duplicated, block: B:371:0x0717  */
    /* JADX WARN: Code duplicated, block: B:372:0x0719  */
    /* JADX WARN: Code duplicated, block: B:375:0x0727 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:378:0x072c  */
    /* JADX WARN: Code duplicated, block: B:381:0x0739  */
    /* JADX WARN: Code duplicated, block: B:382:0x073c  */
    /* JADX WARN: Code duplicated, block: B:384:0x0742  */
    /* JADX WARN: Code duplicated, block: B:385:0x0745  */
    /* JADX WARN: Code duplicated, block: B:390:0x0763  */
    /* JADX WARN: Code duplicated, block: B:392:0x076b  */
    /* JADX WARN: Code duplicated, block: B:395:0x07fa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:398:0x0802 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:399:0x0804 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:401:0x0809  */
    /* JADX WARN: Code duplicated, block: B:403:0x0818  */
    /* JADX WARN: Code duplicated, block: B:406:0x0821  */
    /* JADX WARN: Code duplicated, block: B:409:0x082a  */
    /* JADX WARN: Code duplicated, block: B:412:0x083a A[LOOP:3: B:407:0x0822->B:412:0x083a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:415:0x0840  */
    /* JADX WARN: Code duplicated, block: B:416:0x084c  */
    /* JADX WARN: Code duplicated, block: B:418:0x0856  */
    /* JADX WARN: Code duplicated, block: B:420:0x086a  */
    /* JADX WARN: Code duplicated, block: B:423:0x0871  */
    /* JADX WARN: Code duplicated, block: B:425:0x087c  */
    /* JADX WARN: Code duplicated, block: B:427:0x0886  */
    /* JADX WARN: Code duplicated, block: B:429:0x088c  */
    /* JADX WARN: Code duplicated, block: B:432:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:435:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:438:0x0693 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:451:0x083d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x0838 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x0506 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:? A[LOOP:5: B:261:0x04f3->B:456:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x0527 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x05d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0112  */
    /* JADX WARN: Instruction removed from duplicated block: B:351:0x06b0, please report this as an issue */
    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public final void m345l(boolean z, C5908l c5908l) {
        boolean z2;
        C13052l c13052l;
        boolean z3;
        int i;
        C10444l c10444l;
        long j;
        long j2;
        int iMetrica;
        int i2;
        C3852l c3852lSmaato;
        C2427l c2427l;
        C2427l c2427lFirebase;
        AbstractC1186l abstractC1186l;
        int size;
        C10475l c10475l;
        boolean z4;
        C3852l c3852l;
        C13052l c13052l2;
        int i3;
        Bundle bundle;
        boolean z5;
        long j3;
        C8937l c8937l;
        C8937l c8937l2;
        C16616l c16616l;
        CharSequence charSequence;
        CharSequence charSequence2;
        C3852l c3852l2;
        int iSubscription;
        boolean zSignature;
        HashSet<C12417l> hashSet;
        C13708l c13708l;
        int i4;
        C14023l c14023l;
        Object[] objArrCopyOf;
        Iterator it;
        int i5;
        int i6;
        boolean z6;
        C14023l c14023l2;
        AbstractC1186l abstractC1186lFirebase;
        Bundle bundle2;
        int i7;
        C3915l c3915l;
        Bundle bundle3;
        String string;
        int iLoadAd;
        Uri uri;
        String scheme;
        C14023l c14023l3;
        Bundle bundle4;
        int i8;
        C16616l c16616l2;
        C18503l c18503l;
        boolean z7;
        C1372l c1372l;
        C13736l c13736l;
        boolean z8;
        int i9;
        int i10;
        long jAmazon;
        boolean z9;
        boolean z10;
        int i11;
        boolean z11;
        C2848l c2848lPurchase;
        int i12;
        boolean z12;
        C2427l c2427l2;
        C1908l c1908l;
        C5908l c5908l2;
        C1424l c1424l;
        long j4;
        boolean zStartapp;
        C2427l c2427lSubscription;
        C10475l c10475l2;
        int i13;
        AbstractC1186l abstractC1186l2;
        boolean z13;
        boolean z14;
        Integer num;
        Integer num2;
        long jCrashlytics;
        long jCrashlytics2;
        Integer num3;
        int i14;
        C10517l c10517l;
        Bitmap bitmap;
        C8937l c8937l3;
        Bitmap bitmapLoadAd;
        if (this.firebase || !this.smaato) {
            return;
        }
        C5908l c5908l3 = this.remoteconfig;
        C1424l c1424l2 = this.startapp;
        String packageName = ((C10730l) this.subs.f35934l).yandex.getPackageName();
        long flags = ((C10730l) this.subs.f35934l).yandex.getFlags();
        boolean z15 = ((C10730l) this.subs.f35934l).purchase.yandex() != null;
        int ratingType = ((C10730l) this.subs.f35934l).yandex.getRatingType();
        C16811l c16811l = this.loadAd;
        long j5 = c16811l.f32841l;
        boolean z16 = this.metrica;
        C8937l c8937l4 = (C8937l) c5908l3.f12457l;
        C16830l c16830l = (C16830l) c5908l3.f12458l;
        List list = (List) c5908l3.f12459l;
        if (c8937l4 == null || (c8937l3 = (C8937l) c5908l.f12457l) == null || c8937l4.f18408l == null || (bitmapLoadAd = c8937l3.loadAd()) == null) {
            z2 = z15;
        } else {
            z2 = z15;
            Bitmap bitmapLoadAd2 = c8937l4.loadAd();
            if (bitmapLoadAd2 != null && bitmapLoadAd.sameAs(bitmapLoadAd2)) {
                c8937l3.f18408l = c8937l4.f18408l;
            }
        }
        List list2 = (List) c5908l.f12459l;
        Bundle bundle5 = (Bundle) c5908l.f12454l;
        C16830l c16830l2 = (C16830l) c5908l.f12458l;
        C8937l c8937l5 = (C8937l) c5908l.f12457l;
        C13052l c13052l3 = (C13052l) c5908l.f12452l;
        if (list != list2) {
            HashMap map = new HashMap();
            int i15 = 0;
            while (i15 < list.size()) {
                C10517l c10517l2 = (C10517l) list.get(i15);
                C13052l c13052l4 = c13052l3;
                if (c10517l2.f21399l.f1994l != null) {
                    map.put(Long.valueOf(c10517l2.f21398l), c10517l2);
                }
                i15++;
                c13052l3 = c13052l4;
            }
            c13052l = c13052l3;
            int i16 = 0;
            while (i16 < list2.size()) {
                C10517l c10517l3 = (C10517l) list2.get(i16);
                if (c10517l3.f21399l.f1994l == null || (c10517l = (C10517l) map.get(Long.valueOf(c10517l3.f21398l))) == null) {
                    i14 = i16;
                } else {
                    C0579l c0579l = c10517l3.f21399l;
                    C0579l c0579l2 = c10517l.f21399l;
                    c0579l.getClass();
                    if (c0579l2.f1997l == null || (bitmap = c0579l.f1994l) == null) {
                        i14 = i16;
                    } else {
                        i14 = i16;
                        Bitmap bitmap2 = c0579l2.f1994l;
                        if (bitmap2 != null && bitmap.sameAs(bitmap2)) {
                            c0579l.f1997l = c0579l2.f1997l;
                        }
                    }
                }
                i16 = i14 + 1;
            }
        } else {
            c13052l = c13052l3;
        }
        boolean z17 = list != list2;
        if (z17) {
            C10444l c10444l2 = C10444l.mopub;
            AbstractC12832l.loadAd(4, "initialCapacity");
            Object[] objArrCopyOf2 = new Object[4];
            int i17 = 0;
            int i18 = 0;
            while (i18 < list2.size()) {
                C10517l c10517l4 = (C10517l) list2.get(i18);
                AbstractC8481l abstractC8481l = AbstractC18585l.yandex;
                boolean z18 = z17;
                int i19 = ratingType;
                C10475l c10475l3 = new C10475l(AbstractC18585l.isPro(c10517l4.f21399l), c10517l4.f21398l, -9223372036854775807L);
                int i20 = i17 + 1;
                int iLoadAd2 = AbstractC3594l.loadAd(objArrCopyOf2.length, i20);
                if (iLoadAd2 > objArrCopyOf2.length) {
                    objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, iLoadAd2);
                }
                objArrCopyOf2[i17] = c10475l3;
                i18++;
                i17 = i20;
                z17 = z18;
                ratingType = i19;
            }
            z3 = z17;
            i = ratingType;
            c10444l = new C10444l(AbstractC1186l.vip(i17, objArrCopyOf2), null);
        } else {
            z3 = z17;
            i = ratingType;
            C10444l c10444l3 = (C10444l) ((C1908l) c1424l2.f3603l).isPro;
            c10444l = new C10444l(c10444l3.purchase, c10444l3.billing);
        }
        boolean z19 = ((C8937l) c5908l3.f12457l) != c8937l5 || z;
        long j6 = c16830l == null ? -1L : c16830l.f32854l;
        if (c16830l2 == null) {
            j2 = -1;
            j = -1;
        } else {
            j = -1;
            j2 = c16830l2.f32854l;
        }
        boolean z20 = j6 != j2 || z;
        long jAmazon2 = AbstractC18585l.amazon(c8937l5);
        if (z19 || z20 || z3) {
            boolean z21 = z19;
            if (list2 == null || j2 == j) {
                iMetrica = -1;
                break;
            }
            long j7 = j2;
            iMetrica = 0;
            while (true) {
                if (iMetrica >= list2.size()) {
                    iMetrica = -1;
                    break;
                } else if (((C10517l) list2.get(iMetrica)).f21398l == j7) {
                    break;
                } else {
                    iMetrica++;
                }
            }
            boolean z22 = c8937l5 != null;
            if (z22 && z21) {
                i2 = i;
                c3852lSmaato = AbstractC18585l.remoteconfig(c8937l5, i2);
            } else {
                i2 = i;
                c3852lSmaato = (z22 || !z20) ? ((C1908l) c1424l2.f3603l).premium : iMetrica == -1 ? C3852l.f7980private : AbstractC18585l.smaato(((C10517l) list2.get(iMetrica)).f21399l, i2);
            }
            AbstractC1186l abstractC1186l3 = c10444l.purchase;
            C10444l c10444l4 = c10444l;
            int i21 = -1;
            if (iMetrica != -1) {
                if (iMetrica != i21) {
                    c3852lSmaato = c3852lSmaato;
                    c10444l = new C10444l(abstractC1186l3, null);
                    if (z22) {
                        if (iMetrica >= c10444l.metrica()) {
                            c2427l = null;
                        } else {
                            c2427l = c10444l.subscription(iMetrica).yandex;
                        }
                        c2427l.getClass();
                        c2427lFirebase = AbstractC18585l.firebase(c2427l.yandex, c8937l5, i2);
                        abstractC1186l = c10444l.purchase;
                        size = abstractC1186l.size();
                        c10475l = c10444l.billing;
                        if (iMetrica >= size || (iMetrica == abstractC1186l.size() && c10475l != null)) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        AbstractC12442l.admob(z4);
                        if (iMetrica == abstractC1186l.size()) {
                            c10444l = new C10444l(abstractC1186l, new C10475l(c2427lFirebase, -1L, jAmazon2));
                            bundle5 = bundle5;
                        } else {
                            bundle5 = bundle5;
                            long j8 = ((C10475l) abstractC1186l.get(iMetrica)).loadAd;
                            C16971l c16971l = new C16971l(4);
                            c16971l.amazon(abstractC1186l.subList(0, iMetrica));
                            c16971l.crashlytics(new C10475l(c2427lFirebase, j8, jAmazon2));
                            c16971l.amazon(abstractC1186l.subList(iMetrica + 1, abstractC1186l.size()));
                            c10444l = new C10444l(c16971l.mopub(), c10475l);
                        }
                    } else {
                        bundle5 = bundle5;
                    }
                } else {
                    c10444l = c10444l4;
                    iMetrica = 0;
                }
            } else if (!z21) {
                i21 = -1;
                if (iMetrica != i21) {
                    c3852lSmaato = c3852lSmaato;
                    c10444l = new C10444l(abstractC1186l3, null);
                    if (z22) {
                        bundle5 = bundle5;
                    } else {
                        if (iMetrica >= c10444l.metrica()) {
                            c2427l = null;
                        } else {
                            c2427l = c10444l.subscription(iMetrica).yandex;
                        }
                        c2427l.getClass();
                        c2427lFirebase = AbstractC18585l.firebase(c2427l.yandex, c8937l5, i2);
                        abstractC1186l = c10444l.purchase;
                        size = abstractC1186l.size();
                        c10475l = c10444l.billing;
                        if (iMetrica >= size) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        AbstractC12442l.admob(z4);
                        if (iMetrica == abstractC1186l.size()) {
                            c10444l = new C10444l(abstractC1186l, new C10475l(c2427lFirebase, -1L, jAmazon2));
                            bundle5 = bundle5;
                        } else {
                            bundle5 = bundle5;
                            long j9 = ((C10475l) abstractC1186l.get(iMetrica)).loadAd;
                            C16971l c16971l2 = new C16971l(4);
                            c16971l2.amazon(abstractC1186l.subList(0, iMetrica));
                            c16971l2.crashlytics(new C10475l(c2427lFirebase, j9, jAmazon2));
                            c16971l2.amazon(abstractC1186l.subList(iMetrica + 1, abstractC1186l.size()));
                            c10444l = new C10444l(c16971l2.mopub(), c10475l);
                        }
                    }
                } else {
                    c10444l = c10444l4;
                    iMetrica = 0;
                }
            } else if (z22) {
                AbstractC6427l.vip("MCImplLegacy", "Adding a fake MediaItem at the end of the list because there's no QueueItem with the active queue id and current Timeline should have currently playing MediaItem.");
                CharSequence charSequence3 = c8937l5.f18410l.getCharSequence("android.media.metadata.MEDIA_ID");
                c10444l = new C10444l(abstractC1186l3, new C10475l(AbstractC18585l.firebase(charSequence3 != null ? charSequence3.toString() : null, c8937l5, i2), -1L, jAmazon2));
                iMetrica = c10444l.metrica() - 1;
                c3852lSmaato = c3852lSmaato;
                bundle5 = bundle5;
            } else {
                c10444l = new C10444l(abstractC1186l3, null);
                iMetrica = 0;
            }
            c3852l = c3852lSmaato;
        } else {
            C1908l c1908l2 = (C1908l) c1424l2.f3603l;
            iMetrica = c1908l2.crashlytics.yandex.loadAd;
            c3852l = c1908l2.premium;
            bundle5 = bundle5;
        }
        if (c13052l != null) {
            c13052l2 = c13052l;
            i3 = c13052l2.loadAd;
        } else {
            c13052l2 = c13052l;
            i3 = 0;
        }
        C6921l c6921l = new C6921l(5);
        long j10 = c16830l2 == null ? 0L : c16830l2.f32855l;
        if (c16830l2 != null) {
            bundle = bundle5;
            switch (c16830l2.f32853l) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 9:
                case 10:
                case 11:
                    z5 = true;
                    break;
            }
            if (AbstractC18585l.advert(j10, 4L) || z5) {
                j3 = 4;
                if ((AbstractC18585l.advert(j10, 2L) && z5) || AbstractC18585l.advert(j10, 512L)) {
                }
                if (AbstractC18585l.advert(j10, 1024L) || AbstractC18585l.advert(j10, 2048L) || AbstractC18585l.advert(j10, 8192L)) {
                    c6921l.loadAd(31);
                }
                if (!AbstractC18585l.advert(j10, 16384L)) {
                    c8937l = c8937l5;
                    if (!AbstractC18585l.advert(j10, 32768L) || AbstractC18585l.advert(j10, 65536L) || AbstractC18585l.advert(j10, 131072L)) {
                    }
                    if (AbstractC18585l.advert(j10, 8L)) {
                        c6921l.loadAd(11);
                    }
                    if (AbstractC18585l.advert(j10, 64L)) {
                        c6921l.loadAd(12);
                    }
                    c8937l2 = c8937l;
                    if (AbstractC18585l.advert(j10, 256L)) {
                        c6921l.amazon(5, 4);
                    }
                    if (AbstractC18585l.advert(j10, 32L)) {
                        c6921l.amazon(9, 8);
                    }
                    if (AbstractC18585l.advert(j10, 16L)) {
                        c6921l.amazon(7, 6);
                    }
                    if (AbstractC18585l.advert(j10, 4194304L)) {
                        c6921l.loadAd(13);
                    }
                    if (AbstractC18585l.advert(j10, 1L)) {
                        c6921l.loadAd(3);
                    }
                    if (i3 == 1) {
                        c6921l.amazon(26, 34);
                    } else if (i3 == 2) {
                        c6921l.amazon(26, 34, 25, 33);
                    }
                    c6921l.amazon(23, 17, 18, 16, 21, 32);
                    if ((flags & j3) != 0) {
                        c6921l.loadAd(20);
                    }
                    if (AbstractC18585l.advert(j10, 4096L)) {
                        c6921l.loadAd(10);
                    }
                    if (z2) {
                        if (AbstractC18585l.advert(j10, 262144L)) {
                            c6921l.loadAd(15);
                        }
                        if (AbstractC18585l.advert(j10, 2097152L)) {
                            c6921l.loadAd(14);
                        }
                    }
                    c16616l = new C16616l(c6921l.purchase());
                    charSequence = (CharSequence) c5908l3.f12453l;
                    charSequence2 = (CharSequence) c5908l.f12453l;
                    if (charSequence == charSequence2) {
                        c3852l2 = ((C1908l) c1424l2.f3603l).remoteconfig;
                    } else if (charSequence2 == null) {
                        c3852l2 = C3852l.f7980private;
                    } else {
                        C3117l c3117l = new C3117l();
                        c3117l.yandex = charSequence2;
                        c3852l2 = new C3852l(c3117l);
                    }
                    C3852l c3852l3 = c3852l2;
                    iSubscription = AbstractC18585l.subscription(c5908l.f12456l);
                    zSignature = AbstractC18585l.Signature(c5908l.f12455l);
                    if (c16830l == c16830l2 || z16) {
                        hashSet = new HashSet();
                        c13708l = C12417l.amazon;
                        for (i4 = 0; i4 < c13708l.f26765l; i4++) {
                            hashSet.add(new C12417l(((Integer) c13708l.get(i4)).intValue()));
                        }
                        if (!z2) {
                            for (C12417l c12417l : hashSet) {
                                if (c12417l.yandex == 40010) {
                                    hashSet.remove(c12417l);
                                }
                            }
                        }
                        if (c16830l2 != null) {
                            for (C5388l c5388l : c16830l2.f32858l) {
                                String str = c5388l.f11535l;
                                bundle4 = c5388l.f11537l;
                                if (bundle4 == null) {
                                    bundle4 = Bundle.EMPTY;
                                }
                                hashSet.add(new C12417l(str, bundle4));
                            }
                        }
                        c14023l = new C14023l(hashSet);
                        if (c16830l2 == null) {
                            C9258l c9258l = AbstractC1186l.f3181l;
                            i6 = iSubscription;
                            z6 = zSignature;
                            c14023l2 = c14023l;
                            abstractC1186lFirebase = C13708l.f26763l;
                        } else {
                            List list3 = c16830l2.f32858l;
                            AbstractC12832l.loadAd(4, "initialCapacity");
                            objArrCopyOf = new Object[4];
                            it = list3.iterator();
                            i5 = 0;
                            while (it.hasNext()) {
                                C5388l c5388l2 = (C5388l) it.next();
                                String str2 = c5388l2.f11535l;
                                int i22 = iSubscription;
                                bundle2 = c5388l2.f11537l;
                                if (bundle2 != null) {
                                    i7 = bundle2.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                                } else {
                                    i7 = 0;
                                }
                                C14023l c14023l4 = c14023l;
                                c3915l = new C3915l(i7, c5388l2.f11533l);
                                if (bundle2 == null) {
                                    bundle3 = Bundle.EMPTY;
                                } else {
                                    bundle3 = bundle2;
                                }
                                c3915l.amazon(new C12417l(str2, bundle3));
                                c3915l.billing = c5388l2.f11534l;
                                c3915l.admob = true;
                                if (bundle2 != null) {
                                    c3915l.mopub = new Bundle(bundle2);
                                }
                                if (bundle2 != null) {
                                    string = bundle2.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
                                } else {
                                    string = null;
                                }
                                if (string != null) {
                                    uri = Uri.parse(string);
                                    scheme = uri.getScheme();
                                    if (Objects.equals(scheme, "content") || Objects.equals(scheme, "android.resource")) {
                                        c3915l.loadAd(uri);
                                    }
                                }
                                C14869l c14869lYandex = c3915l.yandex();
                                int i23 = i5 + 1;
                                iLoadAd = AbstractC3594l.loadAd(objArrCopyOf.length, i23);
                                if (iLoadAd > objArrCopyOf.length) {
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iLoadAd);
                                }
                                objArrCopyOf[i5] = c14869lYandex;
                                i5 = i23;
                                iSubscription = i22;
                                it = it;
                                zSignature = zSignature;
                                c14023l = c14023l4;
                            }
                            i6 = iSubscription;
                            z6 = zSignature;
                            c14023l2 = c14023l;
                            abstractC1186lFirebase = C14869l.firebase(AbstractC1186l.vip(i5, objArrCopyOf), c16616l, bundle);
                        }
                        c14023l3 = c14023l2;
                    } else {
                        c14023l3 = (C14023l) c1424l2.f3602l;
                        abstractC1186lFirebase = (AbstractC1186l) c1424l2.f3605l;
                        i6 = iSubscription;
                        z6 = zSignature;
                    }
                    Context context = this.yandex;
                    C14723l c14723lMetrica = AbstractC18585l.metrica(c16830l2, context);
                    if (c16830l2 == null) {
                        i8 = c16830l2.f32853l;
                        int i24 = c16830l2.f32859l;
                        CharSequence charSequence4 = c16830l2.f32850l;
                        Bundle bundle6 = c16830l2.f32860l;
                        c16616l2 = c16616l;
                        if (i8 == 7 && i24 != 0) {
                            int iTapsense = AbstractC18585l.tapsense(i24);
                            String string2 = charSequence4 != null ? charSequence4.toString() : AbstractC18585l.ad(context, iTapsense);
                            if (bundle6 == null) {
                                bundle6 = Bundle.EMPTY;
                            }
                            c18503l = new C18503l(string2, iTapsense, bundle6);
                        }
                        long jCrashlytics3 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j5);
                        long jLoadAd = AbstractC18585l.loadAd(c16830l2, c8937l2, j5);
                        AbstractC1186l abstractC1186l4 = abstractC1186lFirebase;
                        int iLoadAd3 = AbstractC8672l.loadAd(AbstractC18585l.loadAd(c16830l2, c8937l2, j5), AbstractC18585l.amazon(c8937l2));
                        long jLoadAd2 = AbstractC18585l.loadAd(c16830l2, c8937l2, j5) - AbstractC18585l.crashlytics(c16830l2, c8937l2, j5);
                        if (c8937l2 == 0 && c8937l2.yandex("android.media.metadata.ADVERTISEMENT") != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (c16830l2 == null) {
                            c1372l = C1372l.amazon;
                        } else {
                            c1372l = new C1372l(c16830l2.f32856l);
                        }
                        if (c13052l2 == null) {
                            c13736l = C13736l.subs;
                        } else {
                            c13736l = (C13736l) c13052l2.purchase;
                        }
                        C13736l c13736l2 = c13736l;
                        if (c16830l2 == null) {
                            switch (c16830l2.f32853l) {
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 9:
                                case 10:
                                case 11:
                                    z8 = true;
                                    break;
                                case 7:
                                case 8:
                                default:
                                    z8 = false;
                                    break;
                            }
                        } else {
                            z8 = false;
                        }
                        if (c16830l2 == null) {
                            i9 = 1;
                        } else {
                            try {
                                i10 = c16830l2.f32853l;
                                jAmazon = AbstractC18585l.amazon(c8937l2);
                                if (jAmazon == -9223372036854775807L && AbstractC18585l.crashlytics(c16830l2, c8937l2, j5) >= jAmazon) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                switch (i10) {
                                    case 1:
                                        if (z9) {
                                            i9 = 4;
                                            break;
                                        }
                                    case 0:
                                    case 7:
                                    case 8:
                                        i9 = 1;
                                        break;
                                    case 2:
                                        if (z9) {
                                            i9 = 4;
                                            break;
                                        }
                                    case 3:
                                        i9 = 3;
                                        break;
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 9:
                                    case 10:
                                    case 11:
                                        i9 = 2;
                                        break;
                                    default:
                                        throw new C14469l("Invalid state of PlaybackStateCompat: " + i10);
                                }
                            } catch (C14469l unused) {
                                AbstractC6427l.admob("MCImplLegacy", "Received invalid playback state " + c16830l2.f32853l + " from package " + packageName + ". Keeping the previous state.");
                                i9 = ((C1908l) c1424l2.f3603l).signatures;
                            }
                        }
                        int i25 = i9;
                        if (c16830l2 == null && c16830l2.f32853l == 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c13052l2 == null) {
                            c2848lPurchase = C2848l.purchase;
                        } else {
                            if (c13052l2.yandex == 2) {
                                i11 = 1;
                            } else {
                                i11 = 0;
                            }
                            C12676l c12676l = new C12676l(i11);
                            c12676l.amazon = c13052l2.crashlytics;
                            String str3 = (String) c13052l2.billing;
                            if (i11 == 0 || str3 == null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            AbstractC12442l.admob(z11);
                            c12676l.purchase = str3;
                            c2848lPurchase = c12676l.purchase();
                        }
                        C2848l c2848l = c2848lPurchase;
                        if (c13052l2 == null) {
                            i12 = 0;
                        } else {
                            i12 = c13052l2.amazon;
                        }
                        if (c13052l2 == null && c13052l2.amazon == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        C1908l c1908l3 = (C1908l) c1424l2.f3603l;
                        long j11 = c1908l3.applovin;
                        long j12 = c1908l3.appmetrica;
                        long j13 = c1908l3.inmobi;
                        Bundle bundle7 = (Bundle) c5908l.f12454l;
                        C1372l c1372l2 = c1372l;
                        if (iMetrica >= c10444l.metrica()) {
                            c2427l2 = null;
                        } else {
                            c2427l2 = c10444l.subscription(iMetrica).yandex;
                        }
                        C9009l c9009l = new C9009l(m289l(iMetrica, c2427l2, jCrashlytics3, z7), z7, SystemClock.elapsedRealtime(), jAmazon2, jLoadAd, iLoadAd3, jLoadAd2, -9223372036854775807L, jAmazon2, jLoadAd);
                        C4262l c4262l = C9009l.firebase;
                        int i26 = i6;
                        c1908l = new C1908l(c14723lMetrica, 0, c9009l, c4262l, c4262l, 0, c1372l2, i26, z6, C15074l.amazon, c10444l, 0, c3852l3, 1.0f, 1.0f, c13736l2, 0, C16684l.amazon, c2848l, i12, z12, z8, 1, 0, i25, z10, false, c3852l, j11, j12, j13, C1047l.loadAd, C4970l.f10152volatile);
                        C1424l c1424l3 = new C1424l(c1908l, c14023l3, c16616l2, abstractC1186l4, bundle7, c18503l);
                        c5908l2 = this.remoteconfig;
                        c1424l = this.startapp;
                        j4 = c16811l.f32841l;
                        zStartapp = ((C1908l) c1424l.f3603l).isPro.startapp();
                        boolean zStartapp2 = c10444l.startapp();
                        if (!zStartapp && zStartapp2) {
                            num = null;
                            num2 = null;
                        } else if (zStartapp || zStartapp2) {
                            c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                            c2427lSubscription.getClass();
                            c10475l2 = c10444l.billing;
                            if (c10475l2 == null && c2427lSubscription.equals(c10475l2.yandex)) {
                                z13 = true;
                            } else {
                                i13 = 0;
                                while (true) {
                                    abstractC1186l2 = c10444l.purchase;
                                    if (i13 >= abstractC1186l2.size()) {
                                        z13 = false;
                                    } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                        z13 = true;
                                    } else {
                                        i13++;
                                    }
                                }
                            }
                            if (z13) {
                                if (c2427lSubscription.equals(c1908l.subscription())) {
                                    jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                                    jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                                    if (jCrashlytics2 == 0 || i26 != 1) {
                                        if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                            num2 = 5;
                                        } else {
                                            num2 = null;
                                        }
                                        num3 = null;
                                    } else {
                                        num2 = 0;
                                        num3 = null;
                                    }
                                    num = num3;
                                } else {
                                    z14 = true;
                                    num = 1;
                                    num2 = 0;
                                }
                                Pair pairCreate = Pair.create(num2, num);
                                m339l(z, c5908l, true, c1424l3, (Integer) pairCreate.first, (Integer) pairCreate.second);
                                if (this.metrica) {
                                    this.metrica = false;
                                    if (Looper.myLooper() != c16811l.f32839l.getLooper()) {
                                        z14 = false;
                                    }
                                    AbstractC12442l.subscription(z14);
                                    c16811l.f32840l.getClass();
                                }
                            }
                            num2 = 4;
                            num = 3;
                        } else {
                            num = 3;
                            num2 = 0;
                        }
                        z14 = true;
                        Pair pairCreate2 = Pair.create(num2, num);
                        m339l(z, c5908l, true, c1424l3, (Integer) pairCreate2.first, (Integer) pairCreate2.second);
                        if (this.metrica) {
                            this.metrica = false;
                            if (Looper.myLooper() != c16811l.f32839l.getLooper()) {
                                z14 = false;
                            }
                            AbstractC12442l.subscription(z14);
                            c16811l.f32840l.getClass();
                        }
                    }
                    c16616l2 = c16616l;
                    c18503l = null;
                    long jCrashlytics4 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j5);
                    long jLoadAd3 = AbstractC18585l.loadAd(c16830l2, c8937l2, j5);
                    AbstractC1186l abstractC1186l5 = abstractC1186lFirebase;
                    int iLoadAd4 = AbstractC8672l.loadAd(AbstractC18585l.loadAd(c16830l2, c8937l2, j5), AbstractC18585l.amazon(c8937l2));
                    long jLoadAd4 = AbstractC18585l.loadAd(c16830l2, c8937l2, j5) - AbstractC18585l.crashlytics(c16830l2, c8937l2, j5);
                    if (c8937l2 == 0) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    if (c16830l2 == null) {
                        c1372l = C1372l.amazon;
                    } else {
                        c1372l = new C1372l(c16830l2.f32856l);
                    }
                    if (c13052l2 == null) {
                        c13736l = C13736l.subs;
                    } else {
                        c13736l = (C13736l) c13052l2.purchase;
                    }
                    C13736l c13736l3 = c13736l;
                    if (c16830l2 == null) {
                        switch (c16830l2.f32853l) {
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 9:
                            case 10:
                            case 11:
                                z8 = true;
                                break;
                            case 7:
                            case 8:
                            default:
                                z8 = false;
                                break;
                        }
                    } else {
                        z8 = false;
                    }
                    if (c16830l2 == null) {
                        i9 = 1;
                    } else {
                        i10 = c16830l2.f32853l;
                        jAmazon = AbstractC18585l.amazon(c8937l2);
                        if (jAmazon == -9223372036854775807L) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        switch (i10) {
                            case 1:
                                if (z9) {
                                    i9 = 4;
                                    break;
                                }
                            case 0:
                            case 7:
                            case 8:
                                i9 = 1;
                                break;
                            case 2:
                                if (z9) {
                                    i9 = 4;
                                    break;
                                }
                            case 3:
                                i9 = 3;
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 9:
                            case 10:
                            case 11:
                                i9 = 2;
                                break;
                            default:
                                throw new C14469l("Invalid state of PlaybackStateCompat: " + i10);
                        }
                    }
                    int i27 = i9;
                    if (c16830l2 == null) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (c13052l2 == null) {
                        c2848lPurchase = C2848l.purchase;
                    } else {
                        if (c13052l2.yandex == 2) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        C12676l c12676l2 = new C12676l(i11);
                        c12676l2.amazon = c13052l2.crashlytics;
                        String str4 = (String) c13052l2.billing;
                        if (i11 == 0) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        AbstractC12442l.admob(z11);
                        c12676l2.purchase = str4;
                        c2848lPurchase = c12676l2.purchase();
                    }
                    C2848l c2848l2 = c2848lPurchase;
                    if (c13052l2 == null) {
                        i12 = 0;
                    } else {
                        i12 = c13052l2.amazon;
                    }
                    if (c13052l2 == null) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    C1908l c1908l4 = (C1908l) c1424l2.f3603l;
                    long j14 = c1908l4.applovin;
                    long j15 = c1908l4.appmetrica;
                    long j16 = c1908l4.inmobi;
                    Bundle bundle8 = (Bundle) c5908l.f12454l;
                    C1372l c1372l3 = c1372l;
                    if (iMetrica >= c10444l.metrica()) {
                        c2427l2 = null;
                    } else {
                        c2427l2 = c10444l.subscription(iMetrica).yandex;
                    }
                    C9009l c9009l2 = new C9009l(m289l(iMetrica, c2427l2, jCrashlytics4, z7), z7, SystemClock.elapsedRealtime(), jAmazon2, jLoadAd3, iLoadAd4, jLoadAd4, -9223372036854775807L, jAmazon2, jLoadAd3);
                    C4262l c4262l2 = C9009l.firebase;
                    int i28 = i6;
                    c1908l = new C1908l(c14723lMetrica, 0, c9009l2, c4262l2, c4262l2, 0, c1372l3, i28, z6, C15074l.amazon, c10444l, 0, c3852l3, 1.0f, 1.0f, c13736l3, 0, C16684l.amazon, c2848l2, i12, z12, z8, 1, 0, i27, z10, false, c3852l, j14, j15, j16, C1047l.loadAd, C4970l.f10152volatile);
                    C1424l c1424l4 = new C1424l(c1908l, c14023l3, c16616l2, abstractC1186l5, bundle8, c18503l);
                    c5908l2 = this.remoteconfig;
                    c1424l = this.startapp;
                    j4 = c16811l.f32841l;
                    zStartapp = ((C1908l) c1424l.f3603l).isPro.startapp();
                    boolean zStartapp3 = c10444l.startapp();
                    if (!zStartapp) {
                        if (zStartapp) {
                            c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                            c2427lSubscription.getClass();
                            c10475l2 = c10444l.billing;
                            if (c10475l2 == null) {
                                i13 = 0;
                                while (true) {
                                    abstractC1186l2 = c10444l.purchase;
                                    if (i13 >= abstractC1186l2.size()) {
                                        z13 = false;
                                    } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                        z13 = true;
                                    } else {
                                        i13++;
                                    }
                                }
                            } else {
                                i13 = 0;
                                while (true) {
                                    abstractC1186l2 = c10444l.purchase;
                                    if (i13 >= abstractC1186l2.size()) {
                                        z13 = false;
                                    } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                        z13 = true;
                                    } else {
                                        i13++;
                                    }
                                }
                            }
                            if (z13) {
                                num2 = 4;
                                num = 3;
                            } else if (c2427lSubscription.equals(c1908l.subscription())) {
                                jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                                jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                                if (jCrashlytics2 == 0) {
                                    if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                        num2 = 5;
                                    } else {
                                        num2 = null;
                                    }
                                    num3 = null;
                                } else {
                                    if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                        num2 = 5;
                                    } else {
                                        num2 = null;
                                    }
                                    num3 = null;
                                }
                                num = num3;
                            } else {
                                z14 = true;
                                num = 1;
                                num2 = 0;
                            }
                            z14 = true;
                        } else {
                            c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                            c2427lSubscription.getClass();
                            c10475l2 = c10444l.billing;
                            if (c10475l2 == null) {
                                i13 = 0;
                                while (true) {
                                    abstractC1186l2 = c10444l.purchase;
                                    if (i13 >= abstractC1186l2.size()) {
                                        z13 = false;
                                    } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                        z13 = true;
                                    } else {
                                        i13++;
                                    }
                                }
                            } else {
                                i13 = 0;
                                while (true) {
                                    abstractC1186l2 = c10444l.purchase;
                                    if (i13 >= abstractC1186l2.size()) {
                                        z13 = false;
                                    } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                        z13 = true;
                                    } else {
                                        i13++;
                                    }
                                }
                            }
                            if (z13) {
                                num2 = 4;
                                num = 3;
                            } else if (c2427lSubscription.equals(c1908l.subscription())) {
                                jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                                jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                                if (jCrashlytics2 == 0) {
                                    if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                        num2 = 5;
                                    } else {
                                        num2 = null;
                                    }
                                    num3 = null;
                                } else {
                                    if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                        num2 = 5;
                                    } else {
                                        num2 = null;
                                    }
                                    num3 = null;
                                }
                                num = num3;
                            } else {
                                z14 = true;
                                num = 1;
                                num2 = 0;
                            }
                            z14 = true;
                        }
                    } else if (zStartapp) {
                        c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                        c2427lSubscription.getClass();
                        c10475l2 = c10444l.billing;
                        if (c10475l2 == null) {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        } else {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        }
                        if (z13) {
                            num2 = 4;
                            num = 3;
                        } else if (c2427lSubscription.equals(c1908l.subscription())) {
                            jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                            jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                            if (jCrashlytics2 == 0) {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            } else {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            }
                            num = num3;
                        } else {
                            z14 = true;
                            num = 1;
                            num2 = 0;
                        }
                        z14 = true;
                    } else {
                        c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                        c2427lSubscription.getClass();
                        c10475l2 = c10444l.billing;
                        if (c10475l2 == null) {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        } else {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        }
                        if (z13) {
                            num2 = 4;
                            num = 3;
                        } else if (c2427lSubscription.equals(c1908l.subscription())) {
                            jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                            jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                            if (jCrashlytics2 == 0) {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            } else {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            }
                            num = num3;
                        } else {
                            z14 = true;
                            num = 1;
                            num2 = 0;
                        }
                        z14 = true;
                    }
                    Pair pairCreate3 = Pair.create(num2, num);
                    m339l(z, c5908l, true, c1424l4, (Integer) pairCreate3.first, (Integer) pairCreate3.second);
                    if (this.metrica) {
                        this.metrica = false;
                        if (Looper.myLooper() != c16811l.f32839l.getLooper()) {
                            z14 = false;
                        }
                        AbstractC12442l.subscription(z14);
                        c16811l.f32840l.getClass();
                    }
                }
                c8937l = c8937l5;
                c6921l.loadAd(2);
                if (AbstractC18585l.advert(j10, 8L)) {
                    c6921l.loadAd(11);
                }
                if (AbstractC18585l.advert(j10, 64L)) {
                    c6921l.loadAd(12);
                }
                c8937l2 = c8937l;
                if (AbstractC18585l.advert(j10, 256L)) {
                    c6921l.amazon(5, 4);
                }
                if (AbstractC18585l.advert(j10, 32L)) {
                    c6921l.amazon(9, 8);
                }
                if (AbstractC18585l.advert(j10, 16L)) {
                    c6921l.amazon(7, 6);
                }
                if (AbstractC18585l.advert(j10, 4194304L)) {
                    c6921l.loadAd(13);
                }
                if (AbstractC18585l.advert(j10, 1L)) {
                    c6921l.loadAd(3);
                }
                if (i3 == 1) {
                    c6921l.amazon(26, 34);
                } else if (i3 == 2) {
                    c6921l.amazon(26, 34, 25, 33);
                }
                c6921l.amazon(23, 17, 18, 16, 21, 32);
                if ((flags & j3) != 0) {
                    c6921l.loadAd(20);
                }
                if (AbstractC18585l.advert(j10, 4096L)) {
                    c6921l.loadAd(10);
                }
                if (z2) {
                    if (AbstractC18585l.advert(j10, 262144L)) {
                        c6921l.loadAd(15);
                    }
                    if (AbstractC18585l.advert(j10, 2097152L)) {
                        c6921l.loadAd(14);
                    }
                }
                c16616l = new C16616l(c6921l.purchase());
                charSequence = (CharSequence) c5908l3.f12453l;
                charSequence2 = (CharSequence) c5908l.f12453l;
                if (charSequence == charSequence2) {
                    c3852l2 = ((C1908l) c1424l2.f3603l).remoteconfig;
                } else if (charSequence2 == null) {
                    c3852l2 = C3852l.f7980private;
                } else {
                    C3117l c3117l2 = new C3117l();
                    c3117l2.yandex = charSequence2;
                    c3852l2 = new C3852l(c3117l2);
                }
                C3852l c3852l4 = c3852l2;
                iSubscription = AbstractC18585l.subscription(c5908l.f12456l);
                zSignature = AbstractC18585l.Signature(c5908l.f12455l);
                if (c16830l == c16830l2) {
                    hashSet = new HashSet();
                    c13708l = C12417l.amazon;
                    while (i4 < c13708l.f26765l) {
                        hashSet.add(new C12417l(((Integer) c13708l.get(i4)).intValue()));
                    }
                    if (!z2) {
                        while (r11.hasNext()) {
                            if (c12417l.yandex == 40010) {
                                hashSet.remove(c12417l);
                            }
                        }
                    }
                    if (c16830l2 != null) {
                        while (r11.hasNext()) {
                            String str5 = c5388l.f11535l;
                            bundle4 = c5388l.f11537l;
                            if (bundle4 == null) {
                                bundle4 = Bundle.EMPTY;
                            }
                            hashSet.add(new C12417l(str5, bundle4));
                        }
                    }
                    c14023l = new C14023l(hashSet);
                    if (c16830l2 == null) {
                        C9258l c9258l2 = AbstractC1186l.f3181l;
                        i6 = iSubscription;
                        z6 = zSignature;
                        c14023l2 = c14023l;
                        abstractC1186lFirebase = C13708l.f26763l;
                    } else {
                        List list4 = c16830l2.f32858l;
                        AbstractC12832l.loadAd(4, "initialCapacity");
                        objArrCopyOf = new Object[4];
                        it = list4.iterator();
                        i5 = 0;
                        while (it.hasNext()) {
                            C5388l c5388l3 = (C5388l) it.next();
                            String str6 = c5388l3.f11535l;
                            int i29 = iSubscription;
                            bundle2 = c5388l3.f11537l;
                            if (bundle2 != null) {
                                i7 = bundle2.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                            } else {
                                i7 = 0;
                            }
                            C14023l c14023l5 = c14023l;
                            c3915l = new C3915l(i7, c5388l3.f11533l);
                            if (bundle2 == null) {
                                bundle3 = Bundle.EMPTY;
                            } else {
                                bundle3 = bundle2;
                            }
                            c3915l.amazon(new C12417l(str6, bundle3));
                            c3915l.billing = c5388l3.f11534l;
                            c3915l.admob = true;
                            if (bundle2 != null) {
                                c3915l.mopub = new Bundle(bundle2);
                            }
                            if (bundle2 != null) {
                                string = bundle2.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
                            } else {
                                string = null;
                            }
                            if (string != null) {
                                uri = Uri.parse(string);
                                scheme = uri.getScheme();
                                if (Objects.equals(scheme, "content")) {
                                    c3915l.loadAd(uri);
                                } else {
                                    c3915l.loadAd(uri);
                                }
                            }
                            C14869l c14869lYandex2 = c3915l.yandex();
                            int i210 = i5 + 1;
                            iLoadAd = AbstractC3594l.loadAd(objArrCopyOf.length, i210);
                            if (iLoadAd > objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iLoadAd);
                            }
                            objArrCopyOf[i5] = c14869lYandex2;
                            i5 = i210;
                            iSubscription = i29;
                            it = it;
                            zSignature = zSignature;
                            c14023l = c14023l5;
                        }
                        i6 = iSubscription;
                        z6 = zSignature;
                        c14023l2 = c14023l;
                        abstractC1186lFirebase = C14869l.firebase(AbstractC1186l.vip(i5, objArrCopyOf), c16616l, bundle);
                    }
                    c14023l3 = c14023l2;
                } else {
                    hashSet = new HashSet();
                    c13708l = C12417l.amazon;
                    while (i4 < c13708l.f26765l) {
                        hashSet.add(new C12417l(((Integer) c13708l.get(i4)).intValue()));
                    }
                    if (!z2) {
                        while (r11.hasNext()) {
                            if (c12417l.yandex == 40010) {
                                hashSet.remove(c12417l);
                            }
                        }
                    }
                    if (c16830l2 != null) {
                        while (r11.hasNext()) {
                            String str7 = c5388l.f11535l;
                            bundle4 = c5388l.f11537l;
                            if (bundle4 == null) {
                                bundle4 = Bundle.EMPTY;
                            }
                            hashSet.add(new C12417l(str7, bundle4));
                        }
                    }
                    c14023l = new C14023l(hashSet);
                    if (c16830l2 == null) {
                        C9258l c9258l3 = AbstractC1186l.f3181l;
                        i6 = iSubscription;
                        z6 = zSignature;
                        c14023l2 = c14023l;
                        abstractC1186lFirebase = C13708l.f26763l;
                    } else {
                        List list5 = c16830l2.f32858l;
                        AbstractC12832l.loadAd(4, "initialCapacity");
                        objArrCopyOf = new Object[4];
                        it = list5.iterator();
                        i5 = 0;
                        while (it.hasNext()) {
                            C5388l c5388l4 = (C5388l) it.next();
                            String str8 = c5388l4.f11535l;
                            int i211 = iSubscription;
                            bundle2 = c5388l4.f11537l;
                            if (bundle2 != null) {
                                i7 = bundle2.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                            } else {
                                i7 = 0;
                            }
                            C14023l c14023l6 = c14023l;
                            c3915l = new C3915l(i7, c5388l4.f11533l);
                            if (bundle2 == null) {
                                bundle3 = Bundle.EMPTY;
                            } else {
                                bundle3 = bundle2;
                            }
                            c3915l.amazon(new C12417l(str8, bundle3));
                            c3915l.billing = c5388l4.f11534l;
                            c3915l.admob = true;
                            if (bundle2 != null) {
                                c3915l.mopub = new Bundle(bundle2);
                            }
                            if (bundle2 != null) {
                                string = bundle2.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
                            } else {
                                string = null;
                            }
                            if (string != null) {
                                uri = Uri.parse(string);
                                scheme = uri.getScheme();
                                if (Objects.equals(scheme, "content")) {
                                    c3915l.loadAd(uri);
                                } else {
                                    c3915l.loadAd(uri);
                                }
                            }
                            C14869l c14869lYandex3 = c3915l.yandex();
                            int i212 = i5 + 1;
                            iLoadAd = AbstractC3594l.loadAd(objArrCopyOf.length, i212);
                            if (iLoadAd > objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iLoadAd);
                            }
                            objArrCopyOf[i5] = c14869lYandex3;
                            i5 = i212;
                            iSubscription = i211;
                            it = it;
                            zSignature = zSignature;
                            c14023l = c14023l6;
                        }
                        i6 = iSubscription;
                        z6 = zSignature;
                        c14023l2 = c14023l;
                        abstractC1186lFirebase = C14869l.firebase(AbstractC1186l.vip(i5, objArrCopyOf), c16616l, bundle);
                    }
                    c14023l3 = c14023l2;
                }
                Context context2 = this.yandex;
                C14723l c14723lMetrica2 = AbstractC18585l.metrica(c16830l2, context2);
                if (c16830l2 == null) {
                    i8 = c16830l2.f32853l;
                    int i213 = c16830l2.f32859l;
                    CharSequence charSequence5 = c16830l2.f32850l;
                    Bundle bundle9 = c16830l2.f32860l;
                    c16616l2 = c16616l;
                    if (i8 == 7) {
                    }
                    long jCrashlytics5 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j5);
                    long jLoadAd5 = AbstractC18585l.loadAd(c16830l2, c8937l2, j5);
                    AbstractC1186l abstractC1186l6 = abstractC1186lFirebase;
                    int iLoadAd5 = AbstractC8672l.loadAd(AbstractC18585l.loadAd(c16830l2, c8937l2, j5), AbstractC18585l.amazon(c8937l2));
                    long jLoadAd6 = AbstractC18585l.loadAd(c16830l2, c8937l2, j5) - AbstractC18585l.crashlytics(c16830l2, c8937l2, j5);
                    if (c8937l2 == 0) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    if (c16830l2 == null) {
                        c1372l = C1372l.amazon;
                    } else {
                        c1372l = new C1372l(c16830l2.f32856l);
                    }
                    if (c13052l2 == null) {
                        c13736l = C13736l.subs;
                    } else {
                        c13736l = (C13736l) c13052l2.purchase;
                    }
                    C13736l c13736l4 = c13736l;
                    if (c16830l2 == null) {
                        switch (c16830l2.f32853l) {
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 9:
                            case 10:
                            case 11:
                                z8 = true;
                                break;
                            case 7:
                            case 8:
                            default:
                                z8 = false;
                                break;
                        }
                    } else {
                        z8 = false;
                    }
                    if (c16830l2 == null) {
                        i9 = 1;
                    } else {
                        i10 = c16830l2.f32853l;
                        jAmazon = AbstractC18585l.amazon(c8937l2);
                        if (jAmazon == -9223372036854775807L) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        switch (i10) {
                            case 1:
                                if (z9) {
                                    i9 = 4;
                                    break;
                                }
                            case 0:
                            case 7:
                            case 8:
                                i9 = 1;
                                break;
                            case 2:
                                if (z9) {
                                    i9 = 4;
                                    break;
                                }
                            case 3:
                                i9 = 3;
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 9:
                            case 10:
                            case 11:
                                i9 = 2;
                                break;
                            default:
                                throw new C14469l("Invalid state of PlaybackStateCompat: " + i10);
                        }
                    }
                    int i214 = i9;
                    if (c16830l2 == null) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (c13052l2 == null) {
                        c2848lPurchase = C2848l.purchase;
                    } else {
                        if (c13052l2.yandex == 2) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        C12676l c12676l3 = new C12676l(i11);
                        c12676l3.amazon = c13052l2.crashlytics;
                        String str9 = (String) c13052l2.billing;
                        if (i11 == 0) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        AbstractC12442l.admob(z11);
                        c12676l3.purchase = str9;
                        c2848lPurchase = c12676l3.purchase();
                    }
                    C2848l c2848l3 = c2848lPurchase;
                    if (c13052l2 == null) {
                        i12 = 0;
                    } else {
                        i12 = c13052l2.amazon;
                    }
                    if (c13052l2 == null) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    C1908l c1908l5 = (C1908l) c1424l2.f3603l;
                    long j17 = c1908l5.applovin;
                    long j18 = c1908l5.appmetrica;
                    long j19 = c1908l5.inmobi;
                    Bundle bundle10 = (Bundle) c5908l.f12454l;
                    C1372l c1372l4 = c1372l;
                    if (iMetrica >= c10444l.metrica()) {
                        c2427l2 = null;
                    } else {
                        c2427l2 = c10444l.subscription(iMetrica).yandex;
                    }
                    C9009l c9009l3 = new C9009l(m289l(iMetrica, c2427l2, jCrashlytics5, z7), z7, SystemClock.elapsedRealtime(), jAmazon2, jLoadAd5, iLoadAd5, jLoadAd6, -9223372036854775807L, jAmazon2, jLoadAd5);
                    C4262l c4262l3 = C9009l.firebase;
                    int i215 = i6;
                    c1908l = new C1908l(c14723lMetrica2, 0, c9009l3, c4262l3, c4262l3, 0, c1372l4, i215, z6, C15074l.amazon, c10444l, 0, c3852l4, 1.0f, 1.0f, c13736l4, 0, C16684l.amazon, c2848l3, i12, z12, z8, 1, 0, i214, z10, false, c3852l, j17, j18, j19, C1047l.loadAd, C4970l.f10152volatile);
                    C1424l c1424l5 = new C1424l(c1908l, c14023l3, c16616l2, abstractC1186l6, bundle10, c18503l);
                    c5908l2 = this.remoteconfig;
                    c1424l = this.startapp;
                    j4 = c16811l.f32841l;
                    zStartapp = ((C1908l) c1424l.f3603l).isPro.startapp();
                    boolean zStartapp4 = c10444l.startapp();
                    if (!zStartapp) {
                        if (zStartapp) {
                            c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                            c2427lSubscription.getClass();
                            c10475l2 = c10444l.billing;
                            if (c10475l2 == null) {
                                i13 = 0;
                                while (true) {
                                    abstractC1186l2 = c10444l.purchase;
                                    if (i13 >= abstractC1186l2.size()) {
                                        z13 = false;
                                    } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                        z13 = true;
                                    } else {
                                        i13++;
                                    }
                                }
                            } else {
                                i13 = 0;
                                while (true) {
                                    abstractC1186l2 = c10444l.purchase;
                                    if (i13 >= abstractC1186l2.size()) {
                                        z13 = false;
                                    } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                        z13 = true;
                                    } else {
                                        i13++;
                                    }
                                }
                            }
                            if (z13) {
                                num2 = 4;
                                num = 3;
                            } else if (c2427lSubscription.equals(c1908l.subscription())) {
                                jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                                jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                                if (jCrashlytics2 == 0) {
                                    if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                        num2 = 5;
                                    } else {
                                        num2 = null;
                                    }
                                    num3 = null;
                                } else {
                                    if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                        num2 = 5;
                                    } else {
                                        num2 = null;
                                    }
                                    num3 = null;
                                }
                                num = num3;
                            } else {
                                z14 = true;
                                num = 1;
                                num2 = 0;
                            }
                            z14 = true;
                        } else {
                            c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                            c2427lSubscription.getClass();
                            c10475l2 = c10444l.billing;
                            if (c10475l2 == null) {
                                i13 = 0;
                                while (true) {
                                    abstractC1186l2 = c10444l.purchase;
                                    if (i13 >= abstractC1186l2.size()) {
                                        z13 = false;
                                    } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                        z13 = true;
                                    } else {
                                        i13++;
                                    }
                                }
                            } else {
                                i13 = 0;
                                while (true) {
                                    abstractC1186l2 = c10444l.purchase;
                                    if (i13 >= abstractC1186l2.size()) {
                                        z13 = false;
                                    } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                        z13 = true;
                                    } else {
                                        i13++;
                                    }
                                }
                            }
                            if (z13) {
                                num2 = 4;
                                num = 3;
                            } else if (c2427lSubscription.equals(c1908l.subscription())) {
                                jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                                jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                                if (jCrashlytics2 == 0) {
                                    if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                        num2 = 5;
                                    } else {
                                        num2 = null;
                                    }
                                    num3 = null;
                                } else {
                                    if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                        num2 = 5;
                                    } else {
                                        num2 = null;
                                    }
                                    num3 = null;
                                }
                                num = num3;
                            } else {
                                z14 = true;
                                num = 1;
                                num2 = 0;
                            }
                            z14 = true;
                        }
                    } else if (zStartapp) {
                        c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                        c2427lSubscription.getClass();
                        c10475l2 = c10444l.billing;
                        if (c10475l2 == null) {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        } else {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        }
                        if (z13) {
                            num2 = 4;
                            num = 3;
                        } else if (c2427lSubscription.equals(c1908l.subscription())) {
                            jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                            jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                            if (jCrashlytics2 == 0) {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            } else {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            }
                            num = num3;
                        } else {
                            z14 = true;
                            num = 1;
                            num2 = 0;
                        }
                        z14 = true;
                    } else {
                        c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                        c2427lSubscription.getClass();
                        c10475l2 = c10444l.billing;
                        if (c10475l2 == null) {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        } else {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        }
                        if (z13) {
                            num2 = 4;
                            num = 3;
                        } else if (c2427lSubscription.equals(c1908l.subscription())) {
                            jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                            jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                            if (jCrashlytics2 == 0) {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            } else {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            }
                            num = num3;
                        } else {
                            z14 = true;
                            num = 1;
                            num2 = 0;
                        }
                        z14 = true;
                    }
                    Pair pairCreate4 = Pair.create(num2, num);
                    m339l(z, c5908l, true, c1424l5, (Integer) pairCreate4.first, (Integer) pairCreate4.second);
                    if (this.metrica) {
                        this.metrica = false;
                        if (Looper.myLooper() != c16811l.f32839l.getLooper()) {
                            z14 = false;
                        }
                        AbstractC12442l.subscription(z14);
                        c16811l.f32840l.getClass();
                    }
                }
                c16616l2 = c16616l;
                c18503l = null;
                long jCrashlytics6 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j5);
                long jLoadAd7 = AbstractC18585l.loadAd(c16830l2, c8937l2, j5);
                AbstractC1186l abstractC1186l7 = abstractC1186lFirebase;
                int iLoadAd6 = AbstractC8672l.loadAd(AbstractC18585l.loadAd(c16830l2, c8937l2, j5), AbstractC18585l.amazon(c8937l2));
                long jLoadAd8 = AbstractC18585l.loadAd(c16830l2, c8937l2, j5) - AbstractC18585l.crashlytics(c16830l2, c8937l2, j5);
                if (c8937l2 == 0) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (c16830l2 == null) {
                    c1372l = C1372l.amazon;
                } else {
                    c1372l = new C1372l(c16830l2.f32856l);
                }
                if (c13052l2 == null) {
                    c13736l = C13736l.subs;
                } else {
                    c13736l = (C13736l) c13052l2.purchase;
                }
                C13736l c13736l5 = c13736l;
                if (c16830l2 == null) {
                    switch (c16830l2.f32853l) {
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 9:
                        case 10:
                        case 11:
                            z8 = true;
                            break;
                        case 7:
                        case 8:
                        default:
                            z8 = false;
                            break;
                    }
                } else {
                    z8 = false;
                }
                if (c16830l2 == null) {
                    i9 = 1;
                } else {
                    i10 = c16830l2.f32853l;
                    jAmazon = AbstractC18585l.amazon(c8937l2);
                    if (jAmazon == -9223372036854775807L) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    switch (i10) {
                        case 1:
                            if (z9) {
                                i9 = 4;
                                break;
                            }
                        case 0:
                        case 7:
                        case 8:
                            i9 = 1;
                            break;
                        case 2:
                            if (z9) {
                                i9 = 4;
                                break;
                            }
                        case 3:
                            i9 = 3;
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 9:
                        case 10:
                        case 11:
                            i9 = 2;
                            break;
                        default:
                            throw new C14469l("Invalid state of PlaybackStateCompat: " + i10);
                    }
                }
                int i216 = i9;
                if (c16830l2 == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (c13052l2 == null) {
                    c2848lPurchase = C2848l.purchase;
                } else {
                    if (c13052l2.yandex == 2) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    C12676l c12676l4 = new C12676l(i11);
                    c12676l4.amazon = c13052l2.crashlytics;
                    String str10 = (String) c13052l2.billing;
                    if (i11 == 0) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    AbstractC12442l.admob(z11);
                    c12676l4.purchase = str10;
                    c2848lPurchase = c12676l4.purchase();
                }
                C2848l c2848l4 = c2848lPurchase;
                if (c13052l2 == null) {
                    i12 = 0;
                } else {
                    i12 = c13052l2.amazon;
                }
                if (c13052l2 == null) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                C1908l c1908l6 = (C1908l) c1424l2.f3603l;
                long j110 = c1908l6.applovin;
                long j111 = c1908l6.appmetrica;
                long j112 = c1908l6.inmobi;
                Bundle bundle11 = (Bundle) c5908l.f12454l;
                C1372l c1372l5 = c1372l;
                if (iMetrica >= c10444l.metrica()) {
                    c2427l2 = null;
                } else {
                    c2427l2 = c10444l.subscription(iMetrica).yandex;
                }
                C9009l c9009l4 = new C9009l(m289l(iMetrica, c2427l2, jCrashlytics6, z7), z7, SystemClock.elapsedRealtime(), jAmazon2, jLoadAd7, iLoadAd6, jLoadAd8, -9223372036854775807L, jAmazon2, jLoadAd7);
                C4262l c4262l4 = C9009l.firebase;
                int i217 = i6;
                c1908l = new C1908l(c14723lMetrica2, 0, c9009l4, c4262l4, c4262l4, 0, c1372l5, i217, z6, C15074l.amazon, c10444l, 0, c3852l4, 1.0f, 1.0f, c13736l5, 0, C16684l.amazon, c2848l4, i12, z12, z8, 1, 0, i216, z10, false, c3852l, j110, j111, j112, C1047l.loadAd, C4970l.f10152volatile);
                C1424l c1424l6 = new C1424l(c1908l, c14023l3, c16616l2, abstractC1186l7, bundle11, c18503l);
                c5908l2 = this.remoteconfig;
                c1424l = this.startapp;
                j4 = c16811l.f32841l;
                zStartapp = ((C1908l) c1424l.f3603l).isPro.startapp();
                boolean zStartapp5 = c10444l.startapp();
                if (!zStartapp) {
                    if (zStartapp) {
                        c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                        c2427lSubscription.getClass();
                        c10475l2 = c10444l.billing;
                        if (c10475l2 == null) {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        } else {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        }
                        if (z13) {
                            num2 = 4;
                            num = 3;
                        } else if (c2427lSubscription.equals(c1908l.subscription())) {
                            jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                            jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                            if (jCrashlytics2 == 0) {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            } else {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            }
                            num = num3;
                        } else {
                            z14 = true;
                            num = 1;
                            num2 = 0;
                        }
                        z14 = true;
                    } else {
                        c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                        c2427lSubscription.getClass();
                        c10475l2 = c10444l.billing;
                        if (c10475l2 == null) {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        } else {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        }
                        if (z13) {
                            num2 = 4;
                            num = 3;
                        } else if (c2427lSubscription.equals(c1908l.subscription())) {
                            jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                            jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                            if (jCrashlytics2 == 0) {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            } else {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            }
                            num = num3;
                        } else {
                            z14 = true;
                            num = 1;
                            num2 = 0;
                        }
                        z14 = true;
                    }
                } else if (zStartapp) {
                    c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                    c2427lSubscription.getClass();
                    c10475l2 = c10444l.billing;
                    if (c10475l2 == null) {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    } else {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    }
                    if (z13) {
                        num2 = 4;
                        num = 3;
                    } else if (c2427lSubscription.equals(c1908l.subscription())) {
                        jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                        jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                        if (jCrashlytics2 == 0) {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        } else {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        }
                        num = num3;
                    } else {
                        z14 = true;
                        num = 1;
                        num2 = 0;
                    }
                    z14 = true;
                } else {
                    c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                    c2427lSubscription.getClass();
                    c10475l2 = c10444l.billing;
                    if (c10475l2 == null) {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    } else {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    }
                    if (z13) {
                        num2 = 4;
                        num = 3;
                    } else if (c2427lSubscription.equals(c1908l.subscription())) {
                        jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                        jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                        if (jCrashlytics2 == 0) {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        } else {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        }
                        num = num3;
                    } else {
                        z14 = true;
                        num = 1;
                        num2 = 0;
                    }
                    z14 = true;
                }
                Pair pairCreate5 = Pair.create(num2, num);
                m339l(z, c5908l, true, c1424l6, (Integer) pairCreate5.first, (Integer) pairCreate5.second);
                if (this.metrica) {
                    this.metrica = false;
                    if (Looper.myLooper() != c16811l.f32839l.getLooper()) {
                        z14 = false;
                    }
                    AbstractC12442l.subscription(z14);
                    c16811l.f32840l.getClass();
                }
            }
            j3 = 4;
            c6921l.loadAd(1);
            if (AbstractC18585l.advert(j10, 1024L)) {
                c6921l.loadAd(31);
            } else {
                c6921l.loadAd(31);
            }
            if (!AbstractC18585l.advert(j10, 16384L)) {
                c8937l = c8937l5;
                if (!AbstractC18585l.advert(j10, 32768L)) {
                }
                if (AbstractC18585l.advert(j10, 8L)) {
                    c6921l.loadAd(11);
                }
                if (AbstractC18585l.advert(j10, 64L)) {
                    c6921l.loadAd(12);
                }
                c8937l2 = c8937l;
                if (AbstractC18585l.advert(j10, 256L)) {
                    c6921l.amazon(5, 4);
                }
                if (AbstractC18585l.advert(j10, 32L)) {
                    c6921l.amazon(9, 8);
                }
                if (AbstractC18585l.advert(j10, 16L)) {
                    c6921l.amazon(7, 6);
                }
                if (AbstractC18585l.advert(j10, 4194304L)) {
                    c6921l.loadAd(13);
                }
                if (AbstractC18585l.advert(j10, 1L)) {
                    c6921l.loadAd(3);
                }
                if (i3 == 1) {
                    c6921l.amazon(26, 34);
                } else if (i3 == 2) {
                    c6921l.amazon(26, 34, 25, 33);
                }
                c6921l.amazon(23, 17, 18, 16, 21, 32);
                if ((flags & j3) != 0) {
                    c6921l.loadAd(20);
                }
                if (AbstractC18585l.advert(j10, 4096L)) {
                    c6921l.loadAd(10);
                }
                if (z2) {
                    if (AbstractC18585l.advert(j10, 262144L)) {
                        c6921l.loadAd(15);
                    }
                    if (AbstractC18585l.advert(j10, 2097152L)) {
                        c6921l.loadAd(14);
                    }
                }
                c16616l = new C16616l(c6921l.purchase());
                charSequence = (CharSequence) c5908l3.f12453l;
                charSequence2 = (CharSequence) c5908l.f12453l;
                if (charSequence == charSequence2) {
                    c3852l2 = ((C1908l) c1424l2.f3603l).remoteconfig;
                } else if (charSequence2 == null) {
                    c3852l2 = C3852l.f7980private;
                } else {
                    C3117l c3117l3 = new C3117l();
                    c3117l3.yandex = charSequence2;
                    c3852l2 = new C3852l(c3117l3);
                }
                C3852l c3852l5 = c3852l2;
                iSubscription = AbstractC18585l.subscription(c5908l.f12456l);
                zSignature = AbstractC18585l.Signature(c5908l.f12455l);
                if (c16830l == c16830l2) {
                    hashSet = new HashSet();
                    c13708l = C12417l.amazon;
                    while (i4 < c13708l.f26765l) {
                        hashSet.add(new C12417l(((Integer) c13708l.get(i4)).intValue()));
                    }
                    if (!z2) {
                        while (r11.hasNext()) {
                            if (c12417l.yandex == 40010) {
                                hashSet.remove(c12417l);
                            }
                        }
                    }
                    if (c16830l2 != null) {
                        while (r11.hasNext()) {
                            String str11 = c5388l.f11535l;
                            bundle4 = c5388l.f11537l;
                            if (bundle4 == null) {
                                bundle4 = Bundle.EMPTY;
                            }
                            hashSet.add(new C12417l(str11, bundle4));
                        }
                    }
                    c14023l = new C14023l(hashSet);
                    if (c16830l2 == null) {
                        C9258l c9258l4 = AbstractC1186l.f3181l;
                        i6 = iSubscription;
                        z6 = zSignature;
                        c14023l2 = c14023l;
                        abstractC1186lFirebase = C13708l.f26763l;
                    } else {
                        List list6 = c16830l2.f32858l;
                        AbstractC12832l.loadAd(4, "initialCapacity");
                        objArrCopyOf = new Object[4];
                        it = list6.iterator();
                        i5 = 0;
                        while (it.hasNext()) {
                            C5388l c5388l5 = (C5388l) it.next();
                            String str12 = c5388l5.f11535l;
                            int i218 = iSubscription;
                            bundle2 = c5388l5.f11537l;
                            if (bundle2 != null) {
                                i7 = bundle2.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                            } else {
                                i7 = 0;
                            }
                            C14023l c14023l7 = c14023l;
                            c3915l = new C3915l(i7, c5388l5.f11533l);
                            if (bundle2 == null) {
                                bundle3 = Bundle.EMPTY;
                            } else {
                                bundle3 = bundle2;
                            }
                            c3915l.amazon(new C12417l(str12, bundle3));
                            c3915l.billing = c5388l5.f11534l;
                            c3915l.admob = true;
                            if (bundle2 != null) {
                                c3915l.mopub = new Bundle(bundle2);
                            }
                            if (bundle2 != null) {
                                string = bundle2.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
                            } else {
                                string = null;
                            }
                            if (string != null) {
                                uri = Uri.parse(string);
                                scheme = uri.getScheme();
                                if (Objects.equals(scheme, "content")) {
                                    c3915l.loadAd(uri);
                                } else {
                                    c3915l.loadAd(uri);
                                }
                            }
                            C14869l c14869lYandex4 = c3915l.yandex();
                            int i219 = i5 + 1;
                            iLoadAd = AbstractC3594l.loadAd(objArrCopyOf.length, i219);
                            if (iLoadAd > objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iLoadAd);
                            }
                            objArrCopyOf[i5] = c14869lYandex4;
                            i5 = i219;
                            iSubscription = i218;
                            it = it;
                            zSignature = zSignature;
                            c14023l = c14023l7;
                        }
                        i6 = iSubscription;
                        z6 = zSignature;
                        c14023l2 = c14023l;
                        abstractC1186lFirebase = C14869l.firebase(AbstractC1186l.vip(i5, objArrCopyOf), c16616l, bundle);
                    }
                    c14023l3 = c14023l2;
                } else {
                    hashSet = new HashSet();
                    c13708l = C12417l.amazon;
                    while (i4 < c13708l.f26765l) {
                        hashSet.add(new C12417l(((Integer) c13708l.get(i4)).intValue()));
                    }
                    if (!z2) {
                        while (r11.hasNext()) {
                            if (c12417l.yandex == 40010) {
                                hashSet.remove(c12417l);
                            }
                        }
                    }
                    if (c16830l2 != null) {
                        while (r11.hasNext()) {
                            String str13 = c5388l.f11535l;
                            bundle4 = c5388l.f11537l;
                            if (bundle4 == null) {
                                bundle4 = Bundle.EMPTY;
                            }
                            hashSet.add(new C12417l(str13, bundle4));
                        }
                    }
                    c14023l = new C14023l(hashSet);
                    if (c16830l2 == null) {
                        C9258l c9258l5 = AbstractC1186l.f3181l;
                        i6 = iSubscription;
                        z6 = zSignature;
                        c14023l2 = c14023l;
                        abstractC1186lFirebase = C13708l.f26763l;
                    } else {
                        List list7 = c16830l2.f32858l;
                        AbstractC12832l.loadAd(4, "initialCapacity");
                        objArrCopyOf = new Object[4];
                        it = list7.iterator();
                        i5 = 0;
                        while (it.hasNext()) {
                            C5388l c5388l6 = (C5388l) it.next();
                            String str14 = c5388l6.f11535l;
                            int i2110 = iSubscription;
                            bundle2 = c5388l6.f11537l;
                            if (bundle2 != null) {
                                i7 = bundle2.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                            } else {
                                i7 = 0;
                            }
                            C14023l c14023l8 = c14023l;
                            c3915l = new C3915l(i7, c5388l6.f11533l);
                            if (bundle2 == null) {
                                bundle3 = Bundle.EMPTY;
                            } else {
                                bundle3 = bundle2;
                            }
                            c3915l.amazon(new C12417l(str14, bundle3));
                            c3915l.billing = c5388l6.f11534l;
                            c3915l.admob = true;
                            if (bundle2 != null) {
                                c3915l.mopub = new Bundle(bundle2);
                            }
                            if (bundle2 != null) {
                                string = bundle2.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
                            } else {
                                string = null;
                            }
                            if (string != null) {
                                uri = Uri.parse(string);
                                scheme = uri.getScheme();
                                if (Objects.equals(scheme, "content")) {
                                    c3915l.loadAd(uri);
                                } else {
                                    c3915l.loadAd(uri);
                                }
                            }
                            C14869l c14869lYandex5 = c3915l.yandex();
                            int i2111 = i5 + 1;
                            iLoadAd = AbstractC3594l.loadAd(objArrCopyOf.length, i2111);
                            if (iLoadAd > objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iLoadAd);
                            }
                            objArrCopyOf[i5] = c14869lYandex5;
                            i5 = i2111;
                            iSubscription = i2110;
                            it = it;
                            zSignature = zSignature;
                            c14023l = c14023l8;
                        }
                        i6 = iSubscription;
                        z6 = zSignature;
                        c14023l2 = c14023l;
                        abstractC1186lFirebase = C14869l.firebase(AbstractC1186l.vip(i5, objArrCopyOf), c16616l, bundle);
                    }
                    c14023l3 = c14023l2;
                }
                Context context3 = this.yandex;
                C14723l c14723lMetrica3 = AbstractC18585l.metrica(c16830l2, context3);
                if (c16830l2 == null) {
                    i8 = c16830l2.f32853l;
                    int i2112 = c16830l2.f32859l;
                    CharSequence charSequence6 = c16830l2.f32850l;
                    Bundle bundle12 = c16830l2.f32860l;
                    c16616l2 = c16616l;
                    if (i8 == 7) {
                    }
                    long jCrashlytics7 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j5);
                    long jLoadAd9 = AbstractC18585l.loadAd(c16830l2, c8937l2, j5);
                    AbstractC1186l abstractC1186l8 = abstractC1186lFirebase;
                    int iLoadAd7 = AbstractC8672l.loadAd(AbstractC18585l.loadAd(c16830l2, c8937l2, j5), AbstractC18585l.amazon(c8937l2));
                    long jLoadAd10 = AbstractC18585l.loadAd(c16830l2, c8937l2, j5) - AbstractC18585l.crashlytics(c16830l2, c8937l2, j5);
                    if (c8937l2 == 0) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    if (c16830l2 == null) {
                        c1372l = C1372l.amazon;
                    } else {
                        c1372l = new C1372l(c16830l2.f32856l);
                    }
                    if (c13052l2 == null) {
                        c13736l = C13736l.subs;
                    } else {
                        c13736l = (C13736l) c13052l2.purchase;
                    }
                    C13736l c13736l6 = c13736l;
                    if (c16830l2 == null) {
                        switch (c16830l2.f32853l) {
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 9:
                            case 10:
                            case 11:
                                z8 = true;
                                break;
                            case 7:
                            case 8:
                            default:
                                z8 = false;
                                break;
                        }
                    } else {
                        z8 = false;
                    }
                    if (c16830l2 == null) {
                        i9 = 1;
                    } else {
                        i10 = c16830l2.f32853l;
                        jAmazon = AbstractC18585l.amazon(c8937l2);
                        if (jAmazon == -9223372036854775807L) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        switch (i10) {
                            case 1:
                                if (z9) {
                                    i9 = 4;
                                    break;
                                }
                            case 0:
                            case 7:
                            case 8:
                                i9 = 1;
                                break;
                            case 2:
                                if (z9) {
                                    i9 = 4;
                                    break;
                                }
                            case 3:
                                i9 = 3;
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 9:
                            case 10:
                            case 11:
                                i9 = 2;
                                break;
                            default:
                                throw new C14469l("Invalid state of PlaybackStateCompat: " + i10);
                        }
                    }
                    int i2113 = i9;
                    if (c16830l2 == null) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (c13052l2 == null) {
                        c2848lPurchase = C2848l.purchase;
                    } else {
                        if (c13052l2.yandex == 2) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        C12676l c12676l5 = new C12676l(i11);
                        c12676l5.amazon = c13052l2.crashlytics;
                        String str15 = (String) c13052l2.billing;
                        if (i11 == 0) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        AbstractC12442l.admob(z11);
                        c12676l5.purchase = str15;
                        c2848lPurchase = c12676l5.purchase();
                    }
                    C2848l c2848l5 = c2848lPurchase;
                    if (c13052l2 == null) {
                        i12 = 0;
                    } else {
                        i12 = c13052l2.amazon;
                    }
                    if (c13052l2 == null) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    C1908l c1908l7 = (C1908l) c1424l2.f3603l;
                    long j113 = c1908l7.applovin;
                    long j114 = c1908l7.appmetrica;
                    long j115 = c1908l7.inmobi;
                    Bundle bundle13 = (Bundle) c5908l.f12454l;
                    C1372l c1372l6 = c1372l;
                    if (iMetrica >= c10444l.metrica()) {
                        c2427l2 = null;
                    } else {
                        c2427l2 = c10444l.subscription(iMetrica).yandex;
                    }
                    C9009l c9009l5 = new C9009l(m289l(iMetrica, c2427l2, jCrashlytics7, z7), z7, SystemClock.elapsedRealtime(), jAmazon2, jLoadAd9, iLoadAd7, jLoadAd10, -9223372036854775807L, jAmazon2, jLoadAd9);
                    C4262l c4262l5 = C9009l.firebase;
                    int i2114 = i6;
                    c1908l = new C1908l(c14723lMetrica3, 0, c9009l5, c4262l5, c4262l5, 0, c1372l6, i2114, z6, C15074l.amazon, c10444l, 0, c3852l5, 1.0f, 1.0f, c13736l6, 0, C16684l.amazon, c2848l5, i12, z12, z8, 1, 0, i2113, z10, false, c3852l, j113, j114, j115, C1047l.loadAd, C4970l.f10152volatile);
                    C1424l c1424l7 = new C1424l(c1908l, c14023l3, c16616l2, abstractC1186l8, bundle13, c18503l);
                    c5908l2 = this.remoteconfig;
                    c1424l = this.startapp;
                    j4 = c16811l.f32841l;
                    zStartapp = ((C1908l) c1424l.f3603l).isPro.startapp();
                    boolean zStartapp6 = c10444l.startapp();
                    if (!zStartapp) {
                        if (zStartapp) {
                            c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                            c2427lSubscription.getClass();
                            c10475l2 = c10444l.billing;
                            if (c10475l2 == null) {
                                i13 = 0;
                                while (true) {
                                    abstractC1186l2 = c10444l.purchase;
                                    if (i13 >= abstractC1186l2.size()) {
                                        z13 = false;
                                    } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                        z13 = true;
                                    } else {
                                        i13++;
                                    }
                                }
                            } else {
                                i13 = 0;
                                while (true) {
                                    abstractC1186l2 = c10444l.purchase;
                                    if (i13 >= abstractC1186l2.size()) {
                                        z13 = false;
                                    } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                        z13 = true;
                                    } else {
                                        i13++;
                                    }
                                }
                            }
                            if (z13) {
                                num2 = 4;
                                num = 3;
                            } else if (c2427lSubscription.equals(c1908l.subscription())) {
                                jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                                jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                                if (jCrashlytics2 == 0) {
                                    if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                        num2 = 5;
                                    } else {
                                        num2 = null;
                                    }
                                    num3 = null;
                                } else {
                                    if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                        num2 = 5;
                                    } else {
                                        num2 = null;
                                    }
                                    num3 = null;
                                }
                                num = num3;
                            } else {
                                z14 = true;
                                num = 1;
                                num2 = 0;
                            }
                            z14 = true;
                        } else {
                            c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                            c2427lSubscription.getClass();
                            c10475l2 = c10444l.billing;
                            if (c10475l2 == null) {
                                i13 = 0;
                                while (true) {
                                    abstractC1186l2 = c10444l.purchase;
                                    if (i13 >= abstractC1186l2.size()) {
                                        z13 = false;
                                    } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                        z13 = true;
                                    } else {
                                        i13++;
                                    }
                                }
                            } else {
                                i13 = 0;
                                while (true) {
                                    abstractC1186l2 = c10444l.purchase;
                                    if (i13 >= abstractC1186l2.size()) {
                                        z13 = false;
                                    } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                        z13 = true;
                                    } else {
                                        i13++;
                                    }
                                }
                            }
                            if (z13) {
                                num2 = 4;
                                num = 3;
                            } else if (c2427lSubscription.equals(c1908l.subscription())) {
                                jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                                jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                                if (jCrashlytics2 == 0) {
                                    if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                        num2 = 5;
                                    } else {
                                        num2 = null;
                                    }
                                    num3 = null;
                                } else {
                                    if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                        num2 = 5;
                                    } else {
                                        num2 = null;
                                    }
                                    num3 = null;
                                }
                                num = num3;
                            } else {
                                z14 = true;
                                num = 1;
                                num2 = 0;
                            }
                            z14 = true;
                        }
                    } else if (zStartapp) {
                        c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                        c2427lSubscription.getClass();
                        c10475l2 = c10444l.billing;
                        if (c10475l2 == null) {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        } else {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        }
                        if (z13) {
                            num2 = 4;
                            num = 3;
                        } else if (c2427lSubscription.equals(c1908l.subscription())) {
                            jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                            jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                            if (jCrashlytics2 == 0) {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            } else {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            }
                            num = num3;
                        } else {
                            z14 = true;
                            num = 1;
                            num2 = 0;
                        }
                        z14 = true;
                    } else {
                        c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                        c2427lSubscription.getClass();
                        c10475l2 = c10444l.billing;
                        if (c10475l2 == null) {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        } else {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        }
                        if (z13) {
                            num2 = 4;
                            num = 3;
                        } else if (c2427lSubscription.equals(c1908l.subscription())) {
                            jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                            jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                            if (jCrashlytics2 == 0) {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            } else {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            }
                            num = num3;
                        } else {
                            z14 = true;
                            num = 1;
                            num2 = 0;
                        }
                        z14 = true;
                    }
                    Pair pairCreate6 = Pair.create(num2, num);
                    m339l(z, c5908l, true, c1424l7, (Integer) pairCreate6.first, (Integer) pairCreate6.second);
                    if (this.metrica) {
                        this.metrica = false;
                        if (Looper.myLooper() != c16811l.f32839l.getLooper()) {
                            z14 = false;
                        }
                        AbstractC12442l.subscription(z14);
                        c16811l.f32840l.getClass();
                    }
                }
                c16616l2 = c16616l;
                c18503l = null;
                long jCrashlytics8 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j5);
                long jLoadAd11 = AbstractC18585l.loadAd(c16830l2, c8937l2, j5);
                AbstractC1186l abstractC1186l9 = abstractC1186lFirebase;
                int iLoadAd8 = AbstractC8672l.loadAd(AbstractC18585l.loadAd(c16830l2, c8937l2, j5), AbstractC18585l.amazon(c8937l2));
                long jLoadAd12 = AbstractC18585l.loadAd(c16830l2, c8937l2, j5) - AbstractC18585l.crashlytics(c16830l2, c8937l2, j5);
                if (c8937l2 == 0) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (c16830l2 == null) {
                    c1372l = C1372l.amazon;
                } else {
                    c1372l = new C1372l(c16830l2.f32856l);
                }
                if (c13052l2 == null) {
                    c13736l = C13736l.subs;
                } else {
                    c13736l = (C13736l) c13052l2.purchase;
                }
                C13736l c13736l7 = c13736l;
                if (c16830l2 == null) {
                    switch (c16830l2.f32853l) {
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 9:
                        case 10:
                        case 11:
                            z8 = true;
                            break;
                        case 7:
                        case 8:
                        default:
                            z8 = false;
                            break;
                    }
                } else {
                    z8 = false;
                }
                if (c16830l2 == null) {
                    i9 = 1;
                } else {
                    i10 = c16830l2.f32853l;
                    jAmazon = AbstractC18585l.amazon(c8937l2);
                    if (jAmazon == -9223372036854775807L) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    switch (i10) {
                        case 1:
                            if (z9) {
                                i9 = 4;
                                break;
                            }
                        case 0:
                        case 7:
                        case 8:
                            i9 = 1;
                            break;
                        case 2:
                            if (z9) {
                                i9 = 4;
                                break;
                            }
                        case 3:
                            i9 = 3;
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 9:
                        case 10:
                        case 11:
                            i9 = 2;
                            break;
                        default:
                            throw new C14469l("Invalid state of PlaybackStateCompat: " + i10);
                    }
                }
                int i2115 = i9;
                if (c16830l2 == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (c13052l2 == null) {
                    c2848lPurchase = C2848l.purchase;
                } else {
                    if (c13052l2.yandex == 2) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    C12676l c12676l6 = new C12676l(i11);
                    c12676l6.amazon = c13052l2.crashlytics;
                    String str16 = (String) c13052l2.billing;
                    if (i11 == 0) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    AbstractC12442l.admob(z11);
                    c12676l6.purchase = str16;
                    c2848lPurchase = c12676l6.purchase();
                }
                C2848l c2848l6 = c2848lPurchase;
                if (c13052l2 == null) {
                    i12 = 0;
                } else {
                    i12 = c13052l2.amazon;
                }
                if (c13052l2 == null) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                C1908l c1908l8 = (C1908l) c1424l2.f3603l;
                long j116 = c1908l8.applovin;
                long j117 = c1908l8.appmetrica;
                long j118 = c1908l8.inmobi;
                Bundle bundle14 = (Bundle) c5908l.f12454l;
                C1372l c1372l7 = c1372l;
                if (iMetrica >= c10444l.metrica()) {
                    c2427l2 = null;
                } else {
                    c2427l2 = c10444l.subscription(iMetrica).yandex;
                }
                C9009l c9009l6 = new C9009l(m289l(iMetrica, c2427l2, jCrashlytics8, z7), z7, SystemClock.elapsedRealtime(), jAmazon2, jLoadAd11, iLoadAd8, jLoadAd12, -9223372036854775807L, jAmazon2, jLoadAd11);
                C4262l c4262l6 = C9009l.firebase;
                int i2116 = i6;
                c1908l = new C1908l(c14723lMetrica3, 0, c9009l6, c4262l6, c4262l6, 0, c1372l7, i2116, z6, C15074l.amazon, c10444l, 0, c3852l5, 1.0f, 1.0f, c13736l7, 0, C16684l.amazon, c2848l6, i12, z12, z8, 1, 0, i2115, z10, false, c3852l, j116, j117, j118, C1047l.loadAd, C4970l.f10152volatile);
                C1424l c1424l8 = new C1424l(c1908l, c14023l3, c16616l2, abstractC1186l9, bundle14, c18503l);
                c5908l2 = this.remoteconfig;
                c1424l = this.startapp;
                j4 = c16811l.f32841l;
                zStartapp = ((C1908l) c1424l.f3603l).isPro.startapp();
                boolean zStartapp7 = c10444l.startapp();
                if (!zStartapp) {
                    if (zStartapp) {
                        c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                        c2427lSubscription.getClass();
                        c10475l2 = c10444l.billing;
                        if (c10475l2 == null) {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        } else {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        }
                        if (z13) {
                            num2 = 4;
                            num = 3;
                        } else if (c2427lSubscription.equals(c1908l.subscription())) {
                            jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                            jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                            if (jCrashlytics2 == 0) {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            } else {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            }
                            num = num3;
                        } else {
                            z14 = true;
                            num = 1;
                            num2 = 0;
                        }
                        z14 = true;
                    } else {
                        c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                        c2427lSubscription.getClass();
                        c10475l2 = c10444l.billing;
                        if (c10475l2 == null) {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        } else {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        }
                        if (z13) {
                            num2 = 4;
                            num = 3;
                        } else if (c2427lSubscription.equals(c1908l.subscription())) {
                            jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                            jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                            if (jCrashlytics2 == 0) {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            } else {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            }
                            num = num3;
                        } else {
                            z14 = true;
                            num = 1;
                            num2 = 0;
                        }
                        z14 = true;
                    }
                } else if (zStartapp) {
                    c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                    c2427lSubscription.getClass();
                    c10475l2 = c10444l.billing;
                    if (c10475l2 == null) {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    } else {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    }
                    if (z13) {
                        num2 = 4;
                        num = 3;
                    } else if (c2427lSubscription.equals(c1908l.subscription())) {
                        jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                        jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                        if (jCrashlytics2 == 0) {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        } else {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        }
                        num = num3;
                    } else {
                        z14 = true;
                        num = 1;
                        num2 = 0;
                    }
                    z14 = true;
                } else {
                    c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                    c2427lSubscription.getClass();
                    c10475l2 = c10444l.billing;
                    if (c10475l2 == null) {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    } else {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    }
                    if (z13) {
                        num2 = 4;
                        num = 3;
                    } else if (c2427lSubscription.equals(c1908l.subscription())) {
                        jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                        jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                        if (jCrashlytics2 == 0) {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        } else {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        }
                        num = num3;
                    } else {
                        z14 = true;
                        num = 1;
                        num2 = 0;
                    }
                    z14 = true;
                }
                Pair pairCreate7 = Pair.create(num2, num);
                m339l(z, c5908l, true, c1424l8, (Integer) pairCreate7.first, (Integer) pairCreate7.second);
                if (this.metrica) {
                    this.metrica = false;
                    if (Looper.myLooper() != c16811l.f32839l.getLooper()) {
                        z14 = false;
                    }
                    AbstractC12442l.subscription(z14);
                    c16811l.f32840l.getClass();
                }
            }
            c8937l = c8937l5;
            c6921l.loadAd(2);
            if (AbstractC18585l.advert(j10, 8L)) {
                c6921l.loadAd(11);
            }
            if (AbstractC18585l.advert(j10, 64L)) {
                c6921l.loadAd(12);
            }
            c8937l2 = c8937l;
            if (AbstractC18585l.advert(j10, 256L)) {
                c6921l.amazon(5, 4);
            }
            if (AbstractC18585l.advert(j10, 32L)) {
                c6921l.amazon(9, 8);
            }
            if (AbstractC18585l.advert(j10, 16L)) {
                c6921l.amazon(7, 6);
            }
            if (AbstractC18585l.advert(j10, 4194304L)) {
                c6921l.loadAd(13);
            }
            if (AbstractC18585l.advert(j10, 1L)) {
                c6921l.loadAd(3);
            }
            if (i3 == 1) {
                c6921l.amazon(26, 34);
            } else if (i3 == 2) {
                c6921l.amazon(26, 34, 25, 33);
            }
            c6921l.amazon(23, 17, 18, 16, 21, 32);
            if ((flags & j3) != 0) {
                c6921l.loadAd(20);
            }
            if (AbstractC18585l.advert(j10, 4096L)) {
                c6921l.loadAd(10);
            }
            if (z2) {
                if (AbstractC18585l.advert(j10, 262144L)) {
                    c6921l.loadAd(15);
                }
                if (AbstractC18585l.advert(j10, 2097152L)) {
                    c6921l.loadAd(14);
                }
            }
            c16616l = new C16616l(c6921l.purchase());
            charSequence = (CharSequence) c5908l3.f12453l;
            charSequence2 = (CharSequence) c5908l.f12453l;
            if (charSequence == charSequence2) {
                c3852l2 = ((C1908l) c1424l2.f3603l).remoteconfig;
            } else if (charSequence2 == null) {
                c3852l2 = C3852l.f7980private;
            } else {
                C3117l c3117l4 = new C3117l();
                c3117l4.yandex = charSequence2;
                c3852l2 = new C3852l(c3117l4);
            }
            C3852l c3852l6 = c3852l2;
            iSubscription = AbstractC18585l.subscription(c5908l.f12456l);
            zSignature = AbstractC18585l.Signature(c5908l.f12455l);
            if (c16830l == c16830l2) {
                hashSet = new HashSet();
                c13708l = C12417l.amazon;
                while (i4 < c13708l.f26765l) {
                    hashSet.add(new C12417l(((Integer) c13708l.get(i4)).intValue()));
                }
                if (!z2) {
                    while (r11.hasNext()) {
                        if (c12417l.yandex == 40010) {
                            hashSet.remove(c12417l);
                        }
                    }
                }
                if (c16830l2 != null) {
                    while (r11.hasNext()) {
                        String str17 = c5388l.f11535l;
                        bundle4 = c5388l.f11537l;
                        if (bundle4 == null) {
                            bundle4 = Bundle.EMPTY;
                        }
                        hashSet.add(new C12417l(str17, bundle4));
                    }
                }
                c14023l = new C14023l(hashSet);
                if (c16830l2 == null) {
                    C9258l c9258l6 = AbstractC1186l.f3181l;
                    i6 = iSubscription;
                    z6 = zSignature;
                    c14023l2 = c14023l;
                    abstractC1186lFirebase = C13708l.f26763l;
                } else {
                    List list8 = c16830l2.f32858l;
                    AbstractC12832l.loadAd(4, "initialCapacity");
                    objArrCopyOf = new Object[4];
                    it = list8.iterator();
                    i5 = 0;
                    while (it.hasNext()) {
                        C5388l c5388l7 = (C5388l) it.next();
                        String str18 = c5388l7.f11535l;
                        int i2117 = iSubscription;
                        bundle2 = c5388l7.f11537l;
                        if (bundle2 != null) {
                            i7 = bundle2.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                        } else {
                            i7 = 0;
                        }
                        C14023l c14023l9 = c14023l;
                        c3915l = new C3915l(i7, c5388l7.f11533l);
                        if (bundle2 == null) {
                            bundle3 = Bundle.EMPTY;
                        } else {
                            bundle3 = bundle2;
                        }
                        c3915l.amazon(new C12417l(str18, bundle3));
                        c3915l.billing = c5388l7.f11534l;
                        c3915l.admob = true;
                        if (bundle2 != null) {
                            c3915l.mopub = new Bundle(bundle2);
                        }
                        if (bundle2 != null) {
                            string = bundle2.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
                        } else {
                            string = null;
                        }
                        if (string != null) {
                            uri = Uri.parse(string);
                            scheme = uri.getScheme();
                            if (Objects.equals(scheme, "content")) {
                                c3915l.loadAd(uri);
                            } else {
                                c3915l.loadAd(uri);
                            }
                        }
                        C14869l c14869lYandex6 = c3915l.yandex();
                        int i2118 = i5 + 1;
                        iLoadAd = AbstractC3594l.loadAd(objArrCopyOf.length, i2118);
                        if (iLoadAd > objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iLoadAd);
                        }
                        objArrCopyOf[i5] = c14869lYandex6;
                        i5 = i2118;
                        iSubscription = i2117;
                        it = it;
                        zSignature = zSignature;
                        c14023l = c14023l9;
                    }
                    i6 = iSubscription;
                    z6 = zSignature;
                    c14023l2 = c14023l;
                    abstractC1186lFirebase = C14869l.firebase(AbstractC1186l.vip(i5, objArrCopyOf), c16616l, bundle);
                }
                c14023l3 = c14023l2;
            } else {
                hashSet = new HashSet();
                c13708l = C12417l.amazon;
                while (i4 < c13708l.f26765l) {
                    hashSet.add(new C12417l(((Integer) c13708l.get(i4)).intValue()));
                }
                if (!z2) {
                    while (r11.hasNext()) {
                        if (c12417l.yandex == 40010) {
                            hashSet.remove(c12417l);
                        }
                    }
                }
                if (c16830l2 != null) {
                    while (r11.hasNext()) {
                        String str19 = c5388l.f11535l;
                        bundle4 = c5388l.f11537l;
                        if (bundle4 == null) {
                            bundle4 = Bundle.EMPTY;
                        }
                        hashSet.add(new C12417l(str19, bundle4));
                    }
                }
                c14023l = new C14023l(hashSet);
                if (c16830l2 == null) {
                    C9258l c9258l7 = AbstractC1186l.f3181l;
                    i6 = iSubscription;
                    z6 = zSignature;
                    c14023l2 = c14023l;
                    abstractC1186lFirebase = C13708l.f26763l;
                } else {
                    List list9 = c16830l2.f32858l;
                    AbstractC12832l.loadAd(4, "initialCapacity");
                    objArrCopyOf = new Object[4];
                    it = list9.iterator();
                    i5 = 0;
                    while (it.hasNext()) {
                        C5388l c5388l8 = (C5388l) it.next();
                        String str110 = c5388l8.f11535l;
                        int i2119 = iSubscription;
                        bundle2 = c5388l8.f11537l;
                        if (bundle2 != null) {
                            i7 = bundle2.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                        } else {
                            i7 = 0;
                        }
                        C14023l c14023l10 = c14023l;
                        c3915l = new C3915l(i7, c5388l8.f11533l);
                        if (bundle2 == null) {
                            bundle3 = Bundle.EMPTY;
                        } else {
                            bundle3 = bundle2;
                        }
                        c3915l.amazon(new C12417l(str110, bundle3));
                        c3915l.billing = c5388l8.f11534l;
                        c3915l.admob = true;
                        if (bundle2 != null) {
                            c3915l.mopub = new Bundle(bundle2);
                        }
                        if (bundle2 != null) {
                            string = bundle2.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
                        } else {
                            string = null;
                        }
                        if (string != null) {
                            uri = Uri.parse(string);
                            scheme = uri.getScheme();
                            if (Objects.equals(scheme, "content")) {
                                c3915l.loadAd(uri);
                            } else {
                                c3915l.loadAd(uri);
                            }
                        }
                        C14869l c14869lYandex7 = c3915l.yandex();
                        int i21110 = i5 + 1;
                        iLoadAd = AbstractC3594l.loadAd(objArrCopyOf.length, i21110);
                        if (iLoadAd > objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iLoadAd);
                        }
                        objArrCopyOf[i5] = c14869lYandex7;
                        i5 = i21110;
                        iSubscription = i2119;
                        it = it;
                        zSignature = zSignature;
                        c14023l = c14023l10;
                    }
                    i6 = iSubscription;
                    z6 = zSignature;
                    c14023l2 = c14023l;
                    abstractC1186lFirebase = C14869l.firebase(AbstractC1186l.vip(i5, objArrCopyOf), c16616l, bundle);
                }
                c14023l3 = c14023l2;
            }
            Context context4 = this.yandex;
            C14723l c14723lMetrica4 = AbstractC18585l.metrica(c16830l2, context4);
            if (c16830l2 == null) {
                i8 = c16830l2.f32853l;
                int i21111 = c16830l2.f32859l;
                CharSequence charSequence7 = c16830l2.f32850l;
                Bundle bundle15 = c16830l2.f32860l;
                c16616l2 = c16616l;
                if (i8 == 7) {
                }
                long jCrashlytics9 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j5);
                long jLoadAd13 = AbstractC18585l.loadAd(c16830l2, c8937l2, j5);
                AbstractC1186l abstractC1186l10 = abstractC1186lFirebase;
                int iLoadAd9 = AbstractC8672l.loadAd(AbstractC18585l.loadAd(c16830l2, c8937l2, j5), AbstractC18585l.amazon(c8937l2));
                long jLoadAd14 = AbstractC18585l.loadAd(c16830l2, c8937l2, j5) - AbstractC18585l.crashlytics(c16830l2, c8937l2, j5);
                if (c8937l2 == 0) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (c16830l2 == null) {
                    c1372l = C1372l.amazon;
                } else {
                    c1372l = new C1372l(c16830l2.f32856l);
                }
                if (c13052l2 == null) {
                    c13736l = C13736l.subs;
                } else {
                    c13736l = (C13736l) c13052l2.purchase;
                }
                C13736l c13736l8 = c13736l;
                if (c16830l2 == null) {
                    switch (c16830l2.f32853l) {
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 9:
                        case 10:
                        case 11:
                            z8 = true;
                            break;
                        case 7:
                        case 8:
                        default:
                            z8 = false;
                            break;
                    }
                } else {
                    z8 = false;
                }
                if (c16830l2 == null) {
                    i9 = 1;
                } else {
                    i10 = c16830l2.f32853l;
                    jAmazon = AbstractC18585l.amazon(c8937l2);
                    if (jAmazon == -9223372036854775807L) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    switch (i10) {
                        case 1:
                            if (z9) {
                                i9 = 4;
                                break;
                            }
                        case 0:
                        case 7:
                        case 8:
                            i9 = 1;
                            break;
                        case 2:
                            if (z9) {
                                i9 = 4;
                                break;
                            }
                        case 3:
                            i9 = 3;
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 9:
                        case 10:
                        case 11:
                            i9 = 2;
                            break;
                        default:
                            throw new C14469l("Invalid state of PlaybackStateCompat: " + i10);
                    }
                }
                int i21112 = i9;
                if (c16830l2 == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (c13052l2 == null) {
                    c2848lPurchase = C2848l.purchase;
                } else {
                    if (c13052l2.yandex == 2) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    C12676l c12676l7 = new C12676l(i11);
                    c12676l7.amazon = c13052l2.crashlytics;
                    String str111 = (String) c13052l2.billing;
                    if (i11 == 0) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    AbstractC12442l.admob(z11);
                    c12676l7.purchase = str111;
                    c2848lPurchase = c12676l7.purchase();
                }
                C2848l c2848l7 = c2848lPurchase;
                if (c13052l2 == null) {
                    i12 = 0;
                } else {
                    i12 = c13052l2.amazon;
                }
                if (c13052l2 == null) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                C1908l c1908l9 = (C1908l) c1424l2.f3603l;
                long j119 = c1908l9.applovin;
                long j1110 = c1908l9.appmetrica;
                long j1111 = c1908l9.inmobi;
                Bundle bundle16 = (Bundle) c5908l.f12454l;
                C1372l c1372l8 = c1372l;
                if (iMetrica >= c10444l.metrica()) {
                    c2427l2 = null;
                } else {
                    c2427l2 = c10444l.subscription(iMetrica).yandex;
                }
                C9009l c9009l7 = new C9009l(m289l(iMetrica, c2427l2, jCrashlytics9, z7), z7, SystemClock.elapsedRealtime(), jAmazon2, jLoadAd13, iLoadAd9, jLoadAd14, -9223372036854775807L, jAmazon2, jLoadAd13);
                C4262l c4262l7 = C9009l.firebase;
                int i21113 = i6;
                c1908l = new C1908l(c14723lMetrica4, 0, c9009l7, c4262l7, c4262l7, 0, c1372l8, i21113, z6, C15074l.amazon, c10444l, 0, c3852l6, 1.0f, 1.0f, c13736l8, 0, C16684l.amazon, c2848l7, i12, z12, z8, 1, 0, i21112, z10, false, c3852l, j119, j1110, j1111, C1047l.loadAd, C4970l.f10152volatile);
                C1424l c1424l9 = new C1424l(c1908l, c14023l3, c16616l2, abstractC1186l10, bundle16, c18503l);
                c5908l2 = this.remoteconfig;
                c1424l = this.startapp;
                j4 = c16811l.f32841l;
                zStartapp = ((C1908l) c1424l.f3603l).isPro.startapp();
                boolean zStartapp8 = c10444l.startapp();
                if (!zStartapp) {
                    if (zStartapp) {
                        c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                        c2427lSubscription.getClass();
                        c10475l2 = c10444l.billing;
                        if (c10475l2 == null) {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        } else {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        }
                        if (z13) {
                            num2 = 4;
                            num = 3;
                        } else if (c2427lSubscription.equals(c1908l.subscription())) {
                            jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                            jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                            if (jCrashlytics2 == 0) {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            } else {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            }
                            num = num3;
                        } else {
                            z14 = true;
                            num = 1;
                            num2 = 0;
                        }
                        z14 = true;
                    } else {
                        c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                        c2427lSubscription.getClass();
                        c10475l2 = c10444l.billing;
                        if (c10475l2 == null) {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        } else {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        }
                        if (z13) {
                            num2 = 4;
                            num = 3;
                        } else if (c2427lSubscription.equals(c1908l.subscription())) {
                            jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                            jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                            if (jCrashlytics2 == 0) {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            } else {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            }
                            num = num3;
                        } else {
                            z14 = true;
                            num = 1;
                            num2 = 0;
                        }
                        z14 = true;
                    }
                } else if (zStartapp) {
                    c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                    c2427lSubscription.getClass();
                    c10475l2 = c10444l.billing;
                    if (c10475l2 == null) {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    } else {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    }
                    if (z13) {
                        num2 = 4;
                        num = 3;
                    } else if (c2427lSubscription.equals(c1908l.subscription())) {
                        jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                        jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                        if (jCrashlytics2 == 0) {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        } else {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        }
                        num = num3;
                    } else {
                        z14 = true;
                        num = 1;
                        num2 = 0;
                    }
                    z14 = true;
                } else {
                    c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                    c2427lSubscription.getClass();
                    c10475l2 = c10444l.billing;
                    if (c10475l2 == null) {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    } else {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    }
                    if (z13) {
                        num2 = 4;
                        num = 3;
                    } else if (c2427lSubscription.equals(c1908l.subscription())) {
                        jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                        jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                        if (jCrashlytics2 == 0) {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        } else {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        }
                        num = num3;
                    } else {
                        z14 = true;
                        num = 1;
                        num2 = 0;
                    }
                    z14 = true;
                }
                Pair pairCreate8 = Pair.create(num2, num);
                m339l(z, c5908l, true, c1424l9, (Integer) pairCreate8.first, (Integer) pairCreate8.second);
                if (this.metrica) {
                    this.metrica = false;
                    if (Looper.myLooper() != c16811l.f32839l.getLooper()) {
                        z14 = false;
                    }
                    AbstractC12442l.subscription(z14);
                    c16811l.f32840l.getClass();
                }
            }
            c16616l2 = c16616l;
            c18503l = null;
            long jCrashlytics10 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j5);
            long jLoadAd15 = AbstractC18585l.loadAd(c16830l2, c8937l2, j5);
            AbstractC1186l abstractC1186l11 = abstractC1186lFirebase;
            int iLoadAd10 = AbstractC8672l.loadAd(AbstractC18585l.loadAd(c16830l2, c8937l2, j5), AbstractC18585l.amazon(c8937l2));
            long jLoadAd16 = AbstractC18585l.loadAd(c16830l2, c8937l2, j5) - AbstractC18585l.crashlytics(c16830l2, c8937l2, j5);
            if (c8937l2 == 0) {
                z7 = false;
            } else {
                z7 = true;
            }
            if (c16830l2 == null) {
                c1372l = C1372l.amazon;
            } else {
                c1372l = new C1372l(c16830l2.f32856l);
            }
            if (c13052l2 == null) {
                c13736l = C13736l.subs;
            } else {
                c13736l = (C13736l) c13052l2.purchase;
            }
            C13736l c13736l9 = c13736l;
            if (c16830l2 == null) {
                switch (c16830l2.f32853l) {
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 9:
                    case 10:
                    case 11:
                        z8 = true;
                        break;
                    case 7:
                    case 8:
                    default:
                        z8 = false;
                        break;
                }
            } else {
                z8 = false;
            }
            if (c16830l2 == null) {
                i9 = 1;
            } else {
                i10 = c16830l2.f32853l;
                jAmazon = AbstractC18585l.amazon(c8937l2);
                if (jAmazon == -9223372036854775807L) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                switch (i10) {
                    case 1:
                        if (z9) {
                            i9 = 4;
                            break;
                        }
                    case 0:
                    case 7:
                    case 8:
                        i9 = 1;
                        break;
                    case 2:
                        if (z9) {
                            i9 = 4;
                            break;
                        }
                    case 3:
                        i9 = 3;
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 9:
                    case 10:
                    case 11:
                        i9 = 2;
                        break;
                    default:
                        throw new C14469l("Invalid state of PlaybackStateCompat: " + i10);
                }
            }
            int i21114 = i9;
            if (c16830l2 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (c13052l2 == null) {
                c2848lPurchase = C2848l.purchase;
            } else {
                if (c13052l2.yandex == 2) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                C12676l c12676l8 = new C12676l(i11);
                c12676l8.amazon = c13052l2.crashlytics;
                String str112 = (String) c13052l2.billing;
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                AbstractC12442l.admob(z11);
                c12676l8.purchase = str112;
                c2848lPurchase = c12676l8.purchase();
            }
            C2848l c2848l8 = c2848lPurchase;
            if (c13052l2 == null) {
                i12 = 0;
            } else {
                i12 = c13052l2.amazon;
            }
            if (c13052l2 == null) {
                z12 = false;
            } else {
                z12 = true;
            }
            C1908l c1908l10 = (C1908l) c1424l2.f3603l;
            long j1112 = c1908l10.applovin;
            long j1113 = c1908l10.appmetrica;
            long j1114 = c1908l10.inmobi;
            Bundle bundle17 = (Bundle) c5908l.f12454l;
            C1372l c1372l9 = c1372l;
            if (iMetrica >= c10444l.metrica()) {
                c2427l2 = null;
            } else {
                c2427l2 = c10444l.subscription(iMetrica).yandex;
            }
            C9009l c9009l8 = new C9009l(m289l(iMetrica, c2427l2, jCrashlytics10, z7), z7, SystemClock.elapsedRealtime(), jAmazon2, jLoadAd15, iLoadAd10, jLoadAd16, -9223372036854775807L, jAmazon2, jLoadAd15);
            C4262l c4262l8 = C9009l.firebase;
            int i21115 = i6;
            c1908l = new C1908l(c14723lMetrica4, 0, c9009l8, c4262l8, c4262l8, 0, c1372l9, i21115, z6, C15074l.amazon, c10444l, 0, c3852l6, 1.0f, 1.0f, c13736l9, 0, C16684l.amazon, c2848l8, i12, z12, z8, 1, 0, i21114, z10, false, c3852l, j1112, j1113, j1114, C1047l.loadAd, C4970l.f10152volatile);
            C1424l c1424l10 = new C1424l(c1908l, c14023l3, c16616l2, abstractC1186l11, bundle17, c18503l);
            c5908l2 = this.remoteconfig;
            c1424l = this.startapp;
            j4 = c16811l.f32841l;
            zStartapp = ((C1908l) c1424l.f3603l).isPro.startapp();
            boolean zStartapp9 = c10444l.startapp();
            if (!zStartapp) {
                if (zStartapp) {
                    c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                    c2427lSubscription.getClass();
                    c10475l2 = c10444l.billing;
                    if (c10475l2 == null) {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    } else {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    }
                    if (z13) {
                        num2 = 4;
                        num = 3;
                    } else if (c2427lSubscription.equals(c1908l.subscription())) {
                        jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                        jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                        if (jCrashlytics2 == 0) {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        } else {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        }
                        num = num3;
                    } else {
                        z14 = true;
                        num = 1;
                        num2 = 0;
                    }
                    z14 = true;
                } else {
                    c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                    c2427lSubscription.getClass();
                    c10475l2 = c10444l.billing;
                    if (c10475l2 == null) {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    } else {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    }
                    if (z13) {
                        num2 = 4;
                        num = 3;
                    } else if (c2427lSubscription.equals(c1908l.subscription())) {
                        jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                        jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                        if (jCrashlytics2 == 0) {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        } else {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        }
                        num = num3;
                    } else {
                        z14 = true;
                        num = 1;
                        num2 = 0;
                    }
                    z14 = true;
                }
            } else if (zStartapp) {
                c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                c2427lSubscription.getClass();
                c10475l2 = c10444l.billing;
                if (c10475l2 == null) {
                    i13 = 0;
                    while (true) {
                        abstractC1186l2 = c10444l.purchase;
                        if (i13 >= abstractC1186l2.size()) {
                            z13 = false;
                        } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                            z13 = true;
                        } else {
                            i13++;
                        }
                    }
                } else {
                    i13 = 0;
                    while (true) {
                        abstractC1186l2 = c10444l.purchase;
                        if (i13 >= abstractC1186l2.size()) {
                            z13 = false;
                        } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                            z13 = true;
                        } else {
                            i13++;
                        }
                    }
                }
                if (z13) {
                    num2 = 4;
                    num = 3;
                } else if (c2427lSubscription.equals(c1908l.subscription())) {
                    jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                    jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                    if (jCrashlytics2 == 0) {
                        if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    } else {
                        if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    }
                    num = num3;
                } else {
                    z14 = true;
                    num = 1;
                    num2 = 0;
                }
                z14 = true;
            } else {
                c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                c2427lSubscription.getClass();
                c10475l2 = c10444l.billing;
                if (c10475l2 == null) {
                    i13 = 0;
                    while (true) {
                        abstractC1186l2 = c10444l.purchase;
                        if (i13 >= abstractC1186l2.size()) {
                            z13 = false;
                        } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                            z13 = true;
                        } else {
                            i13++;
                        }
                    }
                } else {
                    i13 = 0;
                    while (true) {
                        abstractC1186l2 = c10444l.purchase;
                        if (i13 >= abstractC1186l2.size()) {
                            z13 = false;
                        } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                            z13 = true;
                        } else {
                            i13++;
                        }
                    }
                }
                if (z13) {
                    num2 = 4;
                    num = 3;
                } else if (c2427lSubscription.equals(c1908l.subscription())) {
                    jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                    jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                    if (jCrashlytics2 == 0) {
                        if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    } else {
                        if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    }
                    num = num3;
                } else {
                    z14 = true;
                    num = 1;
                    num2 = 0;
                }
                z14 = true;
            }
            Pair pairCreate9 = Pair.create(num2, num);
            m339l(z, c5908l, true, c1424l10, (Integer) pairCreate9.first, (Integer) pairCreate9.second);
            if (this.metrica) {
                this.metrica = false;
                if (Looper.myLooper() != c16811l.f32839l.getLooper()) {
                    z14 = false;
                }
                AbstractC12442l.subscription(z14);
                c16811l.f32840l.getClass();
            }
        }
        bundle = bundle5;
        z5 = false;
        if (AbstractC18585l.advert(j10, 4L)) {
            j3 = 4;
            if (AbstractC18585l.advert(j10, 2L)) {
                c6921l.loadAd(1);
            } else {
                c6921l.loadAd(1);
            }
        } else {
            j3 = 4;
            if (AbstractC18585l.advert(j10, 2L)) {
                c6921l.loadAd(1);
            } else {
                c6921l.loadAd(1);
            }
        }
        if (AbstractC18585l.advert(j10, 1024L)) {
            c6921l.loadAd(31);
        } else {
            c6921l.loadAd(31);
        }
        if (!AbstractC18585l.advert(j10, 16384L)) {
            c8937l = c8937l5;
            if (!AbstractC18585l.advert(j10, 32768L)) {
            }
            if (AbstractC18585l.advert(j10, 8L)) {
                c6921l.loadAd(11);
            }
            if (AbstractC18585l.advert(j10, 64L)) {
                c6921l.loadAd(12);
            }
            c8937l2 = c8937l;
            if (AbstractC18585l.advert(j10, 256L)) {
                c6921l.amazon(5, 4);
            }
            if (AbstractC18585l.advert(j10, 32L)) {
                c6921l.amazon(9, 8);
            }
            if (AbstractC18585l.advert(j10, 16L)) {
                c6921l.amazon(7, 6);
            }
            if (AbstractC18585l.advert(j10, 4194304L)) {
                c6921l.loadAd(13);
            }
            if (AbstractC18585l.advert(j10, 1L)) {
                c6921l.loadAd(3);
            }
            if (i3 == 1) {
                c6921l.amazon(26, 34);
            } else if (i3 == 2) {
                c6921l.amazon(26, 34, 25, 33);
            }
            c6921l.amazon(23, 17, 18, 16, 21, 32);
            if ((flags & j3) != 0) {
                c6921l.loadAd(20);
            }
            if (AbstractC18585l.advert(j10, 4096L)) {
                c6921l.loadAd(10);
            }
            if (z2) {
                if (AbstractC18585l.advert(j10, 262144L)) {
                    c6921l.loadAd(15);
                }
                if (AbstractC18585l.advert(j10, 2097152L)) {
                    c6921l.loadAd(14);
                }
            }
            c16616l = new C16616l(c6921l.purchase());
            charSequence = (CharSequence) c5908l3.f12453l;
            charSequence2 = (CharSequence) c5908l.f12453l;
            if (charSequence == charSequence2) {
                c3852l2 = ((C1908l) c1424l2.f3603l).remoteconfig;
            } else if (charSequence2 == null) {
                c3852l2 = C3852l.f7980private;
            } else {
                C3117l c3117l5 = new C3117l();
                c3117l5.yandex = charSequence2;
                c3852l2 = new C3852l(c3117l5);
            }
            C3852l c3852l7 = c3852l2;
            iSubscription = AbstractC18585l.subscription(c5908l.f12456l);
            zSignature = AbstractC18585l.Signature(c5908l.f12455l);
            if (c16830l == c16830l2) {
                hashSet = new HashSet();
                c13708l = C12417l.amazon;
                while (i4 < c13708l.f26765l) {
                    hashSet.add(new C12417l(((Integer) c13708l.get(i4)).intValue()));
                }
                if (!z2) {
                    while (r11.hasNext()) {
                        if (c12417l.yandex == 40010) {
                            hashSet.remove(c12417l);
                        }
                    }
                }
                if (c16830l2 != null) {
                    while (r11.hasNext()) {
                        String str113 = c5388l.f11535l;
                        bundle4 = c5388l.f11537l;
                        if (bundle4 == null) {
                            bundle4 = Bundle.EMPTY;
                        }
                        hashSet.add(new C12417l(str113, bundle4));
                    }
                }
                c14023l = new C14023l(hashSet);
                if (c16830l2 == null) {
                    C9258l c9258l8 = AbstractC1186l.f3181l;
                    i6 = iSubscription;
                    z6 = zSignature;
                    c14023l2 = c14023l;
                    abstractC1186lFirebase = C13708l.f26763l;
                } else {
                    List list10 = c16830l2.f32858l;
                    AbstractC12832l.loadAd(4, "initialCapacity");
                    objArrCopyOf = new Object[4];
                    it = list10.iterator();
                    i5 = 0;
                    while (it.hasNext()) {
                        C5388l c5388l9 = (C5388l) it.next();
                        String str114 = c5388l9.f11535l;
                        int i21116 = iSubscription;
                        bundle2 = c5388l9.f11537l;
                        if (bundle2 != null) {
                            i7 = bundle2.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                        } else {
                            i7 = 0;
                        }
                        C14023l c14023l11 = c14023l;
                        c3915l = new C3915l(i7, c5388l9.f11533l);
                        if (bundle2 == null) {
                            bundle3 = Bundle.EMPTY;
                        } else {
                            bundle3 = bundle2;
                        }
                        c3915l.amazon(new C12417l(str114, bundle3));
                        c3915l.billing = c5388l9.f11534l;
                        c3915l.admob = true;
                        if (bundle2 != null) {
                            c3915l.mopub = new Bundle(bundle2);
                        }
                        if (bundle2 != null) {
                            string = bundle2.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
                        } else {
                            string = null;
                        }
                        if (string != null) {
                            uri = Uri.parse(string);
                            scheme = uri.getScheme();
                            if (Objects.equals(scheme, "content")) {
                                c3915l.loadAd(uri);
                            } else {
                                c3915l.loadAd(uri);
                            }
                        }
                        C14869l c14869lYandex8 = c3915l.yandex();
                        int i21117 = i5 + 1;
                        iLoadAd = AbstractC3594l.loadAd(objArrCopyOf.length, i21117);
                        if (iLoadAd > objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iLoadAd);
                        }
                        objArrCopyOf[i5] = c14869lYandex8;
                        i5 = i21117;
                        iSubscription = i21116;
                        it = it;
                        zSignature = zSignature;
                        c14023l = c14023l11;
                    }
                    i6 = iSubscription;
                    z6 = zSignature;
                    c14023l2 = c14023l;
                    abstractC1186lFirebase = C14869l.firebase(AbstractC1186l.vip(i5, objArrCopyOf), c16616l, bundle);
                }
                c14023l3 = c14023l2;
            } else {
                hashSet = new HashSet();
                c13708l = C12417l.amazon;
                while (i4 < c13708l.f26765l) {
                    hashSet.add(new C12417l(((Integer) c13708l.get(i4)).intValue()));
                }
                if (!z2) {
                    while (r11.hasNext()) {
                        if (c12417l.yandex == 40010) {
                            hashSet.remove(c12417l);
                        }
                    }
                }
                if (c16830l2 != null) {
                    while (r11.hasNext()) {
                        String str115 = c5388l.f11535l;
                        bundle4 = c5388l.f11537l;
                        if (bundle4 == null) {
                            bundle4 = Bundle.EMPTY;
                        }
                        hashSet.add(new C12417l(str115, bundle4));
                    }
                }
                c14023l = new C14023l(hashSet);
                if (c16830l2 == null) {
                    C9258l c9258l9 = AbstractC1186l.f3181l;
                    i6 = iSubscription;
                    z6 = zSignature;
                    c14023l2 = c14023l;
                    abstractC1186lFirebase = C13708l.f26763l;
                } else {
                    List list11 = c16830l2.f32858l;
                    AbstractC12832l.loadAd(4, "initialCapacity");
                    objArrCopyOf = new Object[4];
                    it = list11.iterator();
                    i5 = 0;
                    while (it.hasNext()) {
                        C5388l c5388l10 = (C5388l) it.next();
                        String str116 = c5388l10.f11535l;
                        int i21118 = iSubscription;
                        bundle2 = c5388l10.f11537l;
                        if (bundle2 != null) {
                            i7 = bundle2.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                        } else {
                            i7 = 0;
                        }
                        C14023l c14023l12 = c14023l;
                        c3915l = new C3915l(i7, c5388l10.f11533l);
                        if (bundle2 == null) {
                            bundle3 = Bundle.EMPTY;
                        } else {
                            bundle3 = bundle2;
                        }
                        c3915l.amazon(new C12417l(str116, bundle3));
                        c3915l.billing = c5388l10.f11534l;
                        c3915l.admob = true;
                        if (bundle2 != null) {
                            c3915l.mopub = new Bundle(bundle2);
                        }
                        if (bundle2 != null) {
                            string = bundle2.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
                        } else {
                            string = null;
                        }
                        if (string != null) {
                            uri = Uri.parse(string);
                            scheme = uri.getScheme();
                            if (Objects.equals(scheme, "content")) {
                                c3915l.loadAd(uri);
                            } else {
                                c3915l.loadAd(uri);
                            }
                        }
                        C14869l c14869lYandex9 = c3915l.yandex();
                        int i21119 = i5 + 1;
                        iLoadAd = AbstractC3594l.loadAd(objArrCopyOf.length, i21119);
                        if (iLoadAd > objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iLoadAd);
                        }
                        objArrCopyOf[i5] = c14869lYandex9;
                        i5 = i21119;
                        iSubscription = i21118;
                        it = it;
                        zSignature = zSignature;
                        c14023l = c14023l12;
                    }
                    i6 = iSubscription;
                    z6 = zSignature;
                    c14023l2 = c14023l;
                    abstractC1186lFirebase = C14869l.firebase(AbstractC1186l.vip(i5, objArrCopyOf), c16616l, bundle);
                }
                c14023l3 = c14023l2;
            }
            Context context5 = this.yandex;
            C14723l c14723lMetrica5 = AbstractC18585l.metrica(c16830l2, context5);
            if (c16830l2 == null) {
                i8 = c16830l2.f32853l;
                int i211110 = c16830l2.f32859l;
                CharSequence charSequence8 = c16830l2.f32850l;
                Bundle bundle18 = c16830l2.f32860l;
                c16616l2 = c16616l;
                if (i8 == 7) {
                }
                long jCrashlytics11 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j5);
                long jLoadAd17 = AbstractC18585l.loadAd(c16830l2, c8937l2, j5);
                AbstractC1186l abstractC1186l12 = abstractC1186lFirebase;
                int iLoadAd11 = AbstractC8672l.loadAd(AbstractC18585l.loadAd(c16830l2, c8937l2, j5), AbstractC18585l.amazon(c8937l2));
                long jLoadAd18 = AbstractC18585l.loadAd(c16830l2, c8937l2, j5) - AbstractC18585l.crashlytics(c16830l2, c8937l2, j5);
                if (c8937l2 == 0) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (c16830l2 == null) {
                    c1372l = C1372l.amazon;
                } else {
                    c1372l = new C1372l(c16830l2.f32856l);
                }
                if (c13052l2 == null) {
                    c13736l = C13736l.subs;
                } else {
                    c13736l = (C13736l) c13052l2.purchase;
                }
                C13736l c13736l10 = c13736l;
                if (c16830l2 == null) {
                    switch (c16830l2.f32853l) {
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 9:
                        case 10:
                        case 11:
                            z8 = true;
                            break;
                        case 7:
                        case 8:
                        default:
                            z8 = false;
                            break;
                    }
                } else {
                    z8 = false;
                }
                if (c16830l2 == null) {
                    i9 = 1;
                } else {
                    i10 = c16830l2.f32853l;
                    jAmazon = AbstractC18585l.amazon(c8937l2);
                    if (jAmazon == -9223372036854775807L) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    switch (i10) {
                        case 1:
                            if (z9) {
                                i9 = 4;
                                break;
                            }
                        case 0:
                        case 7:
                        case 8:
                            i9 = 1;
                            break;
                        case 2:
                            if (z9) {
                                i9 = 4;
                                break;
                            }
                        case 3:
                            i9 = 3;
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 9:
                        case 10:
                        case 11:
                            i9 = 2;
                            break;
                        default:
                            throw new C14469l("Invalid state of PlaybackStateCompat: " + i10);
                    }
                }
                int i211111 = i9;
                if (c16830l2 == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (c13052l2 == null) {
                    c2848lPurchase = C2848l.purchase;
                } else {
                    if (c13052l2.yandex == 2) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    C12676l c12676l9 = new C12676l(i11);
                    c12676l9.amazon = c13052l2.crashlytics;
                    String str117 = (String) c13052l2.billing;
                    if (i11 == 0) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    AbstractC12442l.admob(z11);
                    c12676l9.purchase = str117;
                    c2848lPurchase = c12676l9.purchase();
                }
                C2848l c2848l9 = c2848lPurchase;
                if (c13052l2 == null) {
                    i12 = 0;
                } else {
                    i12 = c13052l2.amazon;
                }
                if (c13052l2 == null) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                C1908l c1908l11 = (C1908l) c1424l2.f3603l;
                long j1115 = c1908l11.applovin;
                long j1116 = c1908l11.appmetrica;
                long j1117 = c1908l11.inmobi;
                Bundle bundle19 = (Bundle) c5908l.f12454l;
                C1372l c1372l10 = c1372l;
                if (iMetrica >= c10444l.metrica()) {
                    c2427l2 = null;
                } else {
                    c2427l2 = c10444l.subscription(iMetrica).yandex;
                }
                C9009l c9009l9 = new C9009l(m289l(iMetrica, c2427l2, jCrashlytics11, z7), z7, SystemClock.elapsedRealtime(), jAmazon2, jLoadAd17, iLoadAd11, jLoadAd18, -9223372036854775807L, jAmazon2, jLoadAd17);
                C4262l c4262l9 = C9009l.firebase;
                int i211112 = i6;
                c1908l = new C1908l(c14723lMetrica5, 0, c9009l9, c4262l9, c4262l9, 0, c1372l10, i211112, z6, C15074l.amazon, c10444l, 0, c3852l7, 1.0f, 1.0f, c13736l10, 0, C16684l.amazon, c2848l9, i12, z12, z8, 1, 0, i211111, z10, false, c3852l, j1115, j1116, j1117, C1047l.loadAd, C4970l.f10152volatile);
                C1424l c1424l11 = new C1424l(c1908l, c14023l3, c16616l2, abstractC1186l12, bundle19, c18503l);
                c5908l2 = this.remoteconfig;
                c1424l = this.startapp;
                j4 = c16811l.f32841l;
                zStartapp = ((C1908l) c1424l.f3603l).isPro.startapp();
                boolean zStartapp10 = c10444l.startapp();
                if (!zStartapp) {
                    if (zStartapp) {
                        c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                        c2427lSubscription.getClass();
                        c10475l2 = c10444l.billing;
                        if (c10475l2 == null) {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        } else {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        }
                        if (z13) {
                            num2 = 4;
                            num = 3;
                        } else if (c2427lSubscription.equals(c1908l.subscription())) {
                            jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                            jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                            if (jCrashlytics2 == 0) {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            } else {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            }
                            num = num3;
                        } else {
                            z14 = true;
                            num = 1;
                            num2 = 0;
                        }
                        z14 = true;
                    } else {
                        c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                        c2427lSubscription.getClass();
                        c10475l2 = c10444l.billing;
                        if (c10475l2 == null) {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        } else {
                            i13 = 0;
                            while (true) {
                                abstractC1186l2 = c10444l.purchase;
                                if (i13 >= abstractC1186l2.size()) {
                                    z13 = false;
                                } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            }
                        }
                        if (z13) {
                            num2 = 4;
                            num = 3;
                        } else if (c2427lSubscription.equals(c1908l.subscription())) {
                            jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                            jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                            if (jCrashlytics2 == 0) {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            } else {
                                if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            }
                            num = num3;
                        } else {
                            z14 = true;
                            num = 1;
                            num2 = 0;
                        }
                        z14 = true;
                    }
                } else if (zStartapp) {
                    c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                    c2427lSubscription.getClass();
                    c10475l2 = c10444l.billing;
                    if (c10475l2 == null) {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    } else {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    }
                    if (z13) {
                        num2 = 4;
                        num = 3;
                    } else if (c2427lSubscription.equals(c1908l.subscription())) {
                        jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                        jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                        if (jCrashlytics2 == 0) {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        } else {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        }
                        num = num3;
                    } else {
                        z14 = true;
                        num = 1;
                        num2 = 0;
                    }
                    z14 = true;
                } else {
                    c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                    c2427lSubscription.getClass();
                    c10475l2 = c10444l.billing;
                    if (c10475l2 == null) {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    } else {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    }
                    if (z13) {
                        num2 = 4;
                        num = 3;
                    } else if (c2427lSubscription.equals(c1908l.subscription())) {
                        jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                        jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                        if (jCrashlytics2 == 0) {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        } else {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        }
                        num = num3;
                    } else {
                        z14 = true;
                        num = 1;
                        num2 = 0;
                    }
                    z14 = true;
                }
                Pair pairCreate10 = Pair.create(num2, num);
                m339l(z, c5908l, true, c1424l11, (Integer) pairCreate10.first, (Integer) pairCreate10.second);
                if (this.metrica) {
                    this.metrica = false;
                    if (Looper.myLooper() != c16811l.f32839l.getLooper()) {
                        z14 = false;
                    }
                    AbstractC12442l.subscription(z14);
                    c16811l.f32840l.getClass();
                }
            }
            c16616l2 = c16616l;
            c18503l = null;
            long jCrashlytics12 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j5);
            long jLoadAd19 = AbstractC18585l.loadAd(c16830l2, c8937l2, j5);
            AbstractC1186l abstractC1186l13 = abstractC1186lFirebase;
            int iLoadAd12 = AbstractC8672l.loadAd(AbstractC18585l.loadAd(c16830l2, c8937l2, j5), AbstractC18585l.amazon(c8937l2));
            long jLoadAd110 = AbstractC18585l.loadAd(c16830l2, c8937l2, j5) - AbstractC18585l.crashlytics(c16830l2, c8937l2, j5);
            if (c8937l2 == 0) {
                z7 = false;
            } else {
                z7 = true;
            }
            if (c16830l2 == null) {
                c1372l = C1372l.amazon;
            } else {
                c1372l = new C1372l(c16830l2.f32856l);
            }
            if (c13052l2 == null) {
                c13736l = C13736l.subs;
            } else {
                c13736l = (C13736l) c13052l2.purchase;
            }
            C13736l c13736l11 = c13736l;
            if (c16830l2 == null) {
                switch (c16830l2.f32853l) {
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 9:
                    case 10:
                    case 11:
                        z8 = true;
                        break;
                    case 7:
                    case 8:
                    default:
                        z8 = false;
                        break;
                }
            } else {
                z8 = false;
            }
            if (c16830l2 == null) {
                i9 = 1;
            } else {
                i10 = c16830l2.f32853l;
                jAmazon = AbstractC18585l.amazon(c8937l2);
                if (jAmazon == -9223372036854775807L) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                switch (i10) {
                    case 1:
                        if (z9) {
                            i9 = 4;
                            break;
                        }
                    case 0:
                    case 7:
                    case 8:
                        i9 = 1;
                        break;
                    case 2:
                        if (z9) {
                            i9 = 4;
                            break;
                        }
                    case 3:
                        i9 = 3;
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 9:
                    case 10:
                    case 11:
                        i9 = 2;
                        break;
                    default:
                        throw new C14469l("Invalid state of PlaybackStateCompat: " + i10);
                }
            }
            int i211113 = i9;
            if (c16830l2 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (c13052l2 == null) {
                c2848lPurchase = C2848l.purchase;
            } else {
                if (c13052l2.yandex == 2) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                C12676l c12676l10 = new C12676l(i11);
                c12676l10.amazon = c13052l2.crashlytics;
                String str118 = (String) c13052l2.billing;
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                AbstractC12442l.admob(z11);
                c12676l10.purchase = str118;
                c2848lPurchase = c12676l10.purchase();
            }
            C2848l c2848l10 = c2848lPurchase;
            if (c13052l2 == null) {
                i12 = 0;
            } else {
                i12 = c13052l2.amazon;
            }
            if (c13052l2 == null) {
                z12 = false;
            } else {
                z12 = true;
            }
            C1908l c1908l12 = (C1908l) c1424l2.f3603l;
            long j1118 = c1908l12.applovin;
            long j1119 = c1908l12.appmetrica;
            long j11110 = c1908l12.inmobi;
            Bundle bundle110 = (Bundle) c5908l.f12454l;
            C1372l c1372l11 = c1372l;
            if (iMetrica >= c10444l.metrica()) {
                c2427l2 = null;
            } else {
                c2427l2 = c10444l.subscription(iMetrica).yandex;
            }
            C9009l c9009l10 = new C9009l(m289l(iMetrica, c2427l2, jCrashlytics12, z7), z7, SystemClock.elapsedRealtime(), jAmazon2, jLoadAd19, iLoadAd12, jLoadAd110, -9223372036854775807L, jAmazon2, jLoadAd19);
            C4262l c4262l10 = C9009l.firebase;
            int i211114 = i6;
            c1908l = new C1908l(c14723lMetrica5, 0, c9009l10, c4262l10, c4262l10, 0, c1372l11, i211114, z6, C15074l.amazon, c10444l, 0, c3852l7, 1.0f, 1.0f, c13736l11, 0, C16684l.amazon, c2848l10, i12, z12, z8, 1, 0, i211113, z10, false, c3852l, j1118, j1119, j11110, C1047l.loadAd, C4970l.f10152volatile);
            C1424l c1424l12 = new C1424l(c1908l, c14023l3, c16616l2, abstractC1186l13, bundle110, c18503l);
            c5908l2 = this.remoteconfig;
            c1424l = this.startapp;
            j4 = c16811l.f32841l;
            zStartapp = ((C1908l) c1424l.f3603l).isPro.startapp();
            boolean zStartapp11 = c10444l.startapp();
            if (!zStartapp) {
                if (zStartapp) {
                    c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                    c2427lSubscription.getClass();
                    c10475l2 = c10444l.billing;
                    if (c10475l2 == null) {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    } else {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    }
                    if (z13) {
                        num2 = 4;
                        num = 3;
                    } else if (c2427lSubscription.equals(c1908l.subscription())) {
                        jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                        jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                        if (jCrashlytics2 == 0) {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        } else {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        }
                        num = num3;
                    } else {
                        z14 = true;
                        num = 1;
                        num2 = 0;
                    }
                    z14 = true;
                } else {
                    c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                    c2427lSubscription.getClass();
                    c10475l2 = c10444l.billing;
                    if (c10475l2 == null) {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    } else {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    }
                    if (z13) {
                        num2 = 4;
                        num = 3;
                    } else if (c2427lSubscription.equals(c1908l.subscription())) {
                        jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                        jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                        if (jCrashlytics2 == 0) {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        } else {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        }
                        num = num3;
                    } else {
                        z14 = true;
                        num = 1;
                        num2 = 0;
                    }
                    z14 = true;
                }
            } else if (zStartapp) {
                c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                c2427lSubscription.getClass();
                c10475l2 = c10444l.billing;
                if (c10475l2 == null) {
                    i13 = 0;
                    while (true) {
                        abstractC1186l2 = c10444l.purchase;
                        if (i13 >= abstractC1186l2.size()) {
                            z13 = false;
                        } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                            z13 = true;
                        } else {
                            i13++;
                        }
                    }
                } else {
                    i13 = 0;
                    while (true) {
                        abstractC1186l2 = c10444l.purchase;
                        if (i13 >= abstractC1186l2.size()) {
                            z13 = false;
                        } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                            z13 = true;
                        } else {
                            i13++;
                        }
                    }
                }
                if (z13) {
                    num2 = 4;
                    num = 3;
                } else if (c2427lSubscription.equals(c1908l.subscription())) {
                    jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                    jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                    if (jCrashlytics2 == 0) {
                        if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    } else {
                        if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    }
                    num = num3;
                } else {
                    z14 = true;
                    num = 1;
                    num2 = 0;
                }
                z14 = true;
            } else {
                c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                c2427lSubscription.getClass();
                c10475l2 = c10444l.billing;
                if (c10475l2 == null) {
                    i13 = 0;
                    while (true) {
                        abstractC1186l2 = c10444l.purchase;
                        if (i13 >= abstractC1186l2.size()) {
                            z13 = false;
                        } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                            z13 = true;
                        } else {
                            i13++;
                        }
                    }
                } else {
                    i13 = 0;
                    while (true) {
                        abstractC1186l2 = c10444l.purchase;
                        if (i13 >= abstractC1186l2.size()) {
                            z13 = false;
                        } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                            z13 = true;
                        } else {
                            i13++;
                        }
                    }
                }
                if (z13) {
                    num2 = 4;
                    num = 3;
                } else if (c2427lSubscription.equals(c1908l.subscription())) {
                    jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                    jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                    if (jCrashlytics2 == 0) {
                        if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    } else {
                        if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    }
                    num = num3;
                } else {
                    z14 = true;
                    num = 1;
                    num2 = 0;
                }
                z14 = true;
            }
            Pair pairCreate11 = Pair.create(num2, num);
            m339l(z, c5908l, true, c1424l12, (Integer) pairCreate11.first, (Integer) pairCreate11.second);
            if (this.metrica) {
                this.metrica = false;
                if (Looper.myLooper() != c16811l.f32839l.getLooper()) {
                    z14 = false;
                }
                AbstractC12442l.subscription(z14);
                c16811l.f32840l.getClass();
            }
        }
        c8937l = c8937l5;
        c6921l.loadAd(2);
        if (AbstractC18585l.advert(j10, 8L)) {
            c6921l.loadAd(11);
        }
        if (AbstractC18585l.advert(j10, 64L)) {
            c6921l.loadAd(12);
        }
        c8937l2 = c8937l;
        if (AbstractC18585l.advert(j10, 256L)) {
            c6921l.amazon(5, 4);
        }
        if (AbstractC18585l.advert(j10, 32L)) {
            c6921l.amazon(9, 8);
        }
        if (AbstractC18585l.advert(j10, 16L)) {
            c6921l.amazon(7, 6);
        }
        if (AbstractC18585l.advert(j10, 4194304L)) {
            c6921l.loadAd(13);
        }
        if (AbstractC18585l.advert(j10, 1L)) {
            c6921l.loadAd(3);
        }
        if (i3 == 1) {
            c6921l.amazon(26, 34);
        } else if (i3 == 2) {
            c6921l.amazon(26, 34, 25, 33);
        }
        c6921l.amazon(23, 17, 18, 16, 21, 32);
        if ((flags & j3) != 0) {
            c6921l.loadAd(20);
        }
        if (AbstractC18585l.advert(j10, 4096L)) {
            c6921l.loadAd(10);
        }
        if (z2) {
            if (AbstractC18585l.advert(j10, 262144L)) {
                c6921l.loadAd(15);
            }
            if (AbstractC18585l.advert(j10, 2097152L)) {
                c6921l.loadAd(14);
            }
        }
        c16616l = new C16616l(c6921l.purchase());
        charSequence = (CharSequence) c5908l3.f12453l;
        charSequence2 = (CharSequence) c5908l.f12453l;
        if (charSequence == charSequence2) {
            c3852l2 = ((C1908l) c1424l2.f3603l).remoteconfig;
        } else if (charSequence2 == null) {
            c3852l2 = C3852l.f7980private;
        } else {
            C3117l c3117l6 = new C3117l();
            c3117l6.yandex = charSequence2;
            c3852l2 = new C3852l(c3117l6);
        }
        C3852l c3852l8 = c3852l2;
        iSubscription = AbstractC18585l.subscription(c5908l.f12456l);
        zSignature = AbstractC18585l.Signature(c5908l.f12455l);
        if (c16830l == c16830l2) {
            hashSet = new HashSet();
            c13708l = C12417l.amazon;
            while (i4 < c13708l.f26765l) {
                hashSet.add(new C12417l(((Integer) c13708l.get(i4)).intValue()));
            }
            if (!z2) {
                while (r11.hasNext()) {
                    if (c12417l.yandex == 40010) {
                        hashSet.remove(c12417l);
                    }
                }
            }
            if (c16830l2 != null) {
                while (r11.hasNext()) {
                    String str119 = c5388l.f11535l;
                    bundle4 = c5388l.f11537l;
                    if (bundle4 == null) {
                        bundle4 = Bundle.EMPTY;
                    }
                    hashSet.add(new C12417l(str119, bundle4));
                }
            }
            c14023l = new C14023l(hashSet);
            if (c16830l2 == null) {
                C9258l c9258l10 = AbstractC1186l.f3181l;
                i6 = iSubscription;
                z6 = zSignature;
                c14023l2 = c14023l;
                abstractC1186lFirebase = C13708l.f26763l;
            } else {
                List list12 = c16830l2.f32858l;
                AbstractC12832l.loadAd(4, "initialCapacity");
                objArrCopyOf = new Object[4];
                it = list12.iterator();
                i5 = 0;
                while (it.hasNext()) {
                    C5388l c5388l11 = (C5388l) it.next();
                    String str1110 = c5388l11.f11535l;
                    int i211115 = iSubscription;
                    bundle2 = c5388l11.f11537l;
                    if (bundle2 != null) {
                        i7 = bundle2.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                    } else {
                        i7 = 0;
                    }
                    C14023l c14023l13 = c14023l;
                    c3915l = new C3915l(i7, c5388l11.f11533l);
                    if (bundle2 == null) {
                        bundle3 = Bundle.EMPTY;
                    } else {
                        bundle3 = bundle2;
                    }
                    c3915l.amazon(new C12417l(str1110, bundle3));
                    c3915l.billing = c5388l11.f11534l;
                    c3915l.admob = true;
                    if (bundle2 != null) {
                        c3915l.mopub = new Bundle(bundle2);
                    }
                    if (bundle2 != null) {
                        string = bundle2.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
                    } else {
                        string = null;
                    }
                    if (string != null) {
                        uri = Uri.parse(string);
                        scheme = uri.getScheme();
                        if (Objects.equals(scheme, "content")) {
                            c3915l.loadAd(uri);
                        } else {
                            c3915l.loadAd(uri);
                        }
                    }
                    C14869l c14869lYandex10 = c3915l.yandex();
                    int i211116 = i5 + 1;
                    iLoadAd = AbstractC3594l.loadAd(objArrCopyOf.length, i211116);
                    if (iLoadAd > objArrCopyOf.length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iLoadAd);
                    }
                    objArrCopyOf[i5] = c14869lYandex10;
                    i5 = i211116;
                    iSubscription = i211115;
                    it = it;
                    zSignature = zSignature;
                    c14023l = c14023l13;
                }
                i6 = iSubscription;
                z6 = zSignature;
                c14023l2 = c14023l;
                abstractC1186lFirebase = C14869l.firebase(AbstractC1186l.vip(i5, objArrCopyOf), c16616l, bundle);
            }
            c14023l3 = c14023l2;
        } else {
            hashSet = new HashSet();
            c13708l = C12417l.amazon;
            while (i4 < c13708l.f26765l) {
                hashSet.add(new C12417l(((Integer) c13708l.get(i4)).intValue()));
            }
            if (!z2) {
                while (r11.hasNext()) {
                    if (c12417l.yandex == 40010) {
                        hashSet.remove(c12417l);
                    }
                }
            }
            if (c16830l2 != null) {
                while (r11.hasNext()) {
                    String str1111 = c5388l.f11535l;
                    bundle4 = c5388l.f11537l;
                    if (bundle4 == null) {
                        bundle4 = Bundle.EMPTY;
                    }
                    hashSet.add(new C12417l(str1111, bundle4));
                }
            }
            c14023l = new C14023l(hashSet);
            if (c16830l2 == null) {
                C9258l c9258l11 = AbstractC1186l.f3181l;
                i6 = iSubscription;
                z6 = zSignature;
                c14023l2 = c14023l;
                abstractC1186lFirebase = C13708l.f26763l;
            } else {
                List list13 = c16830l2.f32858l;
                AbstractC12832l.loadAd(4, "initialCapacity");
                objArrCopyOf = new Object[4];
                it = list13.iterator();
                i5 = 0;
                while (it.hasNext()) {
                    C5388l c5388l12 = (C5388l) it.next();
                    String str1112 = c5388l12.f11535l;
                    int i211117 = iSubscription;
                    bundle2 = c5388l12.f11537l;
                    if (bundle2 != null) {
                        i7 = bundle2.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                    } else {
                        i7 = 0;
                    }
                    C14023l c14023l14 = c14023l;
                    c3915l = new C3915l(i7, c5388l12.f11533l);
                    if (bundle2 == null) {
                        bundle3 = Bundle.EMPTY;
                    } else {
                        bundle3 = bundle2;
                    }
                    c3915l.amazon(new C12417l(str1112, bundle3));
                    c3915l.billing = c5388l12.f11534l;
                    c3915l.admob = true;
                    if (bundle2 != null) {
                        c3915l.mopub = new Bundle(bundle2);
                    }
                    if (bundle2 != null) {
                        string = bundle2.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
                    } else {
                        string = null;
                    }
                    if (string != null) {
                        uri = Uri.parse(string);
                        scheme = uri.getScheme();
                        if (Objects.equals(scheme, "content")) {
                            c3915l.loadAd(uri);
                        } else {
                            c3915l.loadAd(uri);
                        }
                    }
                    C14869l c14869lYandex11 = c3915l.yandex();
                    int i211118 = i5 + 1;
                    iLoadAd = AbstractC3594l.loadAd(objArrCopyOf.length, i211118);
                    if (iLoadAd > objArrCopyOf.length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iLoadAd);
                    }
                    objArrCopyOf[i5] = c14869lYandex11;
                    i5 = i211118;
                    iSubscription = i211117;
                    it = it;
                    zSignature = zSignature;
                    c14023l = c14023l14;
                }
                i6 = iSubscription;
                z6 = zSignature;
                c14023l2 = c14023l;
                abstractC1186lFirebase = C14869l.firebase(AbstractC1186l.vip(i5, objArrCopyOf), c16616l, bundle);
            }
            c14023l3 = c14023l2;
        }
        Context context6 = this.yandex;
        C14723l c14723lMetrica6 = AbstractC18585l.metrica(c16830l2, context6);
        if (c16830l2 == null) {
            i8 = c16830l2.f32853l;
            int i211119 = c16830l2.f32859l;
            CharSequence charSequence9 = c16830l2.f32850l;
            Bundle bundle111 = c16830l2.f32860l;
            c16616l2 = c16616l;
            if (i8 == 7) {
            }
            long jCrashlytics13 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j5);
            long jLoadAd111 = AbstractC18585l.loadAd(c16830l2, c8937l2, j5);
            AbstractC1186l abstractC1186l14 = abstractC1186lFirebase;
            int iLoadAd13 = AbstractC8672l.loadAd(AbstractC18585l.loadAd(c16830l2, c8937l2, j5), AbstractC18585l.amazon(c8937l2));
            long jLoadAd112 = AbstractC18585l.loadAd(c16830l2, c8937l2, j5) - AbstractC18585l.crashlytics(c16830l2, c8937l2, j5);
            if (c8937l2 == 0) {
                z7 = false;
            } else {
                z7 = true;
            }
            if (c16830l2 == null) {
                c1372l = C1372l.amazon;
            } else {
                c1372l = new C1372l(c16830l2.f32856l);
            }
            if (c13052l2 == null) {
                c13736l = C13736l.subs;
            } else {
                c13736l = (C13736l) c13052l2.purchase;
            }
            C13736l c13736l12 = c13736l;
            if (c16830l2 == null) {
                switch (c16830l2.f32853l) {
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 9:
                    case 10:
                    case 11:
                        z8 = true;
                        break;
                    case 7:
                    case 8:
                    default:
                        z8 = false;
                        break;
                }
            } else {
                z8 = false;
            }
            if (c16830l2 == null) {
                i9 = 1;
            } else {
                i10 = c16830l2.f32853l;
                jAmazon = AbstractC18585l.amazon(c8937l2);
                if (jAmazon == -9223372036854775807L) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                switch (i10) {
                    case 1:
                        if (z9) {
                            i9 = 4;
                            break;
                        }
                    case 0:
                    case 7:
                    case 8:
                        i9 = 1;
                        break;
                    case 2:
                        if (z9) {
                            i9 = 4;
                            break;
                        }
                    case 3:
                        i9 = 3;
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 9:
                    case 10:
                    case 11:
                        i9 = 2;
                        break;
                    default:
                        throw new C14469l("Invalid state of PlaybackStateCompat: " + i10);
                }
            }
            int i2111110 = i9;
            if (c16830l2 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (c13052l2 == null) {
                c2848lPurchase = C2848l.purchase;
            } else {
                if (c13052l2.yandex == 2) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                C12676l c12676l11 = new C12676l(i11);
                c12676l11.amazon = c13052l2.crashlytics;
                String str1113 = (String) c13052l2.billing;
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                AbstractC12442l.admob(z11);
                c12676l11.purchase = str1113;
                c2848lPurchase = c12676l11.purchase();
            }
            C2848l c2848l11 = c2848lPurchase;
            if (c13052l2 == null) {
                i12 = 0;
            } else {
                i12 = c13052l2.amazon;
            }
            if (c13052l2 == null) {
                z12 = false;
            } else {
                z12 = true;
            }
            C1908l c1908l13 = (C1908l) c1424l2.f3603l;
            long j11111 = c1908l13.applovin;
            long j11112 = c1908l13.appmetrica;
            long j11113 = c1908l13.inmobi;
            Bundle bundle112 = (Bundle) c5908l.f12454l;
            C1372l c1372l12 = c1372l;
            if (iMetrica >= c10444l.metrica()) {
                c2427l2 = null;
            } else {
                c2427l2 = c10444l.subscription(iMetrica).yandex;
            }
            C9009l c9009l11 = new C9009l(m289l(iMetrica, c2427l2, jCrashlytics13, z7), z7, SystemClock.elapsedRealtime(), jAmazon2, jLoadAd111, iLoadAd13, jLoadAd112, -9223372036854775807L, jAmazon2, jLoadAd111);
            C4262l c4262l11 = C9009l.firebase;
            int i2111111 = i6;
            c1908l = new C1908l(c14723lMetrica6, 0, c9009l11, c4262l11, c4262l11, 0, c1372l12, i2111111, z6, C15074l.amazon, c10444l, 0, c3852l8, 1.0f, 1.0f, c13736l12, 0, C16684l.amazon, c2848l11, i12, z12, z8, 1, 0, i2111110, z10, false, c3852l, j11111, j11112, j11113, C1047l.loadAd, C4970l.f10152volatile);
            C1424l c1424l13 = new C1424l(c1908l, c14023l3, c16616l2, abstractC1186l14, bundle112, c18503l);
            c5908l2 = this.remoteconfig;
            c1424l = this.startapp;
            j4 = c16811l.f32841l;
            zStartapp = ((C1908l) c1424l.f3603l).isPro.startapp();
            boolean zStartapp12 = c10444l.startapp();
            if (!zStartapp) {
                if (zStartapp) {
                    c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                    c2427lSubscription.getClass();
                    c10475l2 = c10444l.billing;
                    if (c10475l2 == null) {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    } else {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    }
                    if (z13) {
                        num2 = 4;
                        num = 3;
                    } else if (c2427lSubscription.equals(c1908l.subscription())) {
                        jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                        jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                        if (jCrashlytics2 == 0) {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        } else {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        }
                        num = num3;
                    } else {
                        z14 = true;
                        num = 1;
                        num2 = 0;
                    }
                    z14 = true;
                } else {
                    c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                    c2427lSubscription.getClass();
                    c10475l2 = c10444l.billing;
                    if (c10475l2 == null) {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    } else {
                        i13 = 0;
                        while (true) {
                            abstractC1186l2 = c10444l.purchase;
                            if (i13 >= abstractC1186l2.size()) {
                                z13 = false;
                            } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                                z13 = true;
                            } else {
                                i13++;
                            }
                        }
                    }
                    if (z13) {
                        num2 = 4;
                        num = 3;
                    } else if (c2427lSubscription.equals(c1908l.subscription())) {
                        jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                        jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                        if (jCrashlytics2 == 0) {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        } else {
                            if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        }
                        num = num3;
                    } else {
                        z14 = true;
                        num = 1;
                        num2 = 0;
                    }
                    z14 = true;
                }
            } else if (zStartapp) {
                c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                c2427lSubscription.getClass();
                c10475l2 = c10444l.billing;
                if (c10475l2 == null) {
                    i13 = 0;
                    while (true) {
                        abstractC1186l2 = c10444l.purchase;
                        if (i13 >= abstractC1186l2.size()) {
                            z13 = false;
                        } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                            z13 = true;
                        } else {
                            i13++;
                        }
                    }
                } else {
                    i13 = 0;
                    while (true) {
                        abstractC1186l2 = c10444l.purchase;
                        if (i13 >= abstractC1186l2.size()) {
                            z13 = false;
                        } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                            z13 = true;
                        } else {
                            i13++;
                        }
                    }
                }
                if (z13) {
                    num2 = 4;
                    num = 3;
                } else if (c2427lSubscription.equals(c1908l.subscription())) {
                    jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                    jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                    if (jCrashlytics2 == 0) {
                        if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    } else {
                        if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    }
                    num = num3;
                } else {
                    z14 = true;
                    num = 1;
                    num2 = 0;
                }
                z14 = true;
            } else {
                c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                c2427lSubscription.getClass();
                c10475l2 = c10444l.billing;
                if (c10475l2 == null) {
                    i13 = 0;
                    while (true) {
                        abstractC1186l2 = c10444l.purchase;
                        if (i13 >= abstractC1186l2.size()) {
                            z13 = false;
                        } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                            z13 = true;
                        } else {
                            i13++;
                        }
                    }
                } else {
                    i13 = 0;
                    while (true) {
                        abstractC1186l2 = c10444l.purchase;
                        if (i13 >= abstractC1186l2.size()) {
                            z13 = false;
                        } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                            z13 = true;
                        } else {
                            i13++;
                        }
                    }
                }
                if (z13) {
                    num2 = 4;
                    num = 3;
                } else if (c2427lSubscription.equals(c1908l.subscription())) {
                    jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                    jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                    if (jCrashlytics2 == 0) {
                        if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    } else {
                        if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    }
                    num = num3;
                } else {
                    z14 = true;
                    num = 1;
                    num2 = 0;
                }
                z14 = true;
            }
            Pair pairCreate12 = Pair.create(num2, num);
            m339l(z, c5908l, true, c1424l13, (Integer) pairCreate12.first, (Integer) pairCreate12.second);
            if (this.metrica) {
                this.metrica = false;
                if (Looper.myLooper() != c16811l.f32839l.getLooper()) {
                    z14 = false;
                }
                AbstractC12442l.subscription(z14);
                c16811l.f32840l.getClass();
            }
        }
        c16616l2 = c16616l;
        c18503l = null;
        long jCrashlytics14 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j5);
        long jLoadAd113 = AbstractC18585l.loadAd(c16830l2, c8937l2, j5);
        AbstractC1186l abstractC1186l15 = abstractC1186lFirebase;
        int iLoadAd14 = AbstractC8672l.loadAd(AbstractC18585l.loadAd(c16830l2, c8937l2, j5), AbstractC18585l.amazon(c8937l2));
        long jLoadAd114 = AbstractC18585l.loadAd(c16830l2, c8937l2, j5) - AbstractC18585l.crashlytics(c16830l2, c8937l2, j5);
        if (c8937l2 == 0) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (c16830l2 == null) {
            c1372l = C1372l.amazon;
        } else {
            c1372l = new C1372l(c16830l2.f32856l);
        }
        if (c13052l2 == null) {
            c13736l = C13736l.subs;
        } else {
            c13736l = (C13736l) c13052l2.purchase;
        }
        C13736l c13736l13 = c13736l;
        if (c16830l2 == null) {
            switch (c16830l2.f32853l) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 9:
                case 10:
                case 11:
                    z8 = true;
                    break;
                case 7:
                case 8:
                default:
                    z8 = false;
                    break;
            }
        } else {
            z8 = false;
        }
        if (c16830l2 == null) {
            i9 = 1;
        } else {
            i10 = c16830l2.f32853l;
            jAmazon = AbstractC18585l.amazon(c8937l2);
            if (jAmazon == -9223372036854775807L) {
                z9 = false;
            } else {
                z9 = true;
            }
            switch (i10) {
                case 1:
                    if (z9) {
                        i9 = 4;
                        break;
                    }
                case 0:
                case 7:
                case 8:
                    i9 = 1;
                    break;
                case 2:
                    if (z9) {
                        i9 = 4;
                        break;
                    }
                case 3:
                    i9 = 3;
                    break;
                case 4:
                case 5:
                case 6:
                case 9:
                case 10:
                case 11:
                    i9 = 2;
                    break;
                default:
                    throw new C14469l("Invalid state of PlaybackStateCompat: " + i10);
            }
        }
        int i2111112 = i9;
        if (c16830l2 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (c13052l2 == null) {
            c2848lPurchase = C2848l.purchase;
        } else {
            if (c13052l2.yandex == 2) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            C12676l c12676l12 = new C12676l(i11);
            c12676l12.amazon = c13052l2.crashlytics;
            String str1114 = (String) c13052l2.billing;
            if (i11 == 0) {
                z11 = true;
            } else {
                z11 = true;
            }
            AbstractC12442l.admob(z11);
            c12676l12.purchase = str1114;
            c2848lPurchase = c12676l12.purchase();
        }
        C2848l c2848l12 = c2848lPurchase;
        if (c13052l2 == null) {
            i12 = 0;
        } else {
            i12 = c13052l2.amazon;
        }
        if (c13052l2 == null) {
            z12 = false;
        } else {
            z12 = true;
        }
        C1908l c1908l14 = (C1908l) c1424l2.f3603l;
        long j11114 = c1908l14.applovin;
        long j11115 = c1908l14.appmetrica;
        long j11116 = c1908l14.inmobi;
        Bundle bundle113 = (Bundle) c5908l.f12454l;
        C1372l c1372l13 = c1372l;
        if (iMetrica >= c10444l.metrica()) {
            c2427l2 = null;
        } else {
            c2427l2 = c10444l.subscription(iMetrica).yandex;
        }
        C9009l c9009l12 = new C9009l(m289l(iMetrica, c2427l2, jCrashlytics14, z7), z7, SystemClock.elapsedRealtime(), jAmazon2, jLoadAd113, iLoadAd14, jLoadAd114, -9223372036854775807L, jAmazon2, jLoadAd113);
        C4262l c4262l12 = C9009l.firebase;
        int i2111113 = i6;
        c1908l = new C1908l(c14723lMetrica6, 0, c9009l12, c4262l12, c4262l12, 0, c1372l13, i2111113, z6, C15074l.amazon, c10444l, 0, c3852l8, 1.0f, 1.0f, c13736l13, 0, C16684l.amazon, c2848l12, i12, z12, z8, 1, 0, i2111112, z10, false, c3852l, j11114, j11115, j11116, C1047l.loadAd, C4970l.f10152volatile);
        C1424l c1424l14 = new C1424l(c1908l, c14023l3, c16616l2, abstractC1186l15, bundle113, c18503l);
        c5908l2 = this.remoteconfig;
        c1424l = this.startapp;
        j4 = c16811l.f32841l;
        zStartapp = ((C1908l) c1424l.f3603l).isPro.startapp();
        boolean zStartapp13 = c10444l.startapp();
        if (!zStartapp) {
            if (zStartapp) {
                c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                c2427lSubscription.getClass();
                c10475l2 = c10444l.billing;
                if (c10475l2 == null) {
                    i13 = 0;
                    while (true) {
                        abstractC1186l2 = c10444l.purchase;
                        if (i13 >= abstractC1186l2.size()) {
                            z13 = false;
                        } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                            z13 = true;
                        } else {
                            i13++;
                        }
                    }
                } else {
                    i13 = 0;
                    while (true) {
                        abstractC1186l2 = c10444l.purchase;
                        if (i13 >= abstractC1186l2.size()) {
                            z13 = false;
                        } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                            z13 = true;
                        } else {
                            i13++;
                        }
                    }
                }
                if (z13) {
                    num2 = 4;
                    num = 3;
                } else if (c2427lSubscription.equals(c1908l.subscription())) {
                    jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                    jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                    if (jCrashlytics2 == 0) {
                        if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    } else {
                        if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    }
                    num = num3;
                } else {
                    z14 = true;
                    num = 1;
                    num2 = 0;
                }
                z14 = true;
            } else {
                c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
                c2427lSubscription.getClass();
                c10475l2 = c10444l.billing;
                if (c10475l2 == null) {
                    i13 = 0;
                    while (true) {
                        abstractC1186l2 = c10444l.purchase;
                        if (i13 >= abstractC1186l2.size()) {
                            z13 = false;
                        } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                            z13 = true;
                        } else {
                            i13++;
                        }
                    }
                } else {
                    i13 = 0;
                    while (true) {
                        abstractC1186l2 = c10444l.purchase;
                        if (i13 >= abstractC1186l2.size()) {
                            z13 = false;
                        } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                            z13 = true;
                        } else {
                            i13++;
                        }
                    }
                }
                if (z13) {
                    num2 = 4;
                    num = 3;
                } else if (c2427lSubscription.equals(c1908l.subscription())) {
                    jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                    jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                    if (jCrashlytics2 == 0) {
                        if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    } else {
                        if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    }
                    num = num3;
                } else {
                    z14 = true;
                    num = 1;
                    num2 = 0;
                }
                z14 = true;
            }
        } else if (zStartapp) {
            c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
            c2427lSubscription.getClass();
            c10475l2 = c10444l.billing;
            if (c10475l2 == null) {
                i13 = 0;
                while (true) {
                    abstractC1186l2 = c10444l.purchase;
                    if (i13 >= abstractC1186l2.size()) {
                        z13 = false;
                    } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                        z13 = true;
                    } else {
                        i13++;
                    }
                }
            } else {
                i13 = 0;
                while (true) {
                    abstractC1186l2 = c10444l.purchase;
                    if (i13 >= abstractC1186l2.size()) {
                        z13 = false;
                    } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                        z13 = true;
                    } else {
                        i13++;
                    }
                }
            }
            if (z13) {
                num2 = 4;
                num = 3;
            } else if (c2427lSubscription.equals(c1908l.subscription())) {
                jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                if (jCrashlytics2 == 0) {
                    if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                        num2 = 5;
                    } else {
                        num2 = null;
                    }
                    num3 = null;
                } else {
                    if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                        num2 = 5;
                    } else {
                        num2 = null;
                    }
                    num3 = null;
                }
                num = num3;
            } else {
                z14 = true;
                num = 1;
                num2 = 0;
            }
            z14 = true;
        } else {
            c2427lSubscription = ((C1908l) c1424l.f3603l).subscription();
            c2427lSubscription.getClass();
            c10475l2 = c10444l.billing;
            if (c10475l2 == null) {
                i13 = 0;
                while (true) {
                    abstractC1186l2 = c10444l.purchase;
                    if (i13 >= abstractC1186l2.size()) {
                        z13 = false;
                    } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                        z13 = true;
                    } else {
                        i13++;
                    }
                }
            } else {
                i13 = 0;
                while (true) {
                    abstractC1186l2 = c10444l.purchase;
                    if (i13 >= abstractC1186l2.size()) {
                        z13 = false;
                    } else if (c2427lSubscription.equals(((C10475l) abstractC1186l2.get(i13)).yandex)) {
                        z13 = true;
                    } else {
                        i13++;
                    }
                }
            }
            if (z13) {
                num2 = 4;
                num = 3;
            } else if (c2427lSubscription.equals(c1908l.subscription())) {
                jCrashlytics = AbstractC18585l.crashlytics((C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, j4);
                jCrashlytics2 = AbstractC18585l.crashlytics(c16830l2, c8937l2, j4);
                if (jCrashlytics2 == 0) {
                    if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                        num2 = 5;
                    } else {
                        num2 = null;
                    }
                    num3 = null;
                } else {
                    if (Math.abs(jCrashlytics - jCrashlytics2) > 100) {
                        num2 = 5;
                    } else {
                        num2 = null;
                    }
                    num3 = null;
                }
                num = num3;
            } else {
                z14 = true;
                num = 1;
                num2 = 0;
            }
            z14 = true;
        }
        Pair pairCreate13 = Pair.create(num2, num);
        m339l(z, c5908l, true, c1424l14, (Integer) pairCreate13.first, (Integer) pairCreate13.second);
        if (this.metrica) {
            this.metrica = false;
            if (Looper.myLooper() != c16811l.f32839l.getLooper()) {
                z14 = false;
            }
            AbstractC12442l.subscription(z14);
            c16811l.f32840l.getClass();
        }
    }

    @Override // defpackage.InterfaceC11345l
    public final void metrica(C2427l c2427l, long j) {
        mo327l(0, j, AbstractC1186l.isVip(c2427l));
    }

    @Override // defpackage.InterfaceC11345l
    public final int mopub() {
        return ((C1908l) this.startapp.f3603l).admob;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final void mo346native(int i, int i2, List list) {
        AbstractC12442l.admob(i >= 0 && i <= i2);
        int iMetrica = ((C10444l) ((C1908l) this.startapp.f3603l).isPro).metrica();
        if (i > iMetrica) {
            return;
        }
        int iMin = Math.min(i2, iMetrica);
        mo297default(iMin, list);
        mo359throw(i, iMin);
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: new, reason: not valid java name */
    public final long mo347new() {
        return ((C1908l) this.startapp.f3603l).crashlytics.purchase;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void mo348package(int i, int i2) {
        C2848l c2848lInmobi = inmobi();
        int i3 = c2848lInmobi.loadAd;
        int i4 = c2848lInmobi.crashlytics;
        if (i3 <= i && (i4 == 0 || i <= i4)) {
            C1908l c1908lCrashlytics = ((C1908l) this.startapp.f3603l).crashlytics(i, mo329l());
            C1424l c1424l = this.startapp;
            m326l(new C1424l(c1908lCrashlytics, (C14023l) c1424l.f3602l, (C16616l) c1424l.f3601l, (AbstractC1186l) c1424l.f3605l, (Bundle) c1424l.f3604l, (C18503l) null), null, null);
        }
        ((C10730l) this.subs.f35934l).yandex.setVolumeTo(i, i2);
    }

    @Override // defpackage.InterfaceC11345l
    public final void premium() {
        m337l(mo304implements(), 0L);
    }

    @Override // defpackage.InterfaceC11345l
    public final long pro() {
        return getDuration();
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public final void mo350protected() {
        mo296continue(true);
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final C3852l mo351public() {
        return ((C1908l) this.startapp.f3603l).remoteconfig;
    }

    @Override // defpackage.InterfaceC11345l
    public final int purchase() {
        return ((C1908l) this.startapp.f3603l).signatures;
    }

    @Override // defpackage.InterfaceC11345l
    public final void release() {
        Messenger messenger;
        if (this.firebase) {
            return;
        }
        this.firebase = true;
        C5138l c5138l = this.isPro;
        if (c5138l != null) {
            C9557l c9557l = (C9557l) c5138l.f11181l;
            C13568l c13568l = c9557l.billing;
            if (c13568l != null && (messenger = c9557l.mopub) != null) {
                try {
                    c13568l.subscription(7, null, messenger);
                } catch (RemoteException unused) {
                    AbstractC6427l.firebase("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            c9557l.loadAd.disconnect();
            this.isPro = null;
        }
        C18396l c18396l = this.subs;
        if (c18396l != null) {
            Set set = (Set) c18396l.f35933l;
            C17977l c17977l = this.purchase;
            if (set.remove(c17977l)) {
                try {
                    ((C10730l) c18396l.f35934l).crashlytics(c17977l);
                    c17977l.amazon(null);
                } catch (Throwable th) {
                    c17977l.amazon(null);
                    throw th;
                }
            } else {
                AbstractC6427l.vip("MediaControllerCompat", "the callback has never been registered");
            }
            c17977l.amazon.removeCallbacksAndMessages(null);
            this.subs = null;
        }
        this.smaato = false;
        this.amazon.amazon();
    }

    public final void remoteconfig(int i, List list) {
        ArrayList arrayList = new ArrayList();
        RunnableC4985l runnableC4985l = new RunnableC4985l(this, new AtomicInteger(0), list, arrayList, i, 0);
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = ((C2427l) list.get(i2)).amazon.firebase;
            if (bArr == null) {
                arrayList.add(null);
                runnableC4985l.run();
            } else {
                ListenableFuture listenableFutureMo1119try = this.billing.mo1119try(bArr);
                arrayList.add(listenableFutureMo1119try);
                Handler handler = this.loadAd.f32839l;
                Objects.requireNonNull(handler);
                listenableFutureMo1119try.yandex(runnableC4985l, new ExecutorC10366l(handler, 1));
            }
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: return, reason: not valid java name */
    public final void mo352return(boolean z) {
        appmetrica(1, z);
    }

    @Override // defpackage.InterfaceC11345l
    public final float signatures() {
        return 1.0f;
    }

    @Override // defpackage.InterfaceC11345l
    public final void smaato(int i, long j) {
        m337l(i, j);
    }

    @Override // defpackage.InterfaceC11345l
    public final boolean startapp() {
        return ((C1908l) this.startapp.f3603l).license;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final long mo353static() {
        return mo317l();
    }

    @Override // defpackage.InterfaceC11345l
    public final void stop() {
        C1908l c1908l = (C1908l) this.startapp.f3603l;
        if (c1908l.signatures == 1) {
            return;
        }
        C9009l c9009l = c1908l.crashlytics;
        C4262l c4262l = c9009l.yandex;
        boolean z = c9009l.loadAd;
        long j = c9009l.amazon;
        long j2 = c4262l.billing;
        C1908l c1908lIsPro = c1908l.isPro(new C9009l(c4262l, z, SystemClock.elapsedRealtime(), j, j2, AbstractC8672l.loadAd(j2, j), 0L, -9223372036854775807L, j, j2));
        C1908l c1908l2 = (C1908l) this.startapp.f3603l;
        if (c1908l2.signatures != 1) {
            c1908lIsPro = c1908lIsPro.billing(1, c1908l2.yandex);
        }
        C1908l c1908l3 = c1908lIsPro;
        C1424l c1424l = this.startapp;
        m326l(new C1424l(c1908l3, (C14023l) c1424l.f3602l, (C16616l) c1424l.f3601l, (AbstractC1186l) c1424l.f3605l, (Bundle) c1424l.f3604l, (C18503l) null), null, null);
        this.subscription = false;
        ((MediaController.TransportControls) this.subs.appmetrica().f25776l).stop();
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final int mo354strictfp() {
        return -1;
    }

    @Override // defpackage.InterfaceC11345l
    public final boolean subs() {
        return ((C1908l) this.startapp.f3603l).crashlytics.loadAd;
    }

    @Override // defpackage.InterfaceC11345l
    public final int subscription() {
        return ((C1908l) this.startapp.f3603l).crashlytics.billing;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final void mo355super(int i) {
        int iAdmob = admob() - 1;
        if (iAdmob >= inmobi().loadAd) {
            C1908l c1908lCrashlytics = ((C1908l) this.startapp.f3603l).crashlytics(iAdmob, mo329l());
            C1424l c1424l = this.startapp;
            m326l(new C1424l(c1908lCrashlytics, (C14023l) c1424l.f3602l, (C16616l) c1424l.f3601l, (AbstractC1186l) c1424l.f3605l, (Bundle) c1424l.f3604l, (C18503l) null), null, null);
        }
        ((C10730l) this.subs.f35934l).yandex.adjustVolume(-1, i);
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final C14723l mo356switch() {
        return ((C1908l) this.startapp.f3603l).yandex;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void mo357synchronized(int i) {
        int iAdmob = admob();
        int i2 = inmobi().crashlytics;
        if (i2 == 0 || iAdmob + 1 <= i2) {
            C1908l c1908lCrashlytics = ((C1908l) this.startapp.f3603l).crashlytics(iAdmob + 1, mo329l());
            C1424l c1424l = this.startapp;
            m326l(new C1424l(c1908lCrashlytics, (C14023l) c1424l.f3602l, (C16616l) c1424l.f3601l, (AbstractC1186l) c1424l.f3605l, (Bundle) c1424l.f3604l, (C18503l) null), null, null);
        }
        ((C10730l) this.subs.f35934l).yandex.adjustVolume(1, i);
    }

    @Override // defpackage.InterfaceC11345l
    public final long tapsense() {
        return ((C1908l) this.startapp.f3603l).inmobi;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final C16684l mo358this() {
        AbstractC6427l.vip("MCImplLegacy", "Session doesn't support getting Cue");
        return C16684l.amazon;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final void mo359throw(int i, int i2) {
        AbstractC12442l.admob(i >= 0 && i2 >= i);
        int iMetrica = mo338l().metrica();
        int iMin = Math.min(i2, iMetrica);
        if (i >= iMetrica || i == iMin) {
            return;
        }
        C10444l c10444l = (C10444l) ((C1908l) this.startapp.f3603l).isPro;
        c10444l.getClass();
        C16971l c16971l = new C16971l(4);
        AbstractC1186l abstractC1186l = c10444l.purchase;
        c16971l.amazon(abstractC1186l.subList(0, i));
        c16971l.amazon(abstractC1186l.subList(iMin, abstractC1186l.size()));
        C10444l c10444l2 = new C10444l(c16971l.mopub(), c10444l.billing);
        int iMo304implements = mo304implements();
        int i3 = iMin - i;
        if (iMo304implements >= i) {
            iMo304implements = iMo304implements < iMin ? -1 : iMo304implements - i3;
        }
        if (iMo304implements == -1) {
            iMo304implements = AbstractC15323l.isPro(i, 0, c10444l2.metrica() - 1);
            AbstractC6427l.vip("MCImplLegacy", "Currently playing item is removed. Assumes item at " + iMo304implements + " is the new current item");
        }
        C1908l c1908lRemoteconfig = ((C1908l) this.startapp.f3603l).remoteconfig(c10444l2, iMo304implements);
        C1424l c1424l = this.startapp;
        m326l(new C1424l(c1908lRemoteconfig, (C14023l) c1424l.f3602l, (C16616l) c1424l.f3601l, (AbstractC1186l) c1424l.f3605l, (Bundle) c1424l.f3604l, (C18503l) null), null, null);
        if (this.subscription) {
            while (i < iMin && i < ((List) this.remoteconfig.f12459l).size()) {
                this.subs.m4527strictfp(((C10517l) ((List) this.remoteconfig.f12459l).get(i)).f21399l);
                i++;
            }
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final void mo360throws() {
        mo355super(1);
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public final void mo361transient(C3852l c3852l) {
        AbstractC6427l.vip("MCImplLegacy", "Session doesn't support setting playlist metadata");
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final int mo362try() {
        return -1;
    }

    @Override // defpackage.InterfaceC11345l
    public final C16616l vip() {
        return (C16616l) this.startapp.f3601l;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final void mo363volatile() {
        mo296continue(false);
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: while, reason: not valid java name */
    public final int mo364while() {
        return -1;
    }

    @Override // defpackage.InterfaceC11345l
    public final void yandex() {
        C1908l c1908l = (C1908l) this.startapp.f3603l;
        if (c1908l.signatures != 1) {
            return;
        }
        C1908l c1908lBilling = c1908l.billing(c1908l.isPro.startapp() ? 4 : 2, null);
        C1424l c1424l = this.startapp;
        m326l(new C1424l(c1908lBilling, (C14023l) c1424l.f3602l, (C16616l) c1424l.f3601l, (AbstractC1186l) c1424l.f3605l, (Bundle) c1424l.f3604l, (C18503l) null), null, null);
        if (m287abstract(this.startapp)) {
            m308l();
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final void mo349private(C4970l c4970l) {
    }
}
