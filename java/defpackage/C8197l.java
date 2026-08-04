package defpackage;

import bruhcollective.itaysonlab.libvkmusic.objects.DataResponse;
import java.io.Closeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lًۖٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8197l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC13852l f17100l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f17101l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f17102l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8197l(AbstractC13852l abstractC13852l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f17101l = i;
        this.f17100l = abstractC13852l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Exception {
        Object obj2;
        Object objYandex;
        int i = this.f17101l;
        AbstractC13852l abstractC13852l = this.f17100l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f17102l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f17102l = 1;
                    obj = abstractC13852l.yandex(this);
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
                Closeable closeable = (Closeable) obj;
                try {
                    InterfaceC9473l interfaceC9473lMo1516l = ((AbstractC6897l) closeable).mo1516l();
                    boolean zAdmob = abstractC13852l.admob();
                    Class cls = abstractC13852l.loadAd;
                    if (!zAdmob) {
                        DataResponse dataResponse = (DataResponse) VKXApplication.f36629l.yandex(AbstractC15639l.mopub(DataResponse.class, cls)).yandex(interfaceC9473lMo1516l);
                        if (dataResponse != null) {
                            objYandex = dataResponse.yandex;
                        } else {
                            obj2 = null;
                        }
                        AbstractC7876l.loadAd(closeable, null);
                        return obj2;
                    }
                    C12952l c12952l = VKXApplication.f36629l;
                    c12952l.getClass();
                    objYandex = c12952l.loadAd(cls, AbstractC7694l.yandex, null).yandex(interfaceC9473lMo1516l);
                    obj2 = objYandex;
                    AbstractC7876l.loadAd(closeable, null);
                    return obj2;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC7876l.loadAd(closeable, th);
                        throw th2;
                    }
                }
            default:
                int i3 = this.f17102l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f17102l = 1;
                    if (abstractC13852l.crashlytics(this) == enumC9342l) {
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
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f17101l;
        AbstractC13852l abstractC13852l = this.f17100l;
        switch (i) {
            case 0:
                return new C8197l(abstractC13852l, interfaceC14029l, 0);
            default:
                return new C8197l(abstractC13852l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f17101l) {
            case 0:
                break;
        }
        return ((C8197l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
