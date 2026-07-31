package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؘْٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5771l extends AbstractC7481l {
    public final AbstractC12074l loadAd;

    public C5771l(Object obj, AbstractC12074l abstractC12074l) {
        super(obj);
        this.loadAd = abstractC12074l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yandex(Function3 function3, AbstractC0283l abstractC0283l) throws C12789l {
        C11313l c11313l;
        AbstractC12074l abstractC12074l;
        if (abstractC0283l instanceof C11313l) {
            c11313l = (C11313l) abstractC0283l;
            int i = c11313l.f22804l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c11313l.f22804l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c11313l = new C11313l(this, abstractC0283l);
            }
        } else {
            c11313l = new C11313l(this, abstractC0283l);
        }
        Object objSignature = c11313l.f22805l;
        int i2 = c11313l.f22804l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objSignature);
            abstractC12074l = this.loadAd;
            Object objCrashlytics = abstractC12074l.crashlytics();
            InterfaceC9354l interfaceC9354l = objCrashlytics instanceof InterfaceC9354l ? (InterfaceC9354l) objCrashlytics : null;
            if (interfaceC9354l == null) {
                return Unit.INSTANCE;
            }
            AbstractC11626l.yandex((InterfaceC9955l) abstractC12074l.f24000l);
            c11313l.f22806l = abstractC12074l;
            c11313l.f22804l = 1;
            C1640l c1640l = (C1640l) function3;
            c1640l.getClass();
            C1640l c1640l2 = new C1640l((InterfaceC9955l) c1640l.f3982l, (List) c1640l.f3979l, (C11310l) c1640l.f3974l, c11313l);
            c1640l2.f3977l = interfaceC9354l;
            objSignature = c1640l2.Signature(Unit.INSTANCE);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objSignature == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            abstractC12074l = c11313l.f22806l;
            AbstractC2829l.crashlytics(objSignature);
        }
        abstractC12074l.mopub(objSignature);
        return Unit.INSTANCE;
    }
}
