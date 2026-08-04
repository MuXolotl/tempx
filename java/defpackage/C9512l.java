package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems;

/* JADX INFO: renamed from: lٍّۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9512l extends AbstractC8284l {

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public final long f19399l;

    public C9512l(long j) {
        super("", new C17745l(j));
        this.f19399l = j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.AbstractC8284l, defpackage.AbstractC3372l
    /* JADX INFO: renamed from: break */
    public final Object mo850break(int i, InterfaceC14029l interfaceC14029l) {
        C7320l c7320l;
        C13772l c13772l;
        if (interfaceC14029l instanceof C7320l) {
            c7320l = (C7320l) interfaceC14029l;
            int i2 = c7320l.f15177l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c7320l.f15177l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c7320l = new C7320l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c7320l = new C7320l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object obj = c7320l.f15178l;
        int i3 = c7320l.f15177l;
        int i4 = this.f23161l;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(obj);
            C13772l c13772l2 = C13772l.f26875l;
            C7093l c7093l = new C7093l(i4, this.f19399l, i);
            c7320l.f15179l = c13772l2;
            c7320l.f15177l = 1;
            Object objSubs = c7093l.subs(c7320l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objSubs == enumC9342l) {
                return enumC9342l;
            }
            obj = objSubs;
            c13772l = c13772l2;
        } else {
            if (i3 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c13772l = c7320l.f15179l;
            AbstractC2829l.crashlytics(obj);
        }
        VKResponseWithItems vKResponseWithItems = (VKResponseWithItems) obj;
        this.f23160l = ((List) vKResponseWithItems.yandex).size() >= i4;
        List list = (List) vKResponseWithItems.yandex;
        c13772l.getClass();
        ArrayList arrayList = new ArrayList();
        C13772l.m3755l(list, new C8103l(4, arrayList));
        return arrayList;
    }

    @Override // defpackage.AbstractC8284l, defpackage.AbstractC11519l, defpackage.AbstractC2484l
    /* JADX INFO: renamed from: case */
    public final AbstractC14412l mo647case() {
        return new C7511l();
    }

    @Override // defpackage.AbstractC8284l
    /* JADX INFO: renamed from: const */
    public final boolean mo851const() {
        return false;
    }
}
