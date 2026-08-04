package defpackage;

import android.app.Activity;
import androidx.car.app.navigation.model.Maneuver;
import bruhcollective.itaysonlab.libexternal.realm.XTrackLyrics;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedList;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٌِ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8854l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f18199l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f18200l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18201l;

    public /* synthetic */ C8854l(C9575l c9575l, C4786l c4786l, AudioPlaylist audioPlaylist, VKProfile vKProfile) {
        this.f18201l = 27;
        this.f18200l = c4786l;
        this.f18199l = audioPlaylist;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 5;
        int i2 = 8;
        int i3 = 4;
        int i4 = 15;
        int i5 = 11;
        int i6 = 2;
        int i7 = 3;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        int i8 = 1;
        switch (this.f18201l) {
            case 0:
                AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
                ArrayList arrayListMopub = AbstractC17307l.mopub((List) this.f18200l, (Function0) ((C17999l) this.f18199l).loadAd);
                if (arrayListMopub != null) {
                    int size = arrayListMopub.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        C8195l c8195l = (C8195l) arrayListMopub.get(i9);
                        AbstractC10113l abstractC10113l = (AbstractC10113l) c8195l.f17098l;
                        Function0 function0 = (Function0) c8195l.f17097l;
                        AbstractC9601l.isPro(abstractC9601l, abstractC10113l, function0 != null ? ((C5177l) function0.invoke()).yandex : 0L);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C14965l c14965l = (C14965l) this.f18200l;
                C5866l c5866l = (C5866l) this.f18199l;
                C11362l c11362l = (C11362l) c14965l.f29441l;
                C14594l c14594l = C14594l.f28576l;
                ((C1336l) obj).firebase(c11362l.size(), new C13512l(c11362l), new C13512l(c11362l, i3, b == true ? 1 : 0), new C15578l(802480018, true, new C3127l(c11362l, c14965l, c5866l, i)));
                return Unit.INSTANCE;
            case 2:
                C10685l c10685l = (C10685l) this.f18200l;
                AbstractC18643l abstractC18643l = (AbstractC18643l) this.f18199l;
                C3918l c3918l = (C3918l) obj;
                c10685l.getClass();
                c3918l.m1451l(c3918l.m1449l(AbstractC18202l.yandex.loadAd(XTrackLyrics.class), "id == $0", Arrays.copyOf(new Object[]{C10685l.m2944catch(abstractC18643l)}, 1)));
                return Unit.INSTANCE;
            case 3:
                InterfaceC16588l interfaceC16588l = (InterfaceC16588l) this.f18200l;
                InterfaceC16588l interfaceC16588l2 = (InterfaceC16588l) this.f18199l;
                C14416l c14416l = (C14416l) obj;
                c14416l.yandex(interfaceC16588l.purchase(), "key");
                c14416l.yandex(interfaceC16588l2.purchase(), "value");
                return Unit.INSTANCE;
            case 4:
                C11625l c11625l = (C11625l) this.f18200l;
                Function1 function1 = (Function1) this.f18199l;
                Float f = (Float) obj;
                float fFloatValue = f.floatValue();
                if (fFloatValue != c11625l.amazon.admob()) {
                    if (function1 != null) {
                        function1.invoke(f);
                    } else {
                        c11625l.amazon(fFloatValue);
                    }
                }
                return Unit.INSTANCE;
            case 5:
                ((C11265l) this.f18200l).crashlytics.add(new C5564l((InterfaceC0389l) this.f18199l, obj));
                return Unit.INSTANCE;
            case 6:
                File file = (File) this.f18200l;
                C12428l c12428l = (C12428l) this.f18199l;
                if (AbstractC8576l.yandex((String) obj, file.getName())) {
                    AbstractC0676l.billing(c12428l, Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            case 7:
                C2832l c2832l = (C2832l) this.f18200l;
                Function1 function2 = (Function1) this.f18199l;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                c2832l.amazon.setValue(c2832l.yandex());
                function2.invoke(bool);
                return Unit.INSTANCE;
            case 8:
                C2832l c2832l2 = (C2832l) this.f18200l;
                c2832l2.purchase = (C16307l) this.f18199l;
                return new C9582l(i4, c2832l2);
            case 9:
                C11655l c11655l = (C11655l) this.f18200l;
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) this.f18199l;
                C1336l c1336l = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(169113381, true, new C9565l(c11655l, i6)), 3);
                InterfaceC13238l interfaceC13238l = (InterfaceC13238l) interfaceC12244l.getValue();
                int i10 = C5393l.f11563l;
                c1336l.firebase(((AbstractC7095l) interfaceC13238l).pro(), new C5640l(interfaceC13238l, 10), new C5640l(interfaceC13238l, i5, b2 == true ? 1 : 0), new C15578l(802480018, true, new C6780l(interfaceC13238l, c11655l, i4)));
                return Unit.INSTANCE;
            case 10:
                ((C7504l) this.f18200l).ads(null);
                ((C12428l) this.f18199l).amazon((AbstractC13306l) obj);
                return Unit.INSTANCE;
            case 11:
                C8706l c8706l = (C8706l) this.f18200l;
                NewsfeedList newsfeedList = (NewsfeedList) this.f18199l;
                c8706l.f17906l = Integer.valueOf(newsfeedList.yandex);
                c8706l.f17913l = newsfeedList.loadAd;
                c8706l.mo782this();
                return Unit.INSTANCE;
            case 12:
                C11362l c11362l2 = (C11362l) this.f18200l;
                ((C1336l) obj).firebase(c11362l2.size(), null, new C13512l(c11362l2, i2, b3 == true ? 1 : 0), new C15578l(802480018, true, new C4232l(c11362l2, (Function1) this.f18199l, i6)));
                return Unit.INSTANCE;
            case 13:
                C1432l c1432l = (C1432l) this.f18200l;
                AbstractC10113l abstractC10113l2 = (AbstractC10113l) this.f18199l;
                AbstractC9601l abstractC9601l2 = (AbstractC9601l) obj;
                boolean z = c1432l.f3616l;
                float f2 = c1432l.f3617l;
                if (z) {
                    abstractC9601l2.getClass();
                    AbstractC9601l.smaato(abstractC9601l2, abstractC10113l2, AbstractC9361l.yandex(abstractC9601l2, f2), AbstractC9361l.yandex(abstractC9601l2, c1432l.f3615l));
                } else {
                    abstractC9601l2.getClass();
                    abstractC9601l2.mopub(abstractC10113l2, AbstractC9361l.yandex(abstractC9601l2, f2), AbstractC9361l.yandex(abstractC9601l2, c1432l.f3615l), 0.0f);
                }
                return Unit.INSTANCE;
            case 14:
                C14556l c14556l = (C14556l) this.f18200l;
                AbstractC10113l abstractC10113l3 = (AbstractC10113l) this.f18199l;
                AbstractC9601l abstractC9601l3 = (AbstractC9601l) obj;
                long j = ((C5177l) c14556l.f28504l.invoke(abstractC9601l3)).yandex;
                if (c14556l.f28503l) {
                    AbstractC9601l.remoteconfig(abstractC9601l3, abstractC10113l3, (int) (j >> 32), (int) (j & 4294967295L), null, 12);
                } else {
                    AbstractC9601l.startapp(abstractC9601l3, abstractC10113l3, (int) (j >> 32), (int) (j & 4294967295L), null, 12);
                }
                return Unit.INSTANCE;
            case 15:
                ((C1336l) obj).firebase(EnumC9736l.f19866l.pro(), null, new C2911l(i5), new C15578l(802480018, true, new C6780l((C17284l) this.f18200l, (InterfaceC12244l) this.f18199l, 17)));
                return Unit.INSTANCE;
            case 16:
                C12708l c12708l = (C12708l) this.f18200l;
                C18306l c18306l = (C18306l) this.f18199l;
                C1336l c1336l2 = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l2, null, null, new C15578l(-790719172, true, new C0541l(c18306l, c12708l, 21)), 3);
                String str = c12708l.yandex.admob;
                if (str == null) {
                    str = "";
                }
                if (str.length() > 0) {
                    AbstractC1757l.appmetrica(c1336l2, "cell:Description", null, new C15578l(-1276733311, true, new C16561l(i2, c12708l)), 2);
                }
                AbstractC1757l.m1032else(c1336l2, new C15578l(-1862981712, true, new C4508l(9, c18306l)), 2);
                AbstractC18082l abstractC18082l = (AbstractC18082l) c18306l.f35799l.getValue();
                c1336l2.firebase(abstractC18082l.pro(), new C3768l(new C8163l(i7), abstractC18082l, 19), new C2214l(abstractC18082l, 1), new C15578l(2039820996, true, new C3127l(abstractC18082l, c18306l, c12708l, 7)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                Function0 function3 = (Function0) this.f18200l;
                InterfaceC6497l interfaceC6497l = (InterfaceC6497l) this.f18199l;
                function3.invoke();
                ((InterfaceC8885l) obj).yandex(3);
                ((C15552l) interfaceC6497l).loadAd(8, true, true);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C15516l c15516l = (C15516l) this.f18200l;
                AbstractC10113l abstractC10113l4 = (AbstractC10113l) this.f18199l;
                AbstractC9601l abstractC9601l4 = (AbstractC9601l) obj;
                boolean z2 = c15516l.f30325l;
                float f3 = c15516l.f30327l;
                if (z2) {
                    abstractC9601l4.getClass();
                    AbstractC9601l.smaato(abstractC9601l4, abstractC10113l4, AbstractC9361l.yandex(abstractC9601l4, f3), AbstractC9361l.yandex(abstractC9601l4, c15516l.f30324l));
                } else {
                    abstractC9601l4.getClass();
                    abstractC9601l4.mopub(abstractC10113l4, AbstractC9361l.yandex(abstractC9601l4, f3), AbstractC9361l.yandex(abstractC9601l4, c15516l.f30324l), 0.0f);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                Function2 function4 = (Function2) this.f18200l;
                C0554l c0554l = (C0554l) this.f18199l;
                Integer numValueOf = Integer.valueOf(((C11045l) obj).yandex);
                C4685l c4685l = (C4685l) c0554l.f1957l;
                function4.invoke(numValueOf, Integer.valueOf((c4685l != null ? c4685l : null).loadAd));
                return Unit.INSTANCE;
            case 20:
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) this.f18200l;
                AbstractC9601l abstractC9601l5 = (AbstractC9601l) obj;
                C8103l c8103l = new C8103l(i6, (ArrayList) this.f18199l);
                abstractC9601l5.f19562l = true;
                c8103l.invoke(abstractC9601l5);
                abstractC9601l5.f19562l = false;
                interfaceC8714l.getValue();
                return Unit.INSTANCE;
            case 21:
                AbstractC6475l abstractC6475l = (AbstractC6475l) this.f18200l;
                InterfaceC13342l interfaceC13342l = (InterfaceC13342l) this.f18199l;
                abstractC6475l.yandex(interfaceC13342l);
                return new C18616l(abstractC6475l, interfaceC13342l, i7);
            case 22:
                C10056l c10056l = (C10056l) this.f18200l;
                InterfaceC12244l interfaceC12244l2 = (InterfaceC12244l) this.f18199l;
                C1336l c1336l3 = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(-1016686337, true, new C3596l(c10056l, i7)), 3);
                AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(222726070, true, new C7506l(c10056l, interfaceC12244l2, i8)), 3);
                AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(300847159, true, new C3596l(c10056l, i3)), 3);
                AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(378968248, true, new C3596l(c10056l, i)), 3);
                AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(457089337, true, new C3596l(c10056l, b4 == true ? 1 : 0)), 3);
                return Unit.INSTANCE;
            case 23:
                C14451l c14451l = (C14451l) this.f18200l;
                C5245l c5245l = (C5245l) this.f18199l;
                AudioTrack audioTrack = (AudioTrack) obj;
                List list = c14451l.f28630l.billing;
                AppActivity appActivity = (AppActivity) c5245l.isVip();
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC16676l.billing((AudioTrack) it.next()));
                }
                AbstractC9092l.crashlytics(appActivity, new C14004l(arrayList), new C13305l(new C11392l(AbstractC16676l.billing(audioTrack)), 0L, list, false, false, false, 122));
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C16590l c16590l = (C16590l) this.f18200l;
                C6449l c6449l = (C6449l) this.f18199l;
                c16590l.yandex(c6449l);
                return new C18616l(c16590l, c6449l, i3);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((C6134l) this.f18200l).loadAd.subs((InterfaceC0684l) obj, (C9046l) this.f18199l);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C4261l c4261l = (C4261l) this.f18200l;
                InterfaceC12244l interfaceC12244l3 = (InterfaceC12244l) this.f18199l;
                C1336l c1336l4 = (C1336l) obj;
                C11362l c11362l3 = c4261l.f8752l;
                c1336l4.firebase(c11362l3.size(), null, new C13512l(c11362l3, i4, b5 == true ? 1 : 0), new C15578l(802480018, true, new C6780l(c11362l3, c4261l, 20)));
                if (((Boolean) c4261l.f8746l.getValue()).booleanValue()) {
                    AbstractC1757l.appmetrica(c1336l4, null, null, new C15578l(-808489745, true, new C0541l(c4261l, interfaceC12244l3, 29)), 3);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                AbstractC9033l.crashlytics((AppActivity) ((Activity) ((C4786l) this.f18200l).f9819l.getContext()), new C7226l((AudioPlaylist) this.f18199l, (AudioTrack) obj, b6 == true ? 1 : 0, i5));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C6931l c6931l = (C6931l) this.f18200l;
                C6295l c6295l = (C6295l) this.f18199l;
                c6931l.signatures(obj);
                if (c6295l != null) {
                    c6295l.yandex(obj);
                }
                return Unit.INSTANCE;
            default:
                C4791l c4791l = (C4791l) this.f18200l;
                Throwable th = (Throwable) this.f18199l;
                Throwable th2 = (Throwable) obj;
                synchronized (c4791l.amazon) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                AbstractC11718l.yandex(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    c4791l.billing = th;
                    C1008l c1008l = c4791l.license;
                    EnumC6767l enumC6767l = EnumC6767l.f14180l;
                    c1008l.getClass();
                    c1008l.remoteconfig(null, enumC6767l);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C8854l(Object obj, Object obj2, int i) {
        this.f18201l = i;
        this.f18200l = obj;
        this.f18199l = obj2;
    }
}
