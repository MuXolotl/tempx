package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: renamed from: lْۙ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13626l extends AbstractC17254l {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.AbstractC17254l
    public final Object yandex(Context context, InterfaceC14029l interfaceC14029l) throws Throwable {
        C4534l c4534l;
        if (interfaceC14029l instanceof C4534l) {
            c4534l = (C4534l) interfaceC14029l;
            int i = c4534l.f9172l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4534l.f9172l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4534l = new C4534l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c4534l = new C4534l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object objFirebase = c4534l.f9173l;
        int i2 = c4534l.f9172l;
        int i3 = 2;
        InterfaceC14029l interfaceC14029l2 = null;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            C16552l c16552l = AbstractC11463l.yandex;
            C18160l c18160l = new C18160l(i3, interfaceC14029l2, 5);
            c4534l.f9174l = context;
            c4534l.f9172l = 1;
            objFirebase = AbstractC10999l.firebase(c16552l, c18160l, c4534l);
            if (objFirebase != enumC9342l) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC2829l.crashlytics(objFirebase);
                return objFirebase;
            }
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        context = c4534l.f9174l;
        AbstractC2829l.crashlytics(objFirebase);
        C16552l c16552l2 = AbstractC11463l.yandex;
        ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
        C11301l c11301l = new C11301l((List) objFirebase, this, context, null);
        c4534l.f9174l = null;
        c4534l.f9172l = 2;
        Object objFirebase2 = AbstractC10999l.firebase(executorC6708l, c11301l, c4534l);
        return objFirebase2 == enumC9342l ? enumC9342l : objFirebase2;
    }
}
