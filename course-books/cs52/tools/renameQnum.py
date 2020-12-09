import os
import shutil

pathSession = os.path.dirname(os.path.dirname(__file__))
srcdir = os.path.join( pathSession, 'qbank')
dstdir = os.path.join( pathSession, 'qbank2')
start = 9

if not os.path.exists(dstdir):
    os.makedirs(dstdir)

for i, srcfname in enumerate(os.listdir(srcdir)):
    cur: str = srcfname
    seqname = str(start+i).zfill(2)
    corename = ''.join(cur.split()[1:])
    dstfname = f'Q{seqname} {corename}'
    srcpath = os.path.join(srcdir, srcfname)
    dstpath = os.path.join(dstdir, dstfname)
    shutil.copy2(srcpath, dstpath)
