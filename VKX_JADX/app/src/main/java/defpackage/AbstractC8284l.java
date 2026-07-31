package defpackage;

import androidx.recyclerview.widget.subs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lًۜٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8284l extends AbstractC3372l {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public final InterfaceC17817l f17178l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public final String f17179l;

    public AbstractC8284l(String str, InterfaceC17817l interfaceC17817l) {
        this.f17179l = str;
        this.f17178l = interfaceC17817l;
    }

    @Override // defpackage.AbstractC3372l
    /* JADX INFO: renamed from: break */
    public Object mo850break(int i, InterfaceC14029l interfaceC14029l) {
        C16552l c16552l = AbstractC11463l.yandex;
        return AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C11039l(this, null, 5), interfaceC14029l);
    }

    @Override // defpackage.AbstractC11519l, defpackage.AbstractC2484l
    /* JADX INFO: renamed from: case */
    public AbstractC14412l mo647case() {
        return new C3497l(this, true, false, 124);
    }

    /* JADX INFO: renamed from: const */
    public boolean mo851const() {
        return !(this instanceof C16467l);
    }

    @Override // defpackage.AbstractC3372l, defpackage.AbstractC2484l
    /* JADX INFO: renamed from: continue */
    public String mo648continue() {
        return this.f17179l;
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public C8195l mo2292implements() {
        return null;
    }

    @Override // defpackage.AbstractC11519l
    /* JADX INFO: renamed from: protected, reason: merged with bridge method [inline-methods] */
    public C14451l mo1270new() {
        InterfaceC17817l interfaceC17817l = this.f17178l;
        if (interfaceC17817l instanceof C6371l) {
            interfaceC17817l = null;
        }
        return new C14451l(false, false, 0, interfaceC17817l, new Cconst(0, this, AbstractC8284l.class, "getCustomMenuItem", "getCustomMenuItem()Lkotlin/Pair;", 0, 0, 27), null, 103);
    }

    @Override // defpackage.AbstractC11519l
    /* JADX INFO: renamed from: super */
    public void mo1271super() {
        this.f23170l.clear();
        subs subsVar = this.f23165l;
        if (subsVar == null) {
            subsVar = null;
        }
        ((C14451l) subsVar).appmetrica(null);
    }

    @Override // defpackage.AbstractC3372l
    /* JADX INFO: renamed from: transient */
    public Object mo1272transient(List list, InterfaceC14029l interfaceC14029l) {
        ArrayList arrayList = this.f23170l;
        arrayList.addAll(list);
        boolean z = false;
        if (!mo851const() && !list.isEmpty()) {
            z = true;
        }
        this.f23160l = z;
        subs subsVar = this.f23165l;
        if (subsVar == null) {
            subsVar = null;
        }
        ((C14451l) subsVar).appmetrica(arrayList);
        return Unit.INSTANCE;
    }
}
