package androidx.recyclerview.widget;

import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.AbstractC13735l;
import defpackage.AbstractC14366l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC15872l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC9307l;
import defpackage.C10156l;
import defpackage.C11632l;
import defpackage.C13036l;
import defpackage.C13279l;
import defpackage.C14990l;
import defpackage.C1759l;
import defpackage.C18262l;
import defpackage.C18353l;
import defpackage.C18725l;
import defpackage.C3253l;
import defpackage.C5932l;
import defpackage.C7611l;
import defpackage.C8339l;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class firebase {
    public final /* synthetic */ RecyclerView admob;
    public final List amazon;
    public int billing;
    public final ArrayList crashlytics;
    public ArrayList loadAd;
    public C11632l mopub;
    public int purchase;
    public final ArrayList yandex;

    public firebase(RecyclerView recyclerView) {
        this.admob = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.yandex = arrayList;
        this.loadAd = null;
        this.crashlytics = new ArrayList();
        this.amazon = DesugarCollections.unmodifiableList(arrayList);
        this.purchase = 2;
        this.billing = 2;
    }

    public static void amazon(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                amazon((ViewGroup) childAt, true);
            }
        }
        if (z) {
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
            } else {
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }
    }

    public final void admob(int i) {
        if (RecyclerView.sVerboseLoggingEnabled) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.crashlytics;
        metrica metricaVar = (metrica) arrayList.get(i);
        if (RecyclerView.sVerboseLoggingEnabled) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + metricaVar);
        }
        yandex(metricaVar, true);
        arrayList.remove(i);
    }

    public final void billing(subs subsVar, boolean z) {
        C11632l c11632l = this.mopub;
        if (c11632l != null) {
            SparseArray sparseArray = c11632l.yandex;
            Set set = c11632l.crashlytics;
            set.remove(subsVar);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((C7611l) sparseArray.get(sparseArray.keyAt(i))).yandex;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    AbstractC9307l.crashlytics(((metrica) arrayList.get(i2)).yandex);
                }
            }
        }
    }

    public final C11632l crashlytics() {
        if (this.mopub == null) {
            C11632l c11632l = new C11632l();
            c11632l.yandex = new SparseArray();
            c11632l.loadAd = 0;
            c11632l.crashlytics = Collections.newSetFromMap(new IdentityHashMap());
            this.mopub = c11632l;
            purchase();
        }
        return this.mopub;
    }

    public final void firebase(View view) {
        metrica childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        int i = childViewHolderInt.isPro & 12;
        RecyclerView recyclerView = this.admob;
        if (i == 0 && childViewHolderInt.remoteconfig() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
            if (this.loadAd == null) {
                this.loadAd = new ArrayList();
            }
            childViewHolderInt.vip = this;
            childViewHolderInt.metrica = true;
            this.loadAd.add(childViewHolderInt);
            return;
        }
        if (childViewHolderInt.admob() && !childViewHolderInt.isPro() && !recyclerView.mAdapter.f464l) {
            C8339l.metrica(AbstractC14814l.vip(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            return;
        }
        childViewHolderInt.vip = this;
        childViewHolderInt.metrica = false;
        this.yandex.add(childViewHolderInt);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e1 A[LOOP:2: B:64:0x00d6->B:68:0x00e1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x00e4 A[EDGE_INSN: B:93:0x00e4->B:69:0x00e4 BREAK  A[LOOP:1: B:60:0x00c1->B:67:0x00de, LOOP_LABEL: LOOP:1: B:60:0x00c1->B:67:0x00de], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00e4 A[EDGE_INSN: B:95:0x00e4->B:69:0x00e4 BREAK  A[LOOP:1: B:60:0x00c1->B:67:0x00de], SYNTHETIC] */
    public final void isPro(metrica metricaVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        crashlytics crashlyticsVar;
        int i3;
        int i4;
        boolean zFirebase = metricaVar.firebase();
        View view = metricaVar.yandex;
        boolean z3 = false;
        boolean z4 = true;
        RecyclerView recyclerView = this.admob;
        if (zFirebase || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(metricaVar.firebase());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.exceptionLabel());
            throw new IllegalArgumentException(sb.toString());
        }
        if (metricaVar.smaato()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(metricaVar);
            C8339l.metrica(AbstractC14814l.vip(recyclerView, sb2));
            return;
        }
        if (metricaVar.adcel()) {
            C8339l.metrica(AbstractC14814l.vip(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            return;
        }
        if ((metricaVar.isPro & 16) == 0) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            if (view.hasTransientState()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        subs subsVar = recyclerView.mAdapter;
        boolean z5 = subsVar != null && z && subsVar.license(metricaVar);
        boolean z6 = RecyclerView.sDebugAssertionsEnabled;
        ArrayList arrayList = this.crashlytics;
        if (z6 && arrayList.contains(metricaVar)) {
            StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
            sb3.append(metricaVar);
            C8339l.metrica(AbstractC14814l.vip(recyclerView, sb3));
            return;
        }
        if (z5 || metricaVar.subs()) {
            if (this.billing <= 0 || (metricaVar.isPro & 526) != 0) {
                z2 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.billing && size > 0) {
                    admob(0);
                    size--;
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0) {
                    crashlytics crashlyticsVar2 = recyclerView.mPrefetchRegistry;
                    int i5 = metricaVar.crashlytics;
                    if (crashlyticsVar2.crashlytics != null) {
                        int i6 = crashlyticsVar2.amazon * 2;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                i = size - 1;
                                loop1: while (i >= 0) {
                                    i2 = ((metrica) arrayList.get(i)).crashlytics;
                                    crashlyticsVar = recyclerView.mPrefetchRegistry;
                                    if (crashlyticsVar.crashlytics != null) {
                                        break;
                                    }
                                    i3 = crashlyticsVar.amazon * 2;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < i3) {
                                            break loop1;
                                        } else if (crashlyticsVar.crashlytics[i4] == i2) {
                                            break;
                                        } else {
                                            i4 += 2;
                                        }
                                    }
                                    i--;
                                }
                                size = i + 1;
                            } else if (crashlyticsVar2.crashlytics[i7] != i5) {
                                i7 += 2;
                            }
                        }
                    } else {
                        i = size - 1;
                        loop1: while (i >= 0) {
                            i2 = ((metrica) arrayList.get(i)).crashlytics;
                            crashlyticsVar = recyclerView.mPrefetchRegistry;
                            if (crashlyticsVar.crashlytics != null) {
                                break;
                                break;
                            }
                            i3 = crashlyticsVar.amazon * 2;
                            i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    break loop1;
                                    break loop1;
                                } else if (crashlyticsVar.crashlytics[i4] == i2) {
                                    break;
                                } else {
                                    i4 += 2;
                                }
                            }
                            i--;
                        }
                        size = i + 1;
                    }
                }
                arrayList.add(size, metricaVar);
                z2 = true;
            }
            if (z2) {
                z4 = false;
            } else {
                yandex(metricaVar, true);
            }
            z3 = z2;
        } else {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.exceptionLabel());
            }
            z4 = false;
        }
        recyclerView.mViewInfoStore.amazon(metricaVar);
        if (z3 || z4 || !z) {
            return;
        }
        AbstractC9307l.crashlytics(view);
        metricaVar.subscription = null;
        metricaVar.ads = null;
    }

    public final int loadAd(int i) {
        RecyclerView recyclerView = this.admob;
        if (i >= 0 && i < recyclerView.mState.loadAd()) {
            return !recyclerView.mState.mopub ? i : recyclerView.mAdapterHelper.billing(i, 0);
        }
        StringBuilder sbSignature = AbstractC2812l.Signature("invalid position ", i, ". State item count is ");
        sbSignature.append(recyclerView.mState.loadAd());
        sbSignature.append(recyclerView.exceptionLabel());
        throw new IndexOutOfBoundsException(sbSignature.toString());
    }

    public final void mopub() {
        ArrayList arrayList = this.crashlytics;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            admob(size);
        }
        arrayList.clear();
        if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
            crashlytics crashlyticsVar = this.admob.mPrefetchRegistry;
            int[] iArr = crashlyticsVar.crashlytics;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            crashlyticsVar.amazon = 0;
        }
    }

    public final void purchase() {
        if (this.mopub != null) {
            RecyclerView recyclerView = this.admob;
            if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            C11632l c11632l = this.mopub;
            c11632l.crashlytics.add(recyclerView.mAdapter);
        }
    }

    public final void remoteconfig(metrica metricaVar) {
        if (metricaVar.metrica) {
            this.loadAd.remove(metricaVar);
        } else {
            this.yandex.remove(metricaVar);
        }
        metricaVar.vip = null;
        metricaVar.metrica = false;
        metricaVar.isPro &= -33;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:112:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:127:0x0205  */
    /* JADX WARN: Code duplicated, block: B:129:0x020f  */
    /* JADX WARN: Code duplicated, block: B:130:0x021a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0220  */
    /* JADX WARN: Code duplicated, block: B:134:0x022b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0240  */
    /* JADX WARN: Code duplicated, block: B:140:0x024b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0253  */
    /* JADX WARN: Code duplicated, block: B:144:0x025d  */
    /* JADX WARN: Code duplicated, block: B:146:0x026b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0277  */
    /* JADX WARN: Code duplicated, block: B:164:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:175:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:177:0x0301  */
    /* JADX WARN: Code duplicated, block: B:179:0x0305  */
    /* JADX WARN: Code duplicated, block: B:182:0x0329  */
    /* JADX WARN: Code duplicated, block: B:184:0x0331  */
    /* JADX WARN: Code duplicated, block: B:186:0x0339  */
    /* JADX WARN: Code duplicated, block: B:189:0x034c A[LOOP:4: B:185:0x0337->B:189:0x034c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:190:0x034f A[EDGE_INSN: B:190:0x034f->B:191:0x0350 BREAK  A[LOOP:4: B:185:0x0337->B:189:0x034c]] */
    /* JADX WARN: Code duplicated, block: B:192:0x0352  */
    /* JADX WARN: Code duplicated, block: B:194:0x0359  */
    /* JADX WARN: Code duplicated, block: B:196:0x035f  */
    /* JADX WARN: Code duplicated, block: B:199:0x0368  */
    /* JADX WARN: Code duplicated, block: B:201:0x0370  */
    /* JADX WARN: Code duplicated, block: B:207:0x0384  */
    /* JADX WARN: Code duplicated, block: B:209:0x0388 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:214:0x0396 A[Catch: all -> 0x03fc, TryCatch #0 {all -> 0x03fc, blocks: (B:212:0x0390, B:214:0x0396, B:215:0x03ab, B:217:0x03b7, B:230:0x03f4, B:231:0x03fb), top: B:336:0x0390 }] */
    /* JADX WARN: Code duplicated, block: B:217:0x03b7 A[Catch: all -> 0x03fc, TRY_LEAVE, TryCatch #0 {all -> 0x03fc, blocks: (B:212:0x0390, B:214:0x0396, B:215:0x03ab, B:217:0x03b7, B:230:0x03f4, B:231:0x03fb), top: B:336:0x0390 }] */
    /* JADX WARN: Code duplicated, block: B:226:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:229:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:230:0x03f4 A[Catch: all -> 0x03fc, TRY_ENTER, TryCatch #0 {all -> 0x03fc, blocks: (B:212:0x0390, B:214:0x0396, B:215:0x03ab, B:217:0x03b7, B:230:0x03f4, B:231:0x03fb), top: B:336:0x0390 }] */
    /* JADX WARN: Code duplicated, block: B:237:0x0426  */
    /* JADX WARN: Code duplicated, block: B:240:0x042e  */
    /* JADX WARN: Code duplicated, block: B:242:0x0434  */
    /* JADX WARN: Code duplicated, block: B:244:0x043a  */
    /* JADX WARN: Code duplicated, block: B:245:0x043c  */
    /* JADX WARN: Code duplicated, block: B:247:0x043f  */
    /* JADX WARN: Code duplicated, block: B:249:0x0447  */
    /* JADX WARN: Code duplicated, block: B:255:0x046c  */
    /* JADX WARN: Code duplicated, block: B:257:0x0472  */
    /* JADX WARN: Code duplicated, block: B:259:0x0478  */
    /* JADX WARN: Code duplicated, block: B:260:0x047a  */
    /* JADX WARN: Code duplicated, block: B:262:0x047d  */
    /* JADX WARN: Code duplicated, block: B:268:0x048d  */
    /* JADX WARN: Code duplicated, block: B:275:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:277:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:281:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:283:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:284:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:287:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:291:0x0505  */
    /* JADX WARN: Code duplicated, block: B:294:0x0514  */
    /* JADX WARN: Code duplicated, block: B:296:0x051b  */
    /* JADX WARN: Code duplicated, block: B:300:0x0523  */
    /* JADX WARN: Code duplicated, block: B:302:0x0527  */
    /* JADX WARN: Code duplicated, block: B:303:0x0529  */
    /* JADX WARN: Code duplicated, block: B:305:0x052c  */
    /* JADX WARN: Code duplicated, block: B:308:0x0533  */
    /* JADX WARN: Code duplicated, block: B:310:0x0537  */
    /* JADX WARN: Code duplicated, block: B:311:0x053c  */
    /* JADX WARN: Code duplicated, block: B:313:0x0543 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:316:0x054e  */
    /* JADX WARN: Code duplicated, block: B:319:0x0555  */
    /* JADX WARN: Code duplicated, block: B:323:0x055e  */
    /* JADX WARN: Code duplicated, block: B:324:0x0568  */
    /* JADX WARN: Code duplicated, block: B:326:0x056e  */
    /* JADX WARN: Code duplicated, block: B:327:0x0578  */
    /* JADX WARN: Code duplicated, block: B:330:0x057e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:343:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x034f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x0345 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x007e A[EDGE_INSN: B:35:0x007e->B:36:0x007f BREAK  A[LOOP:0: B:14:0x0026->B:20:0x0040]] */
    /* JADX WARN: Code duplicated, block: B:364:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:70:0x0109  */
    /* JADX WARN: Code duplicated, block: B:72:0x010f  */
    /* JADX WARN: Code duplicated, block: B:77:0x012d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0136 A[EDGE_INSN: B:80:0x0136->B:101:0x01a8 BREAK  A[LOOP:1: B:43:0x0092->B:55:0x00c0]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0145  */
    /* JADX WARN: Code duplicated, block: B:83:0x0157  */
    /* JADX WARN: Code duplicated, block: B:85:0x015d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0163  */
    /* JADX WARN: Code duplicated, block: B:89:0x016a  */
    /* JADX WARN: Instruction removed from duplicated block: B:179:0x0305, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v74 */
    public final metrica smaato(int i, long j) {
        metrica metricaVarTapsense;
        int i2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i3;
        long j2;
        long j3;
        View view;
        C10156l c10156l;
        boolean z;
        int iBilling;
        int i4;
        long nanoTime;
        boolean z2;
        long nanoTime2;
        long j4;
        boolean z3;
        boolean z4;
        adcel adcelVar;
        startapp startappVar;
        boolean z5;
        View.AccessibilityDelegate accessibilityDelegateAmazon;
        long j5;
        boolean z6;
        ViewGroup.LayoutParams layoutParams;
        C13036l c13036l;
        C5932l c5932l;
        int i5;
        boolean z7;
        int iBilling2;
        int iSubs;
        subs subsVar;
        long nanoTime3;
        long nanoTime4;
        long j6;
        RecyclerView recyclerViewFindNestedRecyclerView;
        long j7;
        int i6;
        C7611l c7611l;
        metrica metricaVar;
        View view2;
        ArrayList arrayList3;
        int size;
        long jAdmob;
        int size2;
        int i7;
        int size3;
        metrica metricaVar2;
        long j8;
        int size4;
        int i8;
        ArrayList arrayList4;
        int size5;
        int i9;
        View view3;
        int size6;
        int i10;
        metrica metricaVar3;
        metrica childViewHolderInt;
        loadAd loadad;
        C3253l c3253l;
        int iIndexOfChild;
        C3253l c3253l2;
        int iIndexOfChild2;
        int iSubscription;
        metrica childViewHolderInt2;
        int i11;
        ?? r6;
        metrica metricaVar4;
        int size7;
        int iBilling3;
        RecyclerView recyclerView = this.admob;
        if (i < 0 || i >= recyclerView.mState.loadAd()) {
            StringBuilder sbSubscription = AbstractC14814l.subscription(i, i, "Invalid item position ", "(", "). Item count:");
            sbSubscription.append(recyclerView.mState.loadAd());
            sbSubscription.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(sbSubscription.toString());
        }
        if (recyclerView.mState.mopub) {
            ArrayList arrayList5 = this.loadAd;
            if (arrayList5 != null && (size7 = arrayList5.size()) != 0) {
                int i12 = 0;
                while (true) {
                    if (i12 >= size7) {
                        if (recyclerView.mAdapter.f464l && (iBilling3 = recyclerView.mAdapterHelper.billing(i, 0)) > 0 && iBilling3 < recyclerView.mAdapter.mopub()) {
                            long jAdmob2 = recyclerView.mAdapter.admob(iBilling3);
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size7) {
                                    metricaVarTapsense = null;
                                    break;
                                }
                                metrica metricaVar5 = (metrica) this.loadAd.get(i13);
                                if (!metricaVar5.ads() && metricaVar5.purchase == jAdmob2) {
                                    metricaVar5.yandex(32);
                                    metricaVarTapsense = metricaVar5;
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            metricaVarTapsense = null;
                            break;
                        }
                    } else {
                        metricaVarTapsense = (metrica) this.loadAd.get(i12);
                        if (!metricaVarTapsense.ads() && metricaVarTapsense.amazon() == i) {
                            metricaVarTapsense.yandex(32);
                            break;
                        }
                        i12++;
                    }
                }
            } else {
                metricaVarTapsense = null;
                break;
            }
            if (metricaVarTapsense != null) {
                i2 = 1;
            }
            arrayList = this.yandex;
            arrayList2 = this.crashlytics;
            if (metricaVarTapsense == null) {
                size4 = arrayList.size();
                i8 = 0;
                while (true) {
                    if (i8 < size4) {
                        arrayList4 = recyclerView.mChildHelper.crashlytics;
                        size5 = arrayList4.size();
                        i9 = 0;
                        while (true) {
                            if (i9 < size5) {
                                i3 = 1;
                                view3 = null;
                                break;
                            }
                            view3 = (View) arrayList4.get(i9);
                            childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view3);
                            i3 = 1;
                            if (childViewHolderInt2.amazon() != i && !childViewHolderInt2.admob() && !childViewHolderInt2.isPro()) {
                                break;
                            }
                            i9++;
                        }
                        if (view3 != null) {
                            size6 = arrayList2.size();
                            i10 = 0;
                            while (true) {
                                if (i10 < size6) {
                                    metricaVarTapsense = null;
                                    break;
                                }
                                metricaVar3 = (metrica) arrayList2.get(i10);
                                if (metricaVar3.admob() && metricaVar3.amazon() == i && !metricaVar3.billing()) {
                                    arrayList2.remove(i10);
                                    if (RecyclerView.sVerboseLoggingEnabled) {
                                        Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + metricaVar3);
                                    }
                                    metricaVarTapsense = metricaVar3;
                                    break;
                                }
                                i10++;
                            }
                        } else {
                            childViewHolderInt = RecyclerView.getChildViewHolderInt(view3);
                            loadad = recyclerView.mChildHelper;
                            c3253l = loadad.loadAd;
                            iIndexOfChild = ((RecyclerView) loadad.yandex.f4179l).indexOfChild(view3);
                            if (iIndexOfChild >= 0) {
                                C1759l.ads(view3, "view is not a child, cannot hide ");
                                return null;
                            }
                            if (c3253l.license(iIndexOfChild)) {
                                C18353l.metrica(view3, "trying to unhide a view that was not hidden");
                                return null;
                            }
                            c3253l.ads(iIndexOfChild);
                            loadad.isPro(view3);
                            loadAd loadad2 = recyclerView.mChildHelper;
                            c3253l2 = loadad2.loadAd;
                            iIndexOfChild2 = ((RecyclerView) loadad2.yandex.f4179l).indexOfChild(view3);
                            if (iIndexOfChild2 == -1 && !c3253l2.license(iIndexOfChild2)) {
                                iSubscription = iIndexOfChild2 - c3253l2.subscription(iIndexOfChild2);
                            } else {
                                iSubscription = -1;
                            }
                            if (iSubscription != -1) {
                                StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb.append(childViewHolderInt);
                                C8339l.smaato(AbstractC14814l.vip(recyclerView, sb));
                                return null;
                            }
                            recyclerView.mChildHelper.crashlytics(iSubscription);
                            firebase(view3);
                            childViewHolderInt.yandex(8224);
                            metricaVarTapsense = childViewHolderInt;
                            break;
                        }
                    } else {
                        metricaVar4 = (metrica) arrayList.get(i8);
                        if (metricaVar4.ads() && metricaVar4.amazon() == i && !metricaVar4.admob() && (recyclerView.mState.mopub || !metricaVar4.isPro())) {
                            metricaVar4.yandex(32);
                            metricaVarTapsense = metricaVar4;
                            i3 = 1;
                            break;
                        }
                        i8++;
                    }
                }
                if (metricaVarTapsense != null) {
                    if (metricaVarTapsense.isPro()) {
                        i11 = metricaVarTapsense.crashlytics;
                        if (i11 >= 0 || i11 >= recyclerView.mAdapter.mopub()) {
                            StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                            sb2.append(metricaVarTapsense);
                            C18262l.adcel(AbstractC14814l.vip(recyclerView, sb2));
                            return null;
                        }
                        if (recyclerView.mState.mopub || recyclerView.mAdapter.subs(metricaVarTapsense.crashlytics) == metricaVarTapsense.billing) {
                            subs subsVar2 = recyclerView.mAdapter;
                            if (!subsVar2.f464l || metricaVarTapsense.purchase == subsVar2.admob(metricaVarTapsense.crashlytics)) {
                                r6 = i3;
                            } else {
                                r6 = 0;
                            }
                        } else {
                            r6 = 0;
                        }
                    } else {
                        if (!RecyclerView.sDebugAssertionsEnabled && !recyclerView.mState.mopub) {
                            C8339l.smaato(AbstractC14814l.vip(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                            return null;
                        }
                        r6 = recyclerView.mState.mopub;
                    }
                    if (r6 == 0) {
                        metricaVarTapsense.yandex(4);
                        if (metricaVarTapsense.firebase()) {
                            recyclerView.removeDetachedView(metricaVarTapsense.yandex, false);
                            metricaVarTapsense.vip.remoteconfig(metricaVarTapsense);
                        } else if (metricaVarTapsense.ads()) {
                            metricaVarTapsense.isPro &= -33;
                        }
                        isPro(metricaVarTapsense);
                        metricaVarTapsense = null;
                    } else {
                        i2 = i3;
                    }
                }
            } else {
                i3 = 1;
            }
            if (metricaVarTapsense == null) {
                iBilling2 = recyclerView.mAdapterHelper.billing(i, 0);
                if (iBilling2 >= 0) {
                    j2 = 3;
                    if (iBilling2 < recyclerView.mAdapter.mopub()) {
                        iSubs = recyclerView.mAdapter.subs(iBilling2);
                        subsVar = recyclerView.mAdapter;
                        j3 = 4;
                        if (subsVar.f464l) {
                            jAdmob = subsVar.admob(iBilling2);
                            size2 = arrayList.size() - 1;
                            while (true) {
                                if (size2 >= 0) {
                                    i7 = iBilling2;
                                    size3 = arrayList2.size() - 1;
                                    while (true) {
                                        if (size3 >= 0) {
                                            metricaVar2 = (metrica) arrayList2.get(size3);
                                            if (metricaVar2.purchase == jAdmob || metricaVar2.billing()) {
                                                size3--;
                                            } else {
                                                if (iSubs == metricaVar2.billing) {
                                                    arrayList2.remove(size3);
                                                    metricaVarTapsense = metricaVar2;
                                                    break;
                                                }
                                                admob(size3);
                                            }
                                        }
                                        metricaVarTapsense = null;
                                        break;
                                    }
                                }
                                metrica metricaVar6 = (metrica) arrayList.get(size2);
                                i7 = iBilling2;
                                j8 = metricaVar6.purchase;
                                View view4 = metricaVar6.yandex;
                                if (j8 != jAdmob && !metricaVar6.ads()) {
                                    if (iSubs == metricaVar6.billing) {
                                        metricaVar6.yandex(32);
                                        if (metricaVar6.isPro() && !recyclerView.mState.mopub) {
                                            metricaVar6.isPro = (metricaVar6.isPro & (-15)) | 2;
                                        }
                                        metricaVarTapsense = metricaVar6;
                                        break;
                                    }
                                    arrayList.remove(size2);
                                    recyclerView.removeDetachedView(view4, false);
                                    metrica childViewHolderInt3 = RecyclerView.getChildViewHolderInt(view4);
                                    childViewHolderInt3.vip = null;
                                    childViewHolderInt3.metrica = false;
                                    childViewHolderInt3.isPro &= -33;
                                    isPro(childViewHolderInt3);
                                }
                                size2--;
                                iBilling2 = i7;
                            }
                            if (metricaVarTapsense != null) {
                                metricaVarTapsense.crashlytics = i7;
                                i2 = i3;
                            }
                        }
                        if (metricaVarTapsense == null) {
                            if (RecyclerView.sVerboseLoggingEnabled) {
                                Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                            }
                            c7611l = (C7611l) crashlytics().yandex.get(iSubs);
                            if (c7611l != null) {
                                metricaVar = null;
                                break;
                            }
                            arrayList3 = c7611l.yandex;
                            if (arrayList3.isEmpty()) {
                                size = arrayList3.size() - 1;
                                while (true) {
                                    if (size >= 0) {
                                        metricaVar = null;
                                        break;
                                    }
                                    if (!((metrica) arrayList3.get(size)).billing()) {
                                        metricaVar = (metrica) arrayList3.remove(size);
                                        break;
                                    }
                                    size--;
                                }
                            } else {
                                metricaVar = null;
                                break;
                            }
                            if (metricaVar != null) {
                                metricaVar.metrica();
                                if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                    view2 = metricaVar.yandex;
                                    if (view2 instanceof ViewGroup) {
                                        amazon((ViewGroup) view2, false);
                                    }
                                }
                            }
                            metricaVarTapsense = metricaVar;
                        }
                        if (metricaVarTapsense == null) {
                            nanoTime3 = recyclerView.getNanoTime();
                            if (j != Long.MAX_VALUE) {
                                j7 = this.mopub.yandex(iSubs).crashlytics;
                                if (j7 != 0 || j7 + nanoTime3 < j) {
                                    i6 = i3;
                                } else {
                                    i6 = 0;
                                }
                                if (i6 == 0) {
                                    return null;
                                }
                            }
                            subs subsVar3 = recyclerView.mAdapter;
                            subsVar3.getClass();
                            try {
                                if (AbstractC14366l.yandex()) {
                                    Object[] objArr = new Object[i3];
                                    objArr[0] = Integer.valueOf(iSubs);
                                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", objArr));
                                }
                                metricaVarTapsense = subsVar3.tapsense(recyclerView, iSubs);
                                if (metricaVarTapsense.yandex.getParent() == null) {
                                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                }
                                metricaVarTapsense.billing = iSubs;
                                Trace.endSection();
                                if (RecyclerView.ALLOW_THREAD_GAP_WORK && (recyclerViewFindNestedRecyclerView = RecyclerView.findNestedRecyclerView(metricaVarTapsense.yandex)) != null) {
                                    metricaVarTapsense.loadAd = new WeakReference(recyclerViewFindNestedRecyclerView);
                                }
                                nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                                C7611l c7611lYandex = this.mopub.yandex(iSubs);
                                j6 = c7611lYandex.crashlytics;
                                if (j6 != 0) {
                                    nanoTime4 = (nanoTime4 / 4) + ((j6 / 4) * 3);
                                }
                                c7611lYandex.crashlytics = nanoTime4;
                                if (RecyclerView.sVerboseLoggingEnabled) {
                                    Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                                }
                            } catch (Throwable th) {
                                Trace.endSection();
                                throw th;
                            }
                        }
                    }
                }
                StringBuilder sbSubscription2 = AbstractC14814l.subscription(i, iBilling2, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                sbSubscription2.append(recyclerView.mState.loadAd());
                sbSubscription2.append(recyclerView.exceptionLabel());
                throw new IndexOutOfBoundsException(sbSubscription2.toString());
            }
            j2 = 3;
            j3 = 4;
            view = metricaVarTapsense.yandex;
            if (i2 != 0) {
                c5932l = recyclerView.mState;
                if (!c5932l.mopub) {
                    i5 = metricaVarTapsense.isPro;
                    if ((i5 & 8192) != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        metricaVarTapsense.isPro = i5 & (-8193);
                        if (c5932l.isPro) {
                            AbstractC13735l.loadAd(metricaVarTapsense);
                            AbstractC13735l abstractC13735l = recyclerView.mItemAnimator;
                            metricaVarTapsense.purchase();
                            abstractC13735l.getClass();
                            C13279l c13279l = new C13279l();
                            c13279l.yandex(metricaVarTapsense);
                            recyclerView.recordAnimationInfoIfBouncedHiddenView(metricaVarTapsense, c13279l);
                        }
                    }
                }
            }
            if (recyclerView.mState.mopub || !metricaVarTapsense.mopub()) {
                if (metricaVarTapsense.mopub()) {
                    if ((metricaVarTapsense.isPro & 2) != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!z6 || metricaVarTapsense.admob()) {
                    }
                    layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        c13036l = (C13036l) recyclerView.generateDefaultLayoutParams();
                        view.setLayoutParams(c13036l);
                    } else if (recyclerView.checkLayoutParams(layoutParams)) {
                        c13036l = (C13036l) layoutParams;
                    } else {
                        c13036l = (C13036l) recyclerView.generateLayoutParams(layoutParams);
                        view.setLayoutParams(c13036l);
                    }
                    c13036l.yandex = metricaVarTapsense;
                    if (i2 != 0 && z4) {
                        z = z3;
                    }
                    c13036l.amazon = z;
                    return metricaVarTapsense;
                }
                if (!RecyclerView.sDebugAssertionsEnabled && metricaVarTapsense.isPro()) {
                    StringBuilder sb3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                    sb3.append(metricaVarTapsense);
                    C8339l.smaato(AbstractC14814l.vip(recyclerView, sb3));
                    return null;
                }
                c10156l = null;
                z = false;
                iBilling = recyclerView.mAdapterHelper.billing(i, 0);
                metricaVarTapsense.subscription = null;
                metricaVarTapsense.ads = recyclerView;
                i4 = metricaVarTapsense.billing;
                nanoTime = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    j5 = this.mopub.yandex(i4).amazon;
                    if (j5 != 0 || j5 + nanoTime < j) {
                        if (metricaVarTapsense.smaato()) {
                            recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        recyclerView.mAdapter.amazon(metricaVarTapsense, iBilling);
                        if (z2) {
                            recyclerView.detachViewFromParent(view);
                        }
                        nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                        C7611l c7611lYandex2 = this.mopub.yandex(metricaVarTapsense.billing);
                        j4 = c7611lYandex2.amazon;
                        if (j4 != 0) {
                            nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                        }
                        c7611lYandex2.amazon = nanoTime2;
                        if (recyclerView.isAccessibilityEnabled()) {
                            z3 = true;
                            if (view.getImportantForAccessibility() == 0) {
                                view.setImportantForAccessibility(1);
                            }
                            adcelVar = recyclerView.mAccessibilityDelegate;
                            if (adcelVar != null) {
                                startappVar = adcelVar.f450l;
                                if (startappVar != null) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    accessibilityDelegateAmazon = AbstractC15872l.amazon(view);
                                    if (accessibilityDelegateAmazon != null) {
                                        if (accessibilityDelegateAmazon instanceof C14990l) {
                                            c10156l = ((C14990l) accessibilityDelegateAmazon).yandex;
                                        } else {
                                            c10156l = new C10156l(accessibilityDelegateAmazon);
                                        }
                                    }
                                    if (c10156l != null && c10156l != startappVar) {
                                        startappVar.f461l.put(view, c10156l);
                                    }
                                }
                                AbstractC15872l.vip(view, startappVar);
                            }
                        } else {
                            z3 = true;
                        }
                        if (recyclerView.mState.mopub) {
                            metricaVarTapsense.mopub = i;
                        }
                        z4 = z3;
                    } else {
                        z4 = false;
                        z3 = true;
                    }
                } else {
                    if (metricaVarTapsense.smaato()) {
                        recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    recyclerView.mAdapter.amazon(metricaVarTapsense, iBilling);
                    if (z2) {
                        recyclerView.detachViewFromParent(view);
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    C7611l c7611lYandex3 = this.mopub.yandex(metricaVarTapsense.billing);
                    j4 = c7611lYandex3.amazon;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                    }
                    c7611lYandex3.amazon = nanoTime2;
                    if (recyclerView.isAccessibilityEnabled()) {
                        z3 = true;
                        if (view.getImportantForAccessibility() == 0) {
                            view.setImportantForAccessibility(1);
                        }
                        adcelVar = recyclerView.mAccessibilityDelegate;
                        if (adcelVar != null) {
                            startappVar = adcelVar.f450l;
                            if (startappVar != null) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                accessibilityDelegateAmazon = AbstractC15872l.amazon(view);
                                if (accessibilityDelegateAmazon != null) {
                                    if (accessibilityDelegateAmazon instanceof C14990l) {
                                        c10156l = ((C14990l) accessibilityDelegateAmazon).yandex;
                                    } else {
                                        c10156l = new C10156l(accessibilityDelegateAmazon);
                                    }
                                }
                                if (c10156l != null) {
                                    startappVar.f461l.put(view, c10156l);
                                }
                            }
                            AbstractC15872l.vip(view, startappVar);
                        }
                    } else {
                        z3 = true;
                    }
                    if (recyclerView.mState.mopub) {
                        metricaVarTapsense.mopub = i;
                    }
                    z4 = z3;
                }
                layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    c13036l = (C13036l) recyclerView.generateDefaultLayoutParams();
                    view.setLayoutParams(c13036l);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    c13036l = (C13036l) recyclerView.generateLayoutParams(layoutParams);
                    view.setLayoutParams(c13036l);
                } else {
                    c13036l = (C13036l) layoutParams;
                }
                c13036l.yandex = metricaVarTapsense;
                if (i2 != 0) {
                    z = z3;
                }
                c13036l.amazon = z;
                return metricaVarTapsense;
            }
            metricaVarTapsense.mopub = i;
            z4 = false;
            z3 = true;
            z = false;
            layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                c13036l = (C13036l) recyclerView.generateDefaultLayoutParams();
                view.setLayoutParams(c13036l);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                c13036l = (C13036l) recyclerView.generateLayoutParams(layoutParams);
                view.setLayoutParams(c13036l);
            } else {
                c13036l = (C13036l) layoutParams;
            }
            c13036l.yandex = metricaVarTapsense;
            if (i2 != 0) {
                z = z3;
            }
            c13036l.amazon = z;
            return metricaVarTapsense;
        }
        metricaVarTapsense = null;
        i2 = 0;
        arrayList = this.yandex;
        arrayList2 = this.crashlytics;
        if (metricaVarTapsense == null) {
            size4 = arrayList.size();
            i8 = 0;
            while (true) {
                if (i8 < size4) {
                    arrayList4 = recyclerView.mChildHelper.crashlytics;
                    size5 = arrayList4.size();
                    i9 = 0;
                    while (true) {
                        if (i9 < size5) {
                            i3 = 1;
                            view3 = null;
                            break;
                        }
                        view3 = (View) arrayList4.get(i9);
                        childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view3);
                        i3 = 1;
                        if (childViewHolderInt2.amazon() != i) {
                        }
                        i9++;
                    }
                    if (view3 != null) {
                        size6 = arrayList2.size();
                        i10 = 0;
                        while (true) {
                            if (i10 < size6) {
                                metricaVarTapsense = null;
                                break;
                            }
                            metricaVar3 = (metrica) arrayList2.get(i10);
                            if (metricaVar3.admob()) {
                            }
                            i10++;
                        }
                    } else {
                        childViewHolderInt = RecyclerView.getChildViewHolderInt(view3);
                        loadad = recyclerView.mChildHelper;
                        c3253l = loadad.loadAd;
                        iIndexOfChild = ((RecyclerView) loadad.yandex.f4179l).indexOfChild(view3);
                        if (iIndexOfChild >= 0) {
                            C1759l.ads(view3, "view is not a child, cannot hide ");
                            return null;
                        }
                        if (c3253l.license(iIndexOfChild)) {
                            C18353l.metrica(view3, "trying to unhide a view that was not hidden");
                            return null;
                        }
                        c3253l.ads(iIndexOfChild);
                        loadad.isPro(view3);
                        loadAd loadad3 = recyclerView.mChildHelper;
                        c3253l2 = loadad3.loadAd;
                        iIndexOfChild2 = ((RecyclerView) loadad3.yandex.f4179l).indexOfChild(view3);
                        if (iIndexOfChild2 == -1) {
                            iSubscription = -1;
                        } else {
                            iSubscription = iIndexOfChild2 - c3253l2.subscription(iIndexOfChild2);
                        }
                        if (iSubscription != -1) {
                            StringBuilder sb4 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb4.append(childViewHolderInt);
                            C8339l.smaato(AbstractC14814l.vip(recyclerView, sb4));
                            return null;
                        }
                        recyclerView.mChildHelper.crashlytics(iSubscription);
                        firebase(view3);
                        childViewHolderInt.yandex(8224);
                        metricaVarTapsense = childViewHolderInt;
                        break;
                    }
                } else {
                    metricaVar4 = (metrica) arrayList.get(i8);
                    if (metricaVar4.ads()) {
                    }
                    i8++;
                }
            }
            if (metricaVarTapsense != null) {
                if (metricaVarTapsense.isPro()) {
                    i11 = metricaVarTapsense.crashlytics;
                    if (i11 >= 0) {
                    }
                    StringBuilder sb5 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                    sb5.append(metricaVarTapsense);
                    C18262l.adcel(AbstractC14814l.vip(recyclerView, sb5));
                    return null;
                }
                if (!RecyclerView.sDebugAssertionsEnabled) {
                }
                r6 = recyclerView.mState.mopub;
                if (r6 == 0) {
                    metricaVarTapsense.yandex(4);
                    if (metricaVarTapsense.firebase()) {
                        recyclerView.removeDetachedView(metricaVarTapsense.yandex, false);
                        metricaVarTapsense.vip.remoteconfig(metricaVarTapsense);
                    } else if (metricaVarTapsense.ads()) {
                        metricaVarTapsense.isPro &= -33;
                    }
                    isPro(metricaVarTapsense);
                    metricaVarTapsense = null;
                } else {
                    i2 = i3;
                }
            }
        } else {
            i3 = 1;
        }
        if (metricaVarTapsense == null) {
            iBilling2 = recyclerView.mAdapterHelper.billing(i, 0);
            if (iBilling2 >= 0) {
                j2 = 3;
                if (iBilling2 < recyclerView.mAdapter.mopub()) {
                    iSubs = recyclerView.mAdapter.subs(iBilling2);
                    subsVar = recyclerView.mAdapter;
                    j3 = 4;
                    if (subsVar.f464l) {
                        jAdmob = subsVar.admob(iBilling2);
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                i7 = iBilling2;
                                size3 = arrayList2.size() - 1;
                                while (true) {
                                    if (size3 >= 0) {
                                        metricaVar2 = (metrica) arrayList2.get(size3);
                                        if (metricaVar2.purchase == jAdmob) {
                                        }
                                        size3--;
                                    }
                                    metricaVarTapsense = null;
                                    break;
                                }
                            }
                            metrica metricaVar7 = (metrica) arrayList.get(size2);
                            i7 = iBilling2;
                            j8 = metricaVar7.purchase;
                            View view5 = metricaVar7.yandex;
                            if (j8 != jAdmob) {
                            }
                            size2--;
                            iBilling2 = i7;
                        }
                        if (metricaVarTapsense != null) {
                            metricaVarTapsense.crashlytics = i7;
                            i2 = i3;
                        }
                    }
                    if (metricaVarTapsense == null) {
                        if (RecyclerView.sVerboseLoggingEnabled) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                        }
                        c7611l = (C7611l) crashlytics().yandex.get(iSubs);
                        if (c7611l != null) {
                            metricaVar = null;
                            break;
                        }
                        arrayList3 = c7611l.yandex;
                        if (arrayList3.isEmpty()) {
                            metricaVar = null;
                            break;
                        }
                        size = arrayList3.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                metricaVar = null;
                                break;
                            }
                            if (!((metrica) arrayList3.get(size)).billing()) {
                                metricaVar = (metrica) arrayList3.remove(size);
                                break;
                            }
                            size--;
                        }
                        if (metricaVar != null) {
                            metricaVar.metrica();
                            if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                view2 = metricaVar.yandex;
                                if (view2 instanceof ViewGroup) {
                                    amazon((ViewGroup) view2, false);
                                }
                            }
                        }
                        metricaVarTapsense = metricaVar;
                    }
                    if (metricaVarTapsense == null) {
                        nanoTime3 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            j7 = this.mopub.yandex(iSubs).crashlytics;
                            if (j7 != 0) {
                                i6 = i3;
                            } else {
                                i6 = i3;
                            }
                            if (i6 == 0) {
                                return null;
                            }
                        }
                        subs subsVar4 = recyclerView.mAdapter;
                        subsVar4.getClass();
                        if (AbstractC14366l.yandex()) {
                            Object[] objArr2 = new Object[i3];
                            objArr2[0] = Integer.valueOf(iSubs);
                            Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", objArr2));
                        }
                        metricaVarTapsense = subsVar4.tapsense(recyclerView, iSubs);
                        if (metricaVarTapsense.yandex.getParent() == null) {
                            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                        }
                        metricaVarTapsense.billing = iSubs;
                        Trace.endSection();
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                            metricaVarTapsense.loadAd = new WeakReference(recyclerViewFindNestedRecyclerView);
                        }
                        nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                        C7611l c7611lYandex4 = this.mopub.yandex(iSubs);
                        j6 = c7611lYandex4.crashlytics;
                        if (j6 != 0) {
                            nanoTime4 = (nanoTime4 / 4) + ((j6 / 4) * 3);
                        }
                        c7611lYandex4.crashlytics = nanoTime4;
                        if (RecyclerView.sVerboseLoggingEnabled) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                        }
                    }
                }
            }
            StringBuilder sbSubscription3 = AbstractC14814l.subscription(i, iBilling2, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
            sbSubscription3.append(recyclerView.mState.loadAd());
            sbSubscription3.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(sbSubscription3.toString());
        }
        j2 = 3;
        j3 = 4;
        view = metricaVarTapsense.yandex;
        if (i2 != 0) {
            c5932l = recyclerView.mState;
            if (!c5932l.mopub) {
                i5 = metricaVarTapsense.isPro;
                if ((i5 & 8192) != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    metricaVarTapsense.isPro = i5 & (-8193);
                    if (c5932l.isPro) {
                        AbstractC13735l.loadAd(metricaVarTapsense);
                        AbstractC13735l abstractC13735l2 = recyclerView.mItemAnimator;
                        metricaVarTapsense.purchase();
                        abstractC13735l2.getClass();
                        C13279l c13279l2 = new C13279l();
                        c13279l2.yandex(metricaVarTapsense);
                        recyclerView.recordAnimationInfoIfBouncedHiddenView(metricaVarTapsense, c13279l2);
                    }
                }
            }
        }
        if (recyclerView.mState.mopub) {
            if (metricaVarTapsense.mopub()) {
                if ((metricaVarTapsense.isPro & 2) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z6) {
                }
            }
            if (!RecyclerView.sDebugAssertionsEnabled) {
            }
            c10156l = null;
            z = false;
            iBilling = recyclerView.mAdapterHelper.billing(i, 0);
            metricaVarTapsense.subscription = null;
            metricaVarTapsense.ads = recyclerView;
            i4 = metricaVarTapsense.billing;
            nanoTime = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                j5 = this.mopub.yandex(i4).amazon;
                if (j5 != 0) {
                    if (metricaVarTapsense.smaato()) {
                        recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    recyclerView.mAdapter.amazon(metricaVarTapsense, iBilling);
                    if (z2) {
                        recyclerView.detachViewFromParent(view);
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    C7611l c7611lYandex5 = this.mopub.yandex(metricaVarTapsense.billing);
                    j4 = c7611lYandex5.amazon;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                    }
                    c7611lYandex5.amazon = nanoTime2;
                    if (recyclerView.isAccessibilityEnabled()) {
                        z3 = true;
                        if (view.getImportantForAccessibility() == 0) {
                            view.setImportantForAccessibility(1);
                        }
                        adcelVar = recyclerView.mAccessibilityDelegate;
                        if (adcelVar != null) {
                            startappVar = adcelVar.f450l;
                            if (startappVar != null) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                accessibilityDelegateAmazon = AbstractC15872l.amazon(view);
                                if (accessibilityDelegateAmazon != null) {
                                    if (accessibilityDelegateAmazon instanceof C14990l) {
                                        c10156l = ((C14990l) accessibilityDelegateAmazon).yandex;
                                    } else {
                                        c10156l = new C10156l(accessibilityDelegateAmazon);
                                    }
                                }
                                if (c10156l != null) {
                                    startappVar.f461l.put(view, c10156l);
                                }
                            }
                            AbstractC15872l.vip(view, startappVar);
                        }
                    } else {
                        z3 = true;
                    }
                    if (recyclerView.mState.mopub) {
                        metricaVarTapsense.mopub = i;
                    }
                    z4 = z3;
                } else {
                    if (metricaVarTapsense.smaato()) {
                        recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    recyclerView.mAdapter.amazon(metricaVarTapsense, iBilling);
                    if (z2) {
                        recyclerView.detachViewFromParent(view);
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    C7611l c7611lYandex6 = this.mopub.yandex(metricaVarTapsense.billing);
                    j4 = c7611lYandex6.amazon;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                    }
                    c7611lYandex6.amazon = nanoTime2;
                    if (recyclerView.isAccessibilityEnabled()) {
                        z3 = true;
                        if (view.getImportantForAccessibility() == 0) {
                            view.setImportantForAccessibility(1);
                        }
                        adcelVar = recyclerView.mAccessibilityDelegate;
                        if (adcelVar != null) {
                            startappVar = adcelVar.f450l;
                            if (startappVar != null) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                accessibilityDelegateAmazon = AbstractC15872l.amazon(view);
                                if (accessibilityDelegateAmazon != null) {
                                    if (accessibilityDelegateAmazon instanceof C14990l) {
                                        c10156l = ((C14990l) accessibilityDelegateAmazon).yandex;
                                    } else {
                                        c10156l = new C10156l(accessibilityDelegateAmazon);
                                    }
                                }
                                if (c10156l != null) {
                                    startappVar.f461l.put(view, c10156l);
                                }
                            }
                            AbstractC15872l.vip(view, startappVar);
                        }
                    } else {
                        z3 = true;
                    }
                    if (recyclerView.mState.mopub) {
                        metricaVarTapsense.mopub = i;
                    }
                    z4 = z3;
                }
            } else {
                if (metricaVarTapsense.smaato()) {
                    recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                    z2 = true;
                } else {
                    z2 = false;
                }
                recyclerView.mAdapter.amazon(metricaVarTapsense, iBilling);
                if (z2) {
                    recyclerView.detachViewFromParent(view);
                }
                nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                C7611l c7611lYandex7 = this.mopub.yandex(metricaVarTapsense.billing);
                j4 = c7611lYandex7.amazon;
                if (j4 != 0) {
                    nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                }
                c7611lYandex7.amazon = nanoTime2;
                if (recyclerView.isAccessibilityEnabled()) {
                    z3 = true;
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                    adcelVar = recyclerView.mAccessibilityDelegate;
                    if (adcelVar != null) {
                        startappVar = adcelVar.f450l;
                        if (startappVar != null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            accessibilityDelegateAmazon = AbstractC15872l.amazon(view);
                            if (accessibilityDelegateAmazon != null) {
                                if (accessibilityDelegateAmazon instanceof C14990l) {
                                    c10156l = ((C14990l) accessibilityDelegateAmazon).yandex;
                                } else {
                                    c10156l = new C10156l(accessibilityDelegateAmazon);
                                }
                            }
                            if (c10156l != null) {
                                startappVar.f461l.put(view, c10156l);
                            }
                        }
                        AbstractC15872l.vip(view, startappVar);
                    }
                } else {
                    z3 = true;
                }
                if (recyclerView.mState.mopub) {
                    metricaVarTapsense.mopub = i;
                }
                z4 = z3;
            }
        } else {
            if (metricaVarTapsense.mopub()) {
                if ((metricaVarTapsense.isPro & 2) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z6) {
                }
            }
            if (!RecyclerView.sDebugAssertionsEnabled) {
            }
            c10156l = null;
            z = false;
            iBilling = recyclerView.mAdapterHelper.billing(i, 0);
            metricaVarTapsense.subscription = null;
            metricaVarTapsense.ads = recyclerView;
            i4 = metricaVarTapsense.billing;
            nanoTime = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                j5 = this.mopub.yandex(i4).amazon;
                if (j5 != 0) {
                    if (metricaVarTapsense.smaato()) {
                        recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    recyclerView.mAdapter.amazon(metricaVarTapsense, iBilling);
                    if (z2) {
                        recyclerView.detachViewFromParent(view);
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    C7611l c7611lYandex8 = this.mopub.yandex(metricaVarTapsense.billing);
                    j4 = c7611lYandex8.amazon;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                    }
                    c7611lYandex8.amazon = nanoTime2;
                    if (recyclerView.isAccessibilityEnabled()) {
                        z3 = true;
                        if (view.getImportantForAccessibility() == 0) {
                            view.setImportantForAccessibility(1);
                        }
                        adcelVar = recyclerView.mAccessibilityDelegate;
                        if (adcelVar != null) {
                            startappVar = adcelVar.f450l;
                            if (startappVar != null) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                accessibilityDelegateAmazon = AbstractC15872l.amazon(view);
                                if (accessibilityDelegateAmazon != null) {
                                    if (accessibilityDelegateAmazon instanceof C14990l) {
                                        c10156l = ((C14990l) accessibilityDelegateAmazon).yandex;
                                    } else {
                                        c10156l = new C10156l(accessibilityDelegateAmazon);
                                    }
                                }
                                if (c10156l != null) {
                                    startappVar.f461l.put(view, c10156l);
                                }
                            }
                            AbstractC15872l.vip(view, startappVar);
                        }
                    } else {
                        z3 = true;
                    }
                    if (recyclerView.mState.mopub) {
                        metricaVarTapsense.mopub = i;
                    }
                    z4 = z3;
                } else {
                    if (metricaVarTapsense.smaato()) {
                        recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    recyclerView.mAdapter.amazon(metricaVarTapsense, iBilling);
                    if (z2) {
                        recyclerView.detachViewFromParent(view);
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    C7611l c7611lYandex9 = this.mopub.yandex(metricaVarTapsense.billing);
                    j4 = c7611lYandex9.amazon;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                    }
                    c7611lYandex9.amazon = nanoTime2;
                    if (recyclerView.isAccessibilityEnabled()) {
                        z3 = true;
                        if (view.getImportantForAccessibility() == 0) {
                            view.setImportantForAccessibility(1);
                        }
                        adcelVar = recyclerView.mAccessibilityDelegate;
                        if (adcelVar != null) {
                            startappVar = adcelVar.f450l;
                            if (startappVar != null) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                accessibilityDelegateAmazon = AbstractC15872l.amazon(view);
                                if (accessibilityDelegateAmazon != null) {
                                    if (accessibilityDelegateAmazon instanceof C14990l) {
                                        c10156l = ((C14990l) accessibilityDelegateAmazon).yandex;
                                    } else {
                                        c10156l = new C10156l(accessibilityDelegateAmazon);
                                    }
                                }
                                if (c10156l != null) {
                                    startappVar.f461l.put(view, c10156l);
                                }
                            }
                            AbstractC15872l.vip(view, startappVar);
                        }
                    } else {
                        z3 = true;
                    }
                    if (recyclerView.mState.mopub) {
                        metricaVarTapsense.mopub = i;
                    }
                    z4 = z3;
                }
            } else {
                if (metricaVarTapsense.smaato()) {
                    recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                    z2 = true;
                } else {
                    z2 = false;
                }
                recyclerView.mAdapter.amazon(metricaVarTapsense, iBilling);
                if (z2) {
                    recyclerView.detachViewFromParent(view);
                }
                nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                C7611l c7611lYandex10 = this.mopub.yandex(metricaVarTapsense.billing);
                j4 = c7611lYandex10.amazon;
                if (j4 != 0) {
                    nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                }
                c7611lYandex10.amazon = nanoTime2;
                if (recyclerView.isAccessibilityEnabled()) {
                    z3 = true;
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                    adcelVar = recyclerView.mAccessibilityDelegate;
                    if (adcelVar != null) {
                        startappVar = adcelVar.f450l;
                        if (startappVar != null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            accessibilityDelegateAmazon = AbstractC15872l.amazon(view);
                            if (accessibilityDelegateAmazon != null) {
                                if (accessibilityDelegateAmazon instanceof C14990l) {
                                    c10156l = ((C14990l) accessibilityDelegateAmazon).yandex;
                                } else {
                                    c10156l = new C10156l(accessibilityDelegateAmazon);
                                }
                            }
                            if (c10156l != null) {
                                startappVar.f461l.put(view, c10156l);
                            }
                        }
                        AbstractC15872l.vip(view, startappVar);
                    }
                } else {
                    z3 = true;
                }
                if (recyclerView.mState.mopub) {
                    metricaVarTapsense.mopub = i;
                }
                z4 = z3;
            }
        }
        layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c13036l = (C13036l) recyclerView.generateDefaultLayoutParams();
            view.setLayoutParams(c13036l);
        } else if (recyclerView.checkLayoutParams(layoutParams)) {
            c13036l = (C13036l) recyclerView.generateLayoutParams(layoutParams);
            view.setLayoutParams(c13036l);
        } else {
            c13036l = (C13036l) layoutParams;
        }
        c13036l.yandex = metricaVarTapsense;
        if (i2 != 0) {
            z = z3;
        }
        c13036l.amazon = z;
        return metricaVarTapsense;
    }

    public final void subs(View view) {
        metrica childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean zSmaato = childViewHolderInt.smaato();
        RecyclerView recyclerView = this.admob;
        if (zSmaato) {
            recyclerView.removeDetachedView(view, false);
        }
        if (childViewHolderInt.firebase()) {
            childViewHolderInt.vip.remoteconfig(childViewHolderInt);
        } else if (childViewHolderInt.ads()) {
            childViewHolderInt.isPro &= -33;
        }
        isPro(childViewHolderInt);
        if (recyclerView.mItemAnimator == null || childViewHolderInt.subs()) {
            return;
        }
        recyclerView.mItemAnimator.amazon(childViewHolderInt);
    }

    public final void vip() {
        isPro ispro = this.admob.mLayout;
        this.billing = this.purchase + (ispro != null ? ispro.isPro : 0);
        ArrayList arrayList = this.crashlytics;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.billing; size--) {
            admob(size);
        }
    }

    public final void yandex(metrica metricaVar, boolean z) {
        RecyclerView.clearNestedRecyclerViewIfNotNested(metricaVar);
        View view = metricaVar.yandex;
        RecyclerView recyclerView = this.admob;
        adcel adcelVar = recyclerView.mAccessibilityDelegate;
        if (adcelVar != null) {
            startapp startappVar = adcelVar.f450l;
            AbstractC15872l.vip(view, startappVar != null ? (C10156l) startappVar.f461l.remove(view) : null);
        }
        if (z) {
            if (recyclerView.mRecyclerListeners.size() > 0) {
                recyclerView.mRecyclerListeners.get(0).getClass();
                C18725l.loadAd();
                return;
            }
            subs subsVar = recyclerView.mAdapter;
            if (subsVar != null) {
                subsVar.advert(metricaVar);
            }
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.amazon(metricaVar);
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + metricaVar);
            }
        }
        metricaVar.subscription = null;
        metricaVar.ads = null;
        C11632l c11632lCrashlytics = crashlytics();
        c11632lCrashlytics.getClass();
        int i = metricaVar.billing;
        ArrayList arrayList = c11632lCrashlytics.yandex(i).yandex;
        if (((C7611l) c11632lCrashlytics.yandex.get(i)).loadAd <= arrayList.size()) {
            AbstractC9307l.crashlytics(metricaVar.yandex);
        } else if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(metricaVar)) {
            C8339l.metrica("this scrap item already exists");
        } else {
            metricaVar.metrica();
            arrayList.add(metricaVar);
        }
    }
}
