package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lًّۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8207l extends AbstractC17254l {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.AbstractC17254l
    public final Object yandex(Context context, InterfaceC14029l interfaceC14029l) {
        C5887l c5887l;
        C15744l c15744l;
        C15744l c15744l2;
        if (interfaceC14029l instanceof C5887l) {
            c5887l = (C5887l) interfaceC14029l;
            int i = c5887l.f12409l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c5887l.f12409l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c5887l = new C5887l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c5887l = new C5887l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object objFirebase = c5887l.f12408l;
        int i2 = c5887l.f12409l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            InterfaceC6942l interfaceC6942lYandex = AbstractC3803l.yandex(context).yandex();
            c5887l.f12409l = 1;
            objFirebase = AbstractC0622l.firebase(interfaceC6942lYandex, c5887l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objFirebase == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objFirebase);
        }
        C3597l c3597l = (C3597l) objFirebase;
        C15744l c15744l3 = c3597l.f7519l;
        return ((c15744l3 == null || !c15744l3.f30927l) && ((c15744l = c3597l.f7529l) == null || !c15744l.f30927l) && ((c15744l2 = c3597l.f7532l) == null || !c15744l2.f30927l)) ? C2614l.yandex : new C6594l(new C1812l(R.string.qf_eq, R.string.qf_eq_description, R.drawable.ic_sound_wave_outline_28, new C5601l(new C14959l(2, this, C8207l.class, "resolve", "resolve(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 2), R.drawable.ic_sound_wave_slash_outline_28, R.string.qf_eq_action, 8)));
    }
}
