package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems;
import ua.itaysonlab.vkapi2.objects.message.ConversationAudioElement;

/* JADX INFO: renamed from: lًٖٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16467l extends AbstractC8284l {

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public final String f32188l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public String f32189l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public final long f32190l;

    public C16467l(long j, String str) {
        super(str, C6371l.yandex);
        this.f32190l = j;
        this.f32188l = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.AbstractC8284l, defpackage.AbstractC3372l
    /* JADX INFO: renamed from: break */
    public final Object mo850break(int i, InterfaceC14029l interfaceC14029l) {
        C17277l c17277l;
        if (interfaceC14029l instanceof C17277l) {
            c17277l = (C17277l) interfaceC14029l;
            int i2 = c17277l.f33522l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c17277l.f33522l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c17277l = new C17277l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c17277l = new C17277l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object objSubs = c17277l.f33521l;
        int i3 = c17277l.f33522l;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(objSubs);
            C12772l c12772l = new C12772l(this.f32190l, this.f23161l, this.f32189l);
            c17277l.f33522l = 1;
            objSubs = c12772l.subs(c17277l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objSubs == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i3 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objSubs);
        }
        VKResponseWithItems vKResponseWithItems = (VKResponseWithItems) objSubs;
        this.f32189l = vKResponseWithItems.purchase;
        Iterable iterable = (Iterable) vKResponseWithItems.yandex;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((ConversationAudioElement) it.next()).yandex.yandex);
        }
        return arrayList;
    }

    @Override // defpackage.AbstractC8284l, defpackage.AbstractC3372l, defpackage.AbstractC2484l
    /* JADX INFO: renamed from: continue */
    public final String mo648continue() {
        return this.f32188l;
    }

    @Override // defpackage.AbstractC8284l, defpackage.AbstractC11519l
    /* JADX INFO: renamed from: super */
    public final void mo1271super() {
        super.mo1271super();
        this.f32189l = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.AbstractC8284l, defpackage.AbstractC3372l
    /* JADX INFO: renamed from: transient */
    public final Object mo1272transient(List list, InterfaceC14029l interfaceC14029l) {
        C5537l c5537l;
        if (interfaceC14029l instanceof C5537l) {
            c5537l = (C5537l) interfaceC14029l;
            int i = c5537l.f11805l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c5537l.f11805l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c5537l = new C5537l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c5537l = new C5537l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object obj = c5537l.f11804l;
        int i2 = c5537l.f11805l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c5537l.f11805l = 1;
            Object objMo1272transient = super.mo1272transient(list, c5537l);
            Object obj2 = EnumC9342l.f19165l;
            if (objMo1272transient == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        this.f23160l = this.f32189l != null;
        return Unit.INSTANCE;
    }
}
