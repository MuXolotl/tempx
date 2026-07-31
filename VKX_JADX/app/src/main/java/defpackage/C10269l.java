package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lَٓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10269l extends AbstractC7481l {
    public final AbstractC12074l loadAd;

    public C10269l(Object obj, AbstractC12074l abstractC12074l) {
        super(obj);
        this.loadAd = abstractC12074l;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object yandex(Function3 function3, AbstractC0283l abstractC0283l) throws C12789l {
        C8044l c8044l;
        AbstractC12074l abstractC12074l;
        if (abstractC0283l instanceof C8044l) {
            c8044l = (C8044l) abstractC0283l;
            int i = c8044l.f16744l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c8044l.f16744l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c8044l = new C8044l(this, abstractC0283l);
            }
        } else {
            c8044l = new C8044l(this, abstractC0283l);
        }
        C8044l c8044l2 = c8044l;
        Object objSignature = c8044l2.f16745l;
        int i2 = c8044l2.f16744l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objSignature);
            abstractC12074l = this.loadAd;
            InterfaceC6581l interfaceC6581lAdcel = ((InterfaceC9955l) abstractC12074l.f24000l).adcel();
            C11911l c11911l = AbstractC17961l.yandex;
            c8044l2.f16746l = abstractC12074l;
            c8044l2.f16744l = 1;
            C9431l c9431l = (C9431l) function3;
            c9431l.getClass();
            objSignature = new C9431l(c9431l.f19286l, c9431l.f19291l, c9431l.f19288l, c9431l.f19283l, c9431l.f19292l, c8044l2).Signature(Unit.INSTANCE);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objSignature == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            abstractC12074l = c8044l2.f16746l;
            AbstractC2829l.crashlytics(objSignature);
        }
        abstractC12074l.mopub(objSignature);
        return Unit.INSTANCE;
    }
}
