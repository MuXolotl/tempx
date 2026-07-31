package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lًۢۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8345l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C5835l f17269l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f17270l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f17271l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8345l(C5835l c5835l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f17270l = i;
        this.f17269l = c5835l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        int i = this.f17270l;
        C5835l c5835l = this.f17269l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i2 = this.f17271l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C1083l c1083l = C1083l.f2987l;
                    this.f17271l = 1;
                    obj = c1083l.remoteconfig(this);
                    if (obj == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(c5835l.yandex.purchase((AudioTrack) it.next()));
                }
                return arrayList;
            default:
                int i3 = this.f17271l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C16552l c16552l = AbstractC11463l.yandex;
                ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
                C8345l c8345l = new C8345l(c5835l, interfaceC14029l, 0);
                this.f17271l = 1;
                Object objFirebase = AbstractC10999l.firebase(executorC6708l, c8345l, this);
                return objFirebase == enumC9342l ? enumC9342l : objFirebase;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f17270l;
        C5835l c5835l = this.f17269l;
        switch (i) {
            case 0:
                return new C8345l(c5835l, interfaceC14029l, 0);
            default:
                return new C8345l(c5835l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f17270l) {
            case 0:
                break;
        }
        return ((C8345l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
