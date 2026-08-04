package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* JADX INFO: renamed from: lٍٞٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9718l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ long f19818l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f19819l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public /* synthetic */ Object f19820l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f19821l = 4;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ int f19822l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f19823l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9718l(long j, C9987l c9987l, int i, String str, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f19818l = j;
        this.f19820l = c9987l;
        this.f19822l = i;
        this.f19819l = str;
    }

    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        final String string;
        Object objM3168l;
        int i = this.f19821l;
        final long j = this.f19818l;
        final int i2 = this.f19822l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i3 = this.f19823l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C16552l c16552l = AbstractC11463l.yandex;
                    ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
                    C14392l c14392l = new C14392l(null, this.f19818l, this.f19822l, (String) this.f19819l, (Function1) this.f19820l);
                    this.f19823l = 1;
                    if (AbstractC10999l.firebase(executorC6708l, c14392l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i4 = this.f19823l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C13772l c13772l = C13772l.f26881l;
                    AppActivity appActivity = (AppActivity) ((C17984l) this.f19820l).isVip();
                    C17889l c17889l = new C17889l(j, (String) this.f19819l, i2);
                    this.f19823l = 1;
                    if (c13772l.m3756implements(appActivity, c17889l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 2:
                int i5 = this.f19823l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C5616l c5616l = (C5616l) ((List) this.f19819l).get(i2);
                    C9735l c9735l = new C9735l(j);
                    C4776l c4776l = (C4776l) this.f19820l;
                    this.f19823l = 1;
                    if (C5616l.loadAd(c5616l, c9735l, c4776l, null, null, this, 12) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i5 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 3:
                int i6 = this.f19823l;
                if (i6 != 0) {
                    if (i6 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C16534l c16534l = new C16534l(this.f19818l, ((C9987l) this.f19820l).f20387l, 3000, new Integer(i2), (String) this.f19819l);
                this.f19823l = 1;
                Object objSubs = c16534l.subs(this);
                return objSubs == enumC9342l ? enumC9342l : objSubs;
            default:
                int i7 = this.f19823l;
                if (i7 != 0) {
                    if (i7 == 1) {
                        string = (String) this.f19819l;
                        AbstractC2829l.crashlytics(obj);
                        objM3168l = obj;
                    } else if (i7 == 2) {
                        string = (String) this.f19819l;
                        AbstractC2829l.crashlytics(obj);
                        AbstractC5921l.f12465l.adcel(AbstractC0825l.admob(5, string), false);
                        C8490l c8490l = AbstractC6025l.yandex;
                        this.f19820l = null;
                        this.f19819l = null;
                        this.f19823l = 3;
                        if (AbstractC6025l.yandex(C4097l.yandex, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i7 != 3) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                sb.append('_');
                sb.append(i2);
                string = sb.toString();
                C6336l c6336l = C6336l.yandex;
                this.f19820l = null;
                this.f19819l = string;
                this.f19823l = 1;
                objM3168l = C6336l.loadAd.m3168l(this);
                if (objM3168l == enumC9342l) {
                    return enumC9342l;
                }
                Function1 function1 = new Function1() { // from class: lًّٔ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        C3918l c3918l = (C3918l) obj2;
                        boolean z = true;
                        CachedPlaylist cachedPlaylist = (CachedPlaylist) AbstractC11356l.loadAd(c3918l.m1449l(AbstractC18202l.yandex.loadAd(CachedPlaylist.class), "uid == $0", Arrays.copyOf(new Object[]{string}, 1)));
                        if (cachedPlaylist != null) {
                            c3918l.m1451l(cachedPlaylist);
                        } else {
                            AbstractC2991l.billing("VkxRemover", 5, "Cannot delete playlist " + j + '_' + i2 + ": it is not present in the database", null);
                            long ptr$cinterop_release = ((LongPointerWrapper) c3918l.remoteconfig().f12835l).getPtr$cinterop_release();
                            int i8 = AbstractC9795l.yandex;
                            realmcJNI.realm_rollback(ptr$cinterop_release);
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                };
                this.f19820l = null;
                this.f19819l = string;
                this.f19823l = 2;
                if (((C5198l) objM3168l).m1734l(function1, this) == enumC9342l) {
                    return enumC9342l;
                }
                AbstractC5921l.f12465l.adcel(AbstractC0825l.admob(5, string), false);
                C8490l c8490l2 = AbstractC6025l.yandex;
                this.f19820l = null;
                this.f19819l = null;
                this.f19823l = 3;
                if (AbstractC6025l.yandex(C4097l.yandex, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f19821l) {
            case 0:
                return new C9718l(interfaceC14029l, this.f19818l, this.f19822l, (String) this.f19819l, (Function1) this.f19820l);
            case 1:
                return new C9718l((C17984l) this.f19820l, this.f19818l, (String) this.f19819l, this.f19822l, interfaceC14029l);
            case 2:
                return new C9718l((List) this.f19819l, this.f19822l, this.f19818l, (C4776l) this.f19820l, interfaceC14029l);
            case 3:
                return new C9718l(this.f19818l, (C9987l) this.f19820l, this.f19822l, (String) this.f19819l, interfaceC14029l);
            default:
                C9718l c9718l = new C9718l(this.f19822l, this.f19818l, interfaceC14029l);
                c9718l.f19820l = obj;
                return c9718l;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f19821l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((C9718l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9718l(int i, long j, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f19818l = j;
        this.f19822l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9718l(InterfaceC14029l interfaceC14029l, long j, int i, String str, Function1 function1) {
        super(2, interfaceC14029l);
        this.f19818l = j;
        this.f19822l = i;
        this.f19819l = str;
        this.f19820l = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9718l(C17984l c17984l, long j, String str, int i, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f19820l = c17984l;
        this.f19818l = j;
        this.f19819l = str;
        this.f19822l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9718l(List list, int i, long j, C4776l c4776l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f19819l = list;
        this.f19822l = i;
        this.f19818l = j;
        this.f19820l = c4776l;
    }
}
