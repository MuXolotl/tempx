package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import com.samsung.android.app.musiclibrary.ui.widget.TransitionView;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lًؑٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0464l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f1696l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f1697l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1698l;

    public /* synthetic */ C0464l(AbstractC11141l abstractC11141l, C9987l c9987l, WritableByteChannel writableByteChannel) {
        this.f1698l = 23;
        this.f1697l = c9987l;
        this.f1696l = writableByteChannel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Executor executorC3688l;
        C17781l c17781lCrashlytics;
        C2773l c2773l;
        int i = 5;
        int i2 = 4;
        final int i3 = 2;
        int i4 = 3;
        int i5 = 0;
        switch (this.f1698l) {
            case 0:
                C0483l c0483l = (C0483l) this.f1697l;
                ((C13765l) this.f1696l).subs(((Float) obj).floatValue());
                c0483l.amazon.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 1:
                C0483l c0483l2 = (C0483l) this.f1697l;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) this.f1696l;
                TransitionView transitionView = new TransitionView((Context) obj);
                C18572l c18572l = (C18572l) interfaceC8714l.getValue();
                if (c18572l != null) {
                    Activity activity = c18572l.f36261l;
                    if (activity instanceof AbstractActivityC14666l) {
                        c18572l.onDestroy((AbstractActivityC14666l) activity);
                    }
                }
                C18572l c18572l2 = new C18572l(c0483l2.yandex.yandex, transitionView);
                C9478l c9478l = c18572l2.f36260l;
                if (c9478l != null && !c9478l.amazon) {
                    c9478l.amazon = true;
                    if (c9478l.purchase) {
                        ((ValueAnimator) c9478l.billing.subs()).resume();
                    }
                }
                interfaceC8714l.setValue(c18572l2);
                return transitionView;
            case 2:
                C0483l c0483l3 = (C0483l) this.f1697l;
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f1696l;
                EnumC12999l enumC12999l = (EnumC12999l) obj;
                if (enumC12999l == null || enumC12999l == EnumC12999l.f25471l || enumC12999l == EnumC12999l.f25470l || ((Boolean) ((C7549l) AbstractC16584l.yandex().billing.admob).f15551l.getValue()).booleanValue()) {
                    AbstractC10999l.mopub(interfaceC2262l, null, 0, new C12086l(c0483l3, enumC12999l, 0 == true ? 1 : 0, 0 == true ? 1 : 0), 3);
                } else {
                    new C14107l().Signature(c0483l3.yandex.yandex);
                }
                return Unit.INSTANCE;
            case 3:
                ((C2403l) this.f1697l).loadAd((C10129l) this.f1696l);
                return Unit.INSTANCE;
            case 4:
                C13325l c13325l = (C13325l) this.f1697l;
                C2540l c2540l = (C2540l) this.f1696l;
                C13325l c13325l2 = ((C1883l) obj).yandex;
                return Boolean.valueOf(AbstractC8576l.yandex(c13325l2.f26145l, c13325l.f26145l) && AbstractC12359l.crashlytics(c13325l2, c2540l));
            case 5:
                C10987l c10987l = (C10987l) this.f1697l;
                C14061l c14061l = (C14061l) this.f1696l;
                long jIsPro = C1187l.isPro((AbstractC5573l.metrica(c10987l).f7691l == EnumC9931l.f20222l && c10987l.f24782l == EnumC7283l.f15125l) ? -1.0f : 1.0f, ((C3995l) obj).yandex);
                c14061l.yandex(c10987l.f22135l.isPro(Float.intBitsToFloat((int) (c10987l.f24782l == EnumC7283l.f15126l ? jIsPro & 4294967295L : jIsPro >> 32))), 0.0f);
                return Unit.INSTANCE;
            case 6:
                AbstractC10999l.mopub((InterfaceC2262l) this.f1697l, null, 0, new C10291l(((Boolean) obj).booleanValue(), this.f1696l, (InterfaceC14029l) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0)), 3);
                return Unit.INSTANCE;
            case 7:
                EnumC0442l enumC0442l = (EnumC0442l) this.f1697l;
                Function0 function0 = (Function0) this.f1696l;
                if (!((Boolean) obj).booleanValue() && !enumC0442l.f1623l) {
                    return Unit.INSTANCE;
                }
                VKXApplication vKXApplication = VKXApplication.f36631l;
                VKXApplication vKXApplication2 = vKXApplication != null ? vKXApplication : null;
                EnumC0442l[] enumC0442lArrValues = EnumC0442l.values();
                int length = enumC0442lArrValues.length;
                for (int i6 = 0; i6 < length; i6++) {
                    EnumC0442l enumC0442l2 = enumC0442lArrValues[i6];
                    vKXApplication2.getPackageManager().setComponentEnabledSetting(AbstractC14147l.loadAd(vKXApplication2, enumC0442l2), (enumC0442l2 == enumC0442l) != false ? 1 : 2, 1);
                }
                function0.invoke();
                return Unit.INSTANCE;
            case 8:
                CatalogArtist catalogArtist = (CatalogArtist) this.f1697l;
                C13379l c13379l = (C13379l) this.f1696l;
                new C4456l(new C18396l(catalogArtist, new Cconst(0, c13379l, C13379l.class, "callForceRefresh", "callForceRefresh()V", 0, 0, 25), 28)).Signature(c13379l.isVip());
                return Unit.INSTANCE;
            case 9:
                InterfaceC13238l interfaceC13238l = (InterfaceC13238l) this.f1697l;
                ((C1336l) obj).firebase(((AbstractC7095l) interfaceC13238l).pro(), null, new Creturn(interfaceC13238l, 5, false), new C15578l(802480018, true, new C4232l(interfaceC13238l, (Function1) this.f1696l, 0 == true ? 1 : 0)));
                return Unit.INSTANCE;
            case 10:
                AbstractC10999l.mopub((InterfaceC2262l) this.f1697l, null, 0, new C5163l((C5766l) this.f1696l, (C5419l) obj, 0 == true ? 1 : 0, i), 3);
                return Unit.INSTANCE;
            case 11:
                final C3659l c3659l = (C3659l) this.f1697l;
                final View view = (View) this.f1696l;
                InterfaceC13742l interfaceC13742l = (InterfaceC13742l) obj;
                final byte b = 0 == true ? 1 : 0;
                ((C13856l) interfaceC13742l).yandex(R.string.bs_header_cache, R.drawable.ic_download_outline_28, new Function0() { // from class: lٍٟ٘
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i7 = b;
                        View view2 = view;
                        C3659l c3659l2 = c3659l;
                        switch (i7) {
                            case 0:
                                new C17986l(C7635l.yandex, new VKProfile(c3659l2.crashlytics, null, null, c3659l2.amazon, c3659l2.purchase, null, null, 102)).Signature(C9967l.mopub(view2.getContext()));
                                break;
                            default:
                                new C17986l(C6191l.yandex, new VKProfile(c3659l2.crashlytics, null, null, c3659l2.amazon, c3659l2.purchase, null, null, 102)).Signature(C9967l.mopub(view2.getContext()));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                final boolean z = true ? 1 : 0;
                ((C13856l) interfaceC13742l).yandex(R.string.action_audio_dl, R.drawable.ic_download_cloud_outline_28, new Function0() { // from class: lٍٟ٘
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i7 = z;
                        View view2 = view;
                        C3659l c3659l2 = c3659l;
                        switch (i7) {
                            case 0:
                                new C17986l(C7635l.yandex, new VKProfile(c3659l2.crashlytics, null, null, c3659l2.amazon, c3659l2.purchase, null, null, 102)).Signature(C9967l.mopub(view2.getContext()));
                                break;
                            default:
                                new C17986l(C6191l.yandex, new VKProfile(c3659l2.crashlytics, null, null, c3659l2.amazon, c3659l2.purchase, null, null, 102)).Signature(C9967l.mopub(view2.getContext()));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                return Unit.INSTANCE;
            case 12:
                C16873l c16873l = (C16873l) this.f1697l;
                C3877l c3877l = (C3877l) this.f1696l;
                C6606l c6606l = c16873l.f32929l;
                if (c6606l != null) {
                    c6606l.loadAd();
                }
                c16873l.f32929l = null;
                C9426l c9426l = c3877l.f8010l;
                if (c9426l != null) {
                    c9426l.m3885new(Unit.INSTANCE);
                }
                c3877l.f8010l = null;
                return Unit.INSTANCE;
            case 13:
                C16590l c16590l = (C16590l) this.f1697l;
                C10968l c10968l = (C10968l) this.f1696l;
                c16590l.yandex(c10968l);
                return new C18616l(c16590l, c10968l, 0 == true ? 1 : 0);
            case 14:
                C8807l c8807l = (C8807l) this.f1697l;
                C4297l c4297l = (C4297l) this.f1696l;
                C14187l c14187l = (C14187l) obj;
                C8403l c8403l = c14187l.f14096l;
                C8403l c8403l2 = c14187l.f14097l;
                if (!c8807l.yandex) {
                    TimeZone timeZone = AbstractC7973l.yandex;
                    c8807l.loadAd = System.currentTimeMillis();
                }
                c8403l.smaato(c4297l.f8786l);
                c8403l2.smaato(c4297l.f8787l);
                InterfaceC6272l interfaceC6272l = AbstractC12761l.yandex;
                C12222l c12222l = C8403l.f17397l;
                c8403l.firebase(c12222l, new C14082l(i4, (InterfaceC14029l) (0 == true ? 1 : 0), i3));
                C12222l c12222l2 = new C12222l("AfterTransform");
                c8403l.subs(c12222l, c12222l2);
                c8403l.firebase(c12222l2, new C7690l(i4, 0 == true ? 1 : 0, i2));
                C12222l c12222l3 = C8403l.f17379l;
                c8403l2.firebase(c12222l3, new C7690l(i4, 0 == true ? 1 : 0, i4));
                c14187l.firebase(C6731l.f14094l, new C14995l(i4, 0 == true ? 1 : 0, 0 == true ? 1 : 0));
                c14187l.firebase(C6731l.f14090l, new C14995l(i4, 0 == true ? 1 : 0, true ? 1 : 0));
                C12222l c12222l4 = new C12222l("BodyTransformationCheckPostRender");
                c8403l2.subs(c12222l3, c12222l4);
                c8403l2.firebase(c12222l4, new C7690l(i4, 0 == true ? 1 : 0, 0 == true ? 1 : 0));
                return Unit.INSTANCE;
            case 15:
                C8807l c8807l2 = (C8807l) this.f1697l;
                C10038l c10038l = (C10038l) this.f1696l;
                TimeZone timeZone2 = AbstractC7973l.yandex;
                double dCurrentTimeMillis = (System.currentTimeMillis() - c8807l2.loadAd) / 1000.0d;
                boolean z2 = c8807l2.yandex;
                InterfaceC6272l interfaceC6272l2 = (InterfaceC6272l) c10038l.f20462l;
                if (z2) {
                    interfaceC6272l2.firebase("Application started in " + dCurrentTimeMillis + " seconds.");
                    c8807l2.yandex = false;
                } else {
                    interfaceC6272l2.firebase("Application auto-reloaded in " + dCurrentTimeMillis + " seconds.");
                }
                return Unit.INSTANCE;
            case 16:
                C0639l c0639l = (C0639l) this.f1697l;
                Function1 function1 = (Function1) this.f1696l;
                C0639l c0639l2 = (C0639l) obj;
                if (!AbstractC8576l.yandex(c0639l, c0639l2)) {
                    function1.invoke(c0639l2);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C12870l c12870l = (C12870l) this.f1697l;
                AbstractC9544l abstractC9544l = (AbstractC9544l) this.f1696l;
                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                AbstractC9361l.vip(interfaceC13349l, c12870l.crashlytics, 0L, 0L, 0.0f, null, null, c12870l.loadAd, 62);
                AbstractC9361l.vip(interfaceC13349l, abstractC9544l, 0L, 0L, 0.0f, null, null, 6, 62);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C4951l) this.f1697l).invoke((InterfaceC13349l) obj, (C11925l) this.f1696l);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C9902l c9902l = (C9902l) this.f1697l;
                AbstractC9544l abstractC9544l2 = (AbstractC9544l) this.f1696l;
                C6742l c6742l = (C6742l) obj;
                c6742l.yandex();
                AbstractC9361l.smaato(c6742l, c9902l, abstractC9544l2, 0.0f, null, null, 60);
                return Unit.INSTANCE;
            case 20:
                C13616l c13616l = (C13616l) this.f1697l;
                AbstractC9544l abstractC9544l3 = (AbstractC9544l) this.f1696l;
                C6742l c6742l2 = (C6742l) obj;
                c6742l2.yandex();
                AbstractC9361l.smaato(c6742l2, c13616l.amazon, abstractC9544l3, 0.0f, null, null, 60);
                return Unit.INSTANCE;
            case 21:
                ((C17893l) ((C1770l) this.f1697l).f4179l).remoteconfig((C8439l) this.f1696l);
                return Unit.INSTANCE;
            case 22:
                ((C9987l) this.f1697l).f20387l = ((ReadableByteChannel) this.f1696l).read((ByteBuffer) obj);
                return Unit.INSTANCE;
            case 23:
                C9987l c9987l = (C9987l) this.f1697l;
                WritableByteChannel writableByteChannel = (WritableByteChannel) this.f1696l;
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                while (byteBuffer.hasRemaining()) {
                    do {
                        c9987l.f20387l = writableByteChannel.write(byteBuffer);
                        if (!byteBuffer.hasRemaining()) {
                        }
                        break;
                    } while (c9987l.f20387l > 0);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                InterfaceC13238l interfaceC13238l2 = (InterfaceC13238l) this.f1697l;
                ((C1336l) obj).firebase(((AbstractC7095l) interfaceC13238l2).pro(), null, new Creturn(interfaceC13238l2, 13, false), new C15578l(802480018, true, new C6780l(interfaceC13238l2, (C9430l) this.f1696l, true ? 1 : 0)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) this.f1697l;
                final C9430l c9430l = (C9430l) this.f1696l;
                C1336l c1336l = (C1336l) obj;
                if (!((C16187l) interfaceC12244l.getValue()).crashlytics.isEmpty()) {
                    final byte b2 = 0 == true ? 1 : 0;
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(1372687529, true, new Function3() { // from class: l٘ؖۖ
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i7 = b2;
                            C6956l c6956l = (C6956l) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            switch (i7) {
                                case 0:
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c9430l.m2652finally(AbstractC11999l.purchase(c6956l, R.string.fake_catalog_playlists), null, c6956l, 0, 2);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                                case 1:
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c9430l.m2652finally(AbstractC11999l.purchase(c6956l, R.string.fake_catalog_tracks), AbstractC11999l.purchase(c6956l, R.string.cache_v2_sort_title), c6956l, 0, 0);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                                default:
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c9430l.m2652finally(AbstractC11999l.purchase(c6956l, R.string.fake_catalog_tracks), AbstractC11999l.purchase(c6956l, R.string.cache_v2_sort_artist), c6956l, 0, 0);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }), 3);
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-270407072, true, new C18177l(c9430l, interfaceC12244l, true ? 1 : 0)), 3);
                }
                if (!((C16187l) interfaceC12244l.getValue()).yandex.isEmpty()) {
                    final boolean z3 = true ? 1 : 0;
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1371547552, true, new Function3() { // from class: l٘ؖۖ
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i7 = z3;
                            C6956l c6956l = (C6956l) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            switch (i7) {
                                case 0:
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c9430l.m2652finally(AbstractC11999l.purchase(c6956l, R.string.fake_catalog_playlists), null, c6956l, 0, 2);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                                case 1:
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c9430l.m2652finally(AbstractC11999l.purchase(c6956l, R.string.fake_catalog_tracks), AbstractC11999l.purchase(c6956l, R.string.cache_v2_sort_title), c6956l, 0, 0);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                                default:
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c9430l.m2652finally(AbstractC11999l.purchase(c6956l, R.string.fake_catalog_tracks), AbstractC11999l.purchase(c6956l, R.string.cache_v2_sort_artist), c6956l, 0, 0);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }), 3);
                    InterfaceC13238l interfaceC13238l3 = ((C16187l) interfaceC12244l.getValue()).yandex;
                    c1336l.firebase(((AbstractC7095l) interfaceC13238l3).pro(), null, new Creturn(interfaceC13238l3, 11, false), new C15578l(802480018, true, new C3315l(interfaceC13238l3, c9430l, interfaceC12244l, 0 == true ? 1 : 0)));
                }
                if (!((C16187l) interfaceC12244l.getValue()).loadAd.isEmpty()) {
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-794351839, true, new Function3() { // from class: l٘ؖۖ
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i7 = i3;
                            C6956l c6956l = (C6956l) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            switch (i7) {
                                case 0:
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c9430l.m2652finally(AbstractC11999l.purchase(c6956l, R.string.fake_catalog_playlists), null, c6956l, 0, 2);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                                case 1:
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c9430l.m2652finally(AbstractC11999l.purchase(c6956l, R.string.fake_catalog_tracks), AbstractC11999l.purchase(c6956l, R.string.cache_v2_sort_title), c6956l, 0, 0);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                                default:
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c9430l.m2652finally(AbstractC11999l.purchase(c6956l, R.string.fake_catalog_tracks), AbstractC11999l.purchase(c6956l, R.string.cache_v2_sort_artist), c6956l, 0, 0);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }), 3);
                    InterfaceC13238l interfaceC13238l4 = ((C16187l) interfaceC12244l.getValue()).loadAd;
                    c1336l.firebase(((AbstractC7095l) interfaceC13238l4).pro(), null, new Creturn(interfaceC13238l4, 12, false), new C15578l(802480018, true, new C3315l(interfaceC13238l4, c9430l, interfaceC12244l, true ? 1 : 0)));
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C15068l c15068l = (C15068l) this.f1697l;
                InterfaceC12244l interfaceC12244l2 = (InterfaceC12244l) this.f1696l;
                C1336l c1336l2 = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l2, null, null, new C15578l(1852538555, true, new C4360l(c15068l, 0 == true ? 1 : 0)), 3);
                InterfaceC13238l interfaceC13238l5 = (InterfaceC13238l) interfaceC12244l2.getValue();
                int i7 = C15304l.f29913l;
                c1336l2.firebase(((AbstractC7095l) interfaceC13238l5).pro(), new C5640l(interfaceC13238l5, 2), new C5640l(interfaceC13238l5, i4, 0 == true ? 1 : 0), new C15578l(802480018, true, new C6780l(interfaceC13238l5, c15068l, i3)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                InterfaceC3177l interfaceC3177l = (InterfaceC3177l) this.f1697l;
                Function1 function2 = (Function1) this.f1696l;
                Context context = (Context) obj;
                C18089l c18089l = new C18089l(context);
                AbstractC1872l abstractC1872lMo1066while = AbstractC11463l.yandex.mo1066while(2);
                AbstractC16620l abstractC16620l = abstractC1872lMo1066while instanceof AbstractC16620l ? (AbstractC16620l) abstractC1872lMo1066while : null;
                if (abstractC16620l == null || (executorC3688l = abstractC16620l.mo1128l()) == null) {
                    executorC3688l = new ExecutorC3688l(abstractC1872lMo1066while);
                }
                C14605l c14605l = new C14605l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, executorC3688l);
                C13411l c13411l = (C13411l) C7854l.crashlytics().yandex(C13411l.class);
                C1976l c1976l = (C1976l) c13411l.yandex.m216l(c14605l);
                c13411l.loadAd.getClass();
                String str = true != AbstractC14693l.crashlytics() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
                synchronized (AbstractC12366l.class) {
                    c17781lCrashlytics = AbstractC12366l.crashlytics(new C17413l(str, 1));
                }
                C0671l c0671l = new C0671l(c14605l, c1976l, executorC3688l, c17781lCrashlytics);
                AbstractC12225l.crashlytics();
                int i8 = c18089l.loadAd;
                if (2 != i8) {
                    c18089l.loadAd = 2;
                    AbstractC12225l.crashlytics();
                    AbstractC12225l.crashlytics();
                    c18089l.remoteconfig(new RunnableC9534l(c18089l, i8, i2));
                }
                AbstractC12225l.crashlytics();
                c18089l.f35374package = interfaceC3177l;
                c18089l.remoteconfig(null);
                C2773l c2773l2 = new C2773l(Collections.singletonList(c0671l), executorC3688l, new C4143l(function2, c0671l, true ? 1 : 0));
                AbstractC12225l.crashlytics();
                C2773l c2773l3 = c18089l.billing;
                if (c2773l3 != c2773l2 || c18089l.purchase != executorC3688l) {
                    c18089l.purchase = executorC3688l;
                    c18089l.billing = c2773l2;
                    c18089l.mopub.m2692private(executorC3688l, c2773l2);
                    if (!Objects.equals(c2773l3 == null ? null : c2773l3.loadAd(), c2773l2.loadAd())) {
                        Integer num = (Integer) ((C7420l) ((C16506l) c18089l.mopub.admob).subs()).smaato(C16506l.f32251l, 0);
                        num.getClass();
                        Integer numValueOf = Integer.valueOf(c18089l.mopub.m2693strictfp());
                        Integer numValueOf2 = Integer.valueOf(c18089l.mopub.m2695volatile());
                        AbstractC12225l.crashlytics();
                        c18089l.metrica();
                        C9585l c9585lAmazon = c18089l.amazon(num, numValueOf, numValueOf2);
                        c18089l.mopub = c9585lAmazon;
                        Executor executor = c18089l.purchase;
                        if (executor != null && (c2773l = c18089l.billing) != null) {
                            c9585lAmazon.m2692private(executor, c2773l);
                        }
                        c18089l.remoteconfig(null);
                    }
                }
                C7591l c7591l = new C7591l(context);
                c7591l.setController(c18089l);
                return c7591l;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C5891l c5891l = (C5891l) this.f1697l;
                C3560l c3560l = (C3560l) this.f1696l;
                C1336l c1336l3 = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(-18238367, true, new C11492l(c5891l, i5)), 3);
                AbstractC1757l.appmetrica(c1336l3, null, null, AbstractC1789l.billing, 3);
                AbstractC1757l.appmetrica(c1336l3, null, null, AbstractC1789l.mopub, 3);
                AbstractC1757l.appmetrica(c1336l3, null, null, AbstractC1789l.admob, 3);
                if (!((Boolean) c5891l.f12414l.getValue()).booleanValue()) {
                    AbstractC1757l.appmetrica(c1336l3, null, null, AbstractC1789l.subs, 3);
                    AbstractC1757l.appmetrica(c1336l3, null, null, AbstractC1789l.isPro, 3);
                    List list = c3560l.yandex;
                    c1336l3.firebase(list.size(), null, new Creturn(list, 14, false), new C15578l(802480018, true, new C6780l(list, c5891l, i4)));
                    AbstractC1757l.appmetrica(c1336l3, null, null, AbstractC1789l.firebase, 3);
                }
                return Unit.INSTANCE;
            default:
                C12986l c12986l = (C12986l) this.f1697l;
                Function2 function3 = (Function2) this.f1696l;
                C14378l c14378l = (C14378l) c12986l.invoke((C7695l) obj);
                if (c14378l != null) {
                    return new C8119l(c14378l, function3);
                }
                return null;
        }
    }

    public /* synthetic */ C0464l(Object obj, Object obj2, int i) {
        this.f1698l = i;
        this.f1697l = obj;
        this.f1696l = obj2;
    }
}
