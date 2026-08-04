package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؒٞ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1221l extends AbstractC8284l {

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public final int f3260l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1221l() {
        super(VKXApplication.Companion.loadAd(R.string.tab_recommendations), C6371l.yandex);
        VKXApplication.Companion companion = VKXApplication.f36628l;
        this.f3260l = 400;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.AbstractC8284l, defpackage.AbstractC3372l
    /* JADX INFO: renamed from: break, reason: not valid java name */
    public final Object mo850break(int i, InterfaceC14029l interfaceC14029l) {
        C3092l c3092l;
        if (interfaceC14029l instanceof C3092l) {
            c3092l = (C3092l) interfaceC14029l;
            int i2 = c3092l.f6634l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3092l.f6634l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c3092l = new C3092l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c3092l = new C3092l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object objSubs = c3092l.f6633l;
        int i3 = c3092l.f6634l;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(objSubs);
            C16287l.yandex.getClass();
            C16534l c16534l = new C16534l(i, this.f3260l, C16287l.crashlytics(), (String) null);
            c3092l.f6634l = 1;
            objSubs = c16534l.subs(c3092l);
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
        List list = (List) ((VKResponseWithItems) objSubs).yandex;
        return list == null ? C2580l.f5619l : list;
    }

    @Override // defpackage.AbstractC8284l
    /* JADX INFO: renamed from: const, reason: not valid java name */
    public final boolean mo851const() {
        return true;
    }

    @Override // defpackage.AbstractC11519l
    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final int mo853goto() {
        return this.f3260l;
    }

    @Override // defpackage.AbstractC2484l
    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final void mo852final() {
    }
}
