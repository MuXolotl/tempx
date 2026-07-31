package defpackage;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.widget.Toast;
import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.internal.interop.loadAd;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkx.downloader.service.DownloaderService;
import ua.itaysonlab.vkxreborn.cache.path_migration.DedicatedCacheMigrationService;
import ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* JADX INFO: renamed from: lّٔ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14951l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f29421l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f29422l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14951l(InterfaceC14029l interfaceC14029l, C14358l c14358l) {
        super(2, interfaceC14029l);
        this.f29421l = 17;
        this.f29422l = c14358l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = 29;
        C14965l c14965l = 0;
        int i2 = 0;
        switch (this.f29421l) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                C0483l c0483l = (C0483l) this.f29422l;
                C9879l c9879l = c0483l.yandex;
                boolean z = ((Boolean) c0483l.amazon.getValue()).booleanValue() || c0483l.vip() != EnumC6302l.f13255l;
                if (((C10235l) c9879l.purchase.getValue()) == null) {
                    c9879l.yandex.f36642l.amazon(z);
                }
                c9879l.ads.admob.setValue(Boolean.valueOf(c0483l.vip() == EnumC6302l.f13254l));
                return Unit.INSTANCE;
            case 1:
                AbstractC2829l.crashlytics(obj);
                ((C1774l) this.f29422l).f4197l.setValue(C1774l.m1045public());
                return Unit.INSTANCE;
            case 2:
                AbstractC2829l.crashlytics(obj);
                ((NextDockView) ((AppActivity) this.f29422l).f36640l.f15742l).loadAd(String.valueOf(AbstractC8669l.m2398catch(EnumC12111l.f24083l, (EnumC12111l[]) C11538l.f23209l.f833l)), true, true);
                return Unit.INSTANCE;
            case 3:
                AbstractC2829l.crashlytics(obj);
                ((C15178l) this.f29422l).yandex();
                return Unit.INSTANCE;
            case 4:
                AbstractC2829l.crashlytics(obj);
                ((C9991l) this.f29422l).f20388l.setValue(AbstractC7462l.yandex());
                return Unit.INSTANCE;
            case 5:
                AbstractC2829l.crashlytics(obj);
                C4645l c4645l = (C4645l) AbstractC16584l.loadAd().f15735l;
                C4645l.Companion.getClass();
                if (!AbstractC8576l.yandex(c4645l, C4645l.smaato)) {
                    ((C2814l) this.f29422l).yandex.premium();
                }
                return Unit.INSTANCE;
            case 6:
                AbstractC2829l.crashlytics(obj);
                AudioTrack audioTrack = (AudioTrack) this.f29422l;
                return new Long(AbstractC6427l.smaato(AbstractC0825l.subs(audioTrack.f36605package ? 3 : 2, AbstractC16676l.mopub(audioTrack))));
            case 7:
                AbstractC2829l.crashlytics(obj);
                ((C15068l) this.f29422l).mo1143default();
                return Unit.INSTANCE;
            case 8:
                AbstractC2829l.crashlytics(obj);
                C6523l.loadAd((C6523l) this.f29422l);
                return Unit.INSTANCE;
            case 9:
                AbstractC2829l.crashlytics(obj);
                ((C15202l) this.f29422l).remoteconfig(true);
                return Unit.INSTANCE;
            case 10:
                AbstractC2829l.crashlytics(obj);
                C12382l c12382l = AbstractC5921l.f12465l;
                String str = C14025l.f27330l;
                c12382l.adcel(C6162l.ads(((C18014l) this.f29422l).f34617l.getFilesDir()).purchase("vkx_main_cdcm"), false);
                C8688l c8688l = AbstractC0085l.yandex;
                c12382l.ads(C6162l.ads(AbstractC8182l.loadAd().crashlytics()));
                return Unit.INSTANCE;
            case 11:
                AbstractC2829l.crashlytics(obj);
                C12752l c12752l = (C12752l) this.f29422l;
                Boolean bool = (Boolean) ((C7549l) AbstractC16584l.yandex().billing.admob).f15551l.getValue();
                bool.getClass();
                c12752l.f25123l.setValue(bool);
                return Unit.INSTANCE;
            case 12:
                AbstractC2829l.crashlytics(obj);
                byte[] bArr = (byte[]) this.f29422l;
                return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            case 13:
                AbstractC2829l.crashlytics(obj);
                ((C4456l) this.f29422l).purchase();
                return Unit.INSTANCE;
            case 14:
                AbstractC2829l.crashlytics(obj);
                String str2 = AbstractC16733l.yandex;
                C7718l c7718l = (C7718l) this.f29422l;
                C14513l.tapsense().vip(str2, "Constraints changed for " + c7718l);
                return Unit.INSTANCE;
            case 15:
                AbstractC2829l.crashlytics(obj);
                DedicatedCacheMigrationService dedicatedCacheMigrationService = (DedicatedCacheMigrationService) this.f29422l;
                AbstractC12832l.mopub(new C10288l(dedicatedCacheMigrationService.f36652l, dedicatedCacheMigrationService.f36654l), AbstractC11990l.firebase(dedicatedCacheMigrationService));
                return Unit.INSTANCE;
            case 16:
                AbstractC2829l.crashlytics(obj);
                ((DedicatedCacheService) this.f29422l).amazon();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                AbstractC2829l.crashlytics(obj);
                C6267l c6267l = ((C14358l) this.f29422l).crashlytics;
                if (c6267l != null) {
                    c6267l.close();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                AbstractC2829l.crashlytics(obj);
                C5613l c5613l = (C5613l) this.f29422l;
                synchronized (c5613l.f11920l) {
                    if (!c5613l.f11917l || c5613l.f11933l) {
                        return Unit.INSTANCE;
                    }
                    try {
                        c5613l.m1834package();
                        break;
                    } catch (IOException unused) {
                        c5613l.f11926l = true;
                    }
                    try {
                        if ((c5613l.f11925l >= 2000 ? 1 : 0) != 0) {
                            c5613l.m1835private();
                        }
                        break;
                    } catch (IOException unused2) {
                        c5613l.f11921l = true;
                        c5613l.f11932l = new C7167l(new C5397l());
                    }
                    return Unit.INSTANCE;
                }
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                AbstractC2829l.crashlytics(obj);
                ((DownloaderService) this.f29422l).amazon();
                return Unit.INSTANCE;
            case 20:
                AbstractC2829l.crashlytics(obj);
                return (C3597l) this.f29422l;
            case 21:
                AbstractC2829l.crashlytics(obj);
                C13046l c13046l = (C13046l) this.f29422l;
                C13802l c13802l = new C13802l(i, c13046l);
                if (AbstractC12227l.yandex) {
                    c13046l.loadAd.subscription(AbstractC2749l.yandex, new C10207l(c13046l, c13802l, 9));
                }
                ReentrantReadWriteLock reentrantReadWriteLock = c13046l.purchase;
                ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    lock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    try {
                        C8195l c8195lAmazon = c13046l.amazon();
                        C14187l c14187l = (C14187l) c8195lAmazon.f17098l;
                        ClassLoader classLoader = (ClassLoader) c8195lAmazon.f17097l;
                        c13046l.firebase = c14187l;
                        c13046l.mopub = classLoader;
                        Unit unit = Unit.INSTANCE;
                        for (int i4 = 0; i4 < readHoldCount; i4++) {
                            lock.lock();
                        }
                        writeLock.unlock();
                        AbstractC10999l.mopub(AbstractC11990l.yandex(c13046l.purchase().f27778l), null, 0, new C11039l(c13046l, c14965l, 26), 3);
                        C18163l c18163l = c13046l.smaato;
                        c18163l.getClass();
                        return c13046l;
                    } catch (Throwable th) {
                        while (i2 < readHoldCount) {
                            lock.lock();
                            i2++;
                        }
                        writeLock.unlock();
                        throw th;
                    }
                } catch (Throwable th2) {
                    c13046l.billing();
                    if (!c13046l.subs.isEmpty()) {
                        c13046l.crashlytics();
                    }
                    throw th2;
                }
            case 22:
                AbstractC2829l.crashlytics(obj);
                C4560l c4560l = (C4560l) this.f29422l;
                if (c4560l.m1555import().yandex == EnumC9763l.f19904l && c4560l.m1555import().loadAd) {
                    c4560l.f9229l.setValue(Boolean.TRUE);
                    c4560l.f9236l.setValue("");
                    AbstractC10999l.mopub(AbstractC11990l.firebase(c4560l), null, 0, new C11039l(c4560l, c14965l, 28), 3);
                }
                return Unit.INSTANCE;
            case 23:
                AbstractC2829l.crashlytics(obj);
                Activity activityIsVip = ((C0936l) this.f29422l).isVip();
                AbstractC11708l.yandex(new C15245l(i2, activityIsVip, activityIsVip.getResources().getString(R.string.widgets_settings_apply_aw)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                AbstractC2829l.crashlytics(obj);
                C4645l c4645l2 = (C4645l) AbstractC16584l.loadAd().f15735l;
                C4645l.Companion.getClass();
                if (!AbstractC8576l.yandex(c4645l2, C4645l.smaato)) {
                    ((AppActivity) ((C17984l) this.f29422l).isVip()).premium();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                AbstractC2829l.crashlytics(obj);
                ((C1027l) this.f29422l).invoke();
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                AbstractC2829l.crashlytics(obj);
                return loadAd.yandex(((InterfaceC16228l) ((C2494l) this.f29422l).f5291l).mo1176l());
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                AbstractC2829l.crashlytics(obj);
                Toast.makeText(((C0228l) this.f29422l).f5081l, "Произошла ошибка при изменении плейлиста", 0).show();
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C2169l c2169l = (C2169l) this.f29422l;
                C13884l c13884l = c2169l.f4810l;
                AbstractC2829l.crashlytics(obj);
                if (Build.VERSION.SDK_INT >= 29) {
                    if (C14965l.f29439l == null) {
                        VKXApplication vKXApplication = VKXApplication.f36631l;
                        if (vKXApplication == null) {
                            vKXApplication = null;
                        }
                        C14965l.f29439l = new C14965l(vKXApplication.getApplicationContext().getContentResolver());
                    }
                    C14965l c14965l2 = C14965l.f29439l;
                    if (c14965l2 == null) {
                        c14965l2 = null;
                    }
                    c2169l.f4811l.setValue(AbstractC0509l.purchase(AbstractC10000l.ad(c14965l2, new C0554l(new C8392l(0), new C11318l(false, 2), new AbstractC1401l[]{new C2645l(AbstractC2812l.ads(c13884l.yandex, "artist_id == "))}))));
                }
                if (C14965l.f29439l == null) {
                    VKXApplication vKXApplication2 = VKXApplication.f36631l;
                    if (vKXApplication2 == null) {
                        vKXApplication2 = null;
                    }
                    C14965l.f29439l = new C14965l(vKXApplication2.getApplicationContext().getContentResolver());
                }
                C14965l c14965l3 = C14965l.f29439l;
                c2169l.f4812l.setValue(AbstractC0509l.purchase(AbstractC10000l.ad(c14965l3 != null ? c14965l3 : 0, new C0554l(new C8392l(2), new C11318l(), new AbstractC1401l[]{new C2645l(), new C2645l(c13884l.yandex)}))));
                return Unit.INSTANCE;
            default:
                AbstractC2829l.crashlytics(obj);
                C16042l c16042l = (C16042l) this.f29422l;
                if (C14965l.f29439l == null) {
                    VKXApplication vKXApplication3 = VKXApplication.f36631l;
                    if (vKXApplication3 == null) {
                        vKXApplication3 = null;
                    }
                    C14965l.f29439l = new C14965l(vKXApplication3.getApplicationContext().getContentResolver());
                }
                C14965l c14965l4 = C14965l.f29439l;
                c16042l.f31434l.setValue(AbstractC0509l.purchase(AbstractC10000l.ad(c14965l4 != null ? c14965l4 : null, new C0554l(new C8392l(2), new C11318l(), new AbstractC1401l[]{new C2645l(), new C2645l(AbstractC2812l.ads(c16042l.f31433l.yandex, "album_id == "))}))));
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f29421l;
        Object obj2 = this.f29422l;
        switch (i) {
            case 0:
                return new C14951l((C0483l) obj2, interfaceC14029l, 0);
            case 1:
                return new C14951l((C1774l) obj2, interfaceC14029l, 1);
            case 2:
                return new C14951l((AppActivity) obj2, interfaceC14029l, 2);
            case 3:
                return new C14951l((C15178l) obj2, interfaceC14029l, 3);
            case 4:
                return new C14951l((C9991l) obj2, interfaceC14029l, 4);
            case 5:
                return new C14951l((C2814l) obj2, interfaceC14029l, 5);
            case 6:
                return new C14951l((AudioTrack) obj2, interfaceC14029l, 6);
            case 7:
                return new C14951l((C15068l) obj2, interfaceC14029l, 7);
            case 8:
                return new C14951l((C6523l) obj2, interfaceC14029l, 8);
            case 9:
                return new C14951l((C15202l) obj2, interfaceC14029l, 9);
            case 10:
                return new C14951l((C18014l) obj2, interfaceC14029l, 10);
            case 11:
                return new C14951l((C12752l) obj2, interfaceC14029l, 11);
            case 12:
                return new C14951l((byte[]) obj2, interfaceC14029l, 12);
            case 13:
                return new C14951l((C4456l) obj2, interfaceC14029l, 13);
            case 14:
                return new C14951l((C7718l) obj2, interfaceC14029l, 14);
            case 15:
                return new C14951l((DedicatedCacheMigrationService) obj2, interfaceC14029l, 15);
            case 16:
                return new C14951l((DedicatedCacheService) obj2, interfaceC14029l, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C14951l(interfaceC14029l, (C14358l) obj2);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C14951l((C5613l) obj2, interfaceC14029l, 18);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C14951l((DownloaderService) obj2, interfaceC14029l, 19);
            case 20:
                return new C14951l((C3597l) obj2, interfaceC14029l, 20);
            case 21:
                return new C14951l((C13046l) obj2, interfaceC14029l, 21);
            case 22:
                return new C14951l((C4560l) obj2, interfaceC14029l, 22);
            case 23:
                return new C14951l((C0936l) obj2, interfaceC14029l, 23);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C14951l((C17984l) obj2, interfaceC14029l, 24);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C14951l((C1027l) obj2, interfaceC14029l, 25);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C14951l((C2494l) obj2, interfaceC14029l, 26);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C14951l((C0228l) obj2, interfaceC14029l, 27);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C14951l((C2169l) obj2, interfaceC14029l, 28);
            default:
                return new C14951l((C16042l) obj2, interfaceC14029l, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29421l) {
            case 0:
                return ((C14951l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C14951l) ads((InterfaceC14029l) obj2, (C7541l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C14951l) ads((InterfaceC14029l) obj2, (C4537l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C14951l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C14951l) ads((InterfaceC14029l) obj2, (C10088l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C14951l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C14951l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 7:
                return ((C14951l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 8:
                return ((C14951l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 9:
                return ((C14951l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 10:
                return ((C14951l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 11:
                return ((C14951l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 12:
                return ((C14951l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 13:
                return ((C14951l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 14:
                return ((C14951l) ads((InterfaceC14029l) obj2, (AbstractC13306l) obj)).Signature(Unit.INSTANCE);
            case 15:
                return ((C14951l) ads((InterfaceC14029l) obj2, (C0241l) obj)).Signature(Unit.INSTANCE);
            case 16:
                return ((C14951l) ads((InterfaceC14029l) obj2, (C17684l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C14951l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C14951l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C14951l) ads((InterfaceC14029l) obj2, (C11935l) obj)).Signature(Unit.INSTANCE);
            case 20:
                C14951l c14951l = (C14951l) ads((InterfaceC14029l) obj2, (C3597l) obj);
                AbstractC2829l.crashlytics(Unit.INSTANCE);
                return (C3597l) c14951l.f29422l;
            case 21:
                return ((C14951l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 22:
                return ((C14951l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 23:
                return ((C14951l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C14951l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C14951l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C14951l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C14951l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C14951l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C14951l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14951l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f29421l = i;
        this.f29422l = obj;
    }
}
