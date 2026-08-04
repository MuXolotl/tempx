package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import androidx.glance.session.SessionWorker;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;
import ua.itaysonlab.vkxreborn.playback.widget_glance.player_small.SmallPlayerGlanceConfigurationActivity;

/* JADX INFO: renamed from: lًًٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7864l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f16400l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f16401l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f16402l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7864l(InterfaceC14029l interfaceC14029l, Object obj, Object obj2, int i) {
        super(2, interfaceC14029l);
        this.f16401l = i;
        this.f16402l = obj;
        this.f16400l = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    private final Object pro(Object obj) {
        boolean z;
        int i;
        int i2;
        boolean z2;
        Integer num;
        Integer num2;
        int iIntValue;
        Object obj2;
        int i3;
        List listM4213const;
        AbstractC2829l.crashlytics(obj);
        C15161l c15161l = (C15161l) this.f16402l;
        long j = ((C17078l) this.f16400l).f33243l;
        InterfaceC16983l interfaceC16983l = c15161l.purchase;
        if (interfaceC16983l == null) {
            c15161l.crashlytics(new C6711l("Camera is not active."));
        } else {
            synchronized (c15161l.amazon) {
                z = j == c15161l.mopub;
            }
            if (z) {
                synchronized (c15161l.amazon) {
                    i = c15161l.admob;
                    i2 = c15161l.subs;
                    z2 = c15161l.isPro;
                    num = c15161l.firebase;
                    num2 = c15161l.smaato;
                }
                int iAmazon = c15161l.amazon(i, z2, num);
                int i4 = 4;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = (i2 == 1 || i2 != 3) ? 4 : 3;
                }
                C8195l c8195l = new C8195l(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(AbstractC6159l.amazon(c15161l.yandex.loadAd, iAmazon)));
                CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
                InterfaceC5389l interfaceC5389l = c15161l.yandex.loadAd;
                if (AbstractC6159l.crashlytics(interfaceC5389l).contains(Integer.valueOf(iIntValue))) {
                    i4 = iIntValue;
                } else if (!AbstractC6159l.crashlytics(interfaceC5389l).contains(4)) {
                    i4 = AbstractC6159l.crashlytics(interfaceC5389l).contains(1) ? 1 : 0;
                }
                C8195l c8195l2 = new C8195l(key, Integer.valueOf(i4));
                CaptureRequest.Key key2 = CaptureRequest.CONTROL_AWB_MODE;
                InterfaceC5389l interfaceC5389l2 = c15161l.yandex.loadAd;
                CameraCharacteristics.Key key3 = CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES;
                C10861l c10861l = (C10861l) interfaceC5389l2;
                Object objCrashlytics = c10861l.crashlytics(key3);
                Object obj3 = {0};
                if (objCrashlytics != null) {
                    obj3 = objCrashlytics;
                }
                if (AbstractC8669l.tapsense((int[]) obj3, 1)) {
                    i3 = 1;
                } else {
                    int[] iArr = {0};
                    Object objCrashlytics2 = c10861l.crashlytics(key3);
                    if (objCrashlytics2 != null) {
                        obj2 = iArr;
                        obj2 = objCrashlytics2;
                    }
                    obj2 = iArr;
                    if (AbstractC8669l.tapsense((int[]) obj2, 1)) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                }
                try {
                    InterfaceC12932l interfaceC12932lSubs = interfaceC16983l.subs(AbstractC8676l.remoteconfig(c8195l, c8195l2, new C8195l(key2, Integer.valueOf(i3))), EnumC17911l.f34869l, AbstractC3222l.loadAd);
                    synchronized (c15161l.amazon) {
                        listM4213const = AbstractC16901l.m4213const(c15161l.billing);
                    }
                    ((C14750l) interfaceC12932lSubs).mo2154l(new C10207l(listM4213const, c15161l, 15));
                } catch (Exception e) {
                    c15161l.crashlytics(e);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x02bf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        C12130l c12130lCrashlytics;
        Method method;
        Method method2;
        EnumC15312l enumC15312l;
        int iIntValue;
        C15161l c15161l;
        C0665l c0665l;
        C5601l c5601l;
        String string;
        Object c18435l;
        String string2;
        int i = 19;
        int i2 = 20;
        int i3 = 10;
        int i4 = 3;
        int i5 = 2;
        C0307l c0307l = 0;
        byte b = 0;
        int i6 = 1;
        switch (this.f16401l) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                List list = (List) this.f16400l;
                C11419l c11419l = new C11419l();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c11419l.yandex(((AbstractC6896l) it.next()).adcel);
                }
                return Boolean.valueOf(((Number) c11419l.loadAd().mopub.yandex().getUpper()).intValue() > 30);
            case 1:
                AbstractC2829l.crashlytics(obj);
                C0228l c0228l = (C0228l) this.f16402l;
                c0228l.f1210l.invoke((AudioPlaylist) this.f16400l);
                c0228l.purchase();
                return Unit.INSTANCE;
            case 2:
                AbstractC2829l.crashlytics(obj);
                throw null;
            case 3:
                AbstractC2829l.crashlytics(obj);
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) this.f16400l;
                int i7 = AbstractC8007l.yandex;
                if (!((Boolean) interfaceC8714l.getValue()).booleanValue()) {
                    Boolean bool = (Boolean) ((InterfaceC8714l) this.f16402l).getValue();
                    bool.booleanValue();
                    interfaceC8714l.setValue(bool);
                }
                return Unit.INSTANCE;
            case 4:
                C5807l c5807l = (C5807l) this.f16400l;
                C15855l c15855l = (C15855l) this.f16402l;
                AbstractC2829l.crashlytics(obj);
                try {
                    String[] cameraIdList = ((CameraManager) c15855l.f31110l).getCameraIdList();
                    ArrayList arrayList = new ArrayList();
                    for (String str : cameraIdList) {
                        try {
                            c12130lCrashlytics = C12371l.crashlytics(str, null, null);
                        } catch (IllegalArgumentException e) {
                            Log.w("PipePresenceSrc", "Could not create CameraIdentifier for system ID: " + str, e);
                            c12130lCrashlytics = null;
                        }
                        if (c12130lCrashlytics != null) {
                            arrayList.add(c12130lCrashlytics);
                        }
                        break;
                    }
                    Log.d("PipePresenceSrc", "[FetchData] Refreshed camera list from hardware: " + arrayList);
                    c15855l.purchase(arrayList, null);
                    c5807l.loadAd(arrayList);
                    break;
                } catch (Exception e2) {
                    Log.e("PipePresenceSrc", "[FetchData] Failed to refresh camera list from hardware.", e2);
                    c15855l.purchase(null, e2);
                    c5807l.amazon(e2);
                }
                return Unit.INSTANCE;
            case 5:
                AbstractC2829l.crashlytics(obj);
                C13765l c13765l = (C13765l) this.f16400l;
                float fFloatValue = new BigDecimal(String.valueOf((0.1f * ((C15308l) ((AbstractC13264l) this.f16402l).amazon.f32506l).admob()) + 0.5f)).setScale(1, RoundingMode.DOWN).floatValue();
                AbstractC18082l abstractC18082l = C10056l.f20511l;
                c13765l.subs(fFloatValue);
                return Unit.INSTANCE;
            case 6:
                AbstractC2829l.crashlytics(obj);
                Function1 function1 = (Function1) this.f16402l;
                C13765l c13765l2 = (C13765l) this.f16400l;
                AbstractC18082l abstractC18082l2 = C10056l.f20511l;
                function1.invoke(new Float(c13765l2.admob()));
                return Unit.INSTANCE;
            case 7:
                C16811l c16811l = (C16811l) this.f16402l;
                AbstractC2829l.crashlytics(obj);
                EnumC12501l enumC12501l = (EnumC12501l) this.f16400l;
                AbstractC8619l.crashlytics.loadAd(enumC12501l);
                int iOrdinal = enumC12501l.ordinal();
                if (iOrdinal == 0) {
                    i5 = 0;
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        C18725l.billing();
                        return null;
                    }
                    i5 = 1;
                }
                c16811l.mo2752const(i5);
                return Unit.INSTANCE;
            case 8:
                C16811l c16811l2 = (C16811l) this.f16402l;
                AbstractC2829l.crashlytics(obj);
                C16076l c16076l = (C16076l) this.f16400l;
                c16076l.getClass();
                if (((Boolean) c16076l.admob(new C18606l(c16076l, i6))).booleanValue() && c16076l.f31511l.amazon()) {
                    return Unit.INSTANCE;
                }
                c16811l2.mo2785l();
                return Unit.INSTANCE;
            case 9:
                C14050l c14050l = (C14050l) this.f16402l;
                AbstractC2829l.crashlytics(obj);
                PlaybackService playbackService = (PlaybackService) this.f16400l;
                C0307l c0307l2 = playbackService.f36842l;
                if (c0307l2 == null) {
                    c0307l2 = null;
                }
                c0307l2.loadAd(new C8250l(i2, c14050l));
                try {
                    if (((Boolean) AbstractC8619l.purchase.yandex()).booleanValue()) {
                        playbackService.pro().crashlytics(playbackService.getApplicationContext());
                        C13140l c13140lPro = playbackService.pro();
                        Object obj2 = c13140lPro.crashlytics;
                        if (obj2 != null && (method2 = c13140lPro.yandex) != null) {
                            method2.invoke(c13140lPro.loadAd, obj2, null);
                        }
                    } else {
                        C13140l c13140lPro2 = playbackService.pro();
                        if (c13140lPro2.crashlytics != null && (method = c13140lPro2.yandex) != null) {
                            method.invoke(c13140lPro2.loadAd, null, null);
                        }
                    }
                    break;
                } catch (Exception unused) {
                }
                return Unit.INSTANCE;
            case 10:
                AbstractC2829l.crashlytics(obj);
                C0307l c0307l3 = ((PlaybackService) this.f16402l).f36842l;
                c0307l = c0307l3 != null ? c0307l3 : 0;
                C4700l c4700l = (C4700l) this.f16400l;
                boolean z = c4700l.f9550l;
                int i8 = c4700l.f9549l;
                i6 = i8 >= 1 ? i8 : 1;
                c0307l.billing = z;
                c0307l.mopub = ((long) i6) * 1000;
                return Unit.INSTANCE;
            case 11:
                AbstractC2829l.crashlytics(obj);
                ((C0786l) this.f16402l).invoke((List) this.f16400l);
                return Unit.INSTANCE;
            case 12:
                AbstractC2829l.crashlytics(obj);
                Object obj3 = this.f16402l;
                C1424l c1424l = (C1424l) this.f16400l;
                C11315l c11315l = (C11315l) c1424l.f3606l;
                c11315l.addLast(obj3);
                C7119l c7119l = (C7119l) c1424l.f3604l;
                for (Object objTapsense = c7119l.tapsense(); !(objTapsense instanceof C15230l); objTapsense = c7119l.tapsense()) {
                    C0381l.loadAd(objTapsense);
                    c11315l.addLast(objTapsense);
                }
                Log.d("CXCP", "PruningProcessingQueue: Pruning " + c11315l);
                ((Function1) c1424l.f3603l).invoke(c11315l);
                return Unit.INSTANCE;
            case 13:
                AbstractC2829l.crashlytics(obj);
                InterfaceC0273l interfaceC0273l = (InterfaceC0273l) ((InterfaceC2262l) this.f16402l).vip().mo245l(C6168l.f13001l);
                C9426l c9426l = new C9426l();
                AbstractC10999l.billing(4, interfaceC0273l, C1732l.f4136l, new C17949l(c9426l, (Function2) this.f16400l, c0307l, i));
                while (!c9426l.mo2155l()) {
                    try {
                        return AbstractC10999l.subs(interfaceC0273l, new C17680l(c9426l, c0307l, i5));
                    } catch (InterruptedException unused2) {
                    }
                }
                return c9426l.m3884native();
            case 14:
                AbstractC2829l.crashlytics(obj);
                C11446l c11446l = (C11446l) this.f16402l;
                if (((Boolean) c11446l.firebase.getValue()).booleanValue()) {
                    ((C15552l) ((InterfaceC6497l) this.f16400l)).loadAd(8, true, true);
                }
                c11446l.remoteconfig(false);
                return Unit.INSTANCE;
            case 15:
                AbstractC2829l.crashlytics(obj);
                if (((Boolean) ((InterfaceC8714l) this.f16400l).getValue()).booleanValue()) {
                    ((Function0) this.f16402l).invoke();
                }
                return Unit.INSTANCE;
            case 16:
                AbstractC2829l.crashlytics(obj);
                return (C4043l) ((C2319l) this.f16402l).yandex.get(((SessionWorker) this.f16400l).firebase);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                AbstractC2829l.crashlytics(obj);
                C14509l c14509l = (C14509l) this.f16402l;
                if (c14509l.loadAd().isEmpty()) {
                    c14509l.loadAd.f28633l.remove(c14509l.yandex);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C14690l c14690l = (C14690l) this.f16402l;
                AbstractC2829l.crashlytics(obj);
                C12418l c12418l = ((SmallPlayerGlanceConfigurationActivity) this.f16400l).f36846l;
                if (c12418l == null || (enumC15312l = (EnumC15312l) ((C10086l) c12418l.f24521l).getValue()) == null) {
                    enumC15312l = EnumC15312l.RECOMMENDATIONS;
                }
                return C14690l.loadAd(c14690l, enumC15312l, null, 0L, 10);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f16402l;
                AbstractC2829l.crashlytics(obj);
                C7679l c7679l = (C7679l) this.f16400l;
                AbstractC10999l.mopub(interfaceC2262l, null, 0, new C17972l(c7679l, (InterfaceC14029l) c0307l, i2), 3);
                AbstractC10999l.mopub(interfaceC2262l, null, 0, new C14019l(c7679l, c0307l, i), 3);
                return Unit.INSTANCE;
            case 20:
                AbstractC2829l.crashlytics(obj);
                if (!((Set) this.f16402l).isEmpty()) {
                    C9395l c9395l = new C9395l((Set) this.f16402l, true);
                    C10814l c10814l = ((C11419l) c9395l.purchase.getValue()).crashlytics() ? (C10814l) c9395l.billing.getValue() : null;
                    if (c10814l == null || (c0665l = c10814l.mopub) == null) {
                        iIntValue = 1;
                    } else {
                        int i9 = c0665l.crashlytics;
                        Integer numValueOf = i9 != -1 ? Integer.valueOf(i9) : null;
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                        } else {
                            iIntValue = 1;
                        }
                    }
                    synchronized (((C15161l) this.f16400l).amazon) {
                        c15161l = (C15161l) this.f16400l;
                        if (c15161l.subs != iIntValue) {
                            c15161l.subs = iIntValue;
                            b = 1;
                        }
                    }
                    if (b != 0) {
                        c15161l.billing();
                    }
                }
                return Unit.INSTANCE;
            case 21:
                return pro(obj);
            case 22:
                AbstractC2829l.crashlytics(obj);
                AbstractC11397l.mopub((AppActivity) ((C0675l) this.f16402l).f34617l, new C9810l("CacheExport", (List) this.f16400l, i3));
                return Unit.INSTANCE;
            case 23:
                C14704l c14704l = (C14704l) this.f16402l;
                AbstractC2829l.crashlytics(obj);
                ((C0675l) this.f16400l).f2149l.setValue(c14704l.yandex);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                AbstractC2829l.crashlytics(obj);
                C12324l c12324l = (C12324l) this.f16402l;
                EnumC16440l enumC16440l = (EnumC16440l) ((C10086l) c12324l.yandex.amazon).getValue();
                EnumC16440l enumC16440l2 = EnumC16440l.f32143l;
                if (enumC16440l != enumC16440l2) {
                    Function1 function2 = (Function1) this.f16400l;
                    C15389l c15389l = c12324l.yandex;
                    C13765l c13765l3 = (C13765l) c15389l.subs;
                    C13765l c13765l4 = (C13765l) c15389l.subs;
                    if (c13765l3.admob() != 0.0f && !Float.isNaN(c13765l4.admob())) {
                        enumC16440l2 = c13765l4.admob() > 0.0f ? EnumC16440l.f32145l : EnumC16440l.f32144l;
                    }
                    function2.invoke(enumC16440l2);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                AbstractC2829l.crashlytics(obj);
                C7463l c7463l = (C7463l) this.f16402l;
                EnumC12805l enumC12805l = (EnumC12805l) ((C10086l) c7463l.yandex.amazon).getValue();
                EnumC12805l enumC12805l2 = EnumC12805l.f25184l;
                if (enumC12805l != enumC12805l2) {
                    Function1 function3 = (Function1) this.f16400l;
                    C15389l c15389l2 = c7463l.yandex;
                    C13765l c13765l5 = (C13765l) c15389l2.subs;
                    C13765l c13765l6 = (C13765l) c15389l2.subs;
                    if (c13765l5.admob() != 0.0f && !Float.isNaN(c13765l6.admob())) {
                        enumC12805l2 = c13765l6.admob() > 0.0f ? EnumC12805l.f25186l : EnumC12805l.f25185l;
                    }
                    function3.invoke(enumC12805l2);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                AbstractC2829l.crashlytics(obj);
                InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) this.f16402l;
                C12217l c12217l = (C12217l) this.f16400l;
                AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C17773l(c12217l, c0307l, i5), 3);
                return AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C17773l(c12217l, c0307l, i4), 3);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                AbstractC2829l.crashlytics(obj);
                C9478l c9478l = (C9478l) this.f16402l;
                C5601l c5601l2 = (C5601l) this.f16400l;
                int i10 = c5601l2.f11897l;
                int i11 = c5601l2.f11896l;
                C14689l c14689l = c9478l.subs;
                AnimatorSet animatorSet = c9478l.crashlytics;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                C13703l c13703l = c14689l.amazon;
                ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(((Integer) c13703l.billing.yandex).intValue(), i10);
                valueAnimatorOfArgb.addUpdateListener(new C14427l(c9478l, c13703l, i6));
                valueAnimatorOfArgb.setDuration(300L);
                C13703l c13703l2 = c14689l.purchase;
                ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(((Integer) c13703l2.billing.yandex).intValue(), i11);
                valueAnimatorOfArgb2.addUpdateListener(new C14427l(c9478l, c13703l2, i6));
                valueAnimatorOfArgb2.setDuration(300L);
                animatorSet2.playTogether(valueAnimatorOfArgb, valueAnimatorOfArgb2);
                animatorSet2.start();
                c9478l.crashlytics = animatorSet2;
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                AbstractC2829l.crashlytics(obj);
                Bitmap bitmap = (Bitmap) this.f16402l;
                if (bitmap == null || bitmap.isRecycled()) {
                    c5601l = AbstractC1002l.yandex;
                } else {
                    C11154l c11154l = new C2934l(bitmap).loadAd().loadAd;
                    C13562l c13562l = (C13562l) c11154l.get(C7545l.purchase);
                    int iCrashlytics = c13562l != null ? c13562l.amazon : -1;
                    C13562l c13562l2 = (C13562l) c11154l.get(C7545l.billing);
                    int iCrashlytics2 = c13562l2 != null ? c13562l2.amazon : -1;
                    C13562l c13562l3 = (C13562l) c11154l.get(C7545l.mopub);
                    int iCrashlytics3 = c13562l3 != null ? c13562l3.amazon : -1;
                    if (iCrashlytics != -1 && AbstractC14093l.purchase(iCrashlytics) > 0.800000011920929d) {
                        iCrashlytics = AbstractC14093l.crashlytics(iCrashlytics, 0.6f, -16777216);
                    }
                    if (iCrashlytics2 != -1 && AbstractC14093l.purchase(iCrashlytics2) > 0.800000011920929d) {
                        iCrashlytics2 = AbstractC14093l.crashlytics(iCrashlytics2, 0.3f, -16777216);
                    }
                    if (iCrashlytics3 != -1 && AbstractC14093l.purchase(iCrashlytics3) < 0.10000000149011612d) {
                        iCrashlytics3 = AbstractC14093l.crashlytics(iCrashlytics3, 0.4f, -1);
                    }
                    if (iCrashlytics == -1) {
                        iCrashlytics = iCrashlytics2;
                    }
                    if (iCrashlytics3 != -1) {
                        iCrashlytics2 = iCrashlytics3;
                    }
                    c5601l = new C5601l(iCrashlytics, iCrashlytics2, 10);
                }
                AbstractC10999l.mopub(AbstractC3891l.yandex, null, 0, new C7864l((C9478l) this.f16400l, c5601l, (InterfaceC14029l) c0307l, 27), 3);
                return Unit.INSTANCE;
            default:
                String str2 = "Untitled";
                AbstractC2829l.crashlytics(obj);
                C3852l c3852l = (C3852l) this.f16402l;
                C1930l c1930l = (C1930l) this.f16400l;
                C10086l c10086l = c1930l.f4396l;
                C10086l c10086l2 = c1930l.f4397l;
                C10086l c10086l3 = c1930l.f4399l;
                if (c3852l != null) {
                    int i12 = C1930l.f4394l;
                    CharSequence charSequence = c3852l.yandex;
                    if (charSequence != null && (string2 = charSequence.toString()) != null) {
                        str2 = string2;
                    }
                    c10086l3.setValue(str2);
                    CharSequence charSequence2 = c3852l.loadAd;
                    if (charSequence2 == null || (string = charSequence2.toString()) == null) {
                        string = "Unknown Artist";
                    }
                    c10086l2.setValue(string);
                    try {
                        byte[] bArr = c3852l.firebase;
                        c18435l = bArr != null ? BitmapFactory.decodeByteArray(bArr, 0, bArr.length) : null;
                    } catch (Throwable th) {
                        c18435l = new C18435l(th);
                    }
                    c10086l.setValue((Bitmap) (c18435l instanceof C18435l ? null : c18435l));
                    break;
                } else {
                    int i13 = C1930l.f4394l;
                    c10086l3.setValue("Untitled");
                    c10086l2.setValue("Unknown artist");
                    c10086l.setValue(null);
                }
                int i14 = C1930l.f4394l;
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f16401l;
        Object obj2 = this.f16400l;
        switch (i) {
            case 0:
                return new C7864l((C12094l) this.f16402l, (List) obj2, interfaceC14029l, 0);
            case 1:
                return new C7864l((C0228l) this.f16402l, (AudioPlaylist) obj2, interfaceC14029l, 1);
            case 2:
                C7864l c7864l = new C7864l((AbstractC6686l) obj2, interfaceC14029l, 2);
                c7864l.f16402l = obj;
                return c7864l;
            case 3:
                return new C7864l((InterfaceC8714l) this.f16402l, (InterfaceC8714l) obj2, interfaceC14029l, 3);
            case 4:
                return new C7864l((C15855l) this.f16402l, (C5807l) obj2, interfaceC14029l, 4);
            case 5:
                return new C7864l((AbstractC13264l) this.f16402l, (C13765l) obj2, interfaceC14029l, 5);
            case 6:
                return new C7864l((Function1) this.f16402l, (C13765l) obj2, interfaceC14029l, 6);
            case 7:
                C7864l c7864l2 = new C7864l((EnumC12501l) obj2, interfaceC14029l, 7);
                c7864l2.f16402l = obj;
                return c7864l2;
            case 8:
                C7864l c7864l3 = new C7864l((C16076l) obj2, interfaceC14029l, 8);
                c7864l3.f16402l = obj;
                return c7864l3;
            case 9:
                C7864l c7864l4 = new C7864l((PlaybackService) obj2, interfaceC14029l, 9);
                c7864l4.f16402l = obj;
                return c7864l4;
            case 10:
                return new C7864l((PlaybackService) this.f16402l, (C4700l) obj2, interfaceC14029l, 10);
            case 11:
                return new C7864l((C0786l) this.f16402l, (List) obj2, interfaceC14029l, 11);
            case 12:
                C7864l c7864l5 = new C7864l((C1424l) obj2, interfaceC14029l, 12);
                c7864l5.f16402l = obj;
                return c7864l5;
            case 13:
                C7864l c7864l6 = new C7864l((Function2) obj2, interfaceC14029l, 13);
                c7864l6.f16402l = obj;
                return c7864l6;
            case 14:
                return new C7864l((C11446l) this.f16402l, (InterfaceC6497l) obj2, interfaceC14029l, 14);
            case 15:
                return new C7864l((Function0) this.f16402l, (InterfaceC8714l) obj2, interfaceC14029l, 15);
            case 16:
                C7864l c7864l7 = new C7864l((SessionWorker) obj2, interfaceC14029l, 16);
                c7864l7.f16402l = obj;
                return c7864l7;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C7864l((C14509l) this.f16402l, (C0633l) obj2, interfaceC14029l, 17);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C7864l c7864l8 = new C7864l((SmallPlayerGlanceConfigurationActivity) obj2, interfaceC14029l, 18);
                c7864l8.f16402l = obj;
                return c7864l8;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C7864l c7864l9 = new C7864l((C7679l) obj2, interfaceC14029l, 19);
                c7864l9.f16402l = obj;
                return c7864l9;
            case 20:
                return new C7864l(interfaceC14029l, (Set) this.f16402l, (C15161l) obj2, 20);
            case 21:
                return new C7864l(interfaceC14029l, (C15161l) this.f16402l, (C17078l) obj2, 21);
            case 22:
                return new C7864l((C0675l) this.f16402l, (List) obj2, interfaceC14029l, 22);
            case 23:
                C7864l c7864l10 = new C7864l((C0675l) obj2, interfaceC14029l, 23);
                c7864l10.f16402l = obj;
                return c7864l10;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C7864l((C12324l) this.f16402l, (Function1) obj2, interfaceC14029l, 24);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C7864l((C7463l) this.f16402l, (Function1) obj2, interfaceC14029l, 25);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C7864l c7864l11 = new C7864l((C12217l) obj2, interfaceC14029l, 26);
                c7864l11.f16402l = obj;
                return c7864l11;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C7864l((C9478l) this.f16402l, (C5601l) obj2, interfaceC14029l, 27);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C7864l((Bitmap) this.f16402l, (C9478l) obj2, interfaceC14029l, 28);
            default:
                return new C7864l((C3852l) this.f16402l, (C1930l) obj2, interfaceC14029l, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16401l) {
            case 0:
                return ((C7864l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C7864l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 2:
                ((C7864l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
                throw null;
            case 3:
                return ((C7864l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C7864l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C7864l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C7864l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 7:
                return ((C7864l) ads((InterfaceC14029l) obj2, (C16811l) obj)).Signature(Unit.INSTANCE);
            case 8:
                return ((C7864l) ads((InterfaceC14029l) obj2, (C16811l) obj)).Signature(Unit.INSTANCE);
            case 9:
                return ((C7864l) ads((InterfaceC14029l) obj2, (C14050l) obj)).Signature(Unit.INSTANCE);
            case 10:
                return ((C7864l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 11:
                return ((C7864l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 12:
                return ((C7864l) ads((InterfaceC14029l) obj2, obj)).Signature(Unit.INSTANCE);
            case 13:
                return ((C7864l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 14:
                return ((C7864l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 15:
                return ((C7864l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 16:
                return ((C7864l) ads((InterfaceC14029l) obj2, (C2319l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C7864l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C7864l) ads((InterfaceC14029l) obj2, (C14690l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C7864l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 20:
                return ((C7864l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 21:
                return ((C7864l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 22:
                return ((C7864l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 23:
                return ((C7864l) ads((InterfaceC14029l) obj2, (C14704l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C7864l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C7864l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C7864l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C7864l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C7864l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C7864l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7864l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f16401l = i;
        this.f16400l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7864l(Object obj, Object obj2, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f16401l = i;
        this.f16402l = obj;
        this.f16400l = obj2;
    }
}
