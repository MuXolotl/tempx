package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lۘۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18539l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f36185l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f36186l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public Object f36187l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f36188l = 0;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public /* synthetic */ boolean f36189l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f36190l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ Object f36191l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18539l(C0360l c0360l, Function2 function2, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f36187l = c0360l;
        this.f36191l = function2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009a A[Catch: all -> 0x0145, TryCatch #0 {all -> 0x0145, blocks: (B:8:0x0024, B:58:0x0143, B:11:0x002f, B:55:0x012c, B:14:0x003a, B:45:0x0106, B:47:0x010c, B:50:0x0125, B:17:0x0046, B:38:0x00ba, B:20:0x0051, B:28:0x0094, B:30:0x009a, B:33:0x00b2, B:24:0x0060, B:41:0x00d2), top: B:80:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2 A[Catch: all -> 0x0145, TryCatch #0 {all -> 0x0145, blocks: (B:8:0x0024, B:58:0x0143, B:11:0x002f, B:55:0x012c, B:14:0x003a, B:45:0x0106, B:47:0x010c, B:50:0x0125, B:17:0x0046, B:38:0x00ba, B:20:0x0051, B:28:0x0094, B:30:0x009a, B:33:0x00b2, B:24:0x0060, B:41:0x00d2), top: B:80:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:47:0x010c A[Catch: all -> 0x0145, TryCatch #0 {all -> 0x0145, blocks: (B:8:0x0024, B:58:0x0143, B:11:0x002f, B:55:0x012c, B:14:0x003a, B:45:0x0106, B:47:0x010c, B:50:0x0125, B:17:0x0046, B:38:0x00ba, B:20:0x0051, B:28:0x0094, B:30:0x009a, B:33:0x00b2, B:24:0x0060, B:41:0x00d2), top: B:80:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0124  */
    /* JADX WARN: Code duplicated, block: B:50:0x0125 A[Catch: all -> 0x0145, TryCatch #0 {all -> 0x0145, blocks: (B:8:0x0024, B:58:0x0143, B:11:0x002f, B:55:0x012c, B:14:0x003a, B:45:0x0106, B:47:0x010c, B:50:0x0125, B:17:0x0046, B:38:0x00ba, B:20:0x0051, B:28:0x0094, B:30:0x009a, B:33:0x00b2, B:24:0x0060, B:41:0x00d2), top: B:80:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0129  */
    /* JADX WARN: Code duplicated, block: B:53:0x012a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0142  */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Object obj2;
        int i;
        AudioTrack audioTrack;
        AudioTrack audioTrack2;
        int i2;
        Object objFirebase;
        AudioTrack audioTrack3;
        C15442l c15442l;
        Object objFirebase2;
        int i3;
        C15085l c15085l;
        int i4 = this.f36188l;
        Object obj3 = this.f36191l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int iHashCode = 0;
        int i5 = 1;
        InterfaceC14029l interfaceC14029l = null;
        switch (i4) {
            case 0:
                boolean z = this.f36189l;
                int i6 = this.f36185l;
                if (i6 != 0) {
                    if (i6 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else {
                        if (i6 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i = this.f36190l;
                        obj2 = this.f36186l;
                        AbstractC2829l.crashlytics(obj);
                    }
                    return new C2856l(obj2, i, ((Number) obj).intValue());
                }
                AbstractC2829l.crashlytics(obj);
                C0360l c0360l = (C0360l) this.f36187l;
                this.f36189l = z;
                this.f36185l = 1;
                obj = AbstractC5088l.ads(new C10781l(i5, interfaceC14029l, c0360l), this);
                if (obj == enumC9342l) {
                    return enumC9342l;
                }
                iHashCode = obj != null ? obj.hashCode() : 0;
                Boolean boolValueOf = Boolean.valueOf(z);
                this.f36186l = obj;
                this.f36189l = z;
                this.f36190l = iHashCode;
                this.f36185l = 2;
                Object objInvoke = ((Function2) obj3).invoke(boolValueOf, this);
                if (objInvoke == enumC9342l) {
                    return enumC9342l;
                }
                Object obj4 = obj;
                obj = objInvoke;
                obj2 = obj4;
                i = iHashCode;
                return new C2856l(obj2, i, ((Number) obj).intValue());
            default:
                try {
                    switch (this.f36185l) {
                        case 0:
                            AbstractC2829l.crashlytics(obj);
                            audioTrack = (AudioTrack) obj3;
                            if (this.f36189l) {
                                C7644l c7644lLoadAd = AbstractC16584l.loadAd();
                                List listSingletonList = Collections.singletonList(AbstractC16676l.mopub(audioTrack));
                                this.f36186l = null;
                                this.f36187l = audioTrack;
                                this.f36190l = 0;
                                this.f36185l = 1;
                                C17464l c17464l = new C17464l("audio.addDislike", C18450l.f36030l);
                                c17464l.yandex("audio_ids", AbstractC16901l.m4210case(listSingletonList, ",", null, null, null, 62));
                                if (c7644lLoadAd.billing(c17464l, this) == enumC9342l) {
                                    return enumC9342l;
                                }
                                i2 = 0;
                                if (audioTrack.getBilling()) {
                                    this.f36186l = null;
                                    this.f36187l = audioTrack;
                                    this.f36190l = i2;
                                    this.f36185l = 2;
                                    C16552l c16552l = AbstractC11463l.yandex;
                                    objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C18523l(false, audioTrack, (InterfaceC14029l) null), this);
                                    if (objFirebase == enumC9342l) {
                                        objFirebase = Unit.INSTANCE;
                                    }
                                    if (objFirebase == enumC9342l) {
                                        return enumC9342l;
                                    }
                                    audioTrack3 = audioTrack;
                                    audioTrack = audioTrack3;
                                }
                                C8490l c8490l = AbstractC6025l.yandex;
                                c15442l = new C15442l(audioTrack);
                                this.f36186l = null;
                                this.f36187l = null;
                                this.f36190l = i2;
                                this.f36185l = 3;
                                if (AbstractC6025l.yandex(c15442l, this) == enumC9342l) {
                                    return enumC9342l;
                                }
                                Unit unit = Unit.INSTANCE;
                                return Unit.INSTANCE;
                            }
                            C7644l c7644lLoadAd2 = AbstractC16584l.loadAd();
                            List listSingletonList2 = Collections.singletonList(AbstractC16676l.mopub(audioTrack));
                            this.f36186l = null;
                            this.f36187l = audioTrack;
                            this.f36190l = 0;
                            this.f36185l = 4;
                            C17464l c17464l2 = new C17464l("audio.removeDislike", C6168l.f12989l);
                            c17464l2.yandex("audio_ids", AbstractC16901l.m4210case(listSingletonList2, ",", null, null, null, 62));
                            if (c7644lLoadAd2.billing(c17464l2, this) == enumC9342l) {
                                return enumC9342l;
                            }
                            audioTrack2 = audioTrack;
                            if (audioTrack2.f36610volatile.crashlytics) {
                                this.f36186l = null;
                                this.f36187l = audioTrack2;
                                this.f36190l = iHashCode;
                                this.f36185l = 5;
                                C16552l c16552l2 = AbstractC11463l.yandex;
                                objFirebase2 = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C18523l(true, audioTrack2, (InterfaceC14029l) null), this);
                                if (objFirebase2 == enumC9342l) {
                                    objFirebase2 = Unit.INSTANCE;
                                }
                                if (objFirebase2 == enumC9342l) {
                                    return enumC9342l;
                                }
                                i3 = iHashCode;
                                iHashCode = i3;
                            }
                            C8490l c8490l2 = AbstractC6025l.yandex;
                            c15085l = new C15085l(audioTrack2);
                            this.f36186l = null;
                            this.f36187l = null;
                            this.f36190l = iHashCode;
                            this.f36185l = 6;
                            if (AbstractC6025l.yandex(c15085l, this) == enumC9342l) {
                                return enumC9342l;
                            }
                            Unit unit2 = Unit.INSTANCE;
                            return Unit.INSTANCE;
                        case 1:
                            i2 = this.f36190l;
                            audioTrack = (AudioTrack) this.f36187l;
                            AbstractC2829l.crashlytics(obj);
                            if (audioTrack.getBilling()) {
                                this.f36186l = null;
                                this.f36187l = audioTrack;
                                this.f36190l = i2;
                                this.f36185l = 2;
                                C16552l c16552l3 = AbstractC11463l.yandex;
                                objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C18523l(false, audioTrack, (InterfaceC14029l) null), this);
                                if (objFirebase == enumC9342l) {
                                    objFirebase = Unit.INSTANCE;
                                }
                                if (objFirebase == enumC9342l) {
                                    return enumC9342l;
                                }
                                audioTrack3 = audioTrack;
                                audioTrack = audioTrack3;
                            }
                            C8490l c8490l3 = AbstractC6025l.yandex;
                            c15442l = new C15442l(audioTrack);
                            this.f36186l = null;
                            this.f36187l = null;
                            this.f36190l = i2;
                            this.f36185l = 3;
                            if (AbstractC6025l.yandex(c15442l, this) == enumC9342l) {
                                return enumC9342l;
                            }
                            Unit unit3 = Unit.INSTANCE;
                            return Unit.INSTANCE;
                        case 2:
                            i2 = this.f36190l;
                            audioTrack3 = (AudioTrack) this.f36187l;
                            AbstractC2829l.crashlytics(obj);
                            audioTrack = audioTrack3;
                            C8490l c8490l4 = AbstractC6025l.yandex;
                            c15442l = new C15442l(audioTrack);
                            this.f36186l = null;
                            this.f36187l = null;
                            this.f36190l = i2;
                            this.f36185l = 3;
                            if (AbstractC6025l.yandex(c15442l, this) == enumC9342l) {
                                return enumC9342l;
                            }
                            Unit unit4 = Unit.INSTANCE;
                            return Unit.INSTANCE;
                        case 3:
                        case 6:
                            AbstractC2829l.crashlytics(obj);
                            Unit unit5 = Unit.INSTANCE;
                            return Unit.INSTANCE;
                        case 4:
                            iHashCode = this.f36190l;
                            AudioTrack audioTrack4 = (AudioTrack) this.f36187l;
                            AbstractC2829l.crashlytics(obj);
                            audioTrack2 = audioTrack4;
                            if (audioTrack2.f36610volatile.crashlytics) {
                                this.f36186l = null;
                                this.f36187l = audioTrack2;
                                this.f36190l = iHashCode;
                                this.f36185l = 5;
                                C16552l c16552l4 = AbstractC11463l.yandex;
                                objFirebase2 = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C18523l(true, audioTrack2, (InterfaceC14029l) null), this);
                                if (objFirebase2 == enumC9342l) {
                                    objFirebase2 = Unit.INSTANCE;
                                }
                                if (objFirebase2 == enumC9342l) {
                                    return enumC9342l;
                                }
                                i3 = iHashCode;
                                iHashCode = i3;
                            }
                            C8490l c8490l5 = AbstractC6025l.yandex;
                            c15085l = new C15085l(audioTrack2);
                            this.f36186l = null;
                            this.f36187l = null;
                            this.f36190l = iHashCode;
                            this.f36185l = 6;
                            if (AbstractC6025l.yandex(c15085l, this) == enumC9342l) {
                                return enumC9342l;
                            }
                            Unit unit6 = Unit.INSTANCE;
                            return Unit.INSTANCE;
                        case 5:
                            i3 = this.f36190l;
                            audioTrack2 = (AudioTrack) this.f36187l;
                            AbstractC2829l.crashlytics(obj);
                            iHashCode = i3;
                            C8490l c8490l6 = AbstractC6025l.yandex;
                            c15085l = new C15085l(audioTrack2);
                            this.f36186l = null;
                            this.f36187l = null;
                            this.f36190l = iHashCode;
                            this.f36185l = 6;
                            if (AbstractC6025l.yandex(c15085l, this) == enumC9342l) {
                                return enumC9342l;
                            }
                            Unit unit7 = Unit.INSTANCE;
                            return Unit.INSTANCE;
                        default:
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                } catch (Throwable unused) {
                }
                break;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f36188l;
        Object obj2 = this.f36191l;
        switch (i) {
            case 0:
                C18539l c18539l = new C18539l((C0360l) this.f36187l, (Function2) obj2, interfaceC14029l);
                c18539l.f36189l = ((Boolean) obj).booleanValue();
                return c18539l;
            default:
                C18539l c18539l2 = new C18539l(this.f36189l, (AudioTrack) obj2, interfaceC14029l);
                c18539l2.f36186l = obj;
                return c18539l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36188l) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((C18539l) ads((InterfaceC14029l) obj2, bool)).Signature(Unit.INSTANCE);
            default:
                return ((C18539l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18539l(boolean z, AudioTrack audioTrack, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f36189l = z;
        this.f36191l = audioTrack;
    }
}
