package defpackage;

import android.graphics.Bitmap;
import android.hardware.camera2.CameraAccessException;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.upload.AudioUploader$UploadResponse;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkx.downloader.service.DownloaderService;
import ua.itaysonlab.vkxreborn.cache.path_migration.DedicatedCacheMigrationService;
import ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService;

/* JADX INFO: renamed from: lْۙۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13624l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f26652l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f26653l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f26654l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13624l(Object obj, Object obj2, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f26653l = i;
        this.f26652l = obj;
        this.f26654l = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r14v4 */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Exception {
        Throwable th;
        Object objYandex;
        int i;
        int i2;
        int i3 = this.f26653l;
        int i4 = 4;
        int i5 = 11;
        int i6 = 9;
        final int i7 = 2;
        boolean z = true;
        boolean z2 = true;
        z = true;
        final int i8 = 0;
        C16076l c16076l = 0;
        Object obj2 = this.f26654l;
        switch (i3) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                ((C2910l) this.f26652l).ads(((C17887l) obj2).yandex);
                return Unit.INSTANCE;
            case 1:
                AbstractC2829l.crashlytics(obj);
                Iterator it = ((C14894l) this.f26652l).purchase.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2413l) it.next()).ads(((C17887l) obj2).yandex);
                }
                return Unit.INSTANCE;
            case 2:
                AbstractC2829l.crashlytics(obj);
                File file = (File) this.f26652l;
                AbstractC2030l.firebase(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    ((Bitmap) obj2).compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return Unit.INSTANCE;
            case 3:
                AbstractC2829l.crashlytics(obj);
                InterfaceC9473l interfaceC9473lMo1516l = ((C11610l) ((C6252l) this.f26652l).f833l).yandex((C17032l) obj2).billing().f35907l.mo1516l();
                try {
                    objYandex = AbstractC9968l.yandex(VKXApplication.f36629l, AbstractC18202l.yandex(AudioUploader$UploadResponse.class)).yandex(interfaceC9473lMo1516l);
                    if (interfaceC9473lMo1516l != null) {
                        try {
                            interfaceC9473lMo1516l.close();
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    th = null;
                    break;
                } catch (Throwable th3) {
                    if (interfaceC9473lMo1516l != null) {
                        try {
                            interfaceC9473lMo1516l.close();
                        } catch (Throwable th4) {
                            AbstractC11718l.yandex(th3, th4);
                        }
                    }
                    th = th3;
                    objYandex = null;
                    break;
                }
                if (th != null) {
                    throw th;
                }
                if (objYandex != null) {
                    return objYandex;
                }
                C8339l.smaato("HashObject is supposedly null");
                return null;
            case 4:
                AbstractC2829l.crashlytics(obj);
                return ((C11610l) ((C13270l) this.f26652l).f833l).yandex((C17032l) obj2).billing().f35907l.vip();
            case 5:
                AbstractC2829l.crashlytics(obj);
                ((C18163l) this.f26652l).loadAd.vip(AbstractC2749l.billing, (C10038l) obj2);
                return Unit.INSTANCE;
            case 6:
                AbstractC2829l.crashlytics(obj);
                C15202l c15202l = (C15202l) this.f26652l;
                if (c15202l != null) {
                    c15202l.metrica();
                }
                C17266l c17266l = (C17266l) obj2;
                if (c17266l != null) {
                    c17266l.yandex(null);
                }
                return Unit.INSTANCE;
            case 7:
                AbstractC2829l.crashlytics(obj);
                String str = (String) this.f26652l;
                Log.d("CXCP", "Initializing CameraDeviceSetupCompat for " + ((Object) C10160l.loadAd(str)));
                C14232l c14232l = (C14232l) obj2;
                C10393l c10393l = c14232l.crashlytics;
                try {
                    C1198l c1198l = (C1198l) c14232l.smaato.getValue();
                    c1198l.getClass();
                    ArrayList arrayList = new ArrayList();
                    C2009l c2009l = c1198l.yandex;
                    if (c2009l != null) {
                        arrayList.add(new C1703l(c2009l.yandex, str));
                    }
                    C2009l c2009l2 = c1198l.loadAd;
                    if (c2009l2 != null) {
                        try {
                            arrayList.add(new C1703l(c2009l2.yandex, str));
                            break;
                        } catch (UnsupportedOperationException unused) {
                        }
                    }
                    return new C17698l(arrayList);
                } catch (Exception e2) {
                    if (!(e2 instanceof CameraAccessException)) {
                        if (!(e2 instanceof IllegalArgumentException) && !(e2 instanceof SecurityException) && !(e2 instanceof UnsupportedOperationException) && !(e2 instanceof NullPointerException)) {
                            if (!(e2 instanceof IllegalStateException)) {
                                throw e2;
                            }
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                            return null;
                        }
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e2.getMessage());
                        c10393l.yandex(str, false, 9);
                        return null;
                    }
                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e2.getMessage());
                    CameraAccessException cameraAccessException = (CameraAccessException) e2;
                    int reason = cameraAccessException.getReason();
                    if (reason == 1) {
                        i = 3;
                    } else if (reason == 2) {
                        i = 6;
                    } else if (reason == 3) {
                        i = 0;
                    } else if (reason == 4) {
                        i = 1;
                    } else if (reason != 5) {
                        Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                        i = 11;
                    } else {
                        i = 2;
                    }
                    c10393l.yandex(str, true, i);
                    return null;
                }
            case 8:
                AbstractC2829l.crashlytics(obj);
                return ((C10596l) this.f26652l).purchase((String) obj2);
            case 9:
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f26652l;
                AbstractC2829l.crashlytics(obj);
                C4456l c4456l = (C4456l) obj2;
                AbstractC10999l.mopub(interfaceC2262l, null, 0, new C10010l(c4456l, c16076l, i8), 3);
                AbstractC10999l.mopub(interfaceC2262l, null, 0, new C8971l(c4456l, c16076l, i8), 3);
                return Unit.INSTANCE;
            case 10:
                AbstractC2829l.crashlytics(obj);
                AbstractC13264l abstractC13264l = (AbstractC13264l) this.f26652l;
                if (abstractC13264l.metrica() != ((C3981l) obj2).yandex) {
                    if (abstractC13264l.metrica() == 0) {
                        C16076l c16076l2 = VKXApplication.f36632l;
                        c16076l = c16076l2 != null ? c16076l2 : 0;
                        c16076l.getClass();
                        c16076l.subs(C15849l.f31102l);
                    } else if (abstractC13264l.metrica() == 1 || abstractC13264l.metrica() == 2) {
                        C16076l c16076l3 = VKXApplication.f36632l;
                        if (c16076l3 == null) {
                            c16076l3 = null;
                        }
                        c16076l3.getClass();
                        c16076l3.subs(new C8122l(new C7864l(c16076l3, c16076l, 8), null));
                    }
                }
                return Unit.INSTANCE;
            case 11:
                AbstractC2829l.crashlytics(obj);
                C9879l c9879l = (C9879l) this.f26652l;
                c9879l.yandex.license(new C17398l((AudioPlaylist) obj2));
                c9879l.yandex.applovin();
                return Unit.INSTANCE;
            case 12:
                Object obj3 = this.f26652l;
                AbstractC2829l.crashlytics(obj);
                if (obj3 == null && !((InterfaceC9354l) obj2).admob()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                AbstractC10022l abstractC10022l = (AbstractC10022l) this.f26652l;
                AbstractC2829l.crashlytics(obj);
                C17721l method = AbstractC3474l.mopub(abstractC10022l).getMethod();
                Long lCrashlytics = AbstractC11036l.crashlytics(abstractC10022l);
                if (lCrashlytics != null && lCrashlytics.longValue() == 0) {
                    return null;
                }
                if (lCrashlytics == null && AbstractC8576l.yandex(method, C17721l.mopub)) {
                    return null;
                }
                C11349l c11349l = (C11349l) obj2;
                InterfaceC6272l interfaceC6272l = AbstractC4689l.yandex;
                if (abstractC10022l.yandex().signatures("Content-Encoding") == null) {
                    return abstractC10022l;
                }
                String strSignatures = abstractC10022l.yandex().signatures("Content-Encoding");
                if (strSignatures == null) {
                    C8339l.smaato("Content-Encoding unavailable");
                    return null;
                }
                List listM3338public = AbstractC12024l.m3338public(strSignatures, new String[]{","}, 6);
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(listM3338public, 10));
                Iterator it2 = listM3338public.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(AbstractC12024l.m3330l((String) it2.next()).toString().toLowerCase(Locale.ROOT));
                }
                C8892l c8892l = new C8892l(z ? 1 : 0, arrayList2);
                ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(c8892l, 10));
                Iterator it3 = c8892l.iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) ((C8772l) it3).f18067l;
                    if (!listIterator.hasPrevious()) {
                        C13863l c13863l = InterfaceC4539l.yandex;
                        C0090l c0090l = new C0090l(13);
                        abstractC10022l.yandex().isVip(new C15707l(16, c0090l));
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : arrayList2) {
                            if (!arrayList2.contains((String) obj4)) {
                                arrayList4.add(obj4);
                            }
                        }
                        if (!arrayList4.isEmpty()) {
                            c0090l.mo214l("Content-Encoding", AbstractC16901l.m4210case(arrayList4, ",", null, null, null, 62));
                        }
                        Unit unit = Unit.INSTANCE;
                        C3223l c3223lM273l = c0090l.m273l();
                        abstractC10022l.loadAd().getAttributes().mopub(AbstractC4689l.crashlytics, arrayList2);
                        C14249l c14249lLoadAd = abstractC10022l.loadAd();
                        C8103l c8103l = new C8103l(z ? 1 : 0, arrayList3);
                        C2693l c2693l = new C2693l(c14249lLoadAd.f27847l);
                        InterfaceC1814l interfaceC1814l = c14249lLoadAd.f27846l;
                        if (interfaceC1814l == null) {
                            interfaceC1814l = null;
                        }
                        c2693l.f27846l = new C6020l(c2693l, interfaceC1814l, i8);
                        AbstractC10022l abstractC10022l2 = c14249lLoadAd.f27845l;
                        C17228l c17228l = new C17228l(c2693l, abstractC10022l2 != null ? abstractC10022l2 : null, c8103l, c3223lM273l);
                        c2693l.f27845l = c17228l;
                        return c17228l;
                    }
                    String str2 = (String) listIterator.previous();
                    InterfaceC0980l interfaceC0980l = (InterfaceC0980l) c11349l.get(str2);
                    if (interfaceC0980l == null) {
                        throw new C17072l(str2);
                    }
                    arrayList3.add(interfaceC0980l);
                }
                break;
            case 14:
                AbstractC2829l.crashlytics(obj);
                InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) this.f26652l;
                C13404l c13404l = (C13404l) obj2;
                AtomicReference atomicReference = c13404l.loadAd;
                C7504l c7504lMopub = AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C6637l((InterfaceC7042l) atomicReference.getAndSet(null), c13404l, (InterfaceC14029l) c16076l, 15), 3);
                while (!atomicReference.compareAndSet(null, c7504lMopub)) {
                    if (atomicReference.get() != null) {
                        z2 = false;
                        return Boolean.valueOf(z2);
                    }
                }
                return Boolean.valueOf(z2);
            case 15:
                AbstractC12669l abstractC12669l = (AbstractC12669l) this.f26652l;
                AbstractC2829l.crashlytics(obj);
                return Boolean.valueOf((abstractC12669l instanceof C2856l) && ((C2856l) abstractC12669l).yandex <= ((C2856l) ((AbstractC12669l) obj2)).yandex);
            case 16:
                C17098l c17098l = (C17098l) this.f26652l;
                AbstractC2829l.crashlytics(obj);
                DedicatedCacheMigrationService dedicatedCacheMigrationService = (DedicatedCacheMigrationService) obj2;
                if (dedicatedCacheMigrationService.f36652l) {
                    return Unit.INSTANCE;
                }
                C18351l c18351lFirebase = AbstractC11990l.firebase(dedicatedCacheMigrationService);
                C16552l c16552l = AbstractC11463l.yandex;
                AbstractC10999l.mopub(c18351lFirebase, ExecutorC6708l.f14063l, 0, new C18731l(dedicatedCacheMigrationService, c17098l, c16076l, i4), 2);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C0590l c0590l = (C0590l) this.f26652l;
                AbstractC2829l.crashlytics(obj);
                DedicatedCacheService dedicatedCacheService = (DedicatedCacheService) obj2;
                AbstractC7317l abstractC7317l = c0590l.yandex;
                if (!dedicatedCacheService.f11729l.isCanceled()) {
                    AbstractC10999l.mopub(AbstractC11990l.firebase(dedicatedCacheService), AbstractC11463l.yandex, 0, new C5163l(dedicatedCacheService, abstractC7317l, c16076l, i6), 2);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C8350l c8350l = (C8350l) this.f26652l;
                AbstractC2829l.crashlytics(obj);
                DownloaderService downloaderService = (DownloaderService) obj2;
                AbstractC7317l abstractC7317l2 = c8350l.yandex;
                if (!downloaderService.f11729l.isCanceled()) {
                    AbstractC10999l.mopub(AbstractC11990l.firebase(downloaderService), AbstractC11463l.yandex, 0, new C5163l(downloaderService, abstractC7317l2, c16076l, i6), 2);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                AbstractC2829l.crashlytics(obj);
                C16854l c16854l = (C16854l) this.f26652l;
                c16854l.m4203public(true);
                c16854l.m4201finally(true);
                AbstractC10999l.mopub(AbstractC11990l.firebase(c16854l), null, 0, new C4647l((C4530l) obj2, c16854l, (InterfaceC14029l) c16076l, i5), 3);
                return Unit.INSTANCE;
            case 20:
                InterfaceC8639l interfaceC8639l = (InterfaceC8639l) this.f26652l;
                AbstractC2829l.crashlytics(obj);
                C18476l c18476lPurchase = interfaceC8639l.purchase();
                C18476l c18476l = (C18476l) obj2;
                C18476l c18476l2 = new C18476l();
                if (c18476l.f36079l != 0) {
                    C2139l c2139l = c18476l.f36081l;
                    C2139l c2139lPurchase = c2139l.purchase();
                    c18476l2.f36081l = c2139lPurchase;
                    c18476l2.f36080l = c2139lPurchase;
                    for (C2139l c2139l2 = c2139l.billing; c2139l2 != null; c2139l2 = c2139l2.billing) {
                        C2139l c2139l3 = c18476l2.f36080l;
                        C2139l c2139lPurchase2 = c2139l2.purchase();
                        c2139l3.amazon(c2139lPurchase2);
                        c18476l2.f36080l = c2139lPurchase2;
                    }
                    c18476l2.f36079l = c18476l.f36079l;
                }
                c18476lPurchase.isVip(c18476l2);
                return Unit.INSTANCE;
            case 21:
                AbstractC2829l.crashlytics(obj);
                C16221l c16221lPurchase = ((C16221l) this.f26652l).purchase();
                ArrayList<AbstractC12866l> arrayList5 = (ArrayList) obj2;
                C16033l c16033l = C12183l.mopub;
                ArrayList arrayList6 = new ArrayList(AbstractC14055l.billing(arrayList5, 10));
                Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(((AbstractC12866l) it4.next()).getClass().getName());
                }
                c16221lPurchase.amazon(c16033l, AbstractC16901l.m4229l(arrayList6));
                for (AbstractC12866l abstractC12866l : arrayList5) {
                    C3067l c3067l = C12183l.amazon;
                    c3067l.getClass();
                    String canonicalName = abstractC12866l.getClass().getCanonicalName();
                    if (canonicalName == null) {
                        C8339l.metrica("no receiver name");
                        return null;
                    }
                    C16033l c16033lLoadAd = C3067l.loadAd(c3067l, canonicalName);
                    String canonicalName2 = abstractC12866l.purchase().getClass().getCanonicalName();
                    if (canonicalName2 == null) {
                        C8339l.metrica("no provider name");
                        return null;
                    }
                    c16221lPurchase.amazon(c16033lLoadAd, canonicalName2);
                }
                return c16221lPurchase.billing();
            case 22:
                AbstractC2829l.crashlytics(obj);
                C9122l c9122l = (C9122l) this.f26652l;
                boolean z3 = !c9122l.f18750l;
                c9122l.f18750l = z3;
                ((C17015l) obj2).invoke(Boolean.valueOf(z3));
                return Unit.INSTANCE;
            case 23:
                C14187l c14187l = (C14187l) this.f26652l;
                AbstractC2829l.crashlytics(obj);
                AbstractC0007l.amazon(c14187l, AbstractC8566l.loadAd, new C17049l(23));
                final C11644l c11644l = (C11644l) obj2;
                Function1 function1 = new Function1() { // from class: lؙٓۡ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        int i9 = i8;
                        int i10 = 21;
                        InterfaceC14029l interfaceC14029l = null;
                        C11644l c11644l2 = c11644l;
                        int i11 = 0;
                        switch (i9) {
                            case 0:
                                C0720l c0720l = (C0720l) obj5;
                                AbstractC11748l.firebase(c0720l, "/", C17721l.loadAd, new C16931l(13, new C11266l(c11644l2, interfaceC14029l, i11)));
                                for (C15814l c15814l : (List) c11644l2.f23357l) {
                                    c15814l.getClass();
                                    C4647l c4647l = new C4647l(c15814l, interfaceC14029l, i10);
                                    C17721l c17721l = C17721l.crashlytics;
                                    AbstractC11748l.firebase(c0720l, "/auth/start", c17721l, new C6509l(0, c4647l));
                                    AbstractC11748l.firebase(c0720l, "/auth/finish", c17721l, new C6509l(0, new C1537l(c15814l, interfaceC14029l, i11)));
                                }
                                break;
                            case 1:
                                AbstractC10999l.mopub((C18662l) c11644l2.f23358l, null, 0, new C0384l(c11644l2, (C18163l) ((C14187l) obj5).f27783l.get(), interfaceC14029l, i10), 3);
                                break;
                            default:
                                C1008l c1008l = (C1008l) c11644l2.f23360l;
                                C8195l c8195l = new C8195l(0, 0);
                                c1008l.getClass();
                                c1008l.remoteconfig(null, c8195l);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                C11911l c11911l = AbstractC5708l.yandex;
                C1770l c1770l = c14187l.f27779l;
                C6162l c6162l = C0720l.f2206l;
                C0720l c0720l = (C0720l) AbstractC0007l.crashlytics(c14187l).billing(c6162l.getKey());
                if (c0720l != null) {
                    function1.invoke(c0720l);
                }
                final int i9 = z ? 1 : 0;
                c1770l.subscription(AbstractC2749l.amazon, new Function1() { // from class: lؙٓۡ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        int i10 = i9;
                        int i11 = 21;
                        InterfaceC14029l interfaceC14029l = null;
                        C11644l c11644l2 = c11644l;
                        int i12 = 0;
                        switch (i10) {
                            case 0:
                                C0720l c0720l2 = (C0720l) obj5;
                                AbstractC11748l.firebase(c0720l2, "/", C17721l.loadAd, new C16931l(13, new C11266l(c11644l2, interfaceC14029l, i12)));
                                for (C15814l c15814l : (List) c11644l2.f23357l) {
                                    c15814l.getClass();
                                    C4647l c4647l = new C4647l(c15814l, interfaceC14029l, i11);
                                    C17721l c17721l = C17721l.crashlytics;
                                    AbstractC11748l.firebase(c0720l2, "/auth/start", c17721l, new C6509l(0, c4647l));
                                    AbstractC11748l.firebase(c0720l2, "/auth/finish", c17721l, new C6509l(0, new C1537l(c15814l, interfaceC14029l, i12)));
                                }
                                break;
                            case 1:
                                AbstractC10999l.mopub((C18662l) c11644l2.f23358l, null, 0, new C0384l(c11644l2, (C18163l) ((C14187l) obj5).f27783l.get(), interfaceC14029l, i11), 3);
                                break;
                            default:
                                C1008l c1008l = (C1008l) c11644l2.f23360l;
                                C8195l c8195l = new C8195l(0, 0);
                                c1008l.getClass();
                                c1008l.remoteconfig(null, c8195l);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                c1770l.subscription(AbstractC2749l.admob, new Function1() { // from class: lؙٓۡ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        int i10 = i7;
                        int i11 = 21;
                        InterfaceC14029l interfaceC14029l = null;
                        C11644l c11644l2 = c11644l;
                        int i12 = 0;
                        switch (i10) {
                            case 0:
                                C0720l c0720l2 = (C0720l) obj5;
                                AbstractC11748l.firebase(c0720l2, "/", C17721l.loadAd, new C16931l(13, new C11266l(c11644l2, interfaceC14029l, i12)));
                                for (C15814l c15814l : (List) c11644l2.f23357l) {
                                    c15814l.getClass();
                                    C4647l c4647l = new C4647l(c15814l, interfaceC14029l, i11);
                                    C17721l c17721l = C17721l.crashlytics;
                                    AbstractC11748l.firebase(c0720l2, "/auth/start", c17721l, new C6509l(0, c4647l));
                                    AbstractC11748l.firebase(c0720l2, "/auth/finish", c17721l, new C6509l(0, new C1537l(c15814l, interfaceC14029l, i12)));
                                }
                                break;
                            case 1:
                                AbstractC10999l.mopub((C18662l) c11644l2.f23358l, null, 0, new C0384l(c11644l2, (C18163l) ((C14187l) obj5).f27783l.get(), interfaceC14029l, i11), 3);
                                break;
                            default:
                                C1008l c1008l = (C1008l) c11644l2.f23360l;
                                C8195l c8195l = new C8195l(0, 0);
                                c1008l.getClass();
                                c1008l.remoteconfig(null, c8195l);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                InterfaceC2262l interfaceC2262l3 = (InterfaceC2262l) this.f26652l;
                AbstractC2829l.crashlytics(obj);
                InterfaceC12932l interfaceC12932lVip = interfaceC2262l3.vip();
                Function0 function0 = (Function0) obj2;
                try {
                    C1312l c1312l = new C1312l();
                    c1312l.f3401l = AbstractC11174l.subs(AbstractC11174l.mopub(interfaceC12932lVip), true, c1312l);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C1312l.f3399l;
                    try {
                        do {
                            i2 = atomicIntegerFieldUpdater.get(c1312l);
                            if (i2 != 0) {
                                if (i2 != 2 && i2 != 3) {
                                    C1312l.smaato(i2);
                                    throw null;
                                }
                            }
                            return function0.invoke();
                        } while (!atomicIntegerFieldUpdater.compareAndSet(c1312l, i2, 0));
                        return function0.invoke();
                    } finally {
                        c1312l.firebase();
                    }
                } catch (InterruptedException e3) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e3);
                }
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                AbstractC2829l.crashlytics(obj);
                ((C16221l) this.f26652l).amazon(C4595l.loadAd, (Long) obj2);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                AbstractC2829l.crashlytics(obj);
                C3152l c3152l = (C3152l) this.f26652l;
                AbstractC7858l abstractC7858l = (AbstractC7858l) c3152l.amazon(5);
                if (!abstractC7858l.f16395l.equals(c3152l)) {
                    abstractC7858l.crashlytics();
                    AbstractC7858l.amazon(abstractC7858l.f16394l, c3152l);
                }
                C6045l c6045l = (C6045l) obj2;
                C16886l c16886l = (C16886l) abstractC7858l;
                int iSubscription = ((C3152l) c16886l.f16394l).subscription();
                c16886l.crashlytics();
                C3152l.startapp((C3152l) c16886l.f16394l, iSubscription);
                c16886l.crashlytics();
                C3152l.metrica((C3152l) c16886l.f16394l);
                for (Map.Entry entry : c6045l.loadAd.entrySet()) {
                    C7300l c7300l = (C7300l) entry.getKey();
                    int iIntValue = ((Number) entry.getValue()).intValue();
                    if (c6045l.purchase.contains(new Integer(iIntValue))) {
                        C8194l c8194lAds = C13782l.ads();
                        c8194lAds.crashlytics();
                        C13782l.vip((C13782l) c8194lAds.f16394l, c7300l);
                        c8194lAds.crashlytics();
                        C13782l.metrica((C13782l) c8194lAds.f16394l, iIntValue);
                        c16886l.crashlytics();
                        C3152l.vip((C3152l) c16886l.f16394l, (C13782l) c8194lAds.yandex());
                    }
                }
                return c16886l.yandex();
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                AbstractC2829l.crashlytics(obj);
                ((AbstractC9694l) this.f26652l).ad((CatalogArtist) obj2);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                AbstractC2829l.crashlytics(obj);
                C17986l c17986l = (C17986l) this.f26652l;
                c17986l.f35169l.yandex((AppActivity) c17986l.f5081l, c17986l.f35167l, (List) obj2);
                return Unit.INSTANCE;
            default:
                AbstractC2829l.crashlytics(obj);
                InterfaceC2262l interfaceC2262l4 = (InterfaceC2262l) this.f26652l;
                C18351l c18351l = (C18351l) obj2;
                AbstractC6475l abstractC6475l = c18351l.f35867l;
                if (((C5268l) abstractC6475l).subs.compareTo(EnumC8981l.f18521l) >= 0) {
                    abstractC6475l.yandex(c18351l);
                } else {
                    AbstractC11174l.crashlytics(interfaceC2262l4.vip(), null);
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f26653l;
        Object obj2 = this.f26654l;
        switch (i) {
            case 0:
                return new C13624l((C2910l) this.f26652l, (C17887l) obj2, interfaceC14029l, 0);
            case 1:
                return new C13624l((C14894l) this.f26652l, (C17887l) obj2, interfaceC14029l, 1);
            case 2:
                return new C13624l((File) this.f26652l, (Bitmap) obj2, interfaceC14029l, 2);
            case 3:
                return new C13624l((C6252l) this.f26652l, (C17032l) obj2, interfaceC14029l, 3);
            case 4:
                return new C13624l((C13270l) this.f26652l, (C17032l) obj2, interfaceC14029l, 4);
            case 5:
                return new C13624l((C18163l) this.f26652l, (C10038l) obj2, interfaceC14029l, 5);
            case 6:
                return new C13624l((C15202l) this.f26652l, (C17266l) obj2, interfaceC14029l, 6);
            case 7:
                return new C13624l((String) this.f26652l, (C14232l) obj2, interfaceC14029l, 7);
            case 8:
                return new C13624l((C10596l) this.f26652l, (String) obj2, interfaceC14029l, 8);
            case 9:
                C13624l c13624l = new C13624l((C4456l) obj2, interfaceC14029l, 9);
                c13624l.f26652l = obj;
                return c13624l;
            case 10:
                return new C13624l((AbstractC13264l) this.f26652l, (C3981l) obj2, interfaceC14029l, 10);
            case 11:
                return new C13624l((C9879l) this.f26652l, (AudioPlaylist) obj2, interfaceC14029l, 11);
            case 12:
                C13624l c13624l2 = new C13624l((InterfaceC9354l) obj2, interfaceC14029l, 12);
                c13624l2.f26652l = obj;
                return c13624l2;
            case 13:
                C13624l c13624l3 = new C13624l((C11349l) obj2, interfaceC14029l, 13);
                c13624l3.f26652l = obj;
                return c13624l3;
            case 14:
                C13624l c13624l4 = new C13624l((C13404l) obj2, interfaceC14029l, 14);
                c13624l4.f26652l = obj;
                return c13624l4;
            case 15:
                C13624l c13624l5 = new C13624l((AbstractC12669l) obj2, interfaceC14029l, 15);
                c13624l5.f26652l = obj;
                return c13624l5;
            case 16:
                C13624l c13624l6 = new C13624l((DedicatedCacheMigrationService) obj2, interfaceC14029l, 16);
                c13624l6.f26652l = obj;
                return c13624l6;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C13624l c13624l7 = new C13624l((DedicatedCacheService) obj2, interfaceC14029l, 17);
                c13624l7.f26652l = obj;
                return c13624l7;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C13624l c13624l8 = new C13624l((DownloaderService) obj2, interfaceC14029l, 18);
                c13624l8.f26652l = obj;
                return c13624l8;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C13624l((C16854l) this.f26652l, (C4530l) obj2, interfaceC14029l, 19);
            case 20:
                C13624l c13624l9 = new C13624l((C18476l) obj2, interfaceC14029l, 20);
                c13624l9.f26652l = obj;
                return c13624l9;
            case 21:
                C13624l c13624l10 = new C13624l((ArrayList) obj2, interfaceC14029l, 21);
                c13624l10.f26652l = obj;
                return c13624l10;
            case 22:
                return new C13624l((C9122l) this.f26652l, (C17015l) obj2, interfaceC14029l, 22);
            case 23:
                C13624l c13624l11 = new C13624l((C11644l) obj2, interfaceC14029l, 23);
                c13624l11.f26652l = obj;
                return c13624l11;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C13624l c13624l12 = new C13624l((Function0) obj2, interfaceC14029l, 24);
                c13624l12.f26652l = obj;
                return c13624l12;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C13624l c13624l13 = new C13624l((Long) obj2, interfaceC14029l, 25);
                c13624l13.f26652l = obj;
                return c13624l13;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C13624l c13624l14 = new C13624l((C6045l) obj2, interfaceC14029l, 26);
                c13624l14.f26652l = obj;
                return c13624l14;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C13624l((AbstractC9694l) this.f26652l, (CatalogArtist) obj2, interfaceC14029l, 27);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C13624l((C17986l) this.f26652l, (List) obj2, interfaceC14029l, 28);
            default:
                C13624l c13624l15 = new C13624l((C18351l) obj2, interfaceC14029l, 29);
                c13624l15.f26652l = obj;
                return c13624l15;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26653l) {
            case 0:
                return ((C13624l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C13624l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C13624l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C13624l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C13624l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C13624l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C13624l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 7:
                return ((C13624l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 8:
                return ((C13624l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 9:
                return ((C13624l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 10:
                return ((C13624l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 11:
                return ((C13624l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 12:
                return ((C13624l) ads((InterfaceC14029l) obj2, obj)).Signature(Unit.INSTANCE);
            case 13:
                return ((C13624l) ads((InterfaceC14029l) obj2, (AbstractC10022l) obj)).Signature(Unit.INSTANCE);
            case 14:
                return ((C13624l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 15:
                return ((C13624l) ads((InterfaceC14029l) obj2, (AbstractC12669l) obj)).Signature(Unit.INSTANCE);
            case 16:
                return ((C13624l) ads((InterfaceC14029l) obj2, (C17098l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C13624l) ads((InterfaceC14029l) obj2, (C0590l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C13624l) ads((InterfaceC14029l) obj2, (C8350l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C13624l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 20:
                return ((C13624l) ads((InterfaceC14029l) obj2, (InterfaceC8639l) obj)).Signature(Unit.INSTANCE);
            case 21:
                return ((C13624l) ads((InterfaceC14029l) obj2, (C16221l) obj)).Signature(Unit.INSTANCE);
            case 22:
                return ((C13624l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 23:
                return ((C13624l) ads((InterfaceC14029l) obj2, (C14187l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C13624l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C13624l) ads((InterfaceC14029l) obj2, (C16221l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C13624l) ads((InterfaceC14029l) obj2, (C3152l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C13624l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C13624l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C13624l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13624l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f26653l = i;
        this.f26654l = obj;
    }
}
