package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: lَّؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC4841l extends Binder implements InterfaceC4725l {
    public static final /* synthetic */ int smaato = 0;
    public C1394l admob;
    public final C12014l billing;
    public SurfaceHolderC12693l firebase;
    public int isPro;
    public final Set mopub;
    public final WeakReference purchase;
    public C15333l subs;

    public BinderC4841l(C3726l c3726l) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.purchase = new WeakReference(c3726l);
        this.billing = new C12014l(c3726l);
        this.mopub = DesugarCollections.synchronizedSet(new HashSet());
        this.admob = C1394l.f3552l;
        this.subs = C15333l.f29966l;
    }

    /* JADX INFO: renamed from: lِۙٞ, reason: contains not printable characters */
    public static void m1620l(C3726l c3726l, C6499l c6499l, int i, C5159l c5159l) {
        try {
            InterfaceC3270l interfaceC3270l = c6499l.amazon;
            interfaceC3270l.getClass();
            interfaceC3270l.remoteconfig(i, c5159l);
            c3726l.crashlytics.yandex(true, true);
        } catch (RemoteException e) {
            AbstractC6427l.metrica("MediaSessionStub", "Failed to send result to controller " + c6499l, e);
        }
    }

    /* JADX INFO: renamed from: lٔ٘۠, reason: contains not printable characters */
    public static C6536l m1621l(InterfaceC18679l interfaceC18679l) {
        return new C6536l(19, new C6536l(20, interfaceC18679l));
    }

    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public static ListenableFuture m1622l(C3726l c3726l, C6499l c6499l, int i, InterfaceC3266l interfaceC3266l, InterfaceC18679l interfaceC18679l) {
        if (c3726l.metrica()) {
            return C5113l.f11111l;
        }
        ListenableFuture listenableFuture = (ListenableFuture) interfaceC3266l.admob(c3726l, c6499l, i);
        C1090l c1090l = new C1090l();
        listenableFuture.yandex(new RunnableC4063l(c3726l, c1090l, interfaceC18679l, listenableFuture, 14), EnumC1535l.f3808l);
        return c1090l;
    }

    @Override // defpackage.InterfaceC4725l
    public final void Signature(InterfaceC1087l interfaceC1087l, int i, Bundle bundle, long j) {
        C6499l c6499lLicense;
        if (interfaceC1087l == null || bundle == null || (c6499lLicense = this.billing.license(interfaceC1087l.asBinder())) == null) {
            return;
        }
        try {
            m1623l(c6499lLicense, i, 31, new C11123l(new C15263l(new C9435l(j, C2427l.yandex(c6499lLicense.crashlytics, bundle)), new C6541l(15), 7), 1));
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: abstract */
    public final void mo424abstract(InterfaceC1087l interfaceC1087l, int i, int i2, int i3) {
        if (interfaceC1087l == null || i2 < 0 || i3 < i2) {
            return;
        }
        m1628l(interfaceC1087l, i, 20, new C6536l(19, new C10561l(this, i2, i3)));
    }

    @Override // defpackage.InterfaceC4725l
    public final void advert(InterfaceC1087l interfaceC1087l, int i) {
        if (interfaceC1087l == null) {
            return;
        }
        m1628l(interfaceC1087l, i, 24, m1621l(new C6541l(11)));
    }

    @Override // defpackage.InterfaceC4725l
    public final void applovin(InterfaceC1087l interfaceC1087l, int i) {
        C6499l c6499lLicense;
        if (interfaceC1087l == null || (c6499lLicense = this.billing.license(interfaceC1087l.asBinder())) == null) {
            return;
        }
        m1625l(c6499lLicense, i);
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: case */
    public final void mo425case(InterfaceC1087l interfaceC1087l, int i, Bundle bundle) {
        if (interfaceC1087l == null || bundle == null) {
            return;
        }
        try {
            m1628l(interfaceC1087l, i, 29, m1621l(new C15263l(this, C4970l.loadAd(bundle), 2)));
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e);
        }
    }

    public final void crashlytics(InterfaceC1087l interfaceC1087l, C6499l c6499l) {
        if (interfaceC1087l == null) {
            AbstractC2632l.purchase(interfaceC1087l);
            return;
        }
        C3726l c3726l = (C3726l) this.purchase.get();
        if (c3726l == null || c3726l.metrica()) {
            AbstractC2632l.purchase(interfaceC1087l);
        } else {
            this.mopub.add(c6499l);
            AbstractC15323l.m3966final(c3726l.smaato, new RunnableC4063l(this, c6499l, c3726l, interfaceC1087l, 13));
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: default */
    public final void mo426default(InterfaceC1087l interfaceC1087l, int i, int i2) {
        if (interfaceC1087l == null) {
            return;
        }
        m1628l(interfaceC1087l, i, 34, m1621l(new C10503l(i2, 5)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: extends */
    public final void mo427extends(InterfaceC1087l interfaceC1087l, int i, float f) {
        if (interfaceC1087l == null || f < 0.0f || f > 1.0f) {
            return;
        }
        m1628l(interfaceC1087l, i, 24, m1621l(new C4605l(4, f)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: final */
    public final void mo428final(InterfaceC1087l interfaceC1087l, int i) {
        C6499l c6499lLicense;
        if (interfaceC1087l == null || (c6499lLicense = this.billing.license(interfaceC1087l.asBinder())) == null) {
            return;
        }
        m1623l(c6499lLicense, i, 11, m1621l(new C6541l(1)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: for */
    public final void mo429for(InterfaceC1087l interfaceC1087l, int i) {
        if (interfaceC1087l == null) {
            return;
        }
        m1628l(interfaceC1087l, i, 26, m1621l(new C6541l(0)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: goto */
    public final void mo430goto(InterfaceC1087l interfaceC1087l, int i, int i2) {
        if (interfaceC1087l == null) {
            return;
        }
        m1628l(interfaceC1087l, i, 34, m1621l(new C10503l(i2, 4)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: implements */
    public final void mo431implements(InterfaceC1087l interfaceC1087l, int i, IBinder iBinder) {
        C6499l c6499lLicense;
        if (interfaceC1087l == null || iBinder == null || (c6499lLicense = this.billing.license(interfaceC1087l.asBinder())) == null) {
            return;
        }
        try {
            AbstractC1186l abstractC1186lYandex = BinderC11373l.yandex(iBinder);
            C16971l c16971lMetrica = AbstractC1186l.metrica();
            for (int i2 = 0; i2 < abstractC1186lYandex.size(); i2++) {
                Bundle bundle = (Bundle) abstractC1186lYandex.get(i2);
                bundle.getClass();
                c16971lMetrica.crashlytics(C2427l.yandex(c6499lLicense.crashlytics, bundle));
            }
            int i3 = 8;
            m1623l(c6499lLicense, i, 20, new C11123l(new C15263l(new C18696l(2, c16971lMetrica.mopub()), new C6541l(i3), i3), 1));
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: instanceof */
    public final void mo432instanceof(InterfaceC1087l interfaceC1087l, int i, int i2) {
        if (interfaceC1087l == null || i2 < 0) {
            return;
        }
        m1628l(interfaceC1087l, i, 20, new C6536l(19, new C3959l(this, i2, 4)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: interface */
    public final void mo433interface(InterfaceC1087l interfaceC1087l, int i, int i2, Bundle bundle) {
        C6499l c6499lLicense;
        if (interfaceC1087l == null || bundle == null || i2 < 0 || (c6499lLicense = this.billing.license(interfaceC1087l.asBinder())) == null) {
            return;
        }
        try {
            int i3 = 1;
            m1623l(c6499lLicense, i, 20, new C11123l(new C15263l(new C14896l(0, C2427l.yandex(c6499lLicense.crashlytics, bundle)), new C3959l(this, i2, i3), 8), i3));
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    public final void isPro(InterfaceC1087l interfaceC1087l, final int i, final C12417l c12417l, final int i2, final InterfaceC3266l interfaceC3266l) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final C3726l c3726l = (C3726l) this.purchase.get();
            if (c3726l != null && !c3726l.metrica()) {
                final C6499l c6499lLicense = this.billing.license(interfaceC1087l.asBinder());
                if (c6499lLicense == null) {
                    return;
                }
                AbstractC15323l.m3966final(c3726l.smaato, new Runnable() { // from class: lٍؘٖ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C12014l c12014l = this.f31735l.billing;
                        C6499l c6499l = c6499lLicense;
                        if (c12014l.m3307strictfp(c6499l)) {
                            C12417l c12417l2 = c12417l;
                            C3726l c3726l2 = c3726l;
                            int i3 = i;
                            if (c12417l2 != null) {
                                if (!c12014l.m3302for(c6499l, c12417l2)) {
                                    BinderC4841l.m1620l(c3726l2, c6499l, i3, new C5159l(-4));
                                    return;
                                }
                            } else if (!c12014l.m3301extends(c6499l, i2)) {
                                BinderC4841l.m1620l(c3726l2, c6499l, i3, new C5159l(-4));
                                return;
                            }
                            interfaceC3266l.admob(c3726l2, c6499l, i3);
                        }
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    /* JADX INFO: renamed from: lؑؓۙ, reason: contains not printable characters */
    public final void m1623l(final C6499l c6499l, final int i, final int i2, final InterfaceC3266l interfaceC3266l) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final C3726l c3726l = (C3726l) this.purchase.get();
            if (c3726l != null && !c3726l.metrica()) {
                AbstractC15323l.m3966final(c3726l.smaato, new Runnable() { // from class: lٍؔؐ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C12014l c12014l = this.f19103l.billing;
                        final C6499l c6499l2 = c6499l;
                        int i3 = i2;
                        boolean zM3304native = c12014l.m3304native(c6499l2, i3);
                        final C3726l c3726l2 = c3726l;
                        final int i4 = i;
                        if (!zM3304native) {
                            BinderC4841l.m1620l(c3726l2, c6499l2, i4, new C5159l(-4));
                            return;
                        }
                        C15035l c15035l = c3726l2.purchase;
                        c3726l2.m1421volatile(c6499l2);
                        c15035l.getClass();
                        final InterfaceC3266l interfaceC3266l2 = interfaceC3266l;
                        if (i3 != 27) {
                            c12014l.admob(c6499l2, i3, new InterfaceC1374l() { // from class: lٕٖۜ
                                @Override // defpackage.InterfaceC1374l
                                public final ListenableFuture run() {
                                    return (ListenableFuture) interfaceC3266l2.admob(c3726l2, c6499l2, i4);
                                }
                            });
                        } else {
                            interfaceC3266l2.admob(c3726l2, c6499l2, i4);
                            c12014l.admob(c6499l2, i3, new C6506l());
                        }
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lًؑٝ */
    public final void mo434l(InterfaceC1087l interfaceC1087l, int i, boolean z, int i2) {
        if (interfaceC1087l == null) {
            return;
        }
        m1628l(interfaceC1087l, i, 34, m1621l(new C10247l(z, i2)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lؑۨٝ */
    public final void mo435l(InterfaceC1087l interfaceC1087l, int i) {
        C6499l c6499lLicense;
        if (interfaceC1087l == null || (c6499lLicense = this.billing.license(interfaceC1087l.asBinder())) == null) {
            return;
        }
        m1623l(c6499lLicense, i, 3, m1621l(new C6541l(10)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lۣؒٞ */
    public final void mo436l(InterfaceC1087l interfaceC1087l, int i) {
        if (interfaceC1087l == null) {
            return;
        }
        m1628l(interfaceC1087l, i, 26, m1621l(new C6541l(7)));
    }

    /* JADX INFO: renamed from: lؒۜۡ, reason: contains not printable characters */
    public final C1908l m1624l(C1908l c1908l) {
        AbstractC1186l abstractC1186l = c1908l.f4366throws.yandex;
        C15325l c15325l = new C15325l(4, 11);
        C13698l c13698lYandex = AbstractC13675l.yandex();
        for (int i = 0; i < abstractC1186l.size(); i++) {
            C11916l c11916l = ((C14446l) abstractC1186l.get(i)).loadAd;
            String string = (String) this.admob.get(c11916l);
            if (string == null) {
                StringBuilder sb = new StringBuilder();
                int i2 = this.isPro;
                this.isPro = i2 + 1;
                String str = AbstractC15323l.yandex;
                sb.append(Integer.toString(i2, 36));
                sb.append("-");
                sb.append(c11916l.loadAd);
                string = sb.toString();
            }
            c15325l.m3988import(c11916l, string);
            c13698lYandex.mo3668catch(c11916l.loadAd, string);
        }
        this.admob = c15325l.adcel();
        this.subs = c13698lYandex.metrica(false);
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        for (int i3 = 0; i3 < abstractC1186l.size(); i3++) {
            C14446l c14446l = (C14446l) abstractC1186l.get(i3);
            c16971lMetrica.crashlytics(new C14446l(m1627l(c14446l.loadAd), c14446l.crashlytics, c14446l.amazon, c14446l.purchase));
        }
        C1908l c1908lLoadAd = c1908l.loadAd(new C1047l(c16971lMetrica.mopub()));
        C4970l c4970l = c1908lLoadAd.f4365package;
        if (c4970l.f10156synchronized.isEmpty()) {
            return c1908lLoadAd;
        }
        C10806l c10806lCrashlytics = c4970l.yandex().crashlytics();
        AbstractC10199l it = c4970l.f10156synchronized.values().iterator();
        while (it.hasNext()) {
            C0815l c0815l = (C0815l) it.next();
            c10806lCrashlytics.yandex(new C0815l(m1627l(c0815l.yandex), c0815l.loadAd));
        }
        return c1908lLoadAd.metrica(c10806lCrashlytics.loadAd());
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lؒۢۜ */
    public final void mo437l(InterfaceC1087l interfaceC1087l, int i, long j) {
        if (interfaceC1087l == null) {
            return;
        }
        m1628l(interfaceC1087l, i, 5, m1621l(new C12476l(j)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lؓۚ۟ */
    public final void mo438l(InterfaceC1087l interfaceC1087l, int i, int i2, int i3) {
        if (interfaceC1087l == null || i2 < 0 || i3 < 0) {
            return;
        }
        m1628l(interfaceC1087l, i, 20, m1621l(new C12153l(i2, i3, 5)));
    }

    /* JADX INFO: renamed from: lٕؓۡ, reason: contains not printable characters */
    public final void m1625l(C6499l c6499l, int i) {
        m1623l(c6499l, i, 1, m1621l(new C15263l(this, c6499l, 4)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lٖؖ۠ */
    public final void mo439l(InterfaceC1087l interfaceC1087l, int i, Bundle bundle) {
        if (interfaceC1087l == null || bundle == null) {
            return;
        }
        try {
            m1628l(interfaceC1087l, i, 13, m1621l(new C4404l(new C1372l(bundle.getFloat(C1372l.purchase, 1.0f), bundle.getFloat(C1372l.billing, 1.0f)), 2)));
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e);
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo440l(InterfaceC1087l interfaceC1087l, int i, Bundle bundle, boolean z) {
        C6499l c6499lLicense;
        if (interfaceC1087l == null || bundle == null || (c6499lLicense = this.billing.license(interfaceC1087l.asBinder())) == null) {
            return;
        }
        try {
            m1623l(c6499lLicense, i, 31, new C11123l(new C15263l(new C10956l(C2427l.yandex(c6499lLicense.crashlytics, bundle), z, 0), new C6541l(15), 7), 1));
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lؘِٞ */
    public final void mo441l(InterfaceC1087l interfaceC1087l, int i) {
        if (interfaceC1087l == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            C3726l c3726l = (C3726l) this.purchase.get();
            if (c3726l != null && !c3726l.metrica()) {
                AbstractC15323l.m3966final(c3726l.smaato, new RunnableC12388l(this, interfaceC1087l, 24));
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final void mo442l(InterfaceC1087l interfaceC1087l, int i, Surface surface) {
        if (interfaceC1087l == null) {
            return;
        }
        m1628l(interfaceC1087l, i, 27, m1621l(new C15263l(this, surface, 6)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lؙ۟ٙ */
    public final void mo443l(InterfaceC1087l interfaceC1087l, int i, Bundle bundle) {
        C3726l c3726l = (C3726l) this.purchase.get();
        if (interfaceC1087l == null || bundle == null || c3726l == null) {
            AbstractC2632l.purchase(interfaceC1087l);
            return;
        }
        try {
            Context context = c3726l.billing;
            C0176l c0176lYandex = C0176l.yandex(bundle);
            int callingUid = Binder.getCallingUid();
            int callingPid = Binder.getCallingPid();
            String str = c0176lYandex.crashlytics;
            if (AbstractC2632l.loadAd(callingUid, context, str) == 1) {
                AbstractC6427l.vip("MediaSessionStub", "Ignoring connection from invalid package name " + str + " (uid=" + callingUid + ")");
                AbstractC2632l.purchase(interfaceC1087l);
                return;
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = c0176lYandex.amazon;
            }
            try {
                C16701l c16701l = new C16701l(str, callingPid, callingUid);
                boolean zSmaato = C1770l.firebase(context).smaato(c16701l);
                int i2 = c0176lYandex.yandex;
                int i3 = c0176lYandex.loadAd;
                crashlytics(interfaceC1087l, new C6499l(c16701l, i2, i3, zSmaato, new C1300l(interfaceC1087l, i3), c0176lYandex.purchase));
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e);
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lٍؚۖ */
    public final void mo444l(InterfaceC1087l interfaceC1087l) {
        if (interfaceC1087l == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            C3726l c3726l = (C3726l) this.purchase.get();
            if (c3726l != null && !c3726l.metrica()) {
                C6499l c6499lLicense = this.billing.license(interfaceC1087l.asBinder());
                if (c6499lLicense != null) {
                    AbstractC15323l.m3966final(c3726l.smaato, new RunnableC12388l(this, c6499lLicense, 25));
                }
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lًَٙ */
    public final void mo445l(InterfaceC1087l interfaceC1087l, int i, int i2, Bundle bundle) {
        C6499l c6499lLicense;
        if (interfaceC1087l == null || bundle == null || i2 < 0 || (c6499lLicense = this.billing.license(interfaceC1087l.asBinder())) == null) {
            return;
        }
        try {
            int i3 = 1;
            m1623l(c6499lLicense, i, 20, new C11123l(new C15263l(new C14896l(i3, C2427l.yandex(c6499lLicense.crashlytics, bundle)), new C3959l(this, i2, 2), 8), i3));
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lٌّۡ */
    public final void mo446l(InterfaceC1087l interfaceC1087l, int i) {
        if (interfaceC1087l == null) {
            return;
        }
        m1628l(interfaceC1087l, i, 20, m1621l(new C6541l(14)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lٍٙؐ */
    public final void mo447l(InterfaceC1087l interfaceC1087l, int i, boolean z) {
        if (interfaceC1087l == null) {
            return;
        }
        m1628l(interfaceC1087l, i, 14, m1621l(new C7603l(z, 6)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lُٔۨ */
    public final void mo448l(InterfaceC1087l interfaceC1087l, int i, final int i2, final int i3, final int i4) {
        if (interfaceC1087l == null || i2 < 0 || i3 < i2 || i4 < 0) {
            return;
        }
        m1628l(interfaceC1087l, i, 20, m1621l(new InterfaceC18679l() { // from class: lؖؖ۠
            @Override // defpackage.InterfaceC18679l
            public final void accept(Object obj) {
                ((C18602l) obj).mo2790l(i2, i3, i4);
            }
        }));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lؘْؒ */
    public final void mo449l(InterfaceC1087l interfaceC1087l, int i, Bundle bundle) {
        mo440l(interfaceC1087l, i, bundle, true);
    }

    /* JADX INFO: renamed from: lْؕ۠, reason: contains not printable characters */
    public final int m1626l(C6499l c6499l, C18602l c18602l, int i) {
        if (c18602l.mo2779l(17)) {
            C12014l c12014l = this.billing;
            if (!c12014l.m3304native(c6499l, 17) && c12014l.m3304native(c6499l, 16)) {
                return c18602l.mo2761implements() + i;
            }
        }
        return i;
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lؚْٟ */
    public final void mo450l(InterfaceC1087l interfaceC1087l, int i, boolean z) {
        if (interfaceC1087l == null) {
            return;
        }
        m1628l(interfaceC1087l, i, 1, m1621l(new C7603l(z, 4)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lْٓؒ */
    public final void mo451l(InterfaceC1087l interfaceC1087l, int i) {
        if (interfaceC1087l == null) {
            return;
        }
        m1628l(interfaceC1087l, i, 6, m1621l(new C6541l(3)));
    }

    /* JADX INFO: renamed from: lْۣٔ, reason: contains not printable characters */
    public final C11916l m1627l(C11916l c11916l) {
        String str = (String) this.admob.get(c11916l);
        if (str == null) {
            str = c11916l.loadAd;
        }
        int i = 0;
        while (true) {
            int i2 = c11916l.yandex;
            C5978l[] c5978lArr = c11916l.amazon;
            if (i >= i2) {
                return new C11916l(str, c5978lArr);
            }
            if (c5978lArr[i].remoteconfig != null) {
                C5978l[] c5978lArr2 = new C5978l[i2];
                for (int i3 = 0; i3 < c11916l.yandex; i3++) {
                    C5978l c5978l = c5978lArr[i3];
                    String str2 = c5978l.remoteconfig;
                    String str3 = str2 != null ? (String) this.subs.get(str2) : null;
                    if (str3 != null) {
                        C12984l c12984lYandex = c5978l.yandex();
                        c12984lYandex.smaato = str3;
                        c5978lArr2[i3] = new C5978l(c12984lYandex);
                    } else {
                        c5978lArr2[i3] = c5978l;
                    }
                }
                return new C11916l(str, c5978lArr2);
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lؘْٔ */
    public final void mo452l(InterfaceC1087l interfaceC1087l, int i, boolean z) {
        if (interfaceC1087l == null) {
            return;
        }
        m1628l(interfaceC1087l, i, 26, m1621l(new C7603l(z, 5)));
    }

    /* JADX INFO: renamed from: lّٔ٘, reason: contains not printable characters */
    public final void m1628l(InterfaceC1087l interfaceC1087l, int i, int i2, C6536l c6536l) {
        C6499l c6499lLicense = this.billing.license(interfaceC1087l.asBinder());
        if (c6499lLicense != null) {
            m1623l(c6499lLicense, i, i2, c6536l);
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lٍٔ۠ */
    public final void mo453l(InterfaceC1087l interfaceC1087l, int i) {
        if (interfaceC1087l == null) {
            return;
        }
        m1628l(interfaceC1087l, i, 2, m1621l(new C6541l(13)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lٕؓٗ */
    public final void mo454l(InterfaceC1087l interfaceC1087l, int i, int i2) {
        if (interfaceC1087l == null || i2 < 0) {
            return;
        }
        m1628l(interfaceC1087l, i, 10, new C6536l(19, new C3959l(this, i2, 0)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lٕٕۤ */
    public final void mo455l(InterfaceC1087l interfaceC1087l, int i, int i2) {
        if (interfaceC1087l == null || i2 < 0) {
            return;
        }
        m1628l(interfaceC1087l, i, 25, m1621l(new C10503l(i2, 7)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lٕۗٞ */
    public final void mo456l(InterfaceC1087l interfaceC1087l, int i, int i2) {
        if (interfaceC1087l == null) {
            return;
        }
        if (i2 == 2 || i2 == 0 || i2 == 1) {
            m1628l(interfaceC1087l, i, 15, m1621l(new C10503l(i2, 6)));
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lٌٖؖ */
    public final void mo457l(InterfaceC1087l interfaceC1087l, int i, Surface surface, int i2, int i3) {
        if (interfaceC1087l == null) {
            return;
        }
        m1628l(interfaceC1087l, i, 27, m1621l(new C11118l(this, surface, i2, i3, 2)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lَٖؕ */
    public final void mo458l(InterfaceC1087l interfaceC1087l, int i, int i2, IBinder iBinder) {
        C6499l c6499lLicense;
        if (interfaceC1087l == null || iBinder == null || i2 < 0 || (c6499lLicense = this.billing.license(interfaceC1087l.asBinder())) == null) {
            return;
        }
        try {
            AbstractC1186l abstractC1186lYandex = BinderC11373l.yandex(iBinder);
            C16971l c16971lMetrica = AbstractC1186l.metrica();
            for (int i3 = 0; i3 < abstractC1186lYandex.size(); i3++) {
                Bundle bundle = (Bundle) abstractC1186lYandex.get(i3);
                bundle.getClass();
                c16971lMetrica.crashlytics(C2427l.yandex(c6499lLicense.crashlytics, bundle));
            }
            int i4 = 1;
            m1623l(c6499lLicense, i, 20, new C11123l(new C15263l(new C18696l(i4, c16971lMetrica.mopub()), new C3959l(this, i2, 3), 8), i4));
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lٖۡٓ */
    public final void mo459l(InterfaceC1087l interfaceC1087l, int i) {
        C6499l c6499lLicense;
        if (interfaceC1087l == null || (c6499lLicense = this.billing.license(interfaceC1087l.asBinder())) == null) {
            return;
        }
        m1623l(c6499lLicense, i, 7, m1621l(new C6541l(2)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lْٗٔ */
    public final void mo460l(InterfaceC1087l interfaceC1087l, int i, Bundle bundle, Bundle bundle2) {
        mo464package(interfaceC1087l, i, bundle, bundle2, false);
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lؙٗٙ */
    public final void mo461l(InterfaceC1087l interfaceC1087l, int i) {
        if (interfaceC1087l == null) {
            return;
        }
        m1628l(interfaceC1087l, i, 4, m1621l(new C6541l(12)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: l٘ٗ۟ */
    public final void mo462l(InterfaceC1087l interfaceC1087l, int i, Bundle bundle) {
        C6499l c6499lLicense;
        if (interfaceC1087l == null || bundle == null || (c6499lLicense = this.billing.license(interfaceC1087l.asBinder())) == null) {
            return;
        }
        try {
            m1623l(c6499lLicense, i, 19, m1621l(new C4750l(C3852l.loadAd(c6499lLicense.crashlytics, bundle), 2)));
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e);
        }
    }

    @Override // defpackage.InterfaceC4725l
    public final void metrica(InterfaceC1087l interfaceC1087l, int i) {
        C6499l c6499lLicense;
        if (interfaceC1087l == null || (c6499lLicense = this.billing.license(interfaceC1087l.asBinder())) == null) {
            return;
        }
        m1623l(c6499lLicense, i, 1, m1621l(new C4875l(28)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: native */
    public final void mo463native(InterfaceC1087l interfaceC1087l, int i) {
        if (interfaceC1087l == null) {
            return;
        }
        m1628l(interfaceC1087l, i, 8, m1621l(new C4875l(29)));
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C6499l c6499lLicense;
        int i3 = 1;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        int i4 = 2;
        boolean z = false;
        switch (i) {
            case 3002:
                mo427extends(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3003:
                mo455l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3004:
                mo429for(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3005:
                mo436l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3006:
                mo452l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3007:
                mo440l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), (Bundle) AbstractC9307l.yandex(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                Signature(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), (Bundle) AbstractC9307l.yandex(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                mo440l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), (Bundle) AbstractC9307l.yandex(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                mo468super(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                mo468super(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                mo472volatile(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                mo450l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3014:
                smaato(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), (Bundle) AbstractC9307l.yandex(parcel, Bundle.CREATOR));
                return true;
            case 3015:
                mo443l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), (Bundle) AbstractC9307l.yandex(parcel, Bundle.CREATOR));
                return true;
            case 3016:
                InterfaceC1087l interfaceC1087lCrashlytics = BinderC11857l.crashlytics(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                mo464package(interfaceC1087lCrashlytics, i5, (Bundle) AbstractC9307l.yandex(parcel, creator), (Bundle) AbstractC9307l.yandex(parcel, creator), false);
                return true;
            case 3017:
                mo456l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3018:
                mo447l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3019:
                mo432instanceof(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3020:
                mo424abstract(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3021:
                mo446l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3022:
                mo438l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3023:
                mo448l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3024:
                applovin(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3025:
                metrica(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3026:
                mo453l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3027:
                mo439l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), (Bundle) AbstractC9307l.yandex(parcel, Bundle.CREATOR));
                return true;
            case 3028:
                mo465private(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3029:
                InterfaceC1087l interfaceC1087lCrashlytics2 = BinderC11857l.crashlytics(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                Bundle bundle = (Bundle) AbstractC9307l.yandex(parcel, Bundle.CREATOR);
                if (interfaceC1087lCrashlytics2 != null && bundle != null && (c6499lLicense = this.billing.license(interfaceC1087lCrashlytics2.asBinder())) != null) {
                    try {
                        m1623l(c6499lLicense, i6, 20, new C11123l(new C15263l(new C14896l(i4, C2427l.yandex(c6499lLicense.crashlytics, bundle)), new C6541l(9), 8), i3));
                    } catch (RuntimeException e) {
                        AbstractC6427l.metrica("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
                    }
                }
                return true;
            case 3030:
                mo433interface(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) AbstractC9307l.yandex(parcel, Bundle.CREATOR));
                return true;
            case 3031:
                mo431implements(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3032:
                mo458l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3033:
                mo462l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), (Bundle) AbstractC9307l.yandex(parcel, Bundle.CREATOR));
                return true;
            case 3034:
                mo435l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3035:
                mo441l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3036:
                mo461l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3037:
                mo454l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3038:
                mo437l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong());
                return true;
            case 3039:
                mo473while(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readLong());
                return true;
            case 3040:
                mo428final(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3041:
                mo469switch(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3042:
                mo451l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3043:
                mo463native(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3044:
                mo442l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), (Surface) AbstractC9307l.yandex(parcel, Surface.CREATOR));
                return true;
            case 3045:
                mo444l(BinderC11857l.crashlytics(parcel.readStrongBinder()));
                return true;
            case 3046:
                mo459l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3047:
                mo466protected(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3048:
                mo425case(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), (Bundle) AbstractC9307l.yandex(parcel, Bundle.CREATOR));
                return true;
            case 3049:
                vip(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), (Bundle) AbstractC9307l.yandex(parcel, Bundle.CREATOR));
                return true;
            case 3050:
                InterfaceC1087l interfaceC1087lCrashlytics3 = BinderC11857l.crashlytics(parcel.readStrongBinder());
                int i7 = parcel.readInt();
                Bundle bundle2 = (Bundle) AbstractC9307l.yandex(parcel, Bundle.CREATOR);
                if (interfaceC1087lCrashlytics3 != null && bundle2 != null) {
                    try {
                        isPro(interfaceC1087lCrashlytics3, i7, null, 40010, new C11123l(new C6536l(21, AbstractC7778l.yandex(bundle2)), i3));
                    } catch (RuntimeException e2) {
                        AbstractC6427l.metrica("MediaSessionStub", "Ignoring malformed Bundle for Rating", e2);
                    }
                }
                return true;
            case 3051:
                mo467strictfp(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3052:
                mo426default(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3053:
                mo430goto(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3054:
                mo434l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt());
                return true;
            case 3055:
                mo445l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) AbstractC9307l.yandex(parcel, Bundle.CREATOR));
                return true;
            case 3056:
                mo471try(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3057:
                remoteconfig(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), (Bundle) AbstractC9307l.yandex(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3058:
                tapsense(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3059:
                advert(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3060:
                InterfaceC1087l interfaceC1087lCrashlytics4 = BinderC11857l.crashlytics(parcel.readStrongBinder());
                int i8 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                mo464package(interfaceC1087lCrashlytics4, i8, (Bundle) AbstractC9307l.yandex(parcel, creator2), (Bundle) AbstractC9307l.yandex(parcel, creator2), parcel.readInt() != 0);
                return true;
            case 3061:
                mo457l(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), (Surface) AbstractC9307l.yandex(parcel, Surface.CREATOR), parcel.readInt(), parcel.readInt());
                return true;
            case 3062:
                mo470transient(BinderC11857l.crashlytics(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            default:
                C17425l c17425lYandex = null;
                switch (i) {
                    case 4001:
                        InterfaceC1087l interfaceC1087lCrashlytics5 = BinderC11857l.crashlytics(parcel.readStrongBinder());
                        int i9 = parcel.readInt();
                        Bundle bundle3 = (Bundle) AbstractC9307l.yandex(parcel, Bundle.CREATOR);
                        if (interfaceC1087lCrashlytics5 != null) {
                            if (bundle3 != null) {
                                try {
                                    c17425lYandex = C17425l.yandex(bundle3);
                                } catch (RuntimeException e3) {
                                    AbstractC6427l.metrica("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e3);
                                }
                            }
                            isPro(interfaceC1087lCrashlytics5, i9, null, 50000, new C11123l(new C6536l(18, c17425lYandex), z ? 1 : 0));
                            break;
                        }
                        return true;
                    case 4002:
                        InterfaceC1087l interfaceC1087lCrashlytics6 = BinderC11857l.crashlytics(parcel.readStrongBinder());
                        int i10 = parcel.readInt();
                        String string = parcel.readString();
                        if (interfaceC1087lCrashlytics6 != null) {
                            if (TextUtils.isEmpty(string)) {
                                AbstractC6427l.vip("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            isPro(interfaceC1087lCrashlytics6, i10, null, 50004, new C11123l(new C6541l(string), z ? 1 : 0));
                            return true;
                        }
                        return true;
                    case 4003:
                        InterfaceC1087l interfaceC1087lCrashlytics7 = BinderC11857l.crashlytics(parcel.readStrongBinder());
                        int i11 = parcel.readInt();
                        final String string2 = parcel.readString();
                        final int i12 = parcel.readInt();
                        final int i13 = parcel.readInt();
                        Bundle bundle4 = (Bundle) AbstractC9307l.yandex(parcel, Bundle.CREATOR);
                        if (interfaceC1087lCrashlytics7 != null) {
                            if (TextUtils.isEmpty(string2)) {
                                AbstractC6427l.vip("MediaSessionStub", "getChildren(): Ignoring empty parentId");
                            } else if (i12 < 0) {
                                AbstractC6427l.vip("MediaSessionStub", "getChildren(): Ignoring negative page");
                            } else if (i13 < 1) {
                                AbstractC6427l.vip("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle4 != null) {
                                    try {
                                        c17425lYandex = C17425l.yandex(bundle4);
                                    } catch (RuntimeException e4) {
                                        AbstractC6427l.metrica("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e4);
                                    }
                                }
                                final C17425l c17425l = c17425lYandex;
                                final int i14 = 0;
                                isPro(interfaceC1087lCrashlytics7, i11, null, 50003, new C11123l(new InterfaceC3266l() { // from class: lؖؒٙ
                                    @Override // defpackage.InterfaceC3266l
                                    public final Object admob(C3726l c3726l, C6499l c6499l, int i15) {
                                        switch (i14) {
                                            case 0:
                                                return c3726l.Signature(c6499l, string2, i12, i13, c17425l);
                                            default:
                                                return c3726l.ad(c6499l, string2, i12, i13, c17425l);
                                        }
                                    }
                                }, z ? 1 : 0));
                            }
                            break;
                        }
                        return true;
                    case 4004:
                        InterfaceC1087l interfaceC1087lCrashlytics8 = BinderC11857l.crashlytics(parcel.readStrongBinder());
                        int i15 = parcel.readInt();
                        String string3 = parcel.readString();
                        Bundle bundle5 = (Bundle) AbstractC9307l.yandex(parcel, Bundle.CREATOR);
                        if (interfaceC1087lCrashlytics8 != null) {
                            if (TextUtils.isEmpty(string3)) {
                                AbstractC6427l.vip("MediaSessionStub", "search(): Ignoring empty query");
                            } else {
                                if (bundle5 != null) {
                                    try {
                                        c17425lYandex = C17425l.yandex(bundle5);
                                    } catch (RuntimeException e5) {
                                        AbstractC6427l.metrica("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e5);
                                    }
                                }
                                isPro(interfaceC1087lCrashlytics8, i15, null, 50005, new C11123l(new C17406l(i4, c17425lYandex, string3), z ? 1 : 0));
                            }
                            break;
                        }
                        return true;
                    case 4005:
                        InterfaceC1087l interfaceC1087lCrashlytics9 = BinderC11857l.crashlytics(parcel.readStrongBinder());
                        int i16 = parcel.readInt();
                        final String string4 = parcel.readString();
                        final int i17 = parcel.readInt();
                        final int i18 = parcel.readInt();
                        Bundle bundle6 = (Bundle) AbstractC9307l.yandex(parcel, Bundle.CREATOR);
                        if (interfaceC1087lCrashlytics9 != null) {
                            if (TextUtils.isEmpty(string4)) {
                                AbstractC6427l.vip("MediaSessionStub", "getSearchResult(): Ignoring empty query");
                            } else if (i17 < 0) {
                                AbstractC6427l.vip("MediaSessionStub", "getSearchResult(): Ignoring negative page");
                            } else if (i18 < 1) {
                                AbstractC6427l.vip("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle6 != null) {
                                    try {
                                        c17425lYandex = C17425l.yandex(bundle6);
                                    } catch (RuntimeException e6) {
                                        AbstractC6427l.metrica("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e6);
                                    }
                                }
                                final C17425l c17425l2 = c17425lYandex;
                                final int i19 = 1;
                                isPro(interfaceC1087lCrashlytics9, i16, null, 50006, new C11123l(new InterfaceC3266l() { // from class: lؖؒٙ
                                    @Override // defpackage.InterfaceC3266l
                                    public final Object admob(C3726l c3726l, C6499l c6499l, int i110) {
                                        switch (i19) {
                                            case 0:
                                                return c3726l.Signature(c6499l, string4, i17, i18, c17425l2);
                                            default:
                                                return c3726l.ad(c6499l, string4, i17, i18, c17425l2);
                                        }
                                    }
                                }, z ? 1 : 0));
                            }
                            break;
                        }
                        return true;
                    case 4006:
                        InterfaceC1087l interfaceC1087lCrashlytics10 = BinderC11857l.crashlytics(parcel.readStrongBinder());
                        int i20 = parcel.readInt();
                        String string5 = parcel.readString();
                        Bundle bundle7 = (Bundle) AbstractC9307l.yandex(parcel, Bundle.CREATOR);
                        if (interfaceC1087lCrashlytics10 != null) {
                            if (TextUtils.isEmpty(string5)) {
                                AbstractC6427l.vip("MediaSessionStub", "subscribe(): Ignoring empty parentId");
                            } else {
                                if (bundle7 != null) {
                                    try {
                                        c17425lYandex = C17425l.yandex(bundle7);
                                    } catch (RuntimeException e7) {
                                        AbstractC6427l.metrica("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e7);
                                    }
                                }
                                isPro(interfaceC1087lCrashlytics10, i20, null, 50001, new C11123l(new C17406l(i3, c17425lYandex, string5), z ? 1 : 0));
                            }
                            break;
                        }
                        return true;
                    case 4007:
                        InterfaceC1087l interfaceC1087lCrashlytics11 = BinderC11857l.crashlytics(parcel.readStrongBinder());
                        int i21 = parcel.readInt();
                        String string6 = parcel.readString();
                        if (interfaceC1087lCrashlytics11 != null) {
                            if (TextUtils.isEmpty(string6)) {
                                AbstractC6427l.vip("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            isPro(interfaceC1087lCrashlytics11, i21, null, 50002, new C11123l(new C6536l(17, string6), z ? 1 : 0));
                            return true;
                        }
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: package */
    public final void mo464package(final InterfaceC1087l interfaceC1087l, final int i, Bundle bundle, Bundle bundle2, boolean z) {
        Bundle bundleStartapp = AbstractC15323l.startapp(bundle2);
        if (interfaceC1087l == null || bundle == null || bundleStartapp == null) {
            return;
        }
        try {
            final C12417l c12417lYandex = C12417l.yandex(bundle);
            if (!C14869l.vip(c12417lYandex.loadAd)) {
                isPro(interfaceC1087l, i, c12417lYandex, 0, new C11123l(new C15263l(z, c12417lYandex, bundleStartapp), 1));
                return;
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                final C3726l c3726l = (C3726l) this.purchase.get();
                if (c3726l != null && !c3726l.metrica()) {
                    final C6499l c6499lLicense = this.billing.license(interfaceC1087l.asBinder());
                    if (c6499lLicense == null) {
                        return;
                    }
                    AbstractC15323l.m3966final(c3726l.smaato, new Runnable() { // from class: lّٗۗ
                        /* JADX WARN: Code duplicated, block: B:19:0x006a  */
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zBooleanValue;
                            C12417l c12417l = c12417lYandex;
                            String str = c12417l.loadAd;
                            C3726l c3726l2 = c3726l;
                            int i2 = i;
                            BinderC4841l binderC4841l = this.f33250l;
                            C12014l c12014l = binderC4841l.billing;
                            C6499l c6499l = c6499lLicense;
                            if (c12014l.m3307strictfp(c6499l)) {
                                try {
                                    C14869l c14869lAmazon = C14869l.amazon(c12417l);
                                    Object obj = c14869lAmazon.isPro;
                                    int i3 = c14869lAmazon.loadAd;
                                    if (!c14869lAmazon.loadAd()) {
                                        AbstractC6427l.vip("MediaSessionStub", "Can't execute predefined custom command: " + str);
                                        BinderC4841l.m1620l(c3726l2, c6499l, i2, new C5159l(-6));
                                        return;
                                    }
                                    C12417l c12417l2 = c14869lAmazon.yandex;
                                    if (c12417l2 != null) {
                                        AbstractC12442l.subscription(c12417l2.yandex == 40010);
                                        binderC4841l.isPro(interfaceC1087l, i2, null, 40010, new C11123l(new C8294l(c14869lAmazon), 1));
                                        return;
                                    }
                                    C18602l c18602l = c3726l2.tapsense;
                                    if (i3 != 1) {
                                        zBooleanValue = false;
                                    } else if (obj != null) {
                                        zBooleanValue = ((Boolean) obj).booleanValue();
                                    } else if (c18602l.startapp()) {
                                        zBooleanValue = false;
                                    } else {
                                        zBooleanValue = true;
                                    }
                                    if (zBooleanValue) {
                                        binderC4841l.m1625l(c6499l, i2);
                                    } else if (i3 == 31) {
                                        obj.getClass();
                                        binderC4841l.m1623l(c6499l, i2, 31, new C11123l(new C15263l(new C10956l((C2427l) obj, true, 0), new C6541l(15), 7), 1));
                                    } else {
                                        binderC4841l.m1623l(c6499l, i2, i3, BinderC4841l.m1621l(new C8294l(c14869lAmazon)));
                                    }
                                    c12014l.metrica(c6499l);
                                } catch (RuntimeException e) {
                                    AbstractC6427l.metrica("MediaSessionStub", "Failed to convert predefined custom command: " + str, e);
                                    BinderC4841l.m1620l(c3726l2, c6499l, i2, new C5159l(-3));
                                }
                            }
                        }
                    });
                }
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: private */
    public final void mo465private(InterfaceC1087l interfaceC1087l, int i, float f) {
        if (interfaceC1087l == null || f <= 0.0f) {
            return;
        }
        m1628l(interfaceC1087l, i, 13, m1621l(new C4605l(3, f)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: protected */
    public final void mo466protected(InterfaceC1087l interfaceC1087l, int i) {
        C6499l c6499lLicense;
        if (interfaceC1087l == null || (c6499lLicense = this.billing.license(interfaceC1087l.asBinder())) == null) {
            return;
        }
        m1623l(c6499lLicense, i, 9, m1621l(new C6541l(6)));
    }

    @Override // defpackage.InterfaceC4725l
    public final void remoteconfig(InterfaceC1087l interfaceC1087l, int i, Bundle bundle, boolean z) {
        if (interfaceC1087l == null || bundle == null) {
            return;
        }
        try {
            m1628l(interfaceC1087l, i, 35, m1621l(new C10956l(C13736l.yandex(bundle), z, 1)));
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e);
        }
    }

    @Override // defpackage.InterfaceC4725l
    public final void smaato(InterfaceC1087l interfaceC1087l, int i, Bundle bundle) {
        C6694l c6694l;
        if (interfaceC1087l == null || bundle == null) {
            return;
        }
        try {
            C5159l c5159lYandex = C5159l.yandex(bundle);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                C12014l c12014l = this.billing;
                IBinder iBinderAsBinder = interfaceC1087l.asBinder();
                synchronized (c12014l.f23941l) {
                    try {
                        C6499l c6499lLicense = c12014l.license(iBinderAsBinder);
                        c6694l = c6499lLicense != null ? (C6694l) ((C11154l) c12014l.f23944l).get(c6499lLicense) : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C13904l c13904l = c6694l != null ? c6694l.loadAd : null;
                if (c13904l == null) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                } else {
                    c13904l.firebase(i, c5159lYandex);
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            } catch (Throwable th2) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th2;
            }
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e);
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: strictfp */
    public final void mo467strictfp(InterfaceC1087l interfaceC1087l, int i, int i2, int i3) {
        if (interfaceC1087l == null || i2 < 0) {
            return;
        }
        m1628l(interfaceC1087l, i, 33, m1621l(new C12153l(i2, i3, 4)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: super */
    public final void mo468super(InterfaceC1087l interfaceC1087l, int i, IBinder iBinder, boolean z) {
        C6499l c6499lLicense;
        if (interfaceC1087l == null || iBinder == null || (c6499lLicense = this.billing.license(interfaceC1087l.asBinder())) == null) {
            return;
        }
        try {
            AbstractC1186l abstractC1186lYandex = BinderC11373l.yandex(iBinder);
            C16971l c16971lMetrica = AbstractC1186l.metrica();
            for (int i2 = 0; i2 < abstractC1186lYandex.size(); i2++) {
                Bundle bundle = (Bundle) abstractC1186lYandex.get(i2);
                bundle.getClass();
                c16971lMetrica.crashlytics(C2427l.yandex(c6499lLicense.crashlytics, bundle));
            }
            m1623l(c6499lLicense, i, 20, new C11123l(new C15263l(new C10956l(c16971lMetrica.mopub(), z, 2), new C6541l(15), 7), 1));
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: switch */
    public final void mo469switch(InterfaceC1087l interfaceC1087l, int i) {
        C6499l c6499lLicense;
        if (interfaceC1087l == null || (c6499lLicense = this.billing.license(interfaceC1087l.asBinder())) == null) {
            return;
        }
        m1623l(c6499lLicense, i, 12, m1621l(new C6541l(5)));
    }

    @Override // defpackage.InterfaceC4725l
    public final void tapsense(InterfaceC1087l interfaceC1087l, int i) {
        if (interfaceC1087l == null) {
            return;
        }
        m1628l(interfaceC1087l, i, 24, m1621l(new C4875l(27)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: transient */
    public final void mo470transient(InterfaceC1087l interfaceC1087l, int i, int i2, int i3) {
        if (interfaceC1087l == null) {
            return;
        }
        m1628l(interfaceC1087l, i, 27, m1621l(new C10561l(this, i2, i3)));
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: try */
    public final void mo471try(InterfaceC1087l interfaceC1087l, int i, int i2, int i3, IBinder iBinder) {
        C6499l c6499lLicense;
        if (interfaceC1087l == null || iBinder == null || i2 < 0 || i3 < i2 || (c6499lLicense = this.billing.license(interfaceC1087l.asBinder())) == null) {
            return;
        }
        try {
            AbstractC1186l abstractC1186lYandex = BinderC11373l.yandex(iBinder);
            C16971l c16971lMetrica = AbstractC1186l.metrica();
            for (int i4 = 0; i4 < abstractC1186lYandex.size(); i4++) {
                Bundle bundle = (Bundle) abstractC1186lYandex.get(i4);
                bundle.getClass();
                c16971lMetrica.crashlytics(C2427l.yandex(c6499lLicense.crashlytics, bundle));
            }
            m1623l(c6499lLicense, i, 20, new C11123l(new C15263l(new C18317l(c16971lMetrica.mopub(), 2), new C10561l(this, i2, i3), 8), 1));
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.InterfaceC4725l
    public final void vip(InterfaceC1087l interfaceC1087l, int i, String str, Bundle bundle) {
        if (interfaceC1087l == null || str == null || bundle == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            AbstractC6427l.vip("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
            return;
        }
        try {
            isPro(interfaceC1087l, i, null, 40010, new C11123l(new C15263l(str, AbstractC7778l.yandex(bundle), 5), 1));
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MediaSessionStub", "Ignoring malformed Bundle for Rating", e);
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: volatile */
    public final void mo472volatile(InterfaceC1087l interfaceC1087l, int i, IBinder iBinder, int i2, long j) {
        C6499l c6499lLicense;
        if (interfaceC1087l == null || iBinder == null) {
            return;
        }
        if ((i2 == -1 || i2 >= 0) && (c6499lLicense = this.billing.license(interfaceC1087l.asBinder())) != null) {
            try {
                AbstractC1186l abstractC1186lYandex = BinderC11373l.yandex(iBinder);
                C16971l c16971lMetrica = AbstractC1186l.metrica();
                for (int i3 = 0; i3 < abstractC1186lYandex.size(); i3++) {
                    Bundle bundle = (Bundle) abstractC1186lYandex.get(i3);
                    bundle.getClass();
                    c16971lMetrica.crashlytics(C2427l.yandex(c6499lLicense.crashlytics, bundle));
                }
                m1623l(c6499lLicense, i, 20, new C11123l(new C15263l(new C10213l(j, c16971lMetrica.mopub(), i2), new C6541l(15), 7), 1));
            } catch (RuntimeException e) {
                AbstractC6427l.metrica("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: while */
    public final void mo473while(InterfaceC1087l interfaceC1087l, int i, int i2, long j) {
        if (interfaceC1087l == null || i2 < 0) {
            return;
        }
        m1628l(interfaceC1087l, i, 10, new C6536l(19, new C10213l(j, this, i2)));
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
